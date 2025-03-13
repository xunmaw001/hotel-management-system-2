package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 酒店餐饮
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-01-11 13:23:20
 */
@TableName("jiudiancanyin")
public class JiudiancanyinEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JiudiancanyinEntity() {
		
	}
	
	public JiudiancanyinEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 餐饮名称
	 */
					
	private String canyinmingcheng;
	
	/**
	 * 酒店名称
	 */
					
	private String jiudianmingcheng;
	
	/**
	 * 分类
	 */
					
	private String fenlei;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 酒店地址
	 */
					
	private String jiudiandizhi;
	
	/**
	 * 咨询电话
	 */
					
	private String zixundianhua;
	
	/**
	 * 价格
	 */
					
	private Integer jiage;
	
	/**
	 * 详情
	 */
					
	private String xiangqing;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：餐饮名称
	 */
	public void setCanyinmingcheng(String canyinmingcheng) {
		this.canyinmingcheng = canyinmingcheng;
	}
	/**
	 * 获取：餐饮名称
	 */
	public String getCanyinmingcheng() {
		return canyinmingcheng;
	}
	/**
	 * 设置：酒店名称
	 */
	public void setJiudianmingcheng(String jiudianmingcheng) {
		this.jiudianmingcheng = jiudianmingcheng;
	}
	/**
	 * 获取：酒店名称
	 */
	public String getJiudianmingcheng() {
		return jiudianmingcheng;
	}
	/**
	 * 设置：分类
	 */
	public void setFenlei(String fenlei) {
		this.fenlei = fenlei;
	}
	/**
	 * 获取：分类
	 */
	public String getFenlei() {
		return fenlei;
	}
	/**
	 * 设置：图片
	 */
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
	/**
	 * 设置：酒店地址
	 */
	public void setJiudiandizhi(String jiudiandizhi) {
		this.jiudiandizhi = jiudiandizhi;
	}
	/**
	 * 获取：酒店地址
	 */
	public String getJiudiandizhi() {
		return jiudiandizhi;
	}
	/**
	 * 设置：咨询电话
	 */
	public void setZixundianhua(String zixundianhua) {
		this.zixundianhua = zixundianhua;
	}
	/**
	 * 获取：咨询电话
	 */
	public String getZixundianhua() {
		return zixundianhua;
	}
	/**
	 * 设置：价格
	 */
	public void setJiage(Integer jiage) {
		this.jiage = jiage;
	}
	/**
	 * 获取：价格
	 */
	public Integer getJiage() {
		return jiage;
	}
	/**
	 * 设置：详情
	 */
	public void setXiangqing(String xiangqing) {
		this.xiangqing = xiangqing;
	}
	/**
	 * 获取：详情
	 */
	public String getXiangqing() {
		return xiangqing;
	}

}
