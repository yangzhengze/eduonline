package com.video.show.service.impl;

import java.util.List;

import com.entity.tb_shiping;
import com.entity.tb_type;
import com.video.show.dao.showVideo;
import com.video.show.dao.impl.showVideoImpl;
import com.video.show.service.showVideoService;


public class showVideoServiceImpl implements showVideoService {
    showVideo dao;
    public showVideoServiceImpl(){
    	dao=new showVideoImpl();
    }
	@Override
	public List<tb_shiping> findAddVideo() {
		try {
		return dao.findAllVodeo();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return null;
	}
	@Override
	//找到推荐视频
	public List<tb_shiping> findRecommendVideo() {
		// TODO Auto-generated method stub
		try {
		      System.out.println("执行到这里selvct--------------------------------------------------------------------------");
			return dao.findRecommendVideo();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	@Override
	//找到免费视频
	public List<tb_shiping> findFreeVideo() {
		// TODO Auto-generated method stub
		try {
			 System.out.println("执行到这里selvct--------------------------------------------------------------------------");
			return	dao.findFreeVideo();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	@Override
	//通过名字找到id
	public int findIdByName(String name) {
		// TODO Auto-generated method stub
		try {
			return dao.findIdByName(name);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	@Override
	//评论功能
	public int insertComment(int id, int shibian, String text) {
		// TODO Auto-generated method stub
		try {
			return	dao.insertComment(id,shibian,text);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	@Override
	//根据tid找到视频
	public List<tb_shiping> findVideoByTid(int a1) {
		// TODO Auto-generated method stub
		try {
			return dao.findVideoByTid(a1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	@Override
	
	//根据tid找到type的名字
	public List<tb_type> findTypeBytid(int i) {
		// TODO Auto-generated method stub
		try {
			return dao.findTypeBytid(i);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
