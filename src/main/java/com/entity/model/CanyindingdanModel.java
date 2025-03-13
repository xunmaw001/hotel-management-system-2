package com.entity.model;

import com.entity.CanyindingdanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 餐饮订单
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-01-11 13:23:20
 */
public class CanyindingdanModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 餐饮名称
	 */
	
	private String canyinmingcheng;
		
	/**
	 * 分类
	 */
	
	private String fenlei;
		
	/**
	 * 酒店名称
	 */
	
	private String jiudianmingcheng;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 价格
	 */
	
	private String jiage;
		
	/**
	 * 数量
	 */
	
	private Integer shuliang;
		
	/**
	 * 总价格
	 */
	
	private Integer zongjiage;
		
	/**
	 * 下单时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date xiadanshijian;
		
	/**
	 * 留言备注
	 */
	
	private String liuyanbeizhu;
		
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
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
		
	/**
	 * 是否支付
	 */
	
	private String ispay;
				
	
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
	 * 设置：价格
	 */
	 
	public void setJiage(String jiage) {
		this.jiage = jiage;
	}
	
	/**
	 * 获取：价格
	 */
	public String getJiage() {
		return jiage;
	}
				
	
	/**
	 * 设置：数量
	 */
	 
	public void setShuliang(Integer shuliang) {
		this.shuliang = shuliang;
	}
	
	/**
	 * 获取：数量
	 */
	public Integer getShuliang() {
		return shuliang;
	}
				
	
	/**
	 * 设置：总价格
	 */
	 
	public void setZongjiage(Integer zongjiage) {
		this.zongjiage = zongjiage;
	}
	
	/**
	 * 获取：总价格
	 */
	public Integer getZongjiage() {
		return zongjiage;
	}
				
	
	/**
	 * 设置：下单时间
	 */
	 
	public void setXiadanshijian(Date xiadanshijian) {
		this.xiadanshijian = xiadanshijian;
	}
	
	/**
	 * 获取：下单时间
	 */
	public Date getXiadanshijian() {
		return xiadanshijian;
	}
				
	
	/**
	 * 设置：留言备注
	 */
	 
	public void setLiuyanbeizhu(String liuyanbeizhu) {
		this.liuyanbeizhu = liuyanbeizhu;
	}
	
	/**
	 * 获取：留言备注
	 */
	public String getLiuyanbeizhu() {
		return liuyanbeizhu;
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
				
	
	/**
	 * 设置：是否支付
	 */
	 
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}
			
}
