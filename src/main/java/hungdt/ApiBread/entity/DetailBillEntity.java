package hungdt.ApiBread.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;



@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "detail_bill")
public class DetailBillEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "product_id")
    private int productId;
    @Column(name = "bill_id")
    private int billId;
    @Column(name = "quantity")
    private int quantity;
    @Column(name = "deleted")
    private int deleted;

}
