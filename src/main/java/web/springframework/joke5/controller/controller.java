package web.springframework.joke5.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import web.springframework.joke5.services.JokeService;

@Controller
public class controller {
    private  final JokeService jokeService;

        @Autowired
        public controller(JokeService jokeService) {
        this.jokeService = jokeService;
    }
    @RequestMapping({"/",""})
    public String showJoke(Model model){
            model.addAttribute("joke",jokeService.getJokes());
            return "index";
    }
}
