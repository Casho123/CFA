package entity;

import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;

@Entity
@MappedSuperclass
public abstract class BaseEntity {

    private Long id;

    public BaseEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
