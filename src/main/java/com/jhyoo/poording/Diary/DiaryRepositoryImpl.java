package com.jhyoo.poording.Diary;

import java.util.*;

import org.springframework.stereotype.Repository;

@Repository
public class DiaryRepositoryImpl implements DiaryRepository {

    private static Map<Long, Diary> store = new HashMap<>();
    private static long sequence = 0L;

    @Override
    public Diary save(Diary diary) {
        diary.setDiaryid(++sequence);
        store.put(diary.getDiaryId(), diary);
        return diary;
    }

    @Override
    public Optional<Diary> findById(Long diaryId) {
        return Optional.ofNullable(store.get(diaryId));
    }

    @Override
    public Optional<Diary> findByWriter(String writer) {
        return store.values().stream()
            .filter(diary -> diary.getWriter().equals(writer))
            .findAny();
    }

    @Override
    public List<Diary> findAll() {
        return new ArrayList<>(store.values());
    }
    
}
