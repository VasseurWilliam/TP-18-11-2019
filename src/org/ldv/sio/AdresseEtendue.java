package org.ldv.sio;

public class AdresseEtendue {

    private String url;
    private String email;

    public AdresseEtendue(String url, String email) {
        this.url = url;
        this.email = email;
    }


    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "AdresseEtendue{" +
                "url='" + url + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
