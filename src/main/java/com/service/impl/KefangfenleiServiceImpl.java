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


import com.dao.KefangfenleiDao;
import com.entity.KefangfenleiEntity;
import com.service.KefangfenleiService;
import com.entity.vo.KefangfenleiVO;
import com.entity.view.KefangfenleiView;

@Service("kefangfenleiService")
public class KefangfenleiServiceImpl extends ServiceImpl<KefangfenleiDao, KefangfenleiEntity> implements KefangfenleiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KefangfenleiEntity> page = this.selectPage(
                new Query<KefangfenleiEntity>(params).getPage(),
                new EntityWrapper<KefangfenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KefangfenleiEntity> wrapper) {
		  Page<KefangfenleiView> page =new Query<KefangfenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KefangfenleiVO> selectListVO(Wrapper<KefangfenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KefangfenleiVO selectVO(Wrapper<KefangfenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KefangfenleiView> selectListView(Wrapper<KefangfenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KefangfenleiView selectView(Wrapper<KefangfenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
