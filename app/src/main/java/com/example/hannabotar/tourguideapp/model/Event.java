package com.example.hannabotar.tourguideapp.model;

import java.util.Date;

public class Event {

    private String name;
    private String description;
    private String location;
    private Date date;
    private Integer photoId;

    private Event(Builder builder) {
        this.name = builder.name;
        this.description = builder.description;
        this.location = builder.location;
        this.date = builder.date;
        this.photoId = builder.photoId;
    }

    public static class Builder {

        private String name;
        private String description;
        private String location;
        private Date date;
        private Integer photoId;

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder withLocation(String location) {
            this.location = location;
            return this;
        }

        public Builder withDate(Date date) {
            this.date = date;
            return this;
        }

        public Builder withPhotoId(Integer photoId) {
            this.photoId = photoId;
            return this;
        }

        public Event build() {
            return new Event(this);
        }
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getLocation() {
        return location;
    }

    public Date getDate() {
        return date;
    }

    public Integer getPhotoId() {
        return photoId;
    }
}
