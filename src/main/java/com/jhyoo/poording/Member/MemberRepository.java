package com.jhyoo.poording.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);
    Optional<Member> findBymemberId(Long memberId);
    Optional<Member> findById(String Id);
    List<Member> findAll();
}
