package member.service;

import member.dao.MemberDAO;
import member.vo.Member;

import javax.naming.NamingException;

//todo: 비즈니스 로직 처리
public class MemberService {

    //Controller 에서 받아온 값을 객체를 통해서 받고 이것을 서비스에 집어 넣어 로직을 수행
    //메서드 실행후 member님 환영합니다! 로직을 수행해야 하기 때문에 리턴타입도 Member
    public Member login(Member member){

        //로그인 확인 여부 - database 처리 todo: 데이터베이스 처리를 위하여 DAO를 생성
        MemberDAO dao = null;
        try {
            dao = new MemberDAO();
            member = dao.select(member);
        } catch (Exception e) {
            System.out.println("Service 이곳에서 에러");
            System.out.println(e);
        }
        return member;
    }
}
