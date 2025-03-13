package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiudiancanyinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiudiancanyinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiudiancanyinView;


/**
 * 酒店餐饮
 *
 * @author 
 * @email 
 * @date 2021-01-11 13:23:20
 */
public interface JiudiancanyinService extends IService<JiudiancanyinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiudiancanyinVO> selectListVO(Wrapper<JiudiancanyinEntity> wrapper);
   	
   	JiudiancanyinVO selectVO(@Param("ew") Wrapper<JiudiancanyinEntity> wrapper);
   	
   	List<JiudiancanyinView> selectListView(Wrapper<JiudiancanyinEntity> wrapper);
   	
   	JiudiancanyinView selectView(@Param("ew") Wrapper<JiudiancanyinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiudiancanyinEntity> wrapper);
   	
}

