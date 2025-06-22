package com.example.demo.controller;

import com.example.demo.model.Member;
import com.example.demo.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/members")
public class MemberController {

    @Autowired
    private MemberService memberService;

    @PostMapping
    public Mono<Member> createMember(@RequestBody Member member) {
        return memberService.addMember(member);
    }

    @GetMapping
    public Flux<Member> getAllMembers() {
        return memberService.getAllMembers();
    }
}
