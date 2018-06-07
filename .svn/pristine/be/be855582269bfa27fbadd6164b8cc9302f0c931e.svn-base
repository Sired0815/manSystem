package cn.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cn.mapper.ProvinceMapper;
import cn.pojo.Province;

@Service("provinceService")
@Transactional(propagation = Propagation.REQUIRED, timeout = -1)
public class ProvinceServiceImp implements ProvinceService {
	@Resource
	private ProvinceMapper ProvinceMapper;

	@Override
	public List<Province> getAllProvince() {

		return ProvinceMapper.getAllProvince();
	}

}
