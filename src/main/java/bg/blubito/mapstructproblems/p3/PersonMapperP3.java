package bg.blubito.mapstructproblems.p3;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PersonMapperP3 {
    @Mapping(target = "country.name", source = "countryName")
    PersonP3 toEntity (PersonDTOP3 personDTOP3);

    @Mapping(target = "countryName", source = "country.name")
    PersonDTOP3 toDTO (PersonP3 personP3);
}
