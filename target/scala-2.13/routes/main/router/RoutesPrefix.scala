// @GENERATOR:play-routes-compiler
// @SOURCE:/home/hdpu00/play-samples-play-scala-forms-example/conf/routes
// @DATE:Wed Sep 30 17:20:06 CEST 2020


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
