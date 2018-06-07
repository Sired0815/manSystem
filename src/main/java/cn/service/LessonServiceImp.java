package cn.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service("lessonService")
@Transactional(propagation = Propagation.REQUIRED, timeout = -1)
public class LessonServiceImp implements LessonService {

}
