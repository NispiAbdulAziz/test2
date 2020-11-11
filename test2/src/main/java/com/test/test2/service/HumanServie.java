package com.test.test2.service;

import com.test.test2.entity.Human;
import java.util.List;

public interface HumanServie {

    public List<Human> getAll();

    public Human update(String id, Human human);

    public Human save(Human human);

    public String delete (String id);
}
