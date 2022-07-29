package member.service;

import member.dao.UserDAO;
import member.vo.Member;

import javax.naming.NamingException;
import java.sql.SQLException;

public class UserService {

    public Member login(Member member) {

        try {
            UserDAO dao = new UserDAO();
            member = dao.select(member);
        } catch (Exception e) {
            System.out.println(e);
        }
        return member;

    }
}