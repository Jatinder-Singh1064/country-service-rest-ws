# country-service-rest-ws

RESOURCES PUBLISHED

--getPopulation = GET
http://localhost:8080/Jatinder_MidTermPartB/resources/CountryService/population

-- getCountryById= GET
http://localhost:8080/Jatinder_MidTermPartB/resources/CountryService/country/2

-- addCountry= POST
http://localhost:8080/Jatinder_MidTermPartB/resources/CountryService/addcountry

-- updateCountryName = PUT
http://localhost:8080/Jatinder_MidTermPartB/resources/CountryService/updatename/33?name=New Netherlands


-- getCountryiesWithMoreThanFiveStates = GET
http://localhost:8080/Jatinder_MidTermPartB/resources/CountryService/countries

-- getAllCountries = GET
http://localhost:8080/Jatinder_MidTermPartB/resources/CountryService/allcountries

=-===============================================================================================

{
    "city": "Boston",
    "id": "23",
    "name": "USA",
    "states": [
        "California",
        "Kentucky",
        "New York",
        "Florida",
        "Washington",
        "Illinois",
        "Massachusetts"
    ]
}

{
    "city": "Amsterdam",
    "id": "33",
    "name": "Netherlands",
    "states": [
        "Zeeland",
        "Limburg",
        "Holland"
    ]
}

-------------------------------

{
    "city": "Amsterdam",
    "id": "33",
    "name": "New Netherlands",
    "states": [
        "Zeeland",
        "Limburg",
        "Holland"
    ]
}
