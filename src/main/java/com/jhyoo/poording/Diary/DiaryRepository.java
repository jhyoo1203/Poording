package com.jhyoo.poording.Diary;

import java.util.List;
import java.util.Optional;

public interface DiaryRepository {
    Diary save(Diary diary);
    Optional<Diary> findById(Long diaryId);
    Optional<Diary> findByWriter(String writer);
    List<Diary> findAll();
}
