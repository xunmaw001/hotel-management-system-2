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


import com.dao.DiscussjiudiancanyinDao;
import com.entity.DiscussjiudiancanyinEntity;
import com.service.DiscussjiudiancanyinService;
import com.entity.vo.DiscussjiudiancanyinVO;
import com.entity.view.DiscussjiudiancanyinView;

@Service("discussjiudiancanyinService")
public class DiscussjiudiancanyinServiceImpl extends ServiceImpl<DiscussjiudiancanyinDao, DiscussjiudiancanyinEntity> implements DiscussjiudiancanyinService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussjiudiancanyinEntity> page = this.selectPage(
                new Query<DiscussjiudiancanyinEntity>(params).getPage(),
                new EntityWrapper<DiscussjiudiancanyinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussjiudiancanyinEntity> wrapper) {
		  Page<DiscussjiudiancanyinView> page =new Query<DiscussjiudiancanyinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussjiudiancanyinVO> selectListVO(Wrapper<DiscussjiudiancanyinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussjiudiancanyinVO selectVO(Wrapper<DiscussjiudiancanyinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussjiudiancanyinView> selectListView(Wrapper<DiscussjiudiancanyinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussjiudiancanyinView selectView(Wrapper<DiscussjiudiancanyinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
