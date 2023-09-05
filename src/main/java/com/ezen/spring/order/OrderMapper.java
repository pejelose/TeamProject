package com.ezen.spring.order;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Component("orderMapper")
@Mapper
public interface OrderMapper {

	int getMaxOrderNum();

	int addOrder(Order order);

	List<Order> orderList(String uid);

}
