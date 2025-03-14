package com.entity.view;

import com.entity.TuifangpingjiaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 退房评价
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-01-11 13:23:20
 */
@TableName("tuifangpingjia")
public class TuifangpingjiaView  extends TuifangpingjiaEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public TuifangpingjiaView(){
	}
 
 	public TuifangpingjiaView(TuifangpingjiaEntity tuifangpingjiaEntity){
 	try {
			BeanUtils.copyProperties(this, tuifangpingjiaEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
