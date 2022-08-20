package com.practice.FlowableBPMN.Controller;

import com.practice.FlowableBPMN.Model.Approval;
import com.practice.FlowableBPMN.Model.Article;
import com.practice.FlowableBPMN.Service.ArticleWorkFlowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ArticleWorkFlowController {
    @Autowired
    private ArticleWorkFlowService service;

    @PostMapping("/submit")
    public void submit(@RequestBody Article article) {
        service.startProcess(article);
    }

    @GetMapping("/tasks")
    public List<Article> getTasks(@RequestParam String assignee) {
        return service.getTasks(assignee);
    }

    @PostMapping("/review")
    public void review(@RequestBody Approval approval) {
        service.submitReview(approval);
    }
}
