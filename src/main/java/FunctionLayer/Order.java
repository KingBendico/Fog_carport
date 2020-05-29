package FunctionLayer;

/**
 * The type Order.
 */
public class Order {
    private int orderId;
    private int userId;
    private String date;
    private String status;


    /**
     * Instantiates a new Order.
     *
     * @param orderId the order id
     * @param userId  the user id
     * @param date    the date
     * @param status  the status
     */
    public Order(int orderId, int userId, String date, String status) {
        this.orderId = orderId;
        this.userId = userId;
        this.date = date;
        this.status = status;
    }

    /**
     * Gets order id.
     *
     * @return the order id
     */
    public int getOrderId() {
        return orderId;
    }

    /**
     * Sets order id.
     *
     * @param orderId the order id
     */
    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    /**
     * Gets user id.
     *
     * @return the user id
     */
    public int getUserId() {
        return userId;
    }

    /**
     * Sets user id.
     *
     * @param userId the user id
     */
    public void setUserId(int userId) {
        this.userId = userId;
    }

    /**
     * Gets date.
     *
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * Sets date.
     *
     * @param date the date
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * Gets status.
     *
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets status.
     *
     * @param status the status
     */
    public void setStatus(String status) {
        this.status = status;
    }
}