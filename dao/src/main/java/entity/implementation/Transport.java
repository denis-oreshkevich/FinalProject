package entity.implementation;

import entity.BaseEntityMarker;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Set;

/**
 * Created by Denis Areshkevich on 12.06.2017.
 */
@Entity
@Table(name = "transport")
@Inheritance(strategy = InheritanceType.JOINED)
@ToString
public class Transport implements BaseEntityMarker {

    @Getter
    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Getter
    @Setter
    @ManyToOne
    @JoinColumn(name = "mark_id")
    private Mark mark;

    @Getter
    @Setter
    @Column(name = "model")
    private String model;

    @Getter
    @Setter
    @ManyToOne
    @JoinColumn(name = "seat_id")
    private Seat seat;

    @Getter
    @Setter
    @Column(name = "number_of_doors")
    private int numberOfDoors;

    @Getter
    @Setter
    @Column(name = "description")
    private String description;

    @Getter
    @Setter
    @Column(name = "price")
    private BigDecimal price;

    @Getter
    @Setter
    @ManyToMany(mappedBy = "transports")
    Set<FuelCharacteristic> fuelCharacteristicSet;

    @Getter
    @Setter
    @ManyToOne
    @JoinColumn(name = "order_for_rent_id")
    private OrderForRent orderForRent;

    @Getter
    @Setter
    @Version
    @Column(name = "last_update")
    private LocalDateTime lastUpdate;

}
