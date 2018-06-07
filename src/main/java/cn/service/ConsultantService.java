package cn.service;

import java.util.List;

import cn.pojo.Consultant;

public interface ConsultantService {

	// 根据ID获得咨询者信息
	Consultant getConsultantById(Long id);

	// 咨询者修改
	int updateConsultant(Consultant consultant);

	// 获得总数
	int getSum(Consultant consultant, String first1, String first2, String last1, String last2);

	// 获得所有咨询者信息
	List<Consultant> getAllConsultant(Consultant consultant, String first1, String first2, String last1, String last2,
			Integer page, Integer rows);

	// 添加咨询者信息
	int addConsultant(Consultant consultant);
}
