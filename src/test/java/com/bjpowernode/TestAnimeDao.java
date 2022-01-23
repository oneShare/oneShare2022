package com.bjpowernode;

import com.bjpowernode.dao.AnimeDao;
import com.bjpowernode.entity.Anime;
import com.bjpowernode.utils.MyBatisUtil;
import com.bjpowernode.vo.AnimeVo;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class TestAnimeDao {

    @Test
    public void testSelectAll(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        AnimeDao animeDao = sqlSession.getMapper(AnimeDao.class);
        List<Anime> animeList = animeDao.selectAll();
        for (Anime anime : animeList){
            System.out.println("动画===" + anime);
        }
        sqlSession.close();
    }

    @Test
    public void testSelectName(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        AnimeDao animeDao = sqlSession.getMapper(AnimeDao.class);

        List<Map<String,Object>> mapList = animeDao.selectName();
        for(Map<String,Object> map : mapList){
            Set<String> set = map.keySet();
            for(String key : set){
                System.out.println(key);
                System.out.println(map.get(key));
            }
            System.out.println("\n");
        }
    }

    @Test
    public void testSelectByName(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        AnimeDao animeDao = sqlSession.getMapper(AnimeDao.class);

        List<AnimeVo> animeVoList = animeDao.selectByName();
        for(AnimeVo animeVo : animeVoList){
            System.out.println(animeVo);
        }
    }
}
