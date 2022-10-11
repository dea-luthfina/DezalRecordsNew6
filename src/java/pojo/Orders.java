package pojo;
// Generated Oct 11, 2022 9:47:14 AM by Hibernate Tools 4.3.1


import DAO.DAOOrders;
import java.util.Date;
import java.util.List;
import javax.faces.bean.ManagedBean;

/**
 * Orders generated by hbm2java
 */
@ManagedBean
public class Orders  implements java.io.Serializable {


     private Integer idOrder;
     private Integer amount;
     private Integer totalPrice;
     private String idAlbum;
     private Integer idAdmin;
     private Date orderDate;

    public Orders() {
    }

	
    public Orders(Integer idOrder) {
        this.idOrder = idOrder;
    }
    public Orders(Integer idOrder, Integer amount, Integer totalPrice, String idAlbum, Integer idAdmin, Date orderDate) {
       this.idOrder = idOrder;
       this.amount = amount;
       this.totalPrice = totalPrice;
       this.idAlbum = idAlbum;
       this.idAdmin = idAdmin;
       this.orderDate = orderDate;
    }
   
    public Integer getIdOrder() {
        return this.idOrder;
    }
    
    public void setIdOrder(Integer idOrder) {
        this.idOrder = idOrder;
    }
    public Integer getAmount() {
        return this.amount;
    }
    
    public void setAmount(Integer amount) {
        this.amount = amount;
    }
    public Integer getTotalPrice() {
        return this.totalPrice;
    }
    
    public void setTotalPrice(Integer totalPrice) {
        this.totalPrice = totalPrice;
    }
    public String getIdAlbum() {
        return this.idAlbum;
    }
    
    public void setIdAlbum(String idAlbum) {
        this.idAlbum = idAlbum;
    }
    public Integer getIdAdmin() {
        return this.idAdmin;
    }
    
    public void setIdAdmin(Integer idAdmin) {
        this.idAdmin = idAdmin;
    }
    public Date getOrderDate() {
        return this.orderDate;
    }
    
    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public void saveOrder(){
        DAOOrders order = new DAOOrders();
        order.addOrder(this);
    }
    
    public void deleteOrder(){
        DAOOrders order = new DAOOrders();
        order.deleteOrder(idOrder);
        amount = 0;
        totalPrice = 0;
        idAdmin = 0;
        idAlbum = "";
    }
    
//    public Integer getbyid(){
//        DAOOrders order = new DAOOrders();
//        List<Orders> lOrder = order.getbyID(idOrder);
//        amount = lOrder.get(0).amount;
//        totalPrice = lOrder.get(0).totalPrice;
//        idAdmin = lOrder.get(0).idAdmin;
//        idAlbum = lOrder.get(0).idAlbum;
//        orderDate = lOrder.get(0).orderDate;
//        return "order-list"
//    }
    
    public List<Orders> getAllRecords(){
        DAOOrders order = new DAOOrders();
        List<Orders> lOrder = order.retrieveTblOrder();
        return lOrder;
    }
    
    public String updateOrder(){
        DAOOrders order = new DAOOrders();
        order.updateOrder(this);
        amount = 0;
        totalPrice = 0;
        idAdmin = 0;
        idAlbum = "";
        return "order_list";
    }

}

