package org.ijiangtao.tech.alogging.alogger.model.product;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 */
public class Product {

    private Long id;

    private String code;

    private Long storeId;

    private Long industryId;

    private Integer type;

    private Date createTime;

    private Date modifyTime;

    private String remark;

    private String title;

    private String description;

    private BigDecimal salePrice;

    private BigDecimal listPrice;

    public void setId(Long id) {
        this.id = id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    public void setIndustryId(Long industryId) {
        this.industryId = industryId;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setSalePrice(BigDecimal salePrice) {
        this.salePrice = salePrice;
    }

    public void setListPrice(BigDecimal listPrice) {
        this.listPrice = listPrice;
    }

    public Long getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public Long getStoreId() {
        return storeId;
    }

    public Long getIndustryId() {
        return industryId;
    }

    public Integer getType() {
        return type;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public String getRemark() {
        return remark;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public BigDecimal getSalePrice() {
        return salePrice;
    }

    public BigDecimal getListPrice() {
        return listPrice;
    }
}
