package com.trtrefer.banckend.restEntity;

import javax.persistence.Entity;
import java.lang.reflect.Field;

@Entity
public class RestCompany {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
