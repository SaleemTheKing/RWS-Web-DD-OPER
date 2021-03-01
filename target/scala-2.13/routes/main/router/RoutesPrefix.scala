// @GENERATOR:play-routes-compiler
// @SOURCE:D:/IdeaProjects/play-samples-play-java-hello-world-tutorial/conf/routes
// @DATE:Mon Mar 01 10:05:49 CET 2021


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
