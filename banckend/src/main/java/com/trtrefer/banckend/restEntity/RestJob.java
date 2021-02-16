package com.trtrefer.banckend.restEntity;

import com.trtrefer.banckend.dbEntity.Job;

import javax.persistence.Entity;
import java.lang.reflect.Field;

@Entity
public class RestJob {
    private String jobTitle;
    private String jobLink;
    private String jobCodeId;
    private Long companyId;

    public RestJob() {
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getJobLink() {
        return jobLink;
    }

    public void setJobLink(String jobLink) {
        this.jobLink = jobLink;
    }

    public String getJobCodeId() {
        return jobCodeId;
    }

    public void setJobCodeId(String jobCodeId) {
        this.jobCodeId = jobCodeId;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
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
