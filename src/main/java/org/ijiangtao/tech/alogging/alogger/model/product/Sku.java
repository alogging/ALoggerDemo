package net.ijiangtao.tech.alogging.alogger.model.product;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 */
public class Sku {

    private Long id;

    private String code;

    private Long productId;

    private BigDecimal salePrice;

    private BigDecimal listPrice;

    private Date createTime;

    private Date modifyTime;

    private String[] properies;

    public void setSalePrice(BigDecimal salePrice) {
        this.salePrice = salePrice;
    }

    public void setListPrice(BigDecimal listPrice) {
        this.listPrice = listPrice;
    }

    public BigDecimal getSalePrice() {
        return salePrice;
    }

    public BigDecimal getListPrice() {
        return listPrice;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public void setProperies(String[] properies) {
        this.properies = properies;
    }

    public Long getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public Long getProductId() {
        return productId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public String[] getProperies() {
        return properies;
    }
}
