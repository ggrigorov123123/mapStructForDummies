package bg.blubito.mapstructproblems.p4;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = CountryMapperP4.class)
public interface PersonMapperP4 {
    PersonP4 toEntity (PersonDTOP4 personDTOP4);

    PersonDTOP4 toDTO (PersonP4 personP4);
}
