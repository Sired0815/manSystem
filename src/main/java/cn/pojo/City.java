package cn.pojo;
import java.io.Serializable;

import org.springframework.stereotype.Component;

   /**
    * city 实体类
    * Mon Jun 04 09:37:06 CST 2018 myself
    */ 

@Component("city")
public class City implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;//城市编号
	private String name;//城市名称
	private Long provinceId;//省份编号
	public void setId(Long id){
		this.id=id;
	}
	public Long getId(){
		return id;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public Long getProvinceId() {
		return provinceId;
	}
	public void setProvinceId(Long provinceId) {
		this.provinceId = provinceId;
	}
	@Override
	public String toString() {
		return "City [id=" + id + ", name=" + name + ", provinceId=" + provinceId + "]";
	}
	
	
}

