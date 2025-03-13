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


import com.dao.JiudiancanyinDao;
import com.entity.JiudiancanyinEntity;
import com.service.JiudiancanyinService;
import com.entity.vo.JiudiancanyinVO;
import com.entity.view.JiudiancanyinView;

@Service("jiudiancanyinService")
public class JiudiancanyinServiceImpl extends ServiceImpl<JiudiancanyinDao, JiudiancanyinEntity> implements JiudiancanyinService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiudiancanyinEntity> page = this.selectPage(
                new Query<JiudiancanyinEntity>(params).getPage(),
                new EntityWrapper<JiudiancanyinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiudiancanyinEntity> wrapper) {
		  Page<JiudiancanyinView> page =new Query<JiudiancanyinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiudiancanyinVO> selectListVO(Wrapper<JiudiancanyinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiudiancanyinVO selectVO(Wrapper<JiudiancanyinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiudiancanyinView> selectListView(Wrapper<JiudiancanyinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiudiancanyinView selectView(Wrapper<JiudiancanyinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
