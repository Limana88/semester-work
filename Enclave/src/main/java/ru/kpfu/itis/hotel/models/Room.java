package ru.kpfu.itis.hotel.models;

import lombok.*;

import javax.persistence.*;

//@Data
@Getter
@Setter
@EqualsAndHashCode
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "room_hotel")
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String photo;
    private Long dateFrom;
    private Long dateTo;
    private Integer roomsNumber;
    private Integer adultsNumber;
    private Integer childNumber;
    private Integer price;

    @ToString.Exclude
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
