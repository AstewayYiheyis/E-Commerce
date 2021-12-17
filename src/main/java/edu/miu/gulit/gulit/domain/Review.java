package edu.miu.gulit.gulit.domain;
import lombok.AllArgsConstructor;
        import lombok.Data;
        import lombok.Getter;
        import lombok.NoArgsConstructor;

        import javax.persistence.*;
        import java.beans.Transient;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String title;
    String descripton;
    @ManyToOne
    Product product;
    @ManyToOne
    User user;
}

