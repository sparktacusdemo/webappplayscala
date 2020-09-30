// @GENERATOR:play-routes-compiler
// @SOURCE:/home/hdpu00/play-samples-play-scala-forms-example/conf/routes
// @DATE:Wed Sep 30 17:20:06 CEST 2020

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  WidgetController_0: controllers.WidgetController,
  // @LINE:14
  UserController_2: controllers.UserController,
  // @LINE:19
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    WidgetController_0: controllers.WidgetController,
    // @LINE:14
    UserController_2: controllers.UserController,
    // @LINE:19
    Assets_1: controllers.Assets
  ) = this(errorHandler, WidgetController_0, UserController_2, Assets_1, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, WidgetController_0, UserController_2, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.WidgetController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """widgets""", """controllers.WidgetController.listWidgets"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """widgets""", """controllers.WidgetController.createWidget"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """userhome""", """controllers.UserController.indexuser"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users""", """controllers.UserController.listUsers"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users""", """controllers.UserController.createUser"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_WidgetController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_WidgetController_index0_invoker = createInvoker(
    WidgetController_0.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WidgetController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ Home page""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_WidgetController_listWidgets1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("widgets")))
  )
  private[this] lazy val controllers_WidgetController_listWidgets1_invoker = createInvoker(
    WidgetController_0.listWidgets,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WidgetController",
      "listWidgets",
      Nil,
      "GET",
      this.prefix + """widgets""",
      """ Widgets""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_WidgetController_createWidget2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("widgets")))
  )
  private[this] lazy val controllers_WidgetController_createWidget2_invoker = createInvoker(
    WidgetController_0.createWidget,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WidgetController",
      "createWidget",
      Nil,
      "POST",
      this.prefix + """widgets""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_UserController_indexuser3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("userhome")))
  )
  private[this] lazy val controllers_UserController_indexuser3_invoker = createInvoker(
    UserController_2.indexuser,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "indexuser",
      Nil,
      "GET",
      this.prefix + """userhome""",
      """Users
 Home page""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_UserController_listUsers4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users")))
  )
  private[this] lazy val controllers_UserController_listUsers4_invoker = createInvoker(
    UserController_2.listUsers,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "listUsers",
      Nil,
      "GET",
      this.prefix + """users""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_UserController_createUser5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users")))
  )
  private[this] lazy val controllers_UserController_createUser5_invoker = createInvoker(
    UserController_2.createUser,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "createUser",
      Nil,
      "POST",
      this.prefix + """users""",
      """""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_Assets_versioned6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned6_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_WidgetController_index0_route(params@_) =>
      call { 
        controllers_WidgetController_index0_invoker.call(WidgetController_0.index)
      }
  
    // @LINE:9
    case controllers_WidgetController_listWidgets1_route(params@_) =>
      call { 
        controllers_WidgetController_listWidgets1_invoker.call(WidgetController_0.listWidgets)
      }
  
    // @LINE:10
    case controllers_WidgetController_createWidget2_route(params@_) =>
      call { 
        controllers_WidgetController_createWidget2_invoker.call(WidgetController_0.createWidget)
      }
  
    // @LINE:14
    case controllers_UserController_indexuser3_route(params@_) =>
      call { 
        controllers_UserController_indexuser3_invoker.call(UserController_2.indexuser)
      }
  
    // @LINE:15
    case controllers_UserController_listUsers4_route(params@_) =>
      call { 
        controllers_UserController_listUsers4_invoker.call(UserController_2.listUsers)
      }
  
    // @LINE:16
    case controllers_UserController_createUser5_route(params@_) =>
      call { 
        controllers_UserController_createUser5_invoker.call(UserController_2.createUser)
      }
  
    // @LINE:19
    case controllers_Assets_versioned6_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned6_invoker.call(Assets_1.versioned(path, file))
      }
  }
}
