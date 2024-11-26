package com.example.ShoppingCart;

public class Cart {
    private String itemname;
    private Long price;
    private Long qty;
    private Long totalPrice;

    public void setitemname(String itemname){ this.itemname = itemname;};
    public void setPrice(Long price){this.price = price;}
    public void setQty(Long qty){
        this.qty = qty;
        this.totalPrice = this.qty*this.price;
    }
    public String getitemname(){ return this.itemname; };
    public Long getPrice(){ return this.price; }
    public Long getQty(){ return this.qty; }
    public Long getTotalPrice(){ return this.totalPrice;}

    
   
}
