// @GENERATOR:play-routes-compiler
// @SOURCE:D:/IdeaProjects/RWS-web-DD-OPER/conf/routes
// @DATE:Mon Mar 01 12:31:19 CET 2021


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
