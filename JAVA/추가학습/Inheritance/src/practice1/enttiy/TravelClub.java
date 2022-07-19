package practice1.enttiy;


import practice1.util.DateUtil;

import java.util.UUID;

public class TravelClub {
    //사용자 정의 상수 => 코드 변경시 유지보수성 때문에!!!
    private static final int MINIMUM_NAME_LENGTH = 3;
    private static final int MINIMUM_INTRO_LENGTH = 10;

    private String id;
    private String clubName;
    private String intro;
    private String foundationDay;

    private TravelClub() { //외부에서 호출 불가
        this.id = UUID.randomUUID().toString();
    }

    public TravelClub(String clubName, String intro) {
        //인스턴스를 여러개 생성할경우 누가 누구인지 몰라! - 참조변수만 얘네를 구분할수 있다
        //this. = 참조하고있는 참조변수의 정보
        this();
        setClubName(clubName); /**생성자에도 제약조건 걸기*/
        setIntro(intro);
        this.foundationDay = DateUtil.today();
    }

//    public TravelClub(String clubName, String intro, String foundationDay){
//        this(clubName, intro); 코드 중복 필요없이 this 생성자로 초기화 가능하다
//        this.foundationDay = foundationDay;
//    }

    public String getClubName() {
        return clubName;
    }

    public String getId() {
        return id;
    }

    public void setClubName(String clubName) {
        if (clubName.length()<MINIMUM_NAME_LENGTH){
            System.out.println("이름 "+MINIMUM_NAME_LENGTH+"글자 이상 적으세요");
            return;
        }
        this.clubName = clubName;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        if (intro.length()<MINIMUM_INTRO_LENGTH){
            System.out.println(" 설명은 "+ MINIMUM_INTRO_LENGTH + "글자 이상이어야 합니다 ");
        return;
        }
        this.intro = intro;
    }

    public String getFoundationDay() {
        return foundationDay;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Travel Club club Id : ").append(id);
        builder.append(", clubName : ").append(clubName);
        builder.append(", Intro : ").append(intro);
        builder.append(", FoundationDay : ").append(foundationDay);
        return builder.toString();
    }

    public static TravelClub getSample(){
//        String clubName = "Sample Club";
//        String intro = "Sample club Intro";
//        TravelClub sampleClub = new TravelClub(clubName, intro);
        return new TravelClub("Sample Club","Sample Intro~!!!!!!!!");
    }

}
