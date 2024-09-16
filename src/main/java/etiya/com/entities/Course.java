package etiya.com.entities;

import etiya.com.entities.accounts.EducatorAccount;


public class Course {
    private int id;
    private String title;
    private String description;
    private String imageUrl;
    private Category category;
    private EducatorAccount educatorAccount;
    private double fee;

    public Course(int id, String title, String description, String imageUrl, Category category, EducatorAccount educatorAccount, double fee) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.imageUrl = imageUrl;
        this.category = category;
        this.educatorAccount = educatorAccount;
        this.fee = fee;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public EducatorAccount getEducatorAccount() {
        return educatorAccount;
    }

    public void setEducatorAccount(EducatorAccount educatorAccount) {
        this.educatorAccount = educatorAccount;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public double getFee() {
        return fee;
    }
    public void setFee(double fee) {
        this.fee = fee;
    }

}
