package com.mndbempl.empl.repo;

import com.mndbempl.empl.entity.employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface employeeRepo extends MongoRepository<employee,Long> {
}
