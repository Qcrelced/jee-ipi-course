package com.declercq.messagie.teacher;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long> {

    @Override
    <S extends Teacher> S save(S entity);

    @Override
    <S extends Teacher> List<S> saveAll(Iterable<S> entities);

    @Override
    Optional<Teacher> findById(Long aLong);
    
    List<Teacher> findByName(String name);


}
