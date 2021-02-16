package com.trtrefer.banckend.dbEntity;

import com.trtrefer.banckend.restEntity.RestRefer;

import javax.persistence.*;
import java.lang.reflect.Field;

@Entity
@Table(name = "refers")
public class Refer {

    private Long id;
    private Long refererId;
    private Long refereeId;
    private Long jobId;
    private Boolean accepted;

    public Refer() {
    }

    public Refer(RestRefer refer){
        refereeId = refer.getRefereeId();
        refererId = refer.getRefererId();
        jobId = refer.getJobId();
        accepted = refer.getAccepted();
    }

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "refererId")
    public Long getRefererId() {
        return refererId;
    }

    public void setRefererId(Long refererId) {
        this.refererId = refererId;
    }

    @Column(name = "refereeId")
    public Long getRefereeId() {
        return refereeId;
    }

    public void setRefereeId(Long refereeId) {
        this.refereeId = refereeId;
    }

    @Column(name = "accepted")
    public Boolean getAccepted() {
        return accepted;
    }

    public void setAccepted(Boolean accepted) {
        this.accepted = accepted;
    }

    @Column(name = "jobId")
    public Long getJobId() {
        return jobId;
    }

    public void setJobId(Long jobId) {
        this.jobId = jobId;
    }



}
