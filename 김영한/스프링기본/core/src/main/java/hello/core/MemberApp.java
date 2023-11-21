package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MemberApp {
    public static void main(String[] args) {
//        //스프링없이
//        AppConfig appConfig = new AppConfig();
//        MemberService memberService = appConfig.memberService();
//        //객체지향을 지키기위해
//        //MemberService memberService = new MemberServiceImpl();

        //스프링으로 변경해보기
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        MemberService memberService = applicationContext.getBean("memberService" ,MemberService.class);

        Member member = new Member(1L , "mamberA" , Grade.VIP);
        memberService.join(member);

        Member findMember = memberService.findMember(1L);



        System.out.println("findMember = " + findMember.getName());
        System.out.println("member.getName() = " + member.getName());
    }
}
