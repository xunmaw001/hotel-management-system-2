package com.dao;

import com.entity.CanyinpeisongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.CanyinpeisongVO;
import com.entity.view.CanyinpeisongView;


/**
 * 餐饮配送
 * 
 * @author 
 * @email 
 * @date 2021-01-11 13:23:20
 */
public interface CanyinpeisongDao extends BaseMapper<CanyinpeisongEntity> {
	
	List<CanyinpeisongVO> selectListVO(@Param("ew") Wrapper<CanyinpeisongEntity> wrapper);
	
	CanyinpeisongVO selectVO(@Param("ew") Wrapper<CanyinpeisongEntity> wrapper);
	
	List<CanyinpeisongView> selectListView(@Param("ew") Wrapper<CanyinpeisongEntity> wrapper);

	List<CanyinpeisongView> selectListView(Pagination page,@Param("ew") Wrapper<CanyinpeisongEntity> wrapper);
	
	CanyinpeisongView selectView(@Param("ew") Wrapper<CanyinpeisongEntity> wrapper);
	
}
