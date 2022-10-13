package jpa.study.project1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;

import javax.transaction.Transactional;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class MemberServiceImplTest {

    @Autowired MemberService memberService;

    @Test
    void 회원_생성() {
        // given
        String name = "수연";
        Member member = new Member();
        member.setUsername(name);
        member.setAge(2);

        // when
        memberService.join(member);

        // then
        Assertions.assertThat(memberService.findMemberByUsername(name).getUsername())
                .isEqualTo(name);
    }

    @Test
    void 회원_수정() {
        // given
        Long id = 1L;
        Member member = new Member();
        member.setId(id);
        member.setUsername("소정");
        member.setAge(21);

        // when
        memberService.modify(member);

        // then
        Member result = memberService.findByMember(id);
        Assertions.assertThat(result.getAge()).isEqualTo(member.getAge());
        Assertions.assertThat(result.getUsername()).isEqualTo(member.getUsername());
    }

    @Test
    void 회원_조회() {
        // given
        Long memberId = 2L;

        // when
        Member result = memberService.findByMember(memberId);

        // then
        Assertions.assertThat(result.getUsername()).isEqualTo("민");

    }

    @Test
    void 전체_회원_조회() {
        List<Member> members = memberService.findAllMember();
        System.out.println("members.size() = " + members.size());
        for (Member member : members) {
            System.out.println("member.getId() = " + member.getId());
        }
    }

    @Test
    void 회원_탈퇴() {
        // given
        Long id = 2L;

        int beforeSize = memberService.findAllMember().size();

        // when
        memberService.remove(id);

        // then
        int afterSize = memberService.findAllMember().size();

        Assertions.assertThat(beforeSize-1).isEqualTo(afterSize);
        assertThrows(NullPointerException.class,
                ()->memberService.findByMember(id).getUsername());
    }
}