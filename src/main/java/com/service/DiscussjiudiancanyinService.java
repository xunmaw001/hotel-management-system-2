package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussjiudiancanyinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussjiudiancanyinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussjiudiancanyinView;


/**
 * 酒店餐饮评论表
 *
 * @author 
 * @email 
 * @date 2021-01-11 13:23:20
 */
public interface DiscussjiudiancanyinService extends IService<DiscussjiudiancanyinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussjiudiancanyinVO> selectListVO(Wrapper<DiscussjiudiancanyinEntity> wrapper);
   	
   	DiscussjiudiancanyinVO selectVO(@Param("ew") Wrapper<DiscussjiudiancanyinEntity> wrapper);
   	
   	List<DiscussjiudiancanyinView> selectListView(Wrapper<DiscussjiudiancanyinEntity> wrapper);
   	
   	DiscussjiudiancanyinView selectView(@Param("ew") Wrapper<DiscussjiudiancanyinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussjiudiancanyinEntity> wrapper);
   	
}

