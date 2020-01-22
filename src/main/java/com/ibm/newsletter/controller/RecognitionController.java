
package com.ibm.newsletter.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.ibm.newsletter.entity.Recognition;
import com.ibm.newsletter.service.RecognitionService;

@RestController
@RequestMapping("/recognition")
public class RecognitionController {

    @Autowired
    RecognitionService recognitionService;

    @GetMapping
    public List<Recognition> getRecognition() {

        List<Recognition> recognitionList = new ArrayList<>();
        recognitionList = recognitionService.getRecognition();
        return recognitionList;

    }

    @PostMapping
    public void saveRecognition(@RequestBody Recognition recognition) {
        recognitionService.addRecognition(recognition);

    }

    @PutMapping("/{id}")
    public void updateRecognition(@RequestBody Recognition recognition, @PathVariable int id) {
        recognitionService.updateRecognition(id, recognition);
    }

    @DeleteMapping("/{id}")
    public void deleteRecognition(@PathVariable long id) {
        recognitionService.deleteRecognition(id);
    }
}
