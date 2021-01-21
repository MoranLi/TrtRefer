package com.trtrefer.banckend.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Refer {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private Long userId;
    private Long referUserId;
    private Long jobId;
    private Boolean accepted;

    public Refer() {
    }

    public Refer(Long id, Long userId, Long referUserId, Long jobId, Boolean accepted) {
        this.id = id;
        this.userId = userId;
        this.referUserId = referUserId;
        this.jobId = jobId;
        this.accepted = accepted;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getReferUserId() {
        return referUserId;
    }

    public void setReferUserId(Long referUserId) {
        this.referUserId = referUserId;
    }

    public Boolean getAccepted() {
        return accepted;
    }

    public void setAccepted(Boolean accepted) {
        this.accepted = accepted;
    }

    public Long getJobId() {
        return jobId;
    }

    public void setJobId(Long jobId) {
        this.jobId = jobId;
    }
}
