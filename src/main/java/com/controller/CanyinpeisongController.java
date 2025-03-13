package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.CanyinpeisongEntity;
import com.entity.view.CanyinpeisongView;

import com.service.CanyinpeisongService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 餐饮配送
 * 后端接口
 * @author 
 * @email 
 * @date 2021-01-11 13:23:20
 */
@RestController
@RequestMapping("/canyinpeisong")
public class CanyinpeisongController {
    @Autowired
    private CanyinpeisongService canyinpeisongService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,CanyinpeisongEntity canyinpeisong, HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			canyinpeisong.setYonghuming((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<CanyinpeisongEntity> ew = new EntityWrapper<CanyinpeisongEntity>();
		PageUtils page = canyinpeisongService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, canyinpeisong), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,CanyinpeisongEntity canyinpeisong, HttpServletRequest request){
        EntityWrapper<CanyinpeisongEntity> ew = new EntityWrapper<CanyinpeisongEntity>();
		PageUtils page = canyinpeisongService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, canyinpeisong), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( CanyinpeisongEntity canyinpeisong){
       	EntityWrapper<CanyinpeisongEntity> ew = new EntityWrapper<CanyinpeisongEntity>();
      	ew.allEq(MPUtil.allEQMapPre( canyinpeisong, "canyinpeisong")); 
        return R.ok().put("data", canyinpeisongService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(CanyinpeisongEntity canyinpeisong){
        EntityWrapper< CanyinpeisongEntity> ew = new EntityWrapper< CanyinpeisongEntity>();
 		ew.allEq(MPUtil.allEQMapPre( canyinpeisong, "canyinpeisong")); 
		CanyinpeisongView canyinpeisongView =  canyinpeisongService.selectView(ew);
		return R.ok("查询餐饮配送成功").put("data", canyinpeisongView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") String id){
        CanyinpeisongEntity canyinpeisong = canyinpeisongService.selectById(id);
        return R.ok().put("data", canyinpeisong);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") String id){
        CanyinpeisongEntity canyinpeisong = canyinpeisongService.selectById(id);
        return R.ok().put("data", canyinpeisong);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody CanyinpeisongEntity canyinpeisong, HttpServletRequest request){
    	canyinpeisong.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(canyinpeisong);

        canyinpeisongService.insert(canyinpeisong);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody CanyinpeisongEntity canyinpeisong, HttpServletRequest request){
    	canyinpeisong.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(canyinpeisong);

        canyinpeisongService.insert(canyinpeisong);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody CanyinpeisongEntity canyinpeisong, HttpServletRequest request){
        //ValidatorUtils.validateEntity(canyinpeisong);
        canyinpeisongService.updateById(canyinpeisong);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        canyinpeisongService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<CanyinpeisongEntity> wrapper = new EntityWrapper<CanyinpeisongEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			wrapper.eq("yonghuming", (String)request.getSession().getAttribute("username"));
		}

		int count = canyinpeisongService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
