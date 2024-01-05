package com.example.demo.Entity;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tbl_player", schema = "cricket", uniqueConstraints =
@UniqueConstraint(name = "email_id_unique", columnNames = "email_id"))
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Player {
    @Id
    @SequenceGenerator(name = "player_sequence",
            sequenceName = "player_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "player_sequence")
    @Column(name = "playerId")
    private Long id;
    @Column(name = "firstNameOfPlayer", nullable = false)
    private String firstname;
    @Column(name = "lastName")
    private String lastName;

    @Column(name = "email_id", nullable = false)
    private String email;
    @Column(name = "age")
    private int age;
    @Column(name = "state")
    private String state;

}
