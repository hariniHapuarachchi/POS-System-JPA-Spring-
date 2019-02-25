package lk.ijse.dep.app.controller;

public class ViewOrderFormController {
//    @FXML
//    private JFXDatePicker txtOrderDate;
//    @FXML
//    private JFXTextField txtOrderID;
//    @FXML
//    private JFXTextField txtCustomerID;
//    @FXML
//    private JFXTextField txtItemCode;
//    @FXML
//    private JFXTextField txtCustomerName;
//    @FXML
//    private JFXTextField txtDescription;
//    @FXML
//    private JFXTextField txtQtyOnHand;
//    @FXML
//    private JFXTextField txtUnitPrice;
//    @FXML
//    private JFXTextField txtQty;
//    @FXML
//    private TableView<OrderDetailTM> tblOrderDetails;
//    @FXML
//    private Label lblTotal;
//
//    private String orderId;
//
//    private ManageOrdersBO manageOrdersBO = BOFactory.getInstance().getBO(BOFactory.BOTypes.MANAGE_ORDERS);
//    private ManageItemsBO manageItemsBO = BOFactory.getInstance().getBO(BOFactory.BOTypes.MANAGE_ITEMS);
//    private ManageCustomersBO manageCustomersBO = BOFactory.getInstance().getBO(BOFactory.BOTypes.MANAGE_CUSTOMERS);
//
//    @FXML
//    private void navigateToMain(MouseEvent mouseEvent) throws IOException {
//
//        Parent root = FXMLLoader.load(this.getClass().getResource("/lk/ijse/dep/app/view/SearchOrderForm.fxml"));
//        Scene mainScene = new Scene(root);
//        Stage mainStage = (Stage) lblTotal.getScene().getWindow();
//        mainStage.setScene(mainScene);
//
//        TranslateTransition tt1 = new TranslateTransition(Duration.millis(300), root.lookup("AnchorPane"));
//        tt1.setToX(0);
//        tt1.setFromX(-mainScene.getWidth());
//        tt1.play();
//
//        mainStage.centerOnScreen();
//    }
//
//    public void initialize() {
//        tblOrderDetails.getColumns().get(0).setCellValueFactory(new PropertyValueFactory<>("code"));
//        tblOrderDetails.getColumns().get(1).setCellValueFactory(new PropertyValueFactory<>("description"));
//        tblOrderDetails.getColumns().get(2).setCellValueFactory(new PropertyValueFactory<>("qty"));
//        tblOrderDetails.getColumns().get(3).setCellValueFactory(new PropertyValueFactory<>("unitPrice"));
//        tblOrderDetails.getColumns().get(4).setCellValueFactory(new PropertyValueFactory<>("total"));
//
//        tblOrderDetails.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<OrderDetailTM>() {
//            @Override
//            public void changed(ObservableValue<? extends OrderDetailTM> observable, OrderDetailTM oldValue, OrderDetailTM selectedOrderDetail) {
//
//                if (selectedOrderDetail == null) {
//                    // Clear Selection
//                    return;
//                }
//
//                txtItemCode.setText(selectedOrderDetail.getCode());
//                txtDescription.setText(selectedOrderDetail.getDescription());
//                txtUnitPrice.setText(selectedOrderDetail.getUnitPrice() + "");
//                txtQty.setText(selectedOrderDetail.getQty() + "");
//
//                try {
//                    txtQtyOnHand.setText(manageItemsBO.findItem(txtItemCode.getText()).getQtyOnHand() + "");
//                } catch (Exception e) {
//                    Logger.getLogger("").log(Level.SEVERE, null, e);
//                }
//
//
//            }
//        });
//    }
//
//    public void setInitData(String orderId, double orderTotal) {
//        this.orderId = orderId;
//        lblTotal.setText("Total : " + orderTotal);
//        fillData();
//    }
//
//    public void fillData() {
//        try {
//            OrderDTO orderDTO = null;
//
//            orderDTO = manageOrdersBO.findOrder(this.orderId);
//
//            txtCustomerID.setText(orderDTO.getId());
//            txtOrderID.setText(orderDTO.getId());
//            txtOrderDate.setValue(orderDTO.getDate());
//
//            txtCustomerName.setText(manageCustomersBO.findCustomer(orderDTO.getCustomerId()).getName());
//
//
//            List<OrderDetailDTO> orderDetailDTOS = orderDTO.getOrderDetailDTOS();
//            ObservableList<OrderDetailTM> details = FXCollections.observableArrayList();
//
//            for (OrderDetailDTO orderDetailDTO : orderDetailDTOS) {
//                details.add(new OrderDetailTM(orderDetailDTO.getCode(),
//                        orderDetailDTO.getDescription(),
//                        orderDetailDTO.getQty(),
//                        orderDetailDTO.getUnitPrice(),
//                        orderDetailDTO.getQty() * orderDetailDTO.getUnitPrice()));
//            }
//            tblOrderDetails.setItems(details);
//        } catch (Exception e) {
//            Logger.getLogger("").log(Level.SEVERE, null, e);
//        }
//    }
}
