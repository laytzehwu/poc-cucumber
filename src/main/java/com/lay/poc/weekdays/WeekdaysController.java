package com.lay.poc.weekdays;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("weekdays")
public class WeekdaysController {

    @RequestMapping(method= RequestMethod.GET ,path = "/isFriday/{pathVariable}")
    public String isFriday(
            @PathVariable("pathVariable")String pathVariable,
            HttpServletResponse response) {
        response.setStatus(HttpServletResponse.SC_OK);

        return "Test:" + Friday.isFriday(pathVariable);
    }
}
