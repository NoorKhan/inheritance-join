package khan.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "matter_coding_field")
public class MatterCodingField extends CodingField {

    @Column(name = "matter_id")
    private int matterId;

    public MatterCodingField() {
    }

    public MatterCodingField(Integer codingFieldId, String name, int matterId) {
        super(codingFieldId, name);
        this.matterId = matterId;
    }

    public int getMatterId() {
        return matterId;
    }

    public void setMatterId(int matterId) {
        this.matterId = matterId;
    }
}
