package testregistrationAPIandOther1.APIreguser.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;


@Entity
@Table(name ="Users")
@NoArgsConstructor
@AllArgsConstructor


public class UserEntity {
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="user_id")
    private Long ID;
    @Setter
    @Getter
    @Column(name = "Name")
    private String Name;
    @Setter
    @Getter
    @Column(name = "date_of_registration")
    private Date doc;


    public UserEntity(String name, Date doc) {
        Name = name;
        this.doc = doc;
    }
}
