package cn.pojo;

import java.io.Serializable;
import java.sql.Timestamp;

import org.springframework.stereotype.Component;

@Component("consultant")
public class Consultant implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;// 编号
	private String name;// 姓名
	private Integer age;// 年龄
	private String gender;// 性别
	private String phone;// 电话
	private String qq;// qq
	private String experience;// 工作情况
	private Timestamp firstTime;// 第一次咨询时间
	private Timestamp lastTime;// 最后回访时间
	private Long studentId;// 学生类型
	private String studentName;
	private String keyWord;// 关键词
	private String text;// 备注
	private Long userId;// 员工编号
	private String userName;//
	private Long informationId;// 信息来源编号
	private String informationName;
	private Long educationId;// 教育背景Id
	private String educationName;
	private Long lessonId;// 课程Id
	private String lessonName;
	private Long visitId;// 上门回访Id
	private String visitName;
	private Long cityId;// 城市编号
	private String cityName;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public Timestamp getFirstTime() {
		return firstTime;
	}

	public void setFirstTime(Timestamp firstTime) {
		this.firstTime = firstTime;
	}

	public Timestamp getLastTime() {
		return lastTime;
	}

	public void setLastTime(Timestamp lastTime) {
		this.lastTime = lastTime;
	}

	public Long getStudentId() {
		return studentId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getKeyWord() {
		return keyWord;
	}

	public void setKeyWord(String keyWord) {
		this.keyWord = keyWord;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Long getInformationId() {
		return informationId;
	}

	public void setInformationId(Long informationId) {
		this.informationId = informationId;
	}

	public String getInformationName() {
		return informationName;
	}

	public void setInformationName(String informationName) {
		this.informationName = informationName;
	}

	public Long getEducationId() {
		return educationId;
	}

	public void setEducationId(Long educationId) {
		this.educationId = educationId;
	}

	public String getEducationName() {
		return educationName;
	}

	public void setEducationName(String educationName) {
		this.educationName = educationName;
	}

	public Long getLessonId() {
		return lessonId;
	}

	public void setLessonId(Long lessonId) {
		this.lessonId = lessonId;
	}

	public String getLessonName() {
		return lessonName;
	}

	public void setLessonName(String lessonName) {
		this.lessonName = lessonName;
	}

	public Long getVisitId() {
		return visitId;
	}

	public void setVisitId(Long visitId) {
		this.visitId = visitId;
	}

	public String getVisitName() {
		return visitName;
	}

	public void setVisitName(String visitName) {
		this.visitName = visitName;
	}

	public Long getCityId() {
		return cityId;
	}

	public void setCityId(Long cityId) {
		this.cityId = cityId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	@Override
	public String toString() {
		return "Consultant [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", phone=" + phone
				+ ", qq=" + qq + ", experience=" + experience + ", firstTime=" + firstTime + ", lastTime=" + lastTime
				+ ", studentId=" + studentId + ", studentName=" + studentName + ", keyWord=" + keyWord + ", text="
				+ text + ", userId=" + userId + ", userName=" + userName + ", informationId=" + informationId
				+ ", informationName=" + informationName + ", educationId=" + educationId + ", educationName="
				+ educationName + ", lessonId=" + lessonId + ", lessonName=" + lessonName + ", visitId=" + visitId
				+ ", visitName=" + visitName + ", cityId=" + cityId + ", cityName=" + cityName + "]";
	}

}
