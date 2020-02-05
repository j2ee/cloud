package org.j2ee.cloud.mall.order.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
//@RequiredArgsConstructor
public class Order implements Serializable {

    private int id;

}
