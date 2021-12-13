package edu.miu.gulit.gulit.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.tomcat.jni.Address;

import javax.persistence.*;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class UserOrder {
    @Id
    private int number;
    private LocalDateTime canceledDateTime;
    private LocalDateTime orderDateTime;
    private LocalDateTime shippedDateTime;
    private LocalDateTime arrivedDateTime;
    private LocalDateTime deliveredDateTime;

    @OneToOne
    @JoinColumn(name = "shipping_address_id")
    private UserAddress shippingAddress;

    private OrderStatus orderstatus;

    @OneToOne
    @JoinColumn(name = "billing_address_id")
    private UserAddress billingAddress;

    @ManyToOne
    @JoinColumn(name = "buyer_id")
    private Buyer buyer;
}