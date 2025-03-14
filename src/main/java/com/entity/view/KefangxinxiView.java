package com.entity.view;

import com.entity.KefangxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 客房信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-01-11 13:23:20
 */
@TableName("kefangxinxi")
public class KefangxinxiView  extends KefangxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public KefangxinxiView(){
	}
 
 	public KefangxinxiView(KefangxinxiEntity kefangxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, kefangxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
