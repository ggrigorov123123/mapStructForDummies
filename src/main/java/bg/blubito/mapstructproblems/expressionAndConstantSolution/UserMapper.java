package bg.blubito.mapstructproblems.expressionAndConstantSolution;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {
    @Mapping(target = "active", constant = "true")
    User toEntity(UserDTO userDTO);

    @Mapping(target = "active", expression = "java(user.modifyActiveToInactive())")
    UserDTO toDTO(User user);
}
