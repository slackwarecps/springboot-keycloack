package br.com.fabioalvaro.exemplokc.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class Diversos {

    @GetMapping(path = "/")
    public String index() {
        return "uhull";
    }

    @GetMapping(path = "/segura")
    public String segura() {
        return "segura";
    }

    @GetMapping(path = "/customers")
    public String customers() {
        return "customers";
    }

//    @GetMapping(path = "/users")
//    public String getUserInfo(Model model) {
//        KeycloakAuthenticationToken authentication = (KeycloakAuthenticationToken)
//                SecurityContextHolder.getContext().getAuthentication();
//
//        Principal principal = (Principal) authentication.getPrincipal();
//        String dob="";
//
//        if (principal instanceof KeycloakPrincipal) {
//            KeycloakPrincipal kPrincipal = (KeycloakPrincipal) principal;
//            IDToken token = kPrincipal.getKeycloakSecurityContext().getIdToken();
//
//            Map<String, Object> customClaims = token.getOtherClaims();
//
//            if (customClaims.containsKey("DOB")) {
//                dob = String.valueOf(customClaims.get("DOB"));
//            }
//        }
//
//        model.addAttribute("username", principal.getName());
//        model.addAttribute("dob", dob);
//        return "userInfo";
//    }


}
