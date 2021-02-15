package com.trtrefer.banckend.dbEntity;

import javax.persistence.*;
import java.lang.reflect.Field;
import java.sql.Date;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name="helps")
public class Help {

    private Long id;
    private Long userId;
    private Date date;
    private Long jobId;
    private Boolean accepted;

    public Help() {
    }

    public Help(Long id, Long userId, Date date, Long jobId, Boolean accepted) {
        this.id = id;
        this.userId = userId;
        this.date = date;
        this.jobId = jobId;
        this.accepted = accepted;
    }

    @Id
    @GeneratedValue(strategy= IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "userId")
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Column(name = "date")
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Column(name = "jobId")
    public Long getJobId() {
        return jobId;
    }

    public void setJobId(Long jobId) {
        this.jobId = jobId;
    }

    @Column(name = "accepted")
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
