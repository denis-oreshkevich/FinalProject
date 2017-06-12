package entity.implementation;

import entity.BaseEntityMarker;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 * Created by Denis Areshkevich on 12.06.2017.
 */
@Entity
@Table(name = "car")
@PrimaryKeyJoinColumn(name = "transport_id")
public class Car extends Transport implements BaseEntityMarker {

    @Getter
    @Setter
    @Column(name = "max_speed", nullable = false)
    private int maxSpeed;
}
