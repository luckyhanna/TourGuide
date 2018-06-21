package com.example.hannabotar.tourguideapp.model;

import java.io.Serializable;

public class Monument implements Serializable {

    private String name;
    private String description;
    private Integer photoId;
    private String address;
    private String phone;
    private String email;
    private String website;

    private Monument(Builder builder) {
        this.name = builder.name;
        this.description = builder.description;
        this.photoId = builder.photoId;
        this.address = builder.address;
        this.phone = builder.phone;
        this.email = builder.email;
        this.website = builder.website;
    }

    public static class Builder {
        private String name;
        private String description;
        private Integer photoId;
        private String address;
        private String phone;
        private String email;
        private String website;

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder withPhotoId(Integer photoId) {
            this.photoId = photoId;
            return this;
        }

        public Builder withAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder withPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder withEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder withWebsite(String website) {
            this.website = website;
            return this;
        }

        public Monument build() {
            return new Monument(this);
        }
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Integer getPhotoId() {
        return photoId;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getWebsite() {
        return website;
    }
}
