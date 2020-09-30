// @GENERATOR:play-routes-compiler
// @SOURCE:/home/hdpu00/play-samples-play-scala-forms-example/conf/routes
// @DATE:Wed Sep 30 17:20:06 CEST 2020

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:6
package controllers.javascript {

  // @LINE:19
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:19
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseWidgetController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def createWidget: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.WidgetController.createWidget",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "widgets"})
        }
      """
    )
  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.WidgetController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:9
    def listWidgets: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.WidgetController.listWidgets",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "widgets"})
        }
      """
    )
  
  }

  // @LINE:14
  class ReverseUserController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
    def listUsers: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.listUsers",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users"})
        }
      """
    )
  
    // @LINE:14
    def indexuser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.indexuser",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "userhome"})
        }
      """
    )
  
    // @LINE:16
    def createUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.createUser",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "users"})
        }
      """
    )
  
  }


}
