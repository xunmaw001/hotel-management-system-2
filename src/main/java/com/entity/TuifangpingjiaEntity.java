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
 * 退房评价
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-01-11 13:23:20
 */
@TableName("tuifangpingjia")
public class TuifangpingjiaEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public TuifangpingjiaEntity() {
		
	}
	
	public TuifangpingjiaEntity(T t) {
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
	 * 客房名称
	 */
					
	private String kefangmingcheng;
	
	/**
	 * 客房类型
	 */
					
	private String kefangleixing;
	
	/**
	 * 客房图片
	 */
					
	private String kefangtupian;
	
	/**
	 * 酒店名称
	 */
					
	private String jiudianmingcheng;
	
	/**
	 * 酒店地址
	 */
					
	private String jiudiandizhi;
	
	/**
	 * 入住时间
	 */
					
	private String ruzhushijian;
	
	/**
	 * 退房时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date tuifangshijian;
	
	/**
	 * 客房评分
	 */
					
	private String kefangpingfen;
	
	/**
	 * 餐饮评分
	 */
					
	private String canyinpingfen;
	
	/**
	 * 服务评分
	 */
					
	private String fuwupingfen;
	
	/**
	 * 评价内容
	 */
					
	private String pingjianeirong;
	
	/**
	 * 用户名
	 */
					
	private String yonghuming;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 手机
	 */
					
	private String shouji;
	
	/**
	 * 是否审核
	 */
					
	private String sfsh;
	
	/**
	 * 审核回复
	 */
					
	private String shhf;
	
	
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
	 * 设置：客房名称
	 */
	public void setKefangmingcheng(String kefangmingcheng) {
		this.kefangmingcheng = kefangmingcheng;
	}
	/**
	 * 获取：客房名称
	 */
	public String getKefangmingcheng() {
		return kefangmingcheng;
	}
	/**
	 * 设置：客房类型
	 */
	public void setKefangleixing(String kefangleixing) {
		this.kefangleixing = kefangleixing;
	}
	/**
	 * 获取：客房类型
	 */
	public String getKefangleixing() {
		return kefangleixing;
	}
	/**
	 * 设置：客房图片
	 */
	public void setKefangtupian(String kefangtupian) {
		this.kefangtupian = kefangtupian;
	}
	/**
	 * 获取：客房图片
	 */
	public String getKefangtupian() {
		return kefangtupian;
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
	 * 设置：入住时间
	 */
	public void setRuzhushijian(String ruzhushijian) {
		this.ruzhushijian = ruzhushijian;
	}
	/**
	 * 获取：入住时间
	 */
	public String getRuzhushijian() {
		return ruzhushijian;
	}
	/**
	 * 设置：退房时间
	 */
	public void setTuifangshijian(Date tuifangshijian) {
		this.tuifangshijian = tuifangshijian;
	}
	/**
	 * 获取：退房时间
	 */
	public Date getTuifangshijian() {
		return tuifangshijian;
	}
	/**
	 * 设置：客房评分
	 */
	public void setKefangpingfen(String kefangpingfen) {
		this.kefangpingfen = kefangpingfen;
	}
	/**
	 * 获取：客房评分
	 */
	public String getKefangpingfen() {
		return kefangpingfen;
	}
	/**
	 * 设置：餐饮评分
	 */
	public void setCanyinpingfen(String canyinpingfen) {
		this.canyinpingfen = canyinpingfen;
	}
	/**
	 * 获取：餐饮评分
	 */
	public String getCanyinpingfen() {
		return canyinpingfen;
	}
	/**
	 * 设置：服务评分
	 */
	public void setFuwupingfen(String fuwupingfen) {
		this.fuwupingfen = fuwupingfen;
	}
	/**
	 * 获取：服务评分
	 */
	public String getFuwupingfen() {
		return fuwupingfen;
	}
	/**
	 * 设置：评价内容
	 */
	public void setPingjianeirong(String pingjianeirong) {
		this.pingjianeirong = pingjianeirong;
	}
	/**
	 * 获取：评价内容
	 */
	public String getPingjianeirong() {
		return pingjianeirong;
	}
	/**
	 * 设置：用户名
	 */
	public void setYonghuming(String yonghuming) {
		this.yonghuming = yonghuming;
	}
	/**
	 * 获取：用户名
	 */
	public String getYonghuming() {
		return yonghuming;
	}
	/**
	 * 设置：姓名
	 */
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
	/**
	 * 设置：手机
	 */
	public void setShouji(String shouji) {
		this.shouji = shouji;
	}
	/**
	 * 获取：手机
	 */
	public String getShouji() {
		return shouji;
	}
	/**
	 * 设置：是否审核
	 */
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
	/**
	 * 设置：审核回复
	 */
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}

}
