package com.practice.FlowableBPMN.Delegate;

import lombok.extern.slf4j.Slf4j;
import org.flowable.engine.delegate.DelegateExecution;
import org.flowable.engine.delegate.JavaDelegate;

@Slf4j
public class RejectionMail implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) {
        Object author = delegateExecution.getVariable("author");
        log.info("rejection mail sended {}",author);
    }
}
