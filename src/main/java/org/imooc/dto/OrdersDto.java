package org.imooc.dto;

import lombok.Data;
import org.imooc.bean.Orders;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
@Data
public class OrdersDto extends Orders {

    private String img;
    private String title;
    private Integer count;
}