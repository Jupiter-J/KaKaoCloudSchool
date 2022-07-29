package member.service;

import member.dao.UserDAO;
import member.vo.Member;

import javax.naming.NamingException;
import java.sql.SQLException;

public class UserService {

    public Member login(Member member) {
        UserDAO dao = null;
        try {
            dao = new UserDAO();
            member = dao.select(member);
        } catch (Exception e) {
            System.out.println("Service 이곳에서 에러");
            System.out.println(e);
        }
        return member;
    }

}
