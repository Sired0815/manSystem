package cn.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cn.mapper.ConsultantMapper;
import cn.pojo.Consultant;

@Service("consultantService")
@Transactional(propagation = Propagation.REQUIRED, timeout = -1)
public class ConsultantServiceImp implements ConsultantService {
	@Resource
	private ConsultantMapper consultantMapper;

	@Override
	public int updateConsultant(Consultant consultant) {
		return consultantMapper.updateConsultant(consultant);
	}

	@Override
	public Consultant getConsultantById(Long id) {
		return consultantMapper.getConsultantById(id);
	}

	@Override
	public int getSum(Consultant consultant, String first1, String first2, String last1, String last2) {
		return consultantMapper.getSum(consultant, first1, first2, last1, last2);
	}

	@Override
	public int addConsultant(Consultant consultant) {
		return consultantMapper.addConsultant(consultant);
	}

	@Override
	public List<Consultant> getAllConsultant(Consultant consultant, String first1, String first2, String last1,
			String last2, Integer page, Integer rows) {
		return consultantMapper.getAllConsultant(consultant, first1, first2, last1, last2, page, rows);
	}
}
