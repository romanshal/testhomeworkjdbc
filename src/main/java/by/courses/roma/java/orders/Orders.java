package by.courses.roma.java.orders;

import lombok.AllArgsConstructor;
import java.sql.Date;

@AllArgsConstructor(staticName = "of")
public class Orders {

    private int id;

    private int productId;

    private int costumerId;

    private Date createDat;

    public Orders() {
    }

    public Orders(int id, int productId, int costumerId, Date createDat) {
        this.id = id;
        this.productId = productId;
        this.costumerId = costumerId;
        this.createDat = createDat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getCostumerId() {
        return costumerId;
    }

    public void setCostumerId(int costumerId) {
        this.costumerId = costumerId;
    }

    public Date getCreateDat() {
        return createDat;
    }

    public void setCreateData(Date createDat) {
        this.createDat = createDat;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", productId=" + productId +
                ", costumerId=" + costumerId +
                ", createDat=" + createDat +
                '}';
    }
}
