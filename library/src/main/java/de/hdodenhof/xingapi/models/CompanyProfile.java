package de.hdodenhof.xingapi.models;

import java.util.Date;

import de.hdodenhof.xingapi.enums.ActivityObjectType;

public class CompanyProfile extends ActivityObject {

    private Date createdAt;
    private String name;
    private String permalink;
    private String photo;

    public Date getCreatedAt() {
        return createdAt;
    }

    public String getName() {
        return name;
    }

    public String getPermalink() {
        return permalink;
    }

    public String getPhoto() {
        return photo;
    }

    @Override
    public ActivityObjectType getType() {
        return ActivityObjectType.COMPANY_PROFILE;
    }
}
