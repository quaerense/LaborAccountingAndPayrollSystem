package org.quaerense.controller;

import org.quaerense.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/issue")
public class IssueController {
    @Autowired
    private TaskService taskService;
}
