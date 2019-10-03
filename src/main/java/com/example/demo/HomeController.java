package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {
    @Autowired
    JobRepository jobRepository;

    @RequestMapping("/")
    public String listJobs(Model model) {
        model.addAttribute("jobs", jobRepository.findAll());
        return "joblist";
    }

    @GetMapping("/add")
    public String addJob(Model model) {
        model.addAttribute("job", new Job());
        return "jobform";
    }

    @PostMapping("/processjob")
    public String processJob(@ModelAttribute Job job) {
        jobRepository.save(job);
        System.out.println(job.getPostedDate() + " and " + job.getTitle());
        return "redirect:/";
    }

    @RequestMapping("/detail/{id}")
    public String showJob(@PathVariable("id") long id, Model model) {
        model.addAttribute("job", jobRepository.findById(id).get());
        return "show";
    }

    @RequestMapping("/update/{id}")
    public String updateJob(@PathVariable("id") long id, Model model) {
        model.addAttribute("job", jobRepository.findById(id).get());
        return "jobform";
    }

    @RequestMapping("/delete/{id}")
    public String delFlight(@PathVariable("id") long id) {
        jobRepository.deleteById(id);
        return "redirect:/";
    }

    // methods for processing the search

}
