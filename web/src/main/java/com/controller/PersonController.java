package com.controller;

import com.entity.Person;
import com.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Objects;

@Controller
@RequestMapping(value = "/person")
public class PersonController {
    @Autowired
    private PersonService personService;

    @RequestMapping(value = "/login")
    public String login() {
        return "login";
    }

    @RequestMapping(value = "/doLogin")
    public String doLogin(String username, String password) {
        if (Objects.equals(username, "admin") && Objects.equals(password, "123456")) {
            return "redirect:main";
        }
        return "redirect:login";
    }

    @RequestMapping(value = "/main")
    public String main(Model model) {
        List<Person> list = this.personService.getPersons();
        model.addAttribute("persons", list);
        return "main";
    }

    @RequestMapping(value = "/addPrompt")
    public String addPrompt() {
        return "addPerson";
    }

    @RequestMapping(value = "/updatePrompt")
    public String updatePrompt(Model model, String id) {
        model.addAttribute("person", this.personService.getPersonById(id));
        return "updatePerson";
    }

    @RequestMapping(value = "/getPersons")
    @ResponseBody
    public List<Person> getPersons() {
        return personService.getPersons();
    }

    @RequestMapping(value = "/getPersonById")
    @ResponseBody
    public Person getPersonById(String id) {
        return personService.getPersonById(id);
    }

    @RequestMapping(value = "/addPerson")
    public String addPerson(Person person) {
        personService.addPerson(person);
        return "redirect:main";
    }

    @RequestMapping(value = "/updatePerson")
    public String updatePerson(Person person) {
        personService.updatePerson(person);
        return "redirect:main";
    }

    @RequestMapping(value = "/deletePersonById")
    public String deletePersonById(String id) {
        personService.deletePersonById(id);
        return "redirect:main";
    }
}
