package bg.blubito.mapstructproblems.p4;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CountryMapperP4 {
    CountryP4 toEntity (CountryDTOP4 countryDTOP4);

    CountryDTOP4 toDTO (CountryP4 countryP4);
}
