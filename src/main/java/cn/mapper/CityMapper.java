package cn.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.pojo.City;

public interface CityMapper {

	List<City> getAllCityById(@Param("provinceId") Long provinceId);
}
