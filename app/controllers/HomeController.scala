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
  def index = Action {
    Ok(views.html.index("Welcome"))
  }

  //  login page
  def login = Action {
    Ok(views.html.login())
  }

  // signup page
  def signup = Action {
    Ok(views.html.signup())
  }

  // about page
  def about = Action {
    Ok(views.html.about())
  }

   // tasklist
  def tasklist = Action {
    val tasks = List("Task1","Task2","Task3")
    Ok(views.html.tasklist(tasks))
  }

  // userlogin
  def userlogin = Action { request=>
    val postVals = request.body.asFormUrlEncoded
    postVals.map{args=>
      val username = args("email").head
      val password = args("password").head
      if(TaskListInMemoryModel.validateUser(username,password)){
        Redirect(routes.HomeController.tasklist)
      } else {
        Redirect(routes.HomeController.login)
      }
    }.getOrElse(Redirect(routes.HomeController.login))
    
  }
}
