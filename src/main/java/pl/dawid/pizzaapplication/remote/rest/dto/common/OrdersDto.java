package pl.dawid.pizzaapplication.remote.rest.dto.common;

import pl.dawid.pizzaapplication.domain.model.StatusType;

import java.util.List;

public class OrdersDto {

    private Integer id;
    private StatusType status;
    private List<PizzaOrderDto> pizzas;
    private PersonOrderDto person;

    public OrdersDto() {
    }

    public OrdersDto(Integer id, StatusType status, List<PizzaOrderDto> pizzas, PersonOrderDto person) {
        this.id = id;
        this.status = status;
        this.pizzas = pizzas;
        this.person = person;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public StatusType getStatus() {
        return status;
    }

    public void setStatus(StatusType status) {
        this.status = status;
    }

    public List<PizzaOrderDto> getPizzas() {
        return pizzas;
    }

    public void setPizzas(List<PizzaOrderDto> pizzas) {
        this.pizzas = pizzas;
    }

    public PersonOrderDto getPerson() {
        return person;
    }

    public void setPerson(PersonOrderDto person) {
        this.person = person;
    }
}
