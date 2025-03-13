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


import com.dao.CanyindingdanDao;
import com.entity.CanyindingdanEntity;
import com.service.CanyindingdanService;
import com.entity.vo.CanyindingdanVO;
import com.entity.view.CanyindingdanView;

@Service("canyindingdanService")
public class CanyindingdanServiceImpl extends ServiceImpl<CanyindingdanDao, CanyindingdanEntity> implements CanyindingdanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CanyindingdanEntity> page = this.selectPage(
                new Query<CanyindingdanEntity>(params).getPage(),
                new EntityWrapper<CanyindingdanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<CanyindingdanEntity> wrapper) {
		  Page<CanyindingdanView> page =new Query<CanyindingdanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<CanyindingdanVO> selectListVO(Wrapper<CanyindingdanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public CanyindingdanVO selectVO(Wrapper<CanyindingdanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<CanyindingdanView> selectListView(Wrapper<CanyindingdanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CanyindingdanView selectView(Wrapper<CanyindingdanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
