package cn.pojo;
import java.io.Serializable;

import org.springframework.stereotype.Component;

   /**
    * job 实体类
    * Mon Jun 04 09:37:06 CST 2018 myself
    */ 

@Component("job")
public class Job implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;//职位id
	private String name;//职位名称
	private Long departmentId;//部门id
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
	public Long getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}
	@Override
	public String toString() {
		return "Job [id=" + id + ", name=" + name + ", departmentId=" + departmentId + "]";
	}

}

