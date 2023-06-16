package com.company.cubaproject1.entity;

import com.haulmont.chile.core.annotations.MetaProperty;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.time.LocalDateTime;

@Table(name = "CUBAPROJECT1_SESSION")
@Entity(name = "cubaproject1_Session")
@NamePattern("%s|topic")
public class Session extends StandardEntity {
    private static final long serialVersionUID = -5654569285538654899L;

    @NotNull
    @Column(name = "Topic",nullable = false)
    private String topic;

    @NotNull
    @Column(name = "Start_Date",nullable = false)
    private LocalDateTime startDate;

    @NotNull
    @Column(name = "Duration",nullable = false)
    @Positive
    private Integer duration;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "Speaker_ID")
    private Speaker speaker;

    @Lob
    @Column(name = "Description")
    private String description;

    public String getTopic() {
        return topic;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public Integer getDuration() {
        return duration;
    }

    public Speaker getSpeaker() {
        return speaker;
    }

    public String getDescription() {
        return description;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public void setSpeaker(Speaker speaker) {
        this.speaker = speaker;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Transient
    @MetaProperty(related = {"startDate","duration"})
    public LocalDateTime getEndDate(){
        return (startDate != null && duration != null)?startDate.plusHours(duration):null;
    }
}