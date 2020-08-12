package com.ly.springboot.module;

import java.math.BigDecimal;
import java.util.Date;

public class ModelTree {
    private BigDecimal sysModelId;

    private BigDecimal parSysModelId;

    private String modelId;

    private String existModelCode;

    private String modelName;

    private BigDecimal modelLvl;

    private String sysModelType;

    private BigDecimal rootSystemId;

    private String accessType;

    private String url;

    private String accessPath;

    private String isLog;

    private String devPeople;

    private BigDecimal modelState;

    private Date startDt;

    private Date endDt;

    private Date lastUpdate;

    private String isControl;

    private String iosIcon;

    private String iosPkg;

    private String iosClass;

    private String androidIcon;

    private String androidPkg;

    private String androidClass;

    private String appVersion;

    private String enterType;

    private String windowOpenType;

    private Date createDate;

    private BigDecimal createUserId;

    private BigDecimal orderId;

    private String remark;

    private BigDecimal systemType;

    private String pcIcon;

    private String appUrl;

    public BigDecimal getSysModelId() {
        return sysModelId;
    }

    public void setSysModelId(BigDecimal sysModelId) {
        this.sysModelId = sysModelId;
    }

    public BigDecimal getParSysModelId() {
        return parSysModelId;
    }

    public void setParSysModelId(BigDecimal parSysModelId) {
        this.parSysModelId = parSysModelId;
    }

    public String getModelId() {
        return modelId;
    }

    public void setModelId(String modelId) {
        this.modelId = modelId == null ? null : modelId.trim();
    }

    public String getExistModelCode() {
        return existModelCode;
    }

    public void setExistModelCode(String existModelCode) {
        this.existModelCode = existModelCode == null ? null : existModelCode.trim();
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName == null ? null : modelName.trim();
    }

    public BigDecimal getModelLvl() {
        return modelLvl;
    }

    public void setModelLvl(BigDecimal modelLvl) {
        this.modelLvl = modelLvl;
    }

    public String getSysModelType() {
        return sysModelType;
    }

    public void setSysModelType(String sysModelType) {
        this.sysModelType = sysModelType == null ? null : sysModelType.trim();
    }

    public BigDecimal getRootSystemId() {
        return rootSystemId;
    }

    public void setRootSystemId(BigDecimal rootSystemId) {
        this.rootSystemId = rootSystemId;
    }

    public String getAccessType() {
        return accessType;
    }

    public void setAccessType(String accessType) {
        this.accessType = accessType == null ? null : accessType.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getAccessPath() {
        return accessPath;
    }

    public void setAccessPath(String accessPath) {
        this.accessPath = accessPath == null ? null : accessPath.trim();
    }

    public String getIsLog() {
        return isLog;
    }

    public void setIsLog(String isLog) {
        this.isLog = isLog == null ? null : isLog.trim();
    }

    public String getDevPeople() {
        return devPeople;
    }

    public void setDevPeople(String devPeople) {
        this.devPeople = devPeople == null ? null : devPeople.trim();
    }

    public BigDecimal getModelState() {
        return modelState;
    }

    public void setModelState(BigDecimal modelState) {
        this.modelState = modelState;
    }

    public Date getStartDt() {
        return startDt;
    }

    public void setStartDt(Date startDt) {
        this.startDt = startDt;
    }

    public Date getEndDt() {
        return endDt;
    }

    public void setEndDt(Date endDt) {
        this.endDt = endDt;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public String getIsControl() {
        return isControl;
    }

    public void setIsControl(String isControl) {
        this.isControl = isControl == null ? null : isControl.trim();
    }

    public String getIosIcon() {
        return iosIcon;
    }

    public void setIosIcon(String iosIcon) {
        this.iosIcon = iosIcon == null ? null : iosIcon.trim();
    }

    public String getIosPkg() {
        return iosPkg;
    }

    public void setIosPkg(String iosPkg) {
        this.iosPkg = iosPkg == null ? null : iosPkg.trim();
    }

    public String getIosClass() {
        return iosClass;
    }

    public void setIosClass(String iosClass) {
        this.iosClass = iosClass == null ? null : iosClass.trim();
    }

    public String getAndroidIcon() {
        return androidIcon;
    }

    public void setAndroidIcon(String androidIcon) {
        this.androidIcon = androidIcon == null ? null : androidIcon.trim();
    }

    public String getAndroidPkg() {
        return androidPkg;
    }

    public void setAndroidPkg(String androidPkg) {
        this.androidPkg = androidPkg == null ? null : androidPkg.trim();
    }

    public String getAndroidClass() {
        return androidClass;
    }

    public void setAndroidClass(String androidClass) {
        this.androidClass = androidClass == null ? null : androidClass.trim();
    }

    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion == null ? null : appVersion.trim();
    }

    public String getEnterType() {
        return enterType;
    }

    public void setEnterType(String enterType) {
        this.enterType = enterType == null ? null : enterType.trim();
    }

    public String getWindowOpenType() {
        return windowOpenType;
    }

    public void setWindowOpenType(String windowOpenType) {
        this.windowOpenType = windowOpenType == null ? null : windowOpenType.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public BigDecimal getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(BigDecimal createUserId) {
        this.createUserId = createUserId;
    }

    public BigDecimal getOrderId() {
        return orderId;
    }

    public void setOrderId(BigDecimal orderId) {
        this.orderId = orderId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public BigDecimal getSystemType() {
        return systemType;
    }

    public void setSystemType(BigDecimal systemType) {
        this.systemType = systemType;
    }

    public String getPcIcon() {
        return pcIcon;
    }

    public void setPcIcon(String pcIcon) {
        this.pcIcon = pcIcon == null ? null : pcIcon.trim();
    }

    public String getAppUrl() {
        return appUrl;
    }

    public void setAppUrl(String appUrl) {
        this.appUrl = appUrl == null ? null : appUrl.trim();
    }
}