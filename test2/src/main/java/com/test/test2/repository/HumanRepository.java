package com.test.test2.repository;

import com.test.test2.entity.Human;
import org.springframework.data.repository.CrudRepository;

public interface HumanRepository  extends CrudRepository<Human, String> {

}
