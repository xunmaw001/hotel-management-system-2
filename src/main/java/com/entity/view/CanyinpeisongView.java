package com.entity.view;

import com.entity.CanyinpeisongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 餐饮配送
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-01-11 13:23:20
 */
@TableName("canyinpeisong")
public class CanyinpeisongView  extends CanyinpeisongEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public CanyinpeisongView(){
	}
 
 	public CanyinpeisongView(CanyinpeisongEntity canyinpeisongEntity){
 	try {
			BeanUtils.copyProperties(this, canyinpeisongEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
