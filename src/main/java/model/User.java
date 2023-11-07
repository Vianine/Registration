package model;

public class User {

    private String nom;
    private String email;
    private String motpass;

    public String getEmail() {
        return email;
    }

    public User(String nom, String email, String motpass) {
        this.nom = nom;
        this.email = email;
        this.motpass = motpass;
    }

    public User(String email, String motpass) {
        this.email = email;
        this.motpass = motpass;
    }

    @Override
    public String toString() {
        return "User{" +
                "nom='" + nom + '\'' +
                ", email='" + email + '\'' +
                ", motpass='" + motpass + '\'' +
                '}';
    }
}
