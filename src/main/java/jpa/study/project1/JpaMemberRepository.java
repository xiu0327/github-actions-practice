package jpa.study.project1;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

public class JpaMemberRepository implements MemberRepository{

    private final EntityManager em;

    public JpaMemberRepository(EntityManager em) {
        this.em = em;
    }

    @Override
    public void create(Member member) {
        em.persist(member);
    }

    @Override
    public void update(Member member) {
        Member targetMember = em.find(Member.class, member.getId());
        targetMember.setUsername(member.getUsername());
        targetMember.setAge(member.getAge());
    }

    @Override
    public Member findMember(Long id) {
        Member findMember = em.find(Member.class, id);
        return findMember;
    }

    @Override
    public Member findMemberByName(String name) {
        List<Member> result = em.createQuery("select m from Member m where m.username= :name", Member.class)
                .setParameter("name", name)
                .getResultList();
        return result.stream().findAny().get();
    }

    @Override
    public List<Member> findAllMember() {
        return em.createQuery("select m from Member m", Member.class)
                .getResultList();
    }

    @Override
    public void delete(Long id) {
        em.remove(em.find(Member.class, id));
    }
}
