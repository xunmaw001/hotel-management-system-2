package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.KefangxudingDao;
import com.entity.KefangxudingEntity;
import com.service.KefangxudingService;
import com.entity.vo.KefangxudingVO;
import com.entity.view.KefangxudingView;

@Service("kefangxudingService")
public class KefangxudingServiceImpl extends ServiceImpl<KefangxudingDao, KefangxudingEntity> implements KefangxudingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KefangxudingEntity> page = this.selectPage(
                new Query<KefangxudingEntity>(params).getPage(),
                new EntityWrapper<KefangxudingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KefangxudingEntity> wrapper) {
		  Page<KefangxudingView> page =new Query<KefangxudingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KefangxudingVO> selectListVO(Wrapper<KefangxudingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KefangxudingVO selectVO(Wrapper<KefangxudingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KefangxudingView> selectListView(Wrapper<KefangxudingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KefangxudingView selectView(Wrapper<KefangxudingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
