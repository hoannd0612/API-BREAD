package hungdt.ApiBread.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Order")
public class OrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "date_order")
    private Timestamp dateOrder;
    @Column(name = "total_price")
    private double totalPrice;
    @Column(name = "user_id")
    private String user_id;
    @Column(name = "is_delete")
    private boolean isDelete;
}
