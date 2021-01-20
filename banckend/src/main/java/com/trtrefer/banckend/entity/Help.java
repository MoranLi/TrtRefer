package com.trtrefer.banckend.entity;

import javax.persistence.Entity;

@Entity
public class Help {
    private Long id;
    private Long userId;
    private String date;
    private Long companyId;
    private Long jobId;
    private Boolean status;

    public Help() {
    }

    public Help(Long id, Long userId, String date, Long companyId, Long jobId, Boolean status) {
        this.id = id;
        this.userId = userId;
        this.date = date;
        this.companyId = companyId;
        this.jobId = jobId;
        this.status = status;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public Long getJobId() {
        return jobId;
    }

    public void setJobId(Long jobId) {
        this.jobId = jobId;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
