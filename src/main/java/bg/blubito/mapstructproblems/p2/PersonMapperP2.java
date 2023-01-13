package bg.blubito.mapstructproblems.p2;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PersonMapperP2 {
    @Mapping(target = "firstName", source = "name")
    PersonP2 toEntity (PersonDTOP2 personDTOP2);

    @Mapping(target = "name", source = "firstName")
    PersonDTOP2 toDTO (PersonP2 personP2);
}
