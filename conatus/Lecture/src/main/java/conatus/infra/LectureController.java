package conatus.infra;
import conatus.domain.*;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 @RestController
 @RequestMapping(value="/lectures")
 public class LectureController {
        @Autowired
        LectureRepository lectureRepository;



 }
