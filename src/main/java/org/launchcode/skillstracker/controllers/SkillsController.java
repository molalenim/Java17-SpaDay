package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class SkillsController {

    @GetMapping

    public String home() {
        return "<html><body>" +
                "<h1>Skill Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                "<ul>" +
                "<li>Python</li>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "</ul>" +
                "</body></html>";
    }

    @GetMapping("form")

    public String formPage() {
        return "<html><body>" +
                "<form action='display' method='post'>" +
                "<table>" +
                "<tr><td>Name:</td><td><input type='text' name='name'/></td></tr>" +
                "<tr><td>Favorite Language:</td><td><select name='favorite'>" +
                "<option>Java</option>" +
                "<option>Python</option>" +
                "<option>JavaScript</option>" +
                "</select></td></tr>" +
                "<tr><td>Second Favorite:</td><td><select name='secondFavorite'>" +
                "<option>Java</option>" +
                "<option>Python</option>" +
                "<option>JavaScript</option>" +
                "</select></td></tr>" +
                "<tr><td>Third Favorite:</td><td><select name='thirdFavorite'>" +
                "<option>Java</option>" +
                "<option>Python</option>" +
                "<option>JavaScript</option>" +
                "</select></td></tr>" +
                "</table>" +
                "<input type='submit' value='submit'>" +
                "</form>" +


                "</body></html>";
    }

    @PostMapping("display")

    public String displayForm(@RequestParam String name, @RequestParam String favorite, @RequestParam String secondFavorite, @RequestParam String thirdFavorite) {
        return "<html><body>" +
                "<h1>Submitted Form Data</h1>" +
                "<p><strong>Name:</strong> " + name + "</p>" +
                "<p><strong>Favorite Language:</strong> " + favorite + "</p>" +
                "<p><strong>Second Favorite:</strong> " + secondFavorite + "</p>" +
                "<p><strong>Third Favorite:</strong> " + thirdFavorite + "</p>" +
                "</body></html>";
    }
}

