package jpa.study.project1;

import java.util.List;

public interface MemberService {
    void join(Member member);
    void modify(Member member);
    Member findByMember(Long id);
    Member findMemberByUsername(String name);
    List<Member> findAllMember();
    void remove(Long id);
}
