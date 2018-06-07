package cn.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.pojo.Consultant;

public interface ConsultantMapper {

	// 根据ID获得咨询者信息
	Consultant getConsultantById(@Param("id") Long id);

	// 咨询者修改
	int updateConsultant(Consultant consultant);

	// 获得模糊查询总数
	int getSum(@Param("consultant") Consultant consultant, //
			@Param("first1") String first1, //
			@Param("first2") String first2, //
			@Param("last1") String last1, //
			@Param("last2") String last2);

	// 获得所有咨询者信息
	List<Consultant> getAllConsultant(//
			@Param("consultant") Consultant consultant, //
			@Param("first1") String first1, //
			@Param("first2") String first2, //
			@Param("last1") String last1, //
			@Param("last2") String last2, //
			@Param("page") Integer page, //
			@Param("rows") Integer rows);//

	// 添加咨询者信息
	int addConsultant(Consultant consultant);
}
