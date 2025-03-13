package com.entity.model;

import com.entity.KefangxudingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 客房续订
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-01-11 13:23:20
 */
public class KefangxudingModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
	 * 客房价格
	 */
	
	private String kefangjiage;
		
	/**
	 * 续订天数
	 */
	
	private Integer xudingtianshu;
		
	/**
	 * 总价格
	 */
	
	private String zongjiage;
		
	/**
	 * 入住时间
	 */
	
	private String ruzhushijian;
		
	/**
	 * 续订时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date xudingshijian;
		
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
	 * 身份证
	 */
	
	private String shenfenzheng;
		
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
	 * 设置：客房价格
	 */
	 
	public void setKefangjiage(String kefangjiage) {
		this.kefangjiage = kefangjiage;
	}
	
	/**
	 * 获取：客房价格
	 */
	public String getKefangjiage() {
		return kefangjiage;
	}
				
	
	/**
	 * 设置：续订天数
	 */
	 
	public void setXudingtianshu(Integer xudingtianshu) {
		this.xudingtianshu = xudingtianshu;
	}
	
	/**
	 * 获取：续订天数
	 */
	public Integer getXudingtianshu() {
		return xudingtianshu;
	}
				
	
	/**
	 * 设置：总价格
	 */
	 
	public void setZongjiage(String zongjiage) {
		this.zongjiage = zongjiage;
	}
	
	/**
	 * 获取：总价格
	 */
	public String getZongjiage() {
		return zongjiage;
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
	 * 设置：续订时间
	 */
	 
	public void setXudingshijian(Date xudingshijian) {
		this.xudingshijian = xudingshijian;
	}
	
	/**
	 * 获取：续订时间
	 */
	public Date getXudingshijian() {
		return xudingshijian;
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
	 * 设置：身份证
	 */
	 
	public void setShenfenzheng(String shenfenzheng) {
		this.shenfenzheng = shenfenzheng;
	}
	
	/**
	 * 获取：身份证
	 */
	public String getShenfenzheng() {
		return shenfenzheng;
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
