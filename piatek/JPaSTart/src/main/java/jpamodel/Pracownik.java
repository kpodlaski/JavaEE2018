package jpamodel;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Krzysztof Podlaski on 30.11.2018.
 */
@NamedQuery(name = "Pracownik.byImie",
query = "Select p From Pracownik p where p.imie = :imie")

@Entity
public class Pracownik {
    private Integer id;
    private String imie;
    private String nazwisko;
    private Stanowisko stanowisko;
    private List<Jednostka> jednostki;

    @Id
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "imie")
    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    @Basic
    @Column(name = "nazwisko")
    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pracownik pracownik = (Pracownik) o;

        if (id != null ? !id.equals(pracownik.id) : pracownik.id != null) return false;
        if (imie != null ? !imie.equals(pracownik.imie) : pracownik.imie != null) return false;
        if (nazwisko != null ? !nazwisko.equals(pracownik.nazwisko) : pracownik.nazwisko != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (imie != null ? imie.hashCode() : 0);
        result = 31 * result + (nazwisko != null ? nazwisko.hashCode() : 0);
        return result;
    }

    @OneToOne
    @JoinColumn(name = "stanowisko",
            referencedColumnName = "id")
    public Stanowisko getStanowisko() {
        return stanowisko;
    }

    public void setStanowisko(Stanowisko stanowisko) {
        this.stanowisko = stanowisko;
    }

    @ManyToMany(mappedBy = "pracownicy")
    public List<Jednostka> getJednostki() {
        return jednostki;
    }

    public void setJednostki(List<Jednostka> jednostki) {
        this.jednostki = jednostki;
    }
}
