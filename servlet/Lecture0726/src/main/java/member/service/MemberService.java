package member.service;

import member.dao.MemberDAO;
import member.vo.Member;

//todo: 비즈니스 로직을 처리한다 + trycatch 해줌
public class MemberService {
    /**이 메소드를 사용하면 이런 기능을 사용할 수 있어요! (외부노출)*/
    //로그인 처리하는 비즈니스 메소드
    public Member login(Member member)  {
                        //vo 객체를 받는다
        //todo: 로그인이 되는지 확인하기
        //데이터베이스 처리
        //데이터베이스 처리를 위해 DAO가 있어야 한다. class도 존재해야함
        MemberDAO dao = null;
        try {
            dao = new MemberDAO();
            member = dao.select(member);

            System.out.println("Service" + member.getName());
        } catch (Exception e) {
            System.out.println(e);
        }
        return member;
    }



}
