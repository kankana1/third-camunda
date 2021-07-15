package com.example.workflow.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.workflow.service.CamundaService;

@RestController
@RequestMapping("/api")
public class CamundaController {
	
	@Autowired
	private CamundaService camundaService;
	
	@GetMapping("/process-instance/{processKey}/employeeName/{name}")
    public void getCamunda(@PathVariable String processKey, @PathVariable String name) {
        camundaService.triggerProcess(processKey,name);
	}

}
