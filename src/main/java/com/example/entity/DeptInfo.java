package com.example.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 组织机构系统___部门信息表
 * </p>
 *
 * @author ML.Zhang
 * @since 2019-01-02
 */
@TableName("T_dept_info")
public class DeptInfo extends Model<DeptInfo> {

    private static final long serialVersionUID = 1L;

    /**
     * 部门物理id
     */
	private Long id;
    /**
     * 部门编号
     */
    @JsonSerialize(using = ToStringSerializer.class)
    @TableField("dept_code")
	private Long deptCode;
    /**
     * 部门名称
     */
    @TableField("dept_name")
	private String deptName;
    /**
     * 部门地址
     */
    @TableField("dept_address")
	private String deptAddress;
    /**
     * 部门负责人(人员物理id)
     */
    @JsonSerialize(using = ToStringSerializer.class)
    @TableField("person_code")
	private Long personCode;
    /**
     * 上级部门编号(部门物理id)
     */
    @JsonSerialize(using = ToStringSerializer.class)
    @TableField("parent_dept_id")
	private Long parentDeptId;
    /**
     * 单位物理id
     */
    @JsonSerialize(using = ToStringSerializer.class)
    @TableField("unit_id")
	private Long unitId;
    /**
     * 创建时间
     */
	@TableField(value = "create_time", fill = FieldFill.INSERT)
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
	private Date createTime;
    /**
     * 创建人
     */
	@TableField(value = "create_user", fill = FieldFill.INSERT)
	private String createUser;
    /**
     * 数据状态
     */
	private Integer status;
    /**
     * 更新时间
     */
	@TableField(value = "update_time", fill = FieldFill.INSERT_UPDATE)
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
	private Date updateTime;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getDeptCode() {
		return deptCode;
	}

	public void setDeptCode(Long deptCode) {
		this.deptCode = deptCode;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getDeptAddress() {
		return deptAddress;
	}

	public void setDeptAddress(String deptAddress) {
		this.deptAddress = deptAddress;
	}

	public Long getPersonCode() {
		return personCode;
	}

	public void setPersonCode(Long personCode) {
		this.personCode = personCode;
	}

	public Long getParentDeptId() {
		return parentDeptId;
	}

	public void setParentDeptId(Long parentDeptId) {
		this.parentDeptId = parentDeptId;
	}

	public Long getUnitId() {
		return unitId;
	}

	public void setUnitId(Long unitId) {
		this.unitId = unitId;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

	@Override
	public String toString() {
		return "DeptInfo{" +
			", id=" + id +
			", deptCode=" + deptCode +
			", deptName=" + deptName +
			", deptAddress=" + deptAddress +
			", personCode=" + personCode +
			", parentDeptId=" + parentDeptId +
			", unitId=" + unitId +
			", createTime=" + createTime +
			", createUser=" + createUser +
			", status=" + status +
			", updateTime=" + updateTime +
			"}";
	}
}
