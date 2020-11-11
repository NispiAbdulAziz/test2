package com.test.test2.service;

import com.test.test2.entity.Human;
import com.test.test2.repository.HumanRepository;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;

public class HumanServiceImpl implements HumanServie {

    @Autowired
    HumanRepository humanRepository;

    @Override
    public List<Human> getAll() {
        List<Human> lst = (List) this.humanRepository.findAll();
        lst.stream().collect(Collectors.toList());
        return lst;
    }

    @Override
    public Human update(String id, Human humans) {
        Human human = humanRepository.findOne(id);
        if(human == null){
            return null;
        }
        human.setName(humans.getName());
        human.setPhone(humans.getPhone());
        humanRepository.save(humans);
        return human;
    }

    @Override
    public Human save(Human human) {
        return humanRepository.save(human);
    }

    @Override
    public String delete(String id) {
        Human human = humanRepository.findOne(id);
        if (human == null){
            return "";
        }
        humanRepository.delete(id);
        return "ok";
    }
}
