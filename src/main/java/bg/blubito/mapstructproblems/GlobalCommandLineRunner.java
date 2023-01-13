package bg.blubito.mapstructproblems;

import bg.blubito.mapstructproblems.expressionAndConstantSolution.UserMapper;
import bg.blubito.mapstructproblems.p1.PersonDTOP1;
import bg.blubito.mapstructproblems.p1.PersonMapperP1;
import bg.blubito.mapstructproblems.p1.PersonP1;
import bg.blubito.mapstructproblems.p2.PersonMapperP2;
import bg.blubito.mapstructproblems.p3.PersonMapperP3;
import bg.blubito.mapstructproblems.p4.*;
import bg.blubito.mapstructproblems.stackOverflowSolution.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Component
public class GlobalCommandLineRunner implements CommandLineRunner {
    //Mapper for P1
    private PersonMapperP1 personMapperP1;

    //Mapper for P2
    private PersonMapperP2 personMapperP2;

    //Mapper for P3
    private PersonMapperP3 personMapperP3;

    //Mapper for P4
    private PersonMapperP4 personMapperP4;

    //Mapper for stackOverflowSolution
    private OrderMapper orderMapper;
    private OrderItemMapper orderItemMapper;

    //Mapper for expressionAndConstantSolution
    private UserMapper userMapper;

    public GlobalCommandLineRunner(PersonMapperP1 personMapperP1,
                                   PersonMapperP2 personMapperP2,
                                   PersonMapperP3 personMapperP3,
                                   PersonMapperP4 personMapperP4,
                                   OrderMapper orderMapper,
                                   OrderItemMapper orderItemMapper,
                                   UserMapper userMapper) {
        this.personMapperP1 = personMapperP1;
        this.personMapperP2 = personMapperP2;
        this.personMapperP3 = personMapperP3;
        this.personMapperP4 = personMapperP4;
        this.orderMapper = orderMapper;
        this.orderItemMapper = orderItemMapper;
        this.userMapper = userMapper;
    }

