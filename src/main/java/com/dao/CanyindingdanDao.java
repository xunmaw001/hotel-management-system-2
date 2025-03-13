package com.dao;

import com.entity.CanyindingdanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.CanyindingdanVO;
import com.entity.view.CanyindingdanView;


/**
 * 餐饮订单
 * 
 * @author 
 * @email 
 * @date 2021-01-11 13:23:20
 */
public interface CanyindingdanDao extends BaseMapper<CanyindingdanEntity> {
	
	List<CanyindingdanVO> selectListVO(@Param("ew") Wrapper<CanyindingdanEntity> wrapper);
	
	CanyindingdanVO selectVO(@Param("ew") Wrapper<CanyindingdanEntity> wrapper);
	
	List<CanyindingdanView> selectListView(@Param("ew") Wrapper<CanyindingdanEntity> wrapper);

	List<CanyindingdanView> selectListView(Pagination page,@Param("ew") Wrapper<CanyindingdanEntity> wrapper);
	
	CanyindingdanView selectView(@Param("ew") Wrapper<CanyindingdanEntity> wrapper);
	
}
