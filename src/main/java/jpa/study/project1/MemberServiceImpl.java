package jpa.study.project1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public class MemberServiceImpl implements MemberService{

    private final MemberRepository memberRepository;

    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public void join(Member member) {
        memberRepository.create(member);
    }

    @Override
    public void modify(Member member) {
        memberRepository.update(member);
    }

    @Override
    public Member findByMember(Long id) {
        return memberRepository.findMember(id);
    }

    @Override
    public Member findMemberByUsername(String name) {
        return memberRepository.findMemberByName(name);
    }

    @Override
    public List<Member> findAllMember() {
        return memberRepository.findAllMember();
    }

    @Override
    public void remove(Long id) {
        memberRepository.delete(id);
    }
}
