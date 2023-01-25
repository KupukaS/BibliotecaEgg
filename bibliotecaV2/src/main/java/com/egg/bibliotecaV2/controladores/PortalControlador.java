package com.egg.bibliotecaV2.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.egg.bibliotecaV2.excepciones.MiException;
import com.egg.bibliotecaV2.servicios.UsuarioServicio;

@Controller
@RequestMapping("/")
public class PortalControlador {

    @Autowired
    private UsuarioServicio usuarioServicio;

    @GetMapping("/")
    public String index() {

        return "index.html";
    }

    @GetMapping("/registrar")
    public String registar() {

        return "registro.html";
    }

    @PostMapping("/registro")
    public String registro(@RequestParam String nombre, @RequestParam String email, @RequestParam String password,
            String password2, ModelMap modelo) {

        try {

            usuarioServicio.registrar(nombre, email, password, password2);
            modelo.put("exito", "Usuario registrado correctamente");
            return "index.html";

        } catch (MiException ex) {

            modelo.put("error", ex.getMessage());
            modelo.put("nombre", nombre);
            modelo.put("email", email);
            
            return "registro.html";

        }
    }

    @GetMapping("/login")
    public String login(@RequestParam(required=false)String error, ModelMap modelo) {

        if (error != null) {
            modelo.put("error", "Usuario o contraseña no válidos");
        }

        return "login.html";
    }

    @GetMapping("/inicio")
    public String inicio(){
        return "inicio.html";
    }


}
