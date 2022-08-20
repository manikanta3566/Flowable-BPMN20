package com.practice.FlowableBPMN.Model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Article {
    private String id;
    private String authorName;
    private String url;
}
