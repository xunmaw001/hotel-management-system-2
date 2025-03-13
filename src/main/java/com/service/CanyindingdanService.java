package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CanyindingdanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.CanyindingdanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.CanyindingdanView;


/**
 * 餐饮订单
 *
 * @author 
 * @email 
 * @date 2021-01-11 13:23:20
 */
public interface CanyindingdanService extends IService<CanyindingdanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CanyindingdanVO> selectListVO(Wrapper<CanyindingdanEntity> wrapper);
   	
   	CanyindingdanVO selectVO(@Param("ew") Wrapper<CanyindingdanEntity> wrapper);
   	
   	List<CanyindingdanView> selectListView(Wrapper<CanyindingdanEntity> wrapper);
   	
   	CanyindingdanView selectView(@Param("ew") Wrapper<CanyindingdanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CanyindingdanEntity> wrapper);
   	
}

