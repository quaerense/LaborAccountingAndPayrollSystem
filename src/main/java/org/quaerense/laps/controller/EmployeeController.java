package org.quaerense.laps.controller;

import org.quaerense.laps.domain.Employee;
import org.quaerense.laps.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping(value = {"", "/get"})
    public String getEmployees(Model model) {
        model.addAttribute("employees", employeeService.getEmployees());

        return "employees";
    }

    @GetMapping("/add")
    public String getAddEmployeeForm(Model model) {
        model.addAttribute("employee", new Employee());

        return "add_employee";
    }

    @PostMapping("/add")
    public String addEmployee(@ModelAttribute("employee") @Valid Employee employee,
                              BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "add_employee";
        }

        employeeService.addEmployee(employee);

        return "redirect:/employees/";
    }
}
