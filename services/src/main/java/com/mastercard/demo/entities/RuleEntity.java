package com.mastercard.demo.entities;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author Abhishek Raj on 01-Nov-17.
 */
@Entity
@Table(name = "rule")
public class RuleEntity extends AbstractPersistable<Long> {

    @Column
    String ruleId;
    @Column
    String  ruleName;
    @Column
    String  ruleContent;

    @Override
    public String toString() {
        return "RuleEntity{" +
                "ruleId='" + ruleId + '\'' +
                ", ruleName='" + ruleName + '\'' +
                ", ruleContent='" + ruleContent + '\'' +
                '}';
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

    public String getRuleContent() {
        return ruleContent;
    }

    public void setRuleContent(String ruleContent) {
        this.ruleContent = ruleContent;
    }
}
