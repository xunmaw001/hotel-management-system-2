package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KefangxudingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KefangxudingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KefangxudingView;


/**
 * 客房续订
 *
 * @author 
 * @email 
 * @date 2021-01-11 13:23:20
 */
public interface KefangxudingService extends IService<KefangxudingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KefangxudingVO> selectListVO(Wrapper<KefangxudingEntity> wrapper);
   	
   	KefangxudingVO selectVO(@Param("ew") Wrapper<KefangxudingEntity> wrapper);
   	
   	List<KefangxudingView> selectListView(Wrapper<KefangxudingEntity> wrapper);
   	
   	KefangxudingView selectView(@Param("ew") Wrapper<KefangxudingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KefangxudingEntity> wrapper);
   	
}

