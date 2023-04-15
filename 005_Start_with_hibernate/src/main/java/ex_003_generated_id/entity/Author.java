package ex_003_generated_id.entity;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;

@Entity
@DynamicUpdate
@DynamicInsert
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    @Column(name = "name22")
    private String name;

    @Column(name = "last_name")
    private String lastName;
    //***********New*************8
    @Column(name = "NewColum")
    private  String NewColum;
     @Column(name = "MiddleName")
     private String MiddleName;


    public Author(String name) {
        this.name = name;
    }

    public Author() {

    }

    public String getMiddleName() {
        return MiddleName;
    }

    public void setMiddleName(String middleName) {
        MiddleName = middleName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNewColum() {
        return NewColum;
    }

    public void setNewColum(String newColum) {
        NewColum = newColum;
    }
}
