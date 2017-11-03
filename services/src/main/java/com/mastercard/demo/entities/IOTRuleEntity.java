package com.mastercard.demo.entities;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "iot_rule_table")
public class IOTRuleEntity extends AbstractPersistable<Long> {

    @Column(name="rule_id")
    private String ruleId;

    @Column(name = "rule_name")
    private String ruleName;

    @Column(name = "rule_content")
    private String ruleContent;

    public String getRuleContent() {
        return ruleContent;
    }

    public void setRuleContent(String ruleContent) {
        this.ruleContent = ruleContent;
    }

    public String getRuleId() {
        return ruleId;
    }

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }
}
