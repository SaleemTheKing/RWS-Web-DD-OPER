// @GENERATOR:play-routes-compiler
// @SOURCE:D:/IdeaProjects/RWS-web-DD-OPER/conf/routes
// @DATE:Tue Mar 02 13:42:46 CET 2021


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