    @Override
    public void run(String... args) throws Exception {
        //TODO: P1
        System.out.println("\n----------------Example for basic mapper------------------\n");

        System.out.println("\n----------------From entity to dto case------------------\n");

        PersonP1 personP1 = new PersonP1("Asen", "Sofia", 21);
        System.out.println("Actual:\n" + personP1 + "\n");

        PersonDTOP1 personDTOP1 = personMapperP1.toDTO(personP1);
        System.out.println("Result:\n" + personDTOP1 + "\n");

        System.out.println("\n-----------------Form dto to entity case-----------------\n");

        PersonDTOP1 personDTOP11 = new PersonDTOP1("Asen", "Sofia", 21);
        System.out.println("Actual:\n" + personDTOP11 + "\n");

        PersonP1 personP11 = personMapperP1.toEntity(personDTOP11);
        System.out.println("Result:\n" + personP11 + "\n");


//        //TODO: P2
//        System.out.println("\n----------------Example for mapping two fields with different name------------------\n");
//
//        System.out.println("From PersonDTOP2 field name to PersonP2 field firstName and vice versa");
//
//        System.out.println("\n----------------From entity to dto case------------------\n");
//
//        PersonP2 personP2 = new PersonP2("Asen", "Sofia", 21);
//        System.out.println("Actual:\n" + personP2 + "\n");
//
//        PersonDTOP2 personDTOP2 = personMapperP2.toDTO(personP2);
//        System.out.println("Result:\n" + personDTOP2 + "\n");
//
//        System.out.println("\n-----------------Form dto to entity case-----------------\n");
//
//        PersonDTOP2 personDTOP21 = new PersonDTOP2("Asen", "Sofia", 21);
//        System.out.println("Actual:\n" + personDTOP21 + "\n");
//
//        PersonP2 personP21 = personMapperP2.toEntity(personDTOP21);
//        System.out.println("Result:\n" + personP21 + "\n");


//        //TODO: P3
//        System.out.println("\n----------------Example for converting object to field and vice versa------------------\n");
//        System.out.println("From Object Country with field name to PersonDTOP3 field countryName");
//
//        System.out.println("\n----------------From entity to dto case------------------\n");
//        CountryP3 countryP3 = new CountryP3("Bulgaria");
//        PersonP3 personP3 = new PersonP3("Asen", "Sofia", 21, countryP3);
//
//        System.out.println("Actual:\n" + countryP3 + "\n");
//        System.out.println("Actual:\n" + personP3 + "\n");
//
//        PersonDTOP3 personDTOP3 = personMapperP3.toDTO(personP3);
//        System.out.println("Result:\n" + personDTOP3 + "\n");
//
//        System.out.println("\n-----------------Form dto to entity case-----------------\n");
//        PersonDTOP3 personDTOP21 = new PersonDTOP3("Asen", "Sofia", 21, "Bulgaria");
//        System.out.println("Actual:\n" + personDTOP21 + "\n");
//
//        PersonP3 personP31 = personMapperP3.toEntity(personDTOP21);
//        System.out.println("Result:\n" + personP31 + "\n");


//        //TODO: P4
//        System.out.println("\n----------------Example for mapper using another mapper------------------\n");
//
//        System.out.println("\n----------------From entity to dto case------------------\n");
//
//        CountryP4 countryP4 = new CountryP4("Bulgaria");
//        PersonP4 personP4 = new PersonP4("Asen", countryP4);
//
//        System.out.println("Actual:\n" + countryP4 + "\n");
//        System.out.println("Actual:\n" + personP4 + "\n");
//
//        PersonDTOP4 personDTOP4 = personMapperP4.toDTO(personP4);
//        System.out.println("Result:\n" + personDTOP4 + "\n");
//
//        System.out.println("\n-----------------Form dto to entity case-----------------\n");
//        CountryDTOP4 countryDTOP4 = new CountryDTOP4("Bulgaria");
//        PersonDTOP4 personDTOP41 = new PersonDTOP4("Asen", countryDTOP4);
//
//        System.out.println("Actual:\n" + countryDTOP4 + "\n");
//        System.out.println("Actual:\n" + personDTOP41 + "\n");
//
//        PersonP4 personP41 = personMapperP4.toEntity(personDTOP41);
//        System.out.println("Result:\n" + personP41 + "\n");
//
//
//        //TODO: StackOverflowSolution
//        System.out.println("\n----------------Example for StackOverflow------------------\n");
//
//        System.out.println("\n----------------From entity to dto case------------------\n");
//
//        Order order = new Order(1L, "Me", "You");
//        OrderItem orderItem = new OrderItem("Thing", BigDecimal.ONE, 1, order);
//        List<OrderItem> orderItemList = new ArrayList<>();
//        orderItemList.add(orderItem);
//        order.setOrderItemList(orderItemList);
//
//        System.out.println("Actual:\n" + order + "\n");
//        System.out.println("Actual:\n" + orderItem + "\n");
//
//        OrderDTO orderDTO = orderMapper.toDTO(order);
//        System.out.println("Result:\n" + orderDTO.specialToString() + "\n");
//
//        OrderItemDTO orderItemDTO = orderItemMapper.toDTO(orderItem);
//        System.out.println("Result:\n" + orderItemDTO + "\n");
//
//        System.out.println("\n-----------------Form dto to entity case-----------------\n");
//
//        OrderDTO orderDTO1 = new OrderDTO(1L, "Me", "You");
//        OrderItemDTO orderItemDTO1 = new OrderItemDTO("Thing", BigDecimal.ONE, 1, orderDTO1);
//        List<OrderItemDTO> orderItemDTOList = new ArrayList<>();
//        orderItemDTOList.add(orderItemDTO1);
//        orderDTO1.setOrderItemList(orderItemDTOList);
//
//        System.out.println("Actual:\n" + orderDTO1 + "\n");
//        System.out.println("Actual:\n" + orderItemDTO1 + "\n");
//
//        Order order1 = orderMapper.toEntity(orderDTO1);
//        System.out.println("Result:\n" + order1.specialToString() + "\n");
//
//        OrderItem orderItem1 = orderItemMapper.toEntity(orderItemDTO1);
//        System.out.println("Result:\n" + orderItem1 + "\n");
//
//
//
//        //TODO: ExpressionAndConstantSolution
//        System.out.println("\n----------------Example for Expressions and Constants------------------\n");
//
//        System.out.println("\n----------------From entity to dto case------------------\n");
//
//        User user = new User("Georgi");
//        System.out.println("Actual:\n" + user + "\n");
//
//        UserDTO userDTO = userMapper.toDTO(user);
//        System.out.println("Result:\n" + userDTO + "\n");
//
//        System.out.println("\n-----------------Form dto to entity case-----------------\n");
//
//        UserDTO userDTO1 = new UserDTO("Asen");
//        System.out.println("Actual:\n" + userDTO1 + "\n");
//
//        User user1 = userMapper.toEntity(userDTO1);
//        System.out.println("Result:\n" + user1 + "\n");
    }
}
