// @GENERATOR:play-routes-compiler
// @SOURCE:/home/hdpu00/play-samples-play-scala-forms-example/conf/routes
// @DATE:Wed Sep 30 17:20:06 CEST 2020

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:6
package controllers {

  // @LINE:19
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:19
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:6
  class ReverseWidgetController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def createWidget(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "widgets")
    }
  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:9
    def listWidgets(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "widgets")
    }
  
  }

  // @LINE:14
  class ReverseUserController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
    def listUsers(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "users")
    }
  
    // @LINE:14
    def indexuser(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "userhome")
    }
  
    // @LINE:16
    def createUser(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "users")
    }
  
  }


}
