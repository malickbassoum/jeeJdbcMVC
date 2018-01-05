package web;

import java.util.ArrayList;
import java.util.List;

import metier.Produit;

public class ProduitModel {
	private String motCle;
	private Produit produit=new Produit();
	private String errors;
	private String mode="ajout";
	public Produit getProduit() {
		return produit;
	}
	public void setProduit(Produit produit) {
		this.produit = produit;
	}
	private List<Produit> produits=new ArrayList<Produit>();
	public String getMotCle() {
		return motCle;
	}
	public void setMotcle(String motcle) {
		this.motCle = motcle;
	}
	public List<Produit> getProduits() {
		return produits;
	}
	public void setProduits(List<Produit> produits) {
		this.produits = produits;
	}
	public String getErrors() {
		return errors;
	}
	public void setErrors(String errors) {
		this.errors = errors;
	}
	public String getMode() {
		return mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}
	
	
	

}
