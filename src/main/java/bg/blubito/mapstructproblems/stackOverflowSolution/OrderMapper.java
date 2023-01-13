package bg.blubito.mapstructproblems.stackOverflowSolution;

import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "spring", uses = OrderItemMapper.class)
public interface OrderMapper {
    @Mapping(target = "orderItemList", source = "orderItemList", qualifiedByName = "specialToEntity")
    Order toEntity(OrderDTO orderDTO);

    @Mapping(target = "orderItemList", source = "orderItemList", qualifiedByName = "specialToDTO")
    OrderDTO toDTO(Order order);

    @Named("specialToDTO")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    @Mapping(target = "sender", source = "sender")
    @Mapping(target = "receiver", source = "receiver")
    @Mapping(target = "orderItemList", ignore = true)
    OrderDTO toDTOSpecial(Order order);

    @Named("specialToEntity")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    @Mapping(target = "sender", source = "sender")
    @Mapping(target = "receiver", source = "receiver")
    @Mapping(target = "orderItemList", ignore = true)
    Order toEntitySpecial(OrderDTO order);
}
