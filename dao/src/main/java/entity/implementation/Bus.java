package entity.implementation;

import entity.BaseEntityMarker;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 * Created by Denis Areshkevich on 12.06.2017.
 */
@Entity
@Table(name = "bus")
@NoArgsConstructor
@PrimaryKeyJoinColumn(name = "transport_id")
public class Bus extends Transport implements BaseEntityMarker {

    @Getter
    @Setter
    @Column(name = "stay_positions", nullable = false)
    private int stayPositions;
}
