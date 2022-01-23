package com.bjpowernode.dao;

import com.bjpowernode.entity.Anime;
import com.bjpowernode.vo.AnimeVo;

import java.util.List;
import java.util.Map;

public interface AnimeDao {

    List<Anime> selectAll();

    List<Map<String ,Object>> selectName();

    List<AnimeVo> selectByName();
}
