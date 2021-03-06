// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_3: controllers.HomeController,
  // @LINE:8
  CountController_2: controllers.CountController,
  // @LINE:10
  AsyncController_0: controllers.AsyncController,
  // @LINE:13
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_3: controllers.HomeController,
    // @LINE:8
    CountController_2: controllers.CountController,
    // @LINE:10
    AsyncController_0: controllers.AsyncController,
    // @LINE:13
    Assets_1: controllers.Assets
  ) = this(errorHandler, HomeController_3, CountController_2, AsyncController_0, Assets_1, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_3, CountController_2, AsyncController_0, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """count""", """controllers.CountController.count"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """message""", """controllers.AsyncController.message"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(file:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.HomeController.login"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signup""", """controllers.HomeController.signup"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """about""", """controllers.HomeController.about"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tasklist""", """controllers.HomeController.tasklist"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """userlogin""", """controllers.HomeController.userlogin"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """createUser""", """controllers.HomeController.createUser"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.HomeController.logout"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addTask""", """controllers.HomeController.addTask"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deleteTask""", """controllers.HomeController.deleteTask"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_3.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_CountController_count1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("count")))
  )
  private[this] lazy val controllers_CountController_count1_invoker = createInvoker(
    CountController_2.count,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CountController",
      "count",
      Nil,
      "GET",
      this.prefix + """count""",
      """ An example controller showing how to use dependency injection""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_AsyncController_message2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("message")))
  )
  private[this] lazy val controllers_AsyncController_message2_invoker = createInvoker(
    AsyncController_0.message,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AsyncController",
      "message",
      Nil,
      "GET",
      this.prefix + """message""",
      """ An example controller showing how to write asynchronous code""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_Assets_versioned3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned3_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_HomeController_login4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_HomeController_login4_invoker = createInvoker(
    HomeController_3.login,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "login",
      Nil,
      "GET",
      this.prefix + """login""",
      """ Login-page""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_HomeController_signup5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup")))
  )
  private[this] lazy val controllers_HomeController_signup5_invoker = createInvoker(
    HomeController_3.signup,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "signup",
      Nil,
      "GET",
      this.prefix + """signup""",
      """ Signup-page""",
      Seq()
    )
  )

  // @LINE:22
  private[this] lazy val controllers_HomeController_about6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("about")))
  )
  private[this] lazy val controllers_HomeController_about6_invoker = createInvoker(
    HomeController_3.about,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "about",
      Nil,
      "GET",
      this.prefix + """about""",
      """ About-page""",
      Seq()
    )
  )

  // @LINE:25
  private[this] lazy val controllers_HomeController_tasklist7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tasklist")))
  )
  private[this] lazy val controllers_HomeController_tasklist7_invoker = createInvoker(
    HomeController_3.tasklist,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "tasklist",
      Nil,
      "GET",
      this.prefix + """tasklist""",
      """ tasklist-page""",
      Seq()
    )
  )

  // @LINE:29
  private[this] lazy val controllers_HomeController_userlogin8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("userlogin")))
  )
  private[this] lazy val controllers_HomeController_userlogin8_invoker = createInvoker(
    HomeController_3.userlogin,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "userlogin",
      Nil,
      "POST",
      this.prefix + """userlogin""",
      """""",
      Seq()
    )
  )

  // @LINE:33
  private[this] lazy val controllers_HomeController_createUser9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("createUser")))
  )
  private[this] lazy val controllers_HomeController_createUser9_invoker = createInvoker(
    HomeController_3.createUser,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "createUser",
      Nil,
      "POST",
      this.prefix + """createUser""",
      """""",
      Seq()
    )
  )

  // @LINE:36
  private[this] lazy val controllers_HomeController_logout10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_HomeController_logout10_invoker = createInvoker(
    HomeController_3.logout,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "logout",
      Nil,
      "GET",
      this.prefix + """logout""",
      """ logout""",
      Seq()
    )
  )

  // @LINE:39
  private[this] lazy val controllers_HomeController_addTask11_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addTask")))
  )
  private[this] lazy val controllers_HomeController_addTask11_invoker = createInvoker(
    HomeController_3.addTask,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addTask",
      Nil,
      "POST",
      this.prefix + """addTask""",
      """ add task""",
      Seq()
    )
  )

  // @LINE:42
  private[this] lazy val controllers_HomeController_deleteTask12_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteTask")))
  )
  private[this] lazy val controllers_HomeController_deleteTask12_invoker = createInvoker(
    HomeController_3.deleteTask,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "deleteTask",
      Nil,
      "POST",
      this.prefix + """deleteTask""",
      """ delete task""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_3.index)
      }
  
    // @LINE:8
    case controllers_CountController_count1_route(params@_) =>
      call { 
        controllers_CountController_count1_invoker.call(CountController_2.count)
      }
  
    // @LINE:10
    case controllers_AsyncController_message2_route(params@_) =>
      call { 
        controllers_AsyncController_message2_invoker.call(AsyncController_0.message)
      }
  
    // @LINE:13
    case controllers_Assets_versioned3_route(params@_) =>
      call(params.fromPath[String]("file", None)) { (file) =>
        controllers_Assets_versioned3_invoker.call(Assets_1.versioned(file))
      }
  
    // @LINE:16
    case controllers_HomeController_login4_route(params@_) =>
      call { 
        controllers_HomeController_login4_invoker.call(HomeController_3.login)
      }
  
    // @LINE:19
    case controllers_HomeController_signup5_route(params@_) =>
      call { 
        controllers_HomeController_signup5_invoker.call(HomeController_3.signup)
      }
  
    // @LINE:22
    case controllers_HomeController_about6_route(params@_) =>
      call { 
        controllers_HomeController_about6_invoker.call(HomeController_3.about)
      }
  
    // @LINE:25
    case controllers_HomeController_tasklist7_route(params@_) =>
      call { 
        controllers_HomeController_tasklist7_invoker.call(HomeController_3.tasklist)
      }
  
    // @LINE:29
    case controllers_HomeController_userlogin8_route(params@_) =>
      call { 
        controllers_HomeController_userlogin8_invoker.call(HomeController_3.userlogin)
      }
  
    // @LINE:33
    case controllers_HomeController_createUser9_route(params@_) =>
      call { 
        controllers_HomeController_createUser9_invoker.call(HomeController_3.createUser)
      }
  
    // @LINE:36
    case controllers_HomeController_logout10_route(params@_) =>
      call { 
        controllers_HomeController_logout10_invoker.call(HomeController_3.logout)
      }
  
    // @LINE:39
    case controllers_HomeController_addTask11_route(params@_) =>
      call { 
        controllers_HomeController_addTask11_invoker.call(HomeController_3.addTask)
      }
  
    // @LINE:42
    case controllers_HomeController_deleteTask12_route(params@_) =>
      call { 
        controllers_HomeController_deleteTask12_invoker.call(HomeController_3.deleteTask)
      }
  }
}
