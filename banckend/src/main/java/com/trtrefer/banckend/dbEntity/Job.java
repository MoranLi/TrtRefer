package com.trtrefer.banckend.dbEntity;

import javax.persistence.*;
import java.lang.reflect.Field;

@Entity
@Table(name = "jobs")
public class Job {

    private Long id;
    private String jobTitle;
    private String jobLink;
    private String jobCodeId;
    private Long companyId;

    public Job() {
    }

    public Job(Long id, String jobTitle, String jobLink, String jobId, Long companyId) {
        this.id = id;
        this.jobTitle = jobTitle;
        this.jobLink = jobLink;
        this.jobCodeId = jobId;
        this.companyId = companyId;
    }

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "jobTitle")
    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Column(name = "jobLink")
    public String getJobLink() {
        return jobLink;
    }

    public void setJobLink(String jobLink) {
        this.jobLink = jobLink;
    }

    @Column(name = "jobCodeId")
    public String getJobCodeId() {
        return jobCodeId;
    }

    public void setJobCodeId(String jobCodeId) {
        this.jobCodeId = jobCodeId;
    }

    @Column(name = "companyId")
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
