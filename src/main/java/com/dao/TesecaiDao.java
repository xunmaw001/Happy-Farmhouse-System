package com.dao;

import com.entity.TesecaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.TesecaiView;

/**
 * 特色菜 Dao 接口
 *
 * @author 
 * @since 2021-04-10
 */
public interface TesecaiDao extends BaseMapper<TesecaiEntity> {

   List<TesecaiView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
