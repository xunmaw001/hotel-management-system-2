package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KefangfenleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KefangfenleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KefangfenleiView;


/**
 * 客房分类
 *
 * @author 
 * @email 
 * @date 2021-01-11 13:23:20
 */
public interface KefangfenleiService extends IService<KefangfenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KefangfenleiVO> selectListVO(Wrapper<KefangfenleiEntity> wrapper);
   	
   	KefangfenleiVO selectVO(@Param("ew") Wrapper<KefangfenleiEntity> wrapper);
   	
   	List<KefangfenleiView> selectListView(Wrapper<KefangfenleiEntity> wrapper);
   	
   	KefangfenleiView selectView(@Param("ew") Wrapper<KefangfenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KefangfenleiEntity> wrapper);
   	
}

