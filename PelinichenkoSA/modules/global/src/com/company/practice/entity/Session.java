package com.company.practice.entity;

import com.esotericsoftware.kryo.NotNull;
import com.haulmont.chile.core.annotations.MetaProperty;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import org.checkerframework.checker.index.qual.Positive;
import org.eclipse.persistence.annotations.ReadOnly;

import javax.persistence.*;
import java.time.LocalDateTime;

@Table(name = "PRACTICE_SESSION")
@Entity(name = "practice_Session")
public class Session extends StandardEntity {
    private static final long serialVersionUID = 1123859067567259888L;
    @Column(name = "TOPIC", nullable = false)
    private String topic;

    @Column(name = "START_DATE", nullable = false)
    private LocalDateTime startDate;

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Speaker getSpeaker() {
        return speaker;
    }

    public void setSpeaker(Speaker speaker) {
        this.speaker = speaker;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Column(name = "DURATION", nullable = false)
    private Integer duration;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "SPEAKER_ID")
    private Speaker speaker;

    @Column(name = "DESCRIPTION")
    private String description;

    @Transient
    @MetaProperty(related = {"startDate", "duration"})
    public LocalDateTime getEndDate() {
        return (startDate != null && duration != null) ? startDate.plusHours(duration) : null;
    }
}