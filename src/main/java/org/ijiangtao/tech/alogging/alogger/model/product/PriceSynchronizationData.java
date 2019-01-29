package org.ijiangtao.tech.alogging.alogger.model.product;

import java.math.BigDecimal;

public class PriceSynchronizationData {

    private String code;

    private Integer level;

    private BigDecimal salePrice;

    private BigDecimal listPrice;

    public void setCode(String code) {
        this.code = code;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public void setSalePrice(BigDecimal salePrice) {
        this.salePrice = salePrice;
    }

    public void setListPrice(BigDecimal listPrice) {
        this.listPrice = listPrice;
    }

    public String getCode() {
        return code;
    }

    public Integer getLevel() {
        return level;
    }

    public BigDecimal getSalePrice() {
        return salePrice;
    }

    public BigDecimal getListPrice() {
        return listPrice;
    }
}
