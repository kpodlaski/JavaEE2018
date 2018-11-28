package jpamodel;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Krzysztof Podlaski on 28.11.2018.
 */
@Entity
public class Jednostka {
    private Integer id;
    private String nazwa;
    private List<Pracownik> pracownicy;

    @Id
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "nazwa")
    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Jednostka jednostka = (Jednostka) o;

        if (id != null ? !id.equals(jednostka.id) : jednostka.id != null) return false;
        if (nazwa != null ? !nazwa.equals(jednostka.nazwa) : jednostka.nazwa != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (nazwa != null ? nazwa.hashCode() : 0);
        return result;
    }

    @ManyToMany
    @JoinTable(name = "PracJednLnk",
            catalog = "",
            schema = "",
            joinColumns = @JoinColumn(name = "id_jedn",
                    referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "id_prac",
                    referencedColumnName = "id"))
    public List<Pracownik> getPracownicy() {
        return pracownicy;
    }

    public void setPracownicy(List<Pracownik> pracownicy) {
        this.pracownicy = pracownicy;
    }
}
