package practice2.ui.console;

import practice2.enttiy.TravelClub;
import practice2.service.ClubService;
import practice2.service.logic.ClubServiceLogic;
import practice2.util.ConsoleUtil;


//todo: 사용자로부터 데이터를 입력받는다 => 서비스에게 넘김
public class ClubConsole {
    //여러 메소드에서 사용하기 때문에 필드에 선언한다
    private ConsoleUtil consoleUtil;
    private ClubService clubService;

    public ClubConsole() {
        this.consoleUtil = new ConsoleUtil();
        //todo: 변경될 코드
        this.clubService = new ClubServiceLogic();
    }

    public void register(){
        //사용자로부터 club intro, clubName을 받아서 사용
        while (true){
            String clubName = consoleUtil.getValueOf("Club Name(0.ClubMenu)");
            //문자열 비교
            if (clubName.equals("0")){
                return;
            }

            //2. 클럽 소개 입력받기
            String intro = consoleUtil.getValueOf("Club Intro(0.Club Menu)");
            if (intro.equals("0")){
                return;
            }
            //3. 새로운 클럽 입력받기
            TravelClub newClub = new TravelClub(clubName, intro);
            //4. 저장된값 불러오기
            clubService.register(newClub);
                                                    // 오버라이딩한게 나옴
            System.out.println("Registered Club: " + newClub.toString());

        }
    }

    public void findAll(){
       TravelClub[] foundClubs = clubService.findAll();
       if (foundClubs.length == 0){
           //아무런 클럽이 존재하지 않은경우
           System.out.println("Empty!");
           return;
       }
        for (TravelClub club : foundClubs){
            System.out.println(club);
        }
    }
    public void findById(){
        TravelClub foundClub = null;

        while(true){
            String clubId = consoleUtil.getValueOf("Club id를 입력하세요(0.clubMenu)");
            if (clubId.equals("0")){
                break;
            }
            foundClub = clubService.findById(clubId);

            if (foundClub != null){
                System.out.println(foundClub);
            }else{
                System.out.println("Can not find club, ID: " + clubId);
            }
        }
    }

    private TravelClub findOne(){
        TravelClub foundClub = null;

        while(true){
            String clubId = consoleUtil.getValueOf("Club id를 입력하세요(0.clubMenu)");
            if (clubId.equals("0")){
                break;
            }
            foundClub = clubService.findById(clubId);
            if (foundClub != null){
                break;
            }else{
                System.out.println("Can not find club, ID: " + clubId);
            }
        }
        return foundClub;
    }

    public void findByName(){
        TravelClub[] foundClubs = null;
        while(true) {
            String clubName = consoleUtil.getValueOf("Club Name을 입력하세요(0.clubMenu)");
            if (clubName.equals("0")) {
                break;
            }
            foundClubs = clubService.findByNames(clubName);
            if (foundClubs != null && foundClubs.length != 0){
                for (TravelClub club : foundClubs){
                    System.out.println(club);
                }
            }else {
                System.out.println("Can not find club, Name : " + clubName);
            }
        }
    }

    public void modify(){
        TravelClub targetClub = findOne();
        String newName = consoleUtil.getValueOf("New Club name(0. Club Menu, Enter. No Change.)");
        if (newName.equals("0")){
            return;
        }
        if (!newName.isEmpty()){
            targetClub.setClubName(newName);
        }
        String newIntro = consoleUtil.getValueOf("New Club intro(0.Club Menu, Enter. No Change)");
        if (!newIntro.isEmpty()){
            targetClub.setIntro(newIntro);
        }
        //변경작업
        clubService.modify(targetClub);
        System.out.println("Modify Club : " + targetClub.toString());

    }

    public void remove(){

    }




}
