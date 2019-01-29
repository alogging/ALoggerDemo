package org.ijiangtao.tech.alogging.alogger.model.product;

import java.math.BigDecimal;
import java.util.Date;

public class PriceSynchronizationLog {

    private Long id;

    private String code;
    private Integer level;
    private Integer channel;

    private Date createTime;
    private String msg;

    private BigDecimal newListPrice;
    private BigDecimal newSalePrice;

    private BigDecimal oldListPrice;
    private BigDecimal oldSalePrice;

    public void setId(Long id) {
        this.id = id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public void setChannel(Integer channel) {
        this.channel = channel;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setNewListPrice(BigDecimal newListPrice) {
        this.newListPrice = newListPrice;
    }

    public void setNewSalePrice(BigDecimal newSalePrice) {
        this.newSalePrice = newSalePrice;
    }

    public void setOldListPrice(BigDecimal oldListPrice) {
        this.oldListPrice = oldListPrice;
    }

    public void setOldSalePrice(BigDecimal oldSalePrice) {
        this.oldSalePrice = oldSalePrice;
    }

    public Long getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public Integer getLevel() {
        return level;
    }

    public Integer getChannel() {
        return channel;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public String getMsg() {
        return msg;
    }

    public BigDecimal getNewListPrice() {
        return newListPrice;
    }

    public BigDecimal getNewSalePrice() {
        return newSalePrice;
    }

    public BigDecimal getOldListPrice() {
        return oldListPrice;
    }

    public BigDecimal getOldSalePrice() {
        return oldSalePrice;
    }
}
