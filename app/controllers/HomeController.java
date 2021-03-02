package controllers;

import play.mvc.Controller;
import play.mvc.Result;

public class HomeController extends Controller {

    public Result login() {
        return ok(views.html.login.render());
    }

    public Result start() {
        return ok(views.html.start.render());
    }

    public Result test() {
        return ok(views.html.test1.render());
    }

}
