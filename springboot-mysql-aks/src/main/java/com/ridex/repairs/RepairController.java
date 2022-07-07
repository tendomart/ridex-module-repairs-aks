package com.example.springbootmysqlaks;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class RepairController {

    private final RepairRepository repairRepository;

    public RepairController(RepairRepository repairRepository) {
        this.repairRepository = repairRepository;
    }

    @PostMapping("/")
    @ResponseStatus(HttpStatus.CREATED)
    public Repair createRepair(@RequestBody Repair repair) {
        return repairRepository.save(repair);
    }

    @GetMapping("/")
    public Iterable<Repair> getRepairs() {
        return repairRepository.findAll();
    }
}