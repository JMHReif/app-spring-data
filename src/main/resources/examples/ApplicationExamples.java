// tag::model[]
@Node
class Customer {
    @Id
    String customerId;
    String customerName;
    Integer loyaltyNumber;

    //constructor, getters, and setters
}

@Node
class Employee {
    @Id
    String employeeId;
    String employeeName;
    LocalDate startDate;

    //constructor, getters, and setters
}

// tag::node[]
@Node
class Order {
    @Id
    String transactionId;
    LocalDate transactionDate;
    LocalTime transactionTime;

    @Relationship("CREATED", direction = Relationship.Direction.INCOMING) Customer customer;
    @Relationship("FULFILLED", direction = Relationship.Direction.INCOMING) Employee employee;

    //constructor, getters, and setters
}
// end::node[]
// end::model[]

// tag::node-results[]
interface OrderRepository extends Neo4jRepository<Order, String> {
    @Query("MATCH (o:Order) RETURN o LIMIT 10;")
    List<Order> findTenOrders();
}
// end::node-results[]

// tag::rel[]
@RelationshipProperties
class Receipt {
    @RelationshipId
    Long id;

    double orderTotal;

    @TargetNode
    private Order order;
}
// end::rel[]

// tag::rel-results[]

// end::rel-results[]