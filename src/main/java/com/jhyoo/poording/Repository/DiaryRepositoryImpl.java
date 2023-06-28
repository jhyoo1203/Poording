package com.jhyoo.poording.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.jhyoo.poording.Domain.Diary;

@Repository
public class DiaryRepositoryImpl implements DiaryRepository {

    @Override
    public Diary save(Diary diary) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    @Override
    public Optional<Diary> findById(Long diaryId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Override
    public Optional<Diary> findByWriter(String writer) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByWriter'");
    }

    @Override
    public List<Diary> findAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }
    
}
