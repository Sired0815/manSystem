package cn.pojo;
import java.io.Serializable;

import org.springframework.stereotype.Component;

   /**
    * department 实体类
    * Mon Jun 04 09:37:06 CST 2018 myself
    */ 

@Component("department")
public class Department implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;//部门id
	private String name;//部门名
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
	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + "]";
	}
	
}

