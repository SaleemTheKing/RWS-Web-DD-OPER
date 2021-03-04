package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import models.Gebruiker;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;
import saleem.orm.utils.HibernateUtil;

import javax.persistence.EntityManager;

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


    public Result Register(Http.Request request) {

        JsonNode node = request.body().asJson();
        String email =  node.get("email").textValue();
        String password = node.get("password").textValue();
//        // FIXME: We are not checking if the email already exists.
        SessionFactory sessionFactory = HibernateUtil.getSession();
        Session session = sessionFactory.getCurrentSession();
        EntityManager em = sessionFactory.createEntityManager();
        em.getTransaction().begin();
        Gebruiker gebruiker = new Gebruiker(email, password);
        session.beginTransaction();
        session.save(gebruiker);
        session.getTransaction().commit();
        session.close();
        return ok(views.html.login.render());
    }


    public Result tryLogin(String email, String password) {
        SessionFactory session = HibernateUtil.getSession();
        EntityManager em = session.createEntityManager();
        em.getTransaction().begin();

        Gebruiker user = (Gebruiker) em.createQuery("from Gebruiker g where g.email = :email and g.password = :password")
                .setParameter("email", email)
                .setParameter("password", password)
                .getSingleResult();
        if (user != null) return ok(views.html.start.render());
        else return badRequest("Error wrong credentials");

    }
}
