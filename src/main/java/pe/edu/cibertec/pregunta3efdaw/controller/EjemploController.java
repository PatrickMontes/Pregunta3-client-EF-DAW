package pe.edu.cibertec.pregunta3efdaw.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class EjemploController {

    @GetMapping("/public")
    public String getPublicMessage() {
        return "Mensaje para todo publico!!";
    }


    @GetMapping("/private")
    public String getPrivateMessage() {
        return "Mensaje solo para usuarios autenticados!!!";
    }


    @GetMapping("/admin")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public String getAdminMessage() {
        return "Mensaje solo para usuarios autenticados y con rol ADMIN!!!";
    }

}
