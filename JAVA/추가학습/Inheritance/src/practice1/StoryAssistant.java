package practice1;


import practice1.enttiy.TravelClub;

public class StoryAssistant{
    public static void main(String[] args) {
        TravelClub newClub = new TravelClub("JeJuu", "Jeju TrableClub~~~");
        System.out.println(newClub.toString());

        System.out.println(TravelClub.getSample().toString());
    }
}