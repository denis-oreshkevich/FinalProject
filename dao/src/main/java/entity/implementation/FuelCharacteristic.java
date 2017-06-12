package entity.implementation;

import entity.*;
import entity.enumeration.TypeOfFuel;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Denis Areshkevich on 12.06.2017.
 */
@Entity
@Table(name = "fuel_characteristic")
public class FuelCharacteristic implements BaseEntityMarker {

    @Getter
    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Getter
    @Setter
    @Column(name = "type_of_fuel", nullable = false)
    @Enumerated(EnumType.STRING)
    private TypeOfFuel typeOfFuel;

    @Getter
    @Setter
    @Column(name = "fuel_consumption", nullable = false)
    private String fuelConsumption;

    @Getter
    @Setter
    @ManyToMany
    @JoinTable(name = "transport_fuel_characteristic",
            joinColumns = @JoinColumn(name = "fuel_characteristic_id"),
            inverseJoinColumns = @JoinColumn(name = "transport_id")
    )
    private Set<Transport> transports;
}
