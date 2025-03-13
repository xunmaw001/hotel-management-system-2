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
 * 餐饮配送
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-01-11 13:23:20
 */
@TableName("canyinpeisong")
public class CanyinpeisongEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public CanyinpeisongEntity() {
		
	}
	
	public CanyinpeisongEntity(T t) {
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
	 * 订单编号
	 */
					
	private String dingdanbianhao;
	
	/**
	 * 餐饮名称
	 */
					
	private String canyinmingcheng;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 酒店名称
	 */
					
	private String jiudianmingcheng;
	
	/**
	 * 分类
	 */
					
	private String fenlei;
	
	/**
	 * 数量
	 */
					
	private String shuliang;
	
	/**
	 * 订单状态
	 */
					
	private String dingdanzhuangtai;
	
	/**
	 * 下单时间
	 */
					
	private String xiadanshijian;
	
	/**
	 * 更新时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date gengxinshijian;
	
	/**
	 * 用户名
	 */
					
	private String yonghuming;
	
	/**
	 * 手机
	 */
					
	private String shouji;
	
	/**
	 * 客房名称
	 */
					
	private String kefangmingcheng;
	
	
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
	 * 设置：订单编号
	 */
	public void setDingdanbianhao(String dingdanbianhao) {
		this.dingdanbianhao = dingdanbianhao;
	}
	/**
	 * 获取：订单编号
	 */
	public String getDingdanbianhao() {
		return dingdanbianhao;
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
	 * 设置：数量
	 */
	public void setShuliang(String shuliang) {
		this.shuliang = shuliang;
	}
	/**
	 * 获取：数量
	 */
	public String getShuliang() {
		return shuliang;
	}
	/**
	 * 设置：订单状态
	 */
	public void setDingdanzhuangtai(String dingdanzhuangtai) {
		this.dingdanzhuangtai = dingdanzhuangtai;
	}
	/**
	 * 获取：订单状态
	 */
	public String getDingdanzhuangtai() {
		return dingdanzhuangtai;
	}
	/**
	 * 设置：下单时间
	 */
	public void setXiadanshijian(String xiadanshijian) {
		this.xiadanshijian = xiadanshijian;
	}
	/**
	 * 获取：下单时间
	 */
	public String getXiadanshijian() {
		return xiadanshijian;
	}
	/**
	 * 设置：更新时间
	 */
	public void setGengxinshijian(Date gengxinshijian) {
		this.gengxinshijian = gengxinshijian;
	}
	/**
	 * 获取：更新时间
	 */
	public Date getGengxinshijian() {
		return gengxinshijian;
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

}
