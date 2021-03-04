package models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Gebruiker {

    public Gebruiker() {}
    public Gebruiker(String email, String password) {
        this.setEmail(email);
        this.setPassword(password);
    }


    @Id
    @GeneratedValue(generator = "increment")
    private Long id;

    private String email;
    private String password;


    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }
}
