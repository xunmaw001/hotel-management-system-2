package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CanyinpeisongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.CanyinpeisongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.CanyinpeisongView;


/**
 * 餐饮配送
 *
 * @author 
 * @email 
 * @date 2021-01-11 13:23:20
 */
public interface CanyinpeisongService extends IService<CanyinpeisongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CanyinpeisongVO> selectListVO(Wrapper<CanyinpeisongEntity> wrapper);
   	
   	CanyinpeisongVO selectVO(@Param("ew") Wrapper<CanyinpeisongEntity> wrapper);
   	
   	List<CanyinpeisongView> selectListView(Wrapper<CanyinpeisongEntity> wrapper);
   	
   	CanyinpeisongView selectView(@Param("ew") Wrapper<CanyinpeisongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CanyinpeisongEntity> wrapper);
   	
}

