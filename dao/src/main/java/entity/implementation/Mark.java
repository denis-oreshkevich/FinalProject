package entity.implementation;

import entity.*;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Denis Areshkevich on 12.06.2017.
 */
@Entity
@Table(name = "mark")
public class Mark implements BaseEntityMarker {

    @Getter
    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Getter
    @Setter
    @Column(name = "name", nullable = false)
    private String name;

    @Getter
    @Setter
    @OneToMany(mappedBy = "mark")
    private Set<Transport> transportSet;
}
