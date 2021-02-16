package com.trtrefer.banckend.restEntity;

import java.lang.reflect.Field;

public class RestRefer {

    private Long refererId;
    private Long refereeId;
    private Long jobId;
    private Boolean accepted;

    public RestRefer() {
    }

    public Long getRefererId() {
        return refererId;
    }

    public void setRefererId(Long refererId) {
        this.refererId = refererId;
    }

    public Long getRefereeId() {
        return refereeId;
    }

    public void setRefereeId(Long refereeId) {
        this.refereeId = refereeId;
    }

    public Long getJobId() {
        return jobId;
    }

    public void setJobId(Long jobId) {
        this.jobId = jobId;
    }

    public Boolean getAccepted() {
        return accepted;
    }

    public void setAccepted(Boolean accepted) {
        this.accepted = accepted;
    }

    public boolean containsNullField(){
        try {
            for (Field f : this.getClass().getDeclaredFields()) {
                f.setAccessible(true);
                if (f.get(this) == null) {
                    return true;
                }
            }
        } catch (IllegalAccessException e){
            return true;
        }
        return false;
    }

}
