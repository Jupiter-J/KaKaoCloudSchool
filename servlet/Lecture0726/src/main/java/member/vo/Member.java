package member.vo;

//todo: 사용자 테이블을 전부 넣어준다
public class Member {
    private String id;  //컬럼이름과 필드이름 일치해야함 (일치하지 않으면 불필요한 처리가 늘어난다)
    private String pw;
    private String name;

    public Member() {
    }

    public Member(String id, String pw, String name) {
        this.id = id;
        this.pw = pw;
        this.name = name;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
