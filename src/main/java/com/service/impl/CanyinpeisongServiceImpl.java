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


import com.dao.CanyinpeisongDao;
import com.entity.CanyinpeisongEntity;
import com.service.CanyinpeisongService;
import com.entity.vo.CanyinpeisongVO;
import com.entity.view.CanyinpeisongView;

@Service("canyinpeisongService")
public class CanyinpeisongServiceImpl extends ServiceImpl<CanyinpeisongDao, CanyinpeisongEntity> implements CanyinpeisongService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CanyinpeisongEntity> page = this.selectPage(
                new Query<CanyinpeisongEntity>(params).getPage(),
                new EntityWrapper<CanyinpeisongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<CanyinpeisongEntity> wrapper) {
		  Page<CanyinpeisongView> page =new Query<CanyinpeisongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<CanyinpeisongVO> selectListVO(Wrapper<CanyinpeisongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public CanyinpeisongVO selectVO(Wrapper<CanyinpeisongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<CanyinpeisongView> selectListView(Wrapper<CanyinpeisongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CanyinpeisongView selectView(Wrapper<CanyinpeisongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
