package com.dao;

import com.entity.DiscussjiudiancanyinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussjiudiancanyinVO;
import com.entity.view.DiscussjiudiancanyinView;


/**
 * 酒店餐饮评论表
 * 
 * @author 
 * @email 
 * @date 2021-01-11 13:23:20
 */
public interface DiscussjiudiancanyinDao extends BaseMapper<DiscussjiudiancanyinEntity> {
	
	List<DiscussjiudiancanyinVO> selectListVO(@Param("ew") Wrapper<DiscussjiudiancanyinEntity> wrapper);
	
	DiscussjiudiancanyinVO selectVO(@Param("ew") Wrapper<DiscussjiudiancanyinEntity> wrapper);
	
	List<DiscussjiudiancanyinView> selectListView(@Param("ew") Wrapper<DiscussjiudiancanyinEntity> wrapper);

	List<DiscussjiudiancanyinView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussjiudiancanyinEntity> wrapper);
	
	DiscussjiudiancanyinView selectView(@Param("ew") Wrapper<DiscussjiudiancanyinEntity> wrapper);
	
}
