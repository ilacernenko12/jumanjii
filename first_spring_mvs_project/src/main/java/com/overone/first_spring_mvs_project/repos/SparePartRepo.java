package com.overone.first_spring_mvs_project.repos;

import com.overone.first_spring_mvs_project.models.SparePart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SparePartRepo extends JpaRepository<SparePart, Long> {
    SparePart findById(long id);
}
