package practice2.service;

import practice2.enttiy.TravelClub;

public interface ClubService {

    void register(TravelClub travelClub);
    TravelClub[] findAll();
    TravelClub[] findByNames(String clubName);
    TravelClub findById(String clubId);

    void modify(TravelClub modifyClub);
    void remove(String clubId);

}
