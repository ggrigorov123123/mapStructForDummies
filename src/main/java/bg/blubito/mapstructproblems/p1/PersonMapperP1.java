package bg.blubito.mapstructproblems.p1;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PersonMapperP1 {
    PersonP1 toEntity (PersonDTOP1 personDTOP1);

    PersonDTOP1 toDTO (PersonP1 personP1);
}
