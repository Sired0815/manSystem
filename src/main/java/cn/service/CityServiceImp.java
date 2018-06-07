package cn.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cn.mapper.CityMapper;
import cn.pojo.City;

@Service("cityService")
@Transactional(propagation = Propagation.REQUIRED, timeout = -1)
public class CityServiceImp implements CityService {
	@Resource
	private CityMapper cityMapper;

	@Override
	public List<City> getAllCityById(Long provinceId) {
		return cityMapper.getAllCityById(provinceId);
	}

}
