package com.jg.apirest.models.services;

import com.jg.apirest.models.entity.Usuario;

public interface IUsuarioService {

	public Usuario findByUsername(String username);
}
