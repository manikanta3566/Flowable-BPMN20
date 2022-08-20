package com.practice.FlowableBPMN.Service;

import com.practice.FlowableBPMN.Model.Approval;
import com.practice.FlowableBPMN.Model.Article;

import java.util.List;

public interface ArticleWorkFlowService {
   public void startProcess(Article article);
   public List<Article> getTasks(String assigne);
   public void submitReview(Approval approval);
}
