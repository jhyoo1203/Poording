package com.jhyoo.poording.Repository;

import java.util.List;
import java.util.Optional;

import com.jhyoo.poording.Domain.Diary;

public interface DiaryRepository {
    Diary save(Diary diary);
    Optional<Diary> findById(Long diaryId);
    Optional<Diary> findByWriter(String writer);
    List<Diary> findAll();
}
