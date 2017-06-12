package entity.implementation;

import entity.BaseEntityMarker;
import entity.enumeration.Comfort;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Denis Areshkevich on 12.06.2017.
 */
@Entity
@Table(name = "seat")
public class Seat implements BaseEntityMarker {

    @Getter
    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Getter
    @Setter
    @Column(name = "number", nullable = false)
    private int number;

    @Getter
    @Setter
    @Enumerated(EnumType.STRING)
    @Column(name = "comfort_type", nullable = false)
    private Comfort type;

    @Getter
    @Setter
    @OneToMany(mappedBy = "seat")
    private Set<Transport> transportSet;
}
