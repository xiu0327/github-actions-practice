package jpa.study.project1;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ApiController {

    private final MemberService memberService;

    public ApiController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("/test")
    public String getTest(){
        return "test";
    }

    @GetMapping("/members")
    public List<Member> getMembers(){
        return memberService.findAllMember();
    }

    @GetMapping("/find/member")
    public Member getMemberByName(@RequestParam String name){
        return memberService.findMemberByUsername(name);
    }

    @PostMapping("/join")
    public void postJoin(@RequestBody Member member){
        memberService.join(member);
    }
}
