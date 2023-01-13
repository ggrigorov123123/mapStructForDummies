package bg.blubito.mapstructproblems.stackOverflowSolution;

import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import java.util.List;

@Mapper(componentModel = "spring", uses = OrderMapper.class)
public interface OrderItemMapper {
    @Mapping(target = "order", source = "order", qualifiedByName = "specialToEntity")
    OrderItem toEntity(OrderItemDTO orderItemDTO);

    @Mapping(target = "order", source = "order", qualifiedByName = "specialToDTO")
    OrderItemDTO toDTO(OrderItem orderItem);

    @Named("specialToDTO")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "name", source = "name")
    @Mapping(target = "price", source = "price")
    @Mapping(target = "quantity", source = "quantity")
    @Mapping(target = "order", ignore = true)
    OrderItemDTO toDTOSpecial(OrderItem orderItem);

    @Named("specialToEntity")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "name", source = "name")
    @Mapping(target = "price", source = "price")
    @Mapping(target = "quantity", source = "quantity")
    @Mapping(target = "order", ignore = true)
    OrderItem toEntitySpecial(OrderItemDTO orderItemDTO);
}
