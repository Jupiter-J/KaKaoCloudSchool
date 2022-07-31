package practice2.service.logic;

import practice2.enttiy.TravelClub;
import practice2.service.ClubService;

import java.util.Arrays;

//todo: 실제로 작업하는 곳 비즈니스 로직 구현
public class ClubServiceLogic implements ClubService {
    private TravelClub[] clubs;
    private int index;

    public ClubServiceLogic() {
        this.clubs = new TravelClub[10];
        this.index = 0; //초기화
    }

    @Override
    public void register(TravelClub travelClub) {
        clubs[index] = travelClub;
        index++;

    }

    @Override
    public TravelClub[] findAll() {
        //저장된 값만 보내주기 => 복사해서 0~생성된 index 까지
        return Arrays.copyOfRange(clubs,0,index);
    }

    @Override
    public TravelClub[] findByNames(String clubName) {
        TravelClub[] createdClubs = Arrays.copyOfRange(clubs, 0, index);
        TravelClub[] foundClubs = new TravelClub[createdClubs.length];
        int subIndex = 0;
        //찾기
        for (TravelClub club : createdClubs){
            if (club.getClubName().equals(clubName)){
                foundClubs[subIndex] = club;
                subIndex++;
            }
        }
        return Arrays.copyOfRange(foundClubs, 0, subIndex);
    }

    @Override
    public TravelClub findById(String clubId) {
        TravelClub[] createdClubs = Arrays.copyOfRange(clubs, 0, index);
        TravelClub foundClub = null;
        //배열에서 동일한 클럽 아이디를 찾아 반환
        for (TravelClub club : createdClubs){
            if (club.getId().equals(clubId)){
                foundClub = club;
                break;
            }
        }
        return foundClub;
    }

    @Override
    public void modify(TravelClub modifyClub) {
        int foundIndex = 0;
        for (int i=0; i< clubs.length; i++){
            if (clubs[i].getId().equals(modifyClub.getId())){
                foundIndex = i;
                break;
            }
        }
        this.clubs[foundIndex] = modifyClub;
    }

    @Override
    public void remove(String clubId) {

    }
}
