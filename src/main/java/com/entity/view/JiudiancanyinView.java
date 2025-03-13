package com.entity.view;

import com.entity.JiudiancanyinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 酒店餐饮
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-01-11 13:23:20
 */
@TableName("jiudiancanyin")
public class JiudiancanyinView  extends JiudiancanyinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiudiancanyinView(){
	}
 
 	public JiudiancanyinView(JiudiancanyinEntity jiudiancanyinEntity){
 	try {
			BeanUtils.copyProperties(this, jiudiancanyinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
