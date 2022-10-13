package jpa.study.project1;

import java.util.List;

public interface MemberRepository {
    void create(Member member);
    void update(Member member);
    Member findMember(Long id);
    Member findMemberByName(String name);
    List<Member> findAllMember();
    void delete(Long id);
}
