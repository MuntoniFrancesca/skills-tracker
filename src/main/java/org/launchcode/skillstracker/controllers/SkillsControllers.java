package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class SkillsControllers {
    @GetMapping
    public String showLanguages() {
        return "<h1>Skill Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "</ol>";
    }
@GetMapping("/form")
    public String favoriteLanguageForm() {
        return "<form method = 'post' action='/form'><br>" +
        "<label>Name: <br>" +
        "<input type = 'text' name = 'name'><br>" +
                "</label>" +
                "<label>My favorite language:<br></label>" +
                "<select name = 'first' id = 'first'>" +
                "<option value = 'java'>Java</option><br>" +
                "<option value = 'javascript'>Javascript</option><br>" +
                "<option value = 'python'>Python</option></select><br>"+

                "<label>My second favorite language:</label><br>" +
                "<select name = 'second' id = 'second'>" +
                "<option value = 'java'>Java</option><br>" +
                "<option value = 'javascript'>Javascript</option><br>" +
                "<option value = 'python'>Python</option></select><br>"+

                "<label>My third favorite language:</label><br>" +
                "<select name = 'third' id = 'third'>" +
                "<option value = 'java'>Java</option><br>" +
                "<option value = 'javascript'>Javascript</option><br>" +
                "<option value = 'python'>Python</option></select><br>"
                +
                "<input type = 'submit' value = 'Submit'/>" +
                "</form>";
}

@PostMapping("/form")
    public String submitForm(@RequestParam String name, @RequestParam String first, @RequestParam String second, @RequestParam String third) {
        return "<h1>" + name + "</h1><br>" +
                "<ol>" +
                "<li>" + first + "</li>" +
                "<li>" + second + "</li>" +
                "<li>" + third + "</li>" +
        "</ol>";
}





}
