//package fishingStore.rest;
//
//import org.springframework.boot.autoconfigure.neo4j.Neo4jProperties;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//@Controller
//public class LoginController {
//    @RequestMapping(value = {"/login", "/"})
//    public String login() {
//        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//        if (authentication == null) {
//            return "login";
//        }
//        return "redirect:/home";
//    }
//}
