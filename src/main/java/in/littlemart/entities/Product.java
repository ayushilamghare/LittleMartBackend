package in.littlemart.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Integer id;

    @Column(name="product_title", length = 255)
    private String title;

    @Column(name="product_desc",  columnDefinition = "TEXT",  length = 2000)
    private String description;

    @Column(name="product_category",  length = 255)
    private String category;

    @Column(name="product_images", length = 255)
    private String image;

    @Column(name="product_price")
    private double price;

    @Column(name="product_stock")
    private int stock;

}
