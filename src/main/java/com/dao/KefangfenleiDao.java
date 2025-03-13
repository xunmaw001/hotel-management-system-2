package com.dao;

import com.entity.KefangfenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KefangfenleiVO;
import com.entity.view.KefangfenleiView;


/**
 * 客房分类
 * 
 * @author 
 * @email 
 * @date 2021-01-11 13:23:20
 */
public interface KefangfenleiDao extends BaseMapper<KefangfenleiEntity> {
	
	List<KefangfenleiVO> selectListVO(@Param("ew") Wrapper<KefangfenleiEntity> wrapper);
	
	KefangfenleiVO selectVO(@Param("ew") Wrapper<KefangfenleiEntity> wrapper);
	
	List<KefangfenleiView> selectListView(@Param("ew") Wrapper<KefangfenleiEntity> wrapper);

	List<KefangfenleiView> selectListView(Pagination page,@Param("ew") Wrapper<KefangfenleiEntity> wrapper);
	
	KefangfenleiView selectView(@Param("ew") Wrapper<KefangfenleiEntity> wrapper);
	
}
