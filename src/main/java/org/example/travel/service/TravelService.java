package org.example.travel.service.Implement;

import org.example.travel.entity.Description;
import org.example.travel.entity.Travel;
import org.example.travel.entity.User;

import java.util.List;
import java.util.Optional;

public interface TravelService {
    List<Travel> findByTravelDescription(String name);
    List<Travel> getAllTravels();

    //    Neg hereglechiin medeelel hadgalah
    public Travel createTravel(Travel travel);

    //    Olon hereglegchiin medeelel hadgalah
    List<Travel> createTravels(List<Travel> travels);

    //    Neg hereglegchiin medeelel avah
    public Optional<Travel> getTravelrById(Long id);

    //    neg hereglegchiin medeelel zasvarlah
    public Travel updateTravel(Travel travel);

    //    Neg hereglegchiin medeelel ustgah
    public String deleteTravelById(Long id);
    List<Travel>findByNameIsLike(String name);

    List<Description> findByDescriptionId(Long descriptionId);
}
