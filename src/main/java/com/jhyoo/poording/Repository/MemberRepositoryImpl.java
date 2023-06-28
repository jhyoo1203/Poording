package com.jhyoo.poording.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.jhyoo.poording.Domain.Member;

@Repository
public class MemberRepositoryImpl implements MemberRepository {

    @Override
    public Member save(Member member) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    @Override
    public Optional<Member> findById(String Id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Override
    public Optional<Member> findByEmail(String Email) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByEmail'");
    }

    @Override
    public List<Member> findAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }
    
}
