package controllers

import javax.inject._

import play.api.mvc._
import java.lang.ProcessBuilder.Redirect
import models.TaskListInMemoryModel

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class HomeController @Inject()(cc: ControllerComponents) (implicit assetsFinder: AssetsFinder)
  extends AbstractController(cc) {

  /**
   * Create an Action to render an HTML page with a welcome message.
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */
  def index = Action { implicit request =>
    Ok(views.html.index("Welcome"))
  }

  //  login page
  def login = Action {implicit request =>
    Ok(views.html.login())
  }

  // signup page
  def signup = Action {implicit request =>
    Ok(views.html.signup())
  }

  // about page
  def about = Action {implicit request =>
    Ok(views.html.about())
  }

   // tasklist
  def tasklist = Action {implicit request =>
    val usernameOption = request.session.get("username")
    usernameOption.map { username =>
      val tasks = TaskListInMemoryModel.getTasks(username)
      Ok(views.html.tasklist(tasks))
    }.getOrElse(Redirect(routes.HomeController.login))
    
  }

  //create user
  def createUser = Action { implicit request =>
    val postVals = request.body.asFormUrlEncoded
    postVals.map{args=>
      val username = args("email").head
      val password = args("password").head
      if(TaskListInMemoryModel.createUser(username,password)){
        Redirect(routes.HomeController.tasklist).withSession("username"->username)
      } else {
        Redirect(routes.HomeController.login).flashing("error"->"User signup failed")
      }
    }.getOrElse(Redirect(routes.HomeController.login))
    
  }

  // userlogin
  def userlogin = Action { implicit request =>
    val postVals = request.body.asFormUrlEncoded
    postVals.map{args=>
      val username = args("email").head
      val password = args("password").head
      if(TaskListInMemoryModel.validateUser(username,password)){
        Redirect(routes.HomeController.tasklist).withSession("username"->username)
      } else {
        Redirect(routes.HomeController.login).flashing("error"->"Invalid username/password credentials")
      }
    }.getOrElse(Redirect(routes.HomeController.login))
  }

  //logout button action
  def logout = Action { implicit request =>
    Redirect(routes.HomeController.login).withNewSession
  }

  //add task 
  def addTask = Action {implicit request =>
    val usernameOption = request.session.get("username")  
    usernameOption.map{ username =>
      
      val postVals = request.body.asFormUrlEncoded
      postVals.map{args=>
        val task = args("newTask").head
        TaskListInMemoryModel.addTask(username,task)
        Redirect(routes.HomeController.tasklist)
      }.getOrElse(Redirect(routes.HomeController.tasklist))
    }.getOrElse(Redirect(routes.HomeController.login))
  }


  //delete task
  def deleteTask = Action {implicit request =>
    val usernameOption = request.session.get("username")  
    usernameOption.map{ username =>
      
      val postVals = request.body.asFormUrlEncoded
      postVals.map{args=>
        val index = args("index").head.toInt
        TaskListInMemoryModel.removeTask(username,index)
        Redirect(routes.HomeController.tasklist)
      }.getOrElse(Redirect(routes.HomeController.tasklist))
    }.getOrElse(Redirect(routes.HomeController.login))
  }

}
