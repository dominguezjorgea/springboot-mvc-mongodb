package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import repository.IssueRepository;

@Controller
public class IssueController {

    private IssueRepository repository;

    public IssueController(IssueRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/issues")
    public String getAllIssues(Model model) {
        model.addAttribute("issues", repository.findAll());
        return "list-issues";
    }
}