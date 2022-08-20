package com.practice.FlowableBPMN.Model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Approval {
    private String id;
    private boolean status;
}
