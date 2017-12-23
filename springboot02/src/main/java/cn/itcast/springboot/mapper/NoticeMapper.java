package cn.itcast.springboot.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import cn.itcast.springboot.pojo.Notice;

@Mapper
public interface NoticeMapper {
	List<Notice> findAll();
	
	Long count();
	
	List<Notice> findByPage(@Param("page") Integer page,@Param("rows") Integer rows);
}
