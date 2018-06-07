package cn.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

import cn.pojo.Consultant;
import cn.service.ConsultantService;
import cn.service.UserService;

@Controller
@RequestMapping("/consultant")
public class ConsultantController {

	@Resource
	private ConsultantService consultantService;
	@Resource
	private UserService userService;

	@RequestMapping(value = "/getConsultantById", produces = "application/json;charset=utf-8")
	@ResponseBody
	public String getConsultantById(Long id) {
		Consultant consultant = consultantService.getConsultantById(id);
		return JSON.toJSONStringWithDateFormat(consultant, "yyyy-MM-dd HH:mm:ss", SerializerFeature.PrettyFormat);
	}

	@RequestMapping(value = "/updateConsultant", produces = "application/json;charset=utf-8")
	@ResponseBody
	public String updateConsultant(Consultant csonsultant) {
		int i = consultantService.updateConsultant(csonsultant);
		HashMap<String, Boolean> map = new HashMap();
		if (i > 0) {
			map.put("result", true);
		} else {
			map.put("result", false);
		}
		return JSON.toJSONString(map);
	}

	@RequestMapping(value = "/getAll", produces = "application/json;charset=utf-8")
	@ResponseBody
	public String getAll(@RequestParam(value = "name", defaultValue = "", required = false) String name,
			@RequestParam(value = "educationId", defaultValue = "0", required = false) Long educationId,
			@RequestParam(value = "userId", defaultValue = "0", required = false) Long userId,
			@RequestParam(value = "first1", defaultValue = "", required = false) String first1,
			@RequestParam(value = "first2", defaultValue = "", required = false) String first2,
			@RequestParam(value = "informationId", defaultValue = "0", required = false) Long informationId,
			@RequestParam(value = "visitId", defaultValue = "0", required = false) Long visitId,
			@RequestParam(value = "studentId", defaultValue = "0", required = false) Long studentId,
			@RequestParam(value = "lessonId", defaultValue = "0", required = false) Long lessonId,
			@RequestParam(value = "keyWord", defaultValue = "", required = false) String keyWord,
			@RequestParam(value = "last1", defaultValue = "", required = false) String last1,
			@RequestParam(value = "last2", defaultValue = "", required = false) String last2, Integer page,
			Integer rows) {
		System.err.println("name=" + name);
		System.err.println("first1=" + first1);
		System.err.println("first2=" + first2);
		System.err.println("last1=" + last1);
		System.err.println("last2=" + last2);
		Consultant consultant = new Consultant();
		consultant.setName(name);
		consultant.setEducationId(educationId);
		consultant.setUserId(userId);
		consultant.setInformationId(informationId);
		consultant.setVisitId(visitId);
		consultant.setStudentId(studentId);
		consultant.setLessonId(lessonId);
		consultant.setKeyWord(keyWord);
		int total = consultantService.getSum(consultant, first1, first2, last1, last2);
		System.err.println("total=" + total);
		System.err.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		page = (page - 1) * rows;
		List<Consultant> list = consultantService.getAllConsultant(consultant, first1, first2, last1, last2, page,
				rows);
		for (Consultant c : list) {
			System.err.println("c>>>>>>>>>>>>>>>" + c);
		}
		Map<String, Object> map = new HashMap();
		map.put("total", total);
		map.put("rows", list);
		return JSON.toJSONStringWithDateFormat(map, "yyyy-MM-dd HH:mm:ss", SerializerFeature.PrettyFormat);
	}

	@RequestMapping(value = "/addConsultant", produces = "application/json;charset=utf-8")
	@ResponseBody
	public String addConsultant(Consultant consultant) {
		int i = consultantService.addConsultant(consultant);
		Map<String, Boolean> map = new HashMap();
		if (i > 0) {
			map.put("result", true);
		} else {
			map.put("result", false);
		}
		return JSON.toJSONString(map);
	}
}
