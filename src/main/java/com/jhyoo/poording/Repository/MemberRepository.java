package com.jhyoo.poording.Repository;

import java.util.List;
import java.util.Optional;

import com.jhyoo.poording.Domain.Member;

public interface MemberRepository {
    Member save(Member member);
    Optional<Member> findById(String Id);
    Optional<Member> findByEmail(String Email);
    List<Member> findAll();
}
