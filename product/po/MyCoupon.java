package com.stevy.model;
/**
 * 
 * @Author stevy.builder
 * @Create Date 2015-5-28 18:33:37
 */
public class MyCoupon {

	private Long id;
	
	private Long couponId;
	
	private Long userId;
	
	private Integer status;
	
	private java.util.Date createTime;
	
	private java.util.Date useTime;
	
	private Integer deleted;
	
	
	public String getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public String getCouponId() {
		return couponId;
	}

	public void setCouponId(Long couponId) {
		this.couponId = couponId;
	}
	
	public String getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}
	
	public String getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}
	
	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(java.util.Date createTime) {
		this.createTime = createTime;
	}
	
	public String getUseTime() {
		return useTime;
	}

	public void setUseTime(java.util.Date useTime) {
		this.useTime = useTime;
	}
	
	public String getDeleted() {
		return deleted;
	}

	public void setDeleted(Integer deleted) {
		this.deleted = deleted;
	}
	
	
}
