package com.dao;

import com.entity.KefangxudingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KefangxudingVO;
import com.entity.view.KefangxudingView;


/**
 * 客房续订
 * 
 * @author 
 * @email 
 * @date 2021-01-11 13:23:20
 */
public interface KefangxudingDao extends BaseMapper<KefangxudingEntity> {
	
	List<KefangxudingVO> selectListVO(@Param("ew") Wrapper<KefangxudingEntity> wrapper);
	
	KefangxudingVO selectVO(@Param("ew") Wrapper<KefangxudingEntity> wrapper);
	
	List<KefangxudingView> selectListView(@Param("ew") Wrapper<KefangxudingEntity> wrapper);

	List<KefangxudingView> selectListView(Pagination page,@Param("ew") Wrapper<KefangxudingEntity> wrapper);
	
	KefangxudingView selectView(@Param("ew") Wrapper<KefangxudingEntity> wrapper);
	
}
