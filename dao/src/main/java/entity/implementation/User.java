package entity.implementation;

import entity.BaseEntityMarker;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;


/**
 * Created by Denis Areshkevich on 28.05.2017.
 */
@Table(name = "user")
@NoArgsConstructor
@ToString
public class User implements BaseEntityMarker {

    @Getter
    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Getter
    @Setter
    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Getter
    @Setter
    @Column(name = "second_name", nullable = false)
    private String secondName;

    @Getter
    @Setter
    @Column(name = "password", nullable = false)
    private String password;

    @Getter
    @Setter
    @Column(name = "passport_id", nullable = false)
    private String passportId;

    @Getter
    @Setter
    @Column(name = "country_of_residence", nullable = false)
    private String countryOfResidence;

    @Getter
    @Setter
    @Column(name = "city_of_residence", nullable = false)
    private String cityOfResidence;

    @Getter
    @Setter
    @Column(name = "home_address", nullable = false)
    private String homeAddress;

    @Getter
    @Setter
    @Column(name = "phone_number", nullable = false)
    private String phoneNumber;

    @Getter
    @Setter
    @OneToOne
    @JoinColumn(name = "order_for_rent_id")
    private OrderForRent orderForRent;


}