package jpa.study;

import jpa.study.project1.JpaMemberRepository;
import jpa.study.project1.MemberService;
import jpa.study.project1.MemberServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;

@Configuration
public class SpringConfig {

    private final EntityManager em;

    public SpringConfig(EntityManager em) {
        this.em = em;
    }

    @Bean
    public MemberService memberService(){
        return new MemberServiceImpl(memberRepository());
    }

    private JpaMemberRepository memberRepository() {
        return new JpaMemberRepository(em);
    }


}
