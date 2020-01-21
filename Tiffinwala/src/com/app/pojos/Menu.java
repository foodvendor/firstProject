package com.app.pojos;

public class Menu {
	private Integer menuId, chapati;
	private String subji, rice, dal, salad, sweetDish, chatni, pickle;

	public Menu() {
		System.out.println("in def Menu ctor");
	}

	public Menu(Integer menuId, Integer chapati, String subji, String rice, String dal, String salad, String sweetDish,
			String chatni, String pickle) {
		super();
		this.menuId = menuId;
		this.chapati = chapati;
		this.subji = subji;
		this.rice = rice;
		this.dal = dal;
		this.salad = salad;
		this.sweetDish = sweetDish;
		this.chatni = chatni;
		this.pickle = pickle;
	}

	public Integer getMenuId() {
		return menuId;
	}

	public void setMenuId(Integer menuId) {
		this.menuId = menuId;
	}

	public Integer getChapati() {
		return chapati;
	}

	public void setChapati(Integer chapati) {
		this.chapati = chapati;
	}

	public String getSubji() {
		return subji;
	}

	public void setSubji(String subji) {
		this.subji = subji;
	}

	public String getRice() {
		return rice;
	}

	public void setRice(String rice) {
		this.rice = rice;
	}

	public String getDal() {
		return dal;
	}

	public void setDal(String dal) {
		this.dal = dal;
	}

	public String getSalad() {
		return salad;
	}

	public void setSalad(String salad) {
		this.salad = salad;
	}

	public String getSweetDish() {
		return sweetDish;
	}

	public void setSweetDish(String sweetDish) {
		this.sweetDish = sweetDish;
	}

	public String getChatni() {
		return chatni;
	}

	public void setChatni(String chatni) {
		this.chatni = chatni;
	}

	public String getPickle() {
		return pickle;
	}

	public void setPickle(String pickle) {
		this.pickle = pickle;
	}

}
