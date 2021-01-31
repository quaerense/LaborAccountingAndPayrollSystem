package org.quaerense.controller;

import org.quaerense.domain.Employee;
import org.quaerense.service.EmployeeService;
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
@RequestMapping("/")
public class MainController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public String getEmployees(Model model) {
        model.addAttribute("employees", employeeService.getEmployees());

        return "employees";
    }

    @GetMapping("/add_employee")
    public String showAddEmployeeForm(@ModelAttribute("employee") Employee employee) {
        return "add_employee";
    }

    @PostMapping("/add_employee")
    public String addEmployee(@ModelAttribute("employee") @Valid Employee employee,
                              BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "add_employee";
        }

        employeeService.addEmployee(employee);
        return "redirect:/employees";
    }
}
