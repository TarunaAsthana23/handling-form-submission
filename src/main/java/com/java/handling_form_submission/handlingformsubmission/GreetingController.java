package com.java.handling_form_submission.handlingformsubmission;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class GreetingController
{
    @GetMapping("/greeting")
    public String greetingForm(Model model)
    {
        model.addAttribute("greeting", new Greeting());
        return "greeting";
    }
    @PostMapping("/greeting")
    public String greetingSubmit(@ModelAttribute Greeting greeting, Model model)
    {
        greeting.setId(1); // Here, we are using the setId method
        greeting.setContent("Hello,World"); // This sets the content to "Hello, World!"
        model.addAttribute("greeting", greeting);
        return "result";
    }

}