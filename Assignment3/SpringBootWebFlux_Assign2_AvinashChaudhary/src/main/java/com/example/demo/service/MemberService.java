package com.example.demo.service;

import com.example.demo.model.Member;
import com.example.demo.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class MemberService {

    @Autowired
    private MemberRepository memberRepository;

    public Mono<Member> addMember(Member member) {
        return memberRepository.save(member);
    }

    public Flux<Member> getAllMembers() {
        return memberRepository.findAll();
    }
}
