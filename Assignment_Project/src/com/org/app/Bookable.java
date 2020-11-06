package com.org.app;

public class Bookable {
	private int goods;
	private String goodsType;
	public Bookable() {
		super();
	}
	public Bookable(int goods, String goodsType) {
		super();
		this.goods = goods;
		this.goodsType = goodsType;
	}
	public int getGoods() {
		return goods;
	}
	public void setGoods(int goods) {
		this.goods = goods;
	}
	public String getGoodsType() {
		return goodsType;
	}
	public void setGoodsType(String goodsType) {
		this.goodsType = goodsType;
	}
	@Override
	public String toString() {
		return "Bookable [goods=" + goods + ", goodsType=" + goodsType + "]";
	}
	
}
