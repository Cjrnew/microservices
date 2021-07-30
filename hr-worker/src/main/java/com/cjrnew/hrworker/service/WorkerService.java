package com.cjrnew.hrworker.service;

import com.cjrnew.hrworker.entity.Worker;
import com.cjrnew.hrworker.repository.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class WorkerService {

    @Autowired
    private WorkerRepository workerRepository;

    public List<Worker> findAll() {
        return workerRepository.findAll();
    }

    public Worker findById(Long id) {
        return workerRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Worker not Found."));
    }
}
