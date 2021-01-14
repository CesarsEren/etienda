package com.eletronic.etienda.model;

public class Producto {

	Integer producto_id;
	String producto_nombre, producto_descripcion, producto_image;
	Double producto_precio;
	Boolean producto_estado;

	public Producto() {
		super();
	}

	public Producto(Integer producto_id, String producto_nombre, String producto_descripcion, String producto_image,
			Double producto_precio, Boolean producto_estado) {
		super();
		this.producto_id = producto_id;
		this.producto_nombre = producto_nombre;
		this.producto_descripcion = producto_descripcion;
		this.producto_image = producto_image;
		this.producto_precio = producto_precio;
		this.producto_estado = producto_estado;
	}

	public Integer getProducto_id() {
		return producto_id;
	}

	public void setProducto_id(Integer producto_id) {
		this.producto_id = producto_id;
	}

	public String getProducto_nombre() {
		return producto_nombre;
	}

	public void setProducto_nombre(String producto_nombre) {
		this.producto_nombre = producto_nombre;
	}

	public String getProducto_descripcion() {
		return producto_descripcion;
	}

	public void setProducto_descripcion(String producto_descripcion) {
		this.producto_descripcion = producto_descripcion;
	}

	public String getProducto_image() {
		return producto_image;
	}

	public void setProducto_image(String producto_image) {
		this.producto_image = producto_image;
	}

	public Double getProducto_precio() {
		return producto_precio;
	}

	public void setProducto_precio(Double producto_precio) {
		this.producto_precio = producto_precio;
	}

	public Boolean getProducto_estado() {
		return producto_estado;
	}

	public void setProducto_estado(Boolean producto_estado) {
		this.producto_estado = producto_estado;
	}

}
