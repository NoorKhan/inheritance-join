package khan.model;

import javax.persistence.*;

@Entity
@Table(name = "coding_field")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class CodingField {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "coding_field_id")
    private Integer codingFieldId;

    @Column(name = "name")
    private String name;

    public CodingField() {
    }

    public CodingField(Integer codingFieldId, String name) {
        this.codingFieldId = codingFieldId;
        this.name = name;
    }

    public Integer getCodingFieldId() {
        return codingFieldId;
    }

    public void setCodingFieldId(Integer codingFieldId) {
        this.codingFieldId = codingFieldId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
