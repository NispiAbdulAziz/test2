package com.test.test2.controller;

import com.google.gson.Gson;
import com.test.test2.entity.Human;
import com.test.test2.service.HumanServie;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@RestController
@RequestMapping("/human")
public class HumanContoller {


    @Autowired
    HumanServie humanServie;

    @GetMapping("/getAll")
    public String  getAllData()  {
        List<Human> humans= humanServie.getAll();
        String result = new Gson().toJson(humans);
        return result;
    }

    @PostMapping("/add")
    public ResponseEntity<Human> addAllData(@Valid @RequestBody Human human)  {
        return ResponseEntity.ok(humanServie.save(human));
    }

    @PutMapping("/update")
    public ResponseEntity<Human> putAllData(
        @RequestParam String id,
        @Valid @RequestBody Human human)  {
        Human humanss = humanServie.update(id,human);
        if(humanss == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(humanss);
    }

    @DeleteMapping("/delete/{id}")
    public String putAllData(
        @PathVariable(value = "id") String id)  {
        String humanss = humanServie.delete(id);
        if(humanss.isEmpty()){
            return "Data tidak ditemukan";
        }
        return "Data Telah Terhapus";
    }

}

