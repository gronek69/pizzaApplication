package pl.dawid.pizzaapplication.remote.rest.dto.response;

import pl.dawid.pizzaapplication.remote.rest.dto.common.OrdersDto;

import java.util.List;

public class OrdersCollectionDto {

    private List<OrdersDto> orders;

    public OrdersCollectionDto() {
    }

    public OrdersCollectionDto(List<OrdersDto> orders) {
        this.orders = orders;
    }

    public List<OrdersDto> getOrders() {
        return orders;
    }

    public void setOrders(List<OrdersDto> orders) {
        this.orders = orders;
    }
}
