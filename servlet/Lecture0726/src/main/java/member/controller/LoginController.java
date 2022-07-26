package member.controller;


import member.service.MemberService;
import member.vo.Member;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/book/login")
public class LoginController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public LoginController() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1. 입력
        //2. 로직
        //3. 출력
    }

    @Override //todo: 클라이언트로부터 파라미터를 사용하여 값을 입력받는다
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 1.입력받기 -servlet - 처음으로 클라이언트에게 전달을 받기 때문에
        String id = req.getParameter("userID");  //데이터 입력받기 - html name과 동일하게
        String pw = req.getParameter("userPW");

        /** 조직화된 구조에서 데이터를 주고받을때 값 자체를 넣지 않고 VO에 집어넣어 주고받는다
         클라이언트에서 입력 받은 데이터를 service에 전달하기 위해 VO가 필요하다
         */
        // VO 객체 생성 -> 클래스 생성하고 오기
        Member member = new Member();
        member.setId(id);
        member.setPw(pw);

        // 2.로직 -service
        /** 로직 처리를 하려면 서비스 객체가 필요하다
         객체를 생성하기 위해 클래스가 필요하다. - ServiceClass 만들기
         */
        // 서비스 객체 생성
        MemberService service = new MemberService();
        //member로 값을 짚어넣고 그값을 가져옴
        try {
            member = service.login(member); //서비스를 수행하기 위해 받은 id, pw 인자로 넘기기(?)
        } catch (Exception e) {
            e.printStackTrace();
        }

        //3. 출력
        //로그인에 성공하면 VO객체 안에 로그인한 사람의 이름이 들어가 있다
        if(member != null) { //null이 아니면 로그인 성공
            //로그인에 성공하면 JSP를 사용하여 출력한다
            //사용자이름은 member 객체(VO)안에 있다 멤버 VO객체를 JSP에게 전달해야한다
            //즉, controller servlet이 request를 전달해서 다른 서블릿(JSP)를 호출
            RequestDispatcher rd = req.getRequestDispatcher("/book/member/loginSuccess.jsp");
            req.setAttribute("member",member); //결과 데이터를 붙여서 surblet -> jsp로 붙여서 보낸다
            rd.forward(req, resp); //servlet이 jsp를 찾아서 실행(forward)

        }else{
            resp.sendRedirect("/book/member/loginFail.html");
        }
    }




}

