package interview.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import interview.model.Classroom;
import interview.repository.ClassroomRepository;
import interview.repository.CourseRepository;

@RestController
public class ClassroomController {

    @Autowired  
    private CourseRepository courseRepository;
    
    @Autowired  
    private ClassroomRepository classroomRepository;

    /**
     * Find all available classroom for the given course.
     * @param courseId ID of the given course.
     * @return list of classrooms available
     */
	// URL: /classrooms/findAll
	public List<Classroom> getAvailableClassrooms(@RequestParam Integer courseId) {
		// TODO replace below with implementation
		return null;
	}
        
    /**
     * Reserve an available classroom for the given course.
     * @param courseId ID of the given course.
     * @return classroom reserved
     */
	// URL: /classrooms/reserve
	public Classroom reserveClassroom(@RequestParam Integer courseId) {
		// TODO replace below with implementation
		return null;
	}

    /**
     * Reserve available classrooms for the given courses.
     * @param courseIds list of IDs of the given courses.
     * @return classrooms reserved
     */
	// URL: /classrooms/reserveAll
	public List<Classroom> reserveClassrooms(@RequestParam List<Integer> courseIds) {
		// TODO replace below with implementation
		return null;
	}


}
