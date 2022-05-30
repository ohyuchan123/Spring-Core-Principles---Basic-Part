package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {
    @Test
    void join(){

        MemberService memberService = new MemberServiceImpl();

        //given 환경이 주어졌을 때
        Member member = new Member(1L,"memberA", Grade.VIP);

        //when 이렇게 했을 때
        memberService.join(member);
        Member findMember = memberService.findMember(1L);

        //then 된다
        Assertions.assertThat(member).isEqualTo(findMember); // join과 찾는 값이 똑같으면 실행
    }
}
