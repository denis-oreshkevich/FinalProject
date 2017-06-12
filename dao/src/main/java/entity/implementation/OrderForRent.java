package entity.implementation;


import entity.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

/**
 * Created by Denis Areshkevich on 12.06.2017.
 */
@Entity
@Table(name = "order_for_rent")
@NoArgsConstructor
@ToString
public class OrderForRent implements BaseEntityMarker {

    @Getter
    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Getter
    @Setter
    @OneToMany(mappedBy = "orderForRent")
    private Set<Transport> transport;

    @Getter
    @Setter
    @Column(name = "start_time", nullable = false)
    private LocalDateTime startTime;

    @Getter
    @Setter
    @Column(name = "end_time", nullable = false)
    private LocalDateTime endTime;

    @Getter
    @Setter
    @Version
    @Column(name = "last_update")
    private LocalDateTime lastUpdate;

    @Getter
    @Setter
    @OneToOne(mappedBy = "orderForRent")
    private User user;
}
