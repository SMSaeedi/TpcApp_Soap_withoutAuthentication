package com.example.demo.tpcApp.model;

import java.util.Date;

public class ProductDetailPojo {
    private Long itemId;
    private String itemTitle;
    private String authorFName;
    private String authorLName;
    private Date itemPubDate;
    private String itemPublisher;
    private String itemSubject;
    private String itemDesc;
    private String itemCost;
    private String itemSrp;
    private String itemAvail;
    private String itemIsbn;
    private String itemPage;
    private String itemBacking;
    private String itemDimensions;
    private byte[] imageBytes;
    private String emptyList;

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public String getItemTitle() {
        return itemTitle;
    }

    public void setItemTitle(String itemTitle) {
        this.itemTitle = itemTitle;
    }

    public String getAuthorFName() {
        return authorFName;
    }

    public void setAuthorFName(String authorFName) {
        this.authorFName = authorFName;
    }

    public String getAuthorLName() {
        return authorLName;
    }

    public void setAuthorLName(String authorLName) {
        this.authorLName = authorLName;
    }

    public Date getItemPubDate() {
        return itemPubDate;
    }

    public void setItemPubDate(Date itemPubDate) {
        this.itemPubDate = itemPubDate;
    }

    public String getItemPublisher() {
        return itemPublisher;
    }

    public void setItemPublisher(String itemPublisher) {
        this.itemPublisher = itemPublisher;
    }

    public String getItemSubject() {
        return itemSubject;
    }

    public void setItemSubject(String itemSubject) {
        this.itemSubject = itemSubject;
    }

    public String getItemDesc() {
        return itemDesc;
    }

    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc;
    }

    public String getItemCost() {
        return itemCost;
    }

    public void setItemCost(String itemCost) {
        this.itemCost = itemCost;
    }

    public String getItemSrp() {
        return itemSrp;
    }

    public void setItemSrp(String itemSrp) {
        this.itemSrp = itemSrp;
    }

    public String getItemAvail() {
        return itemAvail;
    }

    public void setItemAvail(String itemAvail) {
        this.itemAvail = itemAvail;
    }

    public String getItemIsbn() {
        return itemIsbn;
    }

    public void setItemIsbn(String itemIsbn) {
        this.itemIsbn = itemIsbn;
    }

    public String getItemPage() {
        return itemPage;
    }

    public void setItemPage(String itemPage) {
        this.itemPage = itemPage;
    }

    public String getItemBacking() {
        return itemBacking;
    }

    public void setItemBacking(String itemBacking) {
        this.itemBacking = itemBacking;
    }

    public String getItemDimensions() {
        return itemDimensions;
    }

    public void setItemDimensions(String itemDimensions) {
        this.itemDimensions = itemDimensions;
    }

    public byte[] getImageBytes() {
        return imageBytes;
    }

    public void setImageBytes(byte[] imageBytes) {
        this.imageBytes = imageBytes;
    }

    public String getEmptyList() {
        return emptyList;
    }

    public void setEmptyList(String emptyList) {
        this.emptyList = emptyList;
    }
}