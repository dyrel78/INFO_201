# INFO 201 Milestone 2

Dyrel Lumiwes 2962217

Suggestions from GitHub CoPilot were used to help complete ERD's.

## Summary Report
A brief summary of the content and findings of your work. You should also document any assumptions or issues, and explain any significant design decisions.

You only need to document assumptions that you have made, i.e., you don’t need to restate assumptions already explicitly stated in this specification. Note that you can’t use assumptions to negate or nullify something that is explicitly stated in the specification.




## Use Cases

### ID

UC-01

### Title

Add Item to shopping cart

### Description

Enables customer to save an item they want to buy to an online cart

### Primary Actor

Customer

### Secondary Actors (if applicable)

N/A

### Preconditions (if applicable)

Item must be in stock.

### Main Success Scenario

1. Customer browses or searches for an item they want to purchase.
2. They go onto the item's page, if it is in stock they will click "Add to Cart"
3. The item is added to the shopping cart and displays a message to say it has been added
4. The customer can continue shopping or proceed to checkout
   
5. ### Alternative Success Scenarios (if applicable)

N/A

### Exceptions (if applicable)

* Item might not be in stock
  * Prevent user from adding to cart and send message to staff to order more stock
* Server might be down
  * Better protection or server load management



---
### ID

UC-02

### Title

Checkout Cart

### Description

Customer checkouts items in the cart they are intending to purchase.

### Primary Actor

Customer

### Secondary Actors (if applicable)

N/A
### Preconditions (if applicable)

[Describe the state your system is expected to be in before this use case can proceed. For example, before the library use case "Lend Item" (Lecture 6, slide 24) can proceed, the item(s) to be loaned must be available and the patron must have a valid library membership.]

### Main Success Scenario

1. Customer selects the "Checkout" button on the shopping cart icon/page
2. System displays summary of the current order
3. System asks for shipping and billing information (etc. customer address and email)
4. Customer enters this relevent information
5. System displays summary of the order again and then asks for payment information
6. Customer selects a payments method and clicks "Place Order"
7. System waits for payment to process
8. If successful, confirmation message is displayed.
9. Email is sent by the system to the customer which contains order details and shipping information
10. Stock numbers are updated



### Alternative Success Scenarios (if applicable)

1. Shopping Cart may be saved
2. Payment information and customer details are saved securely
3. Customer is prompted to create a membership account


### Exceptions (if applicable)

[Describe situations that could prevent successful completion of the use case, and corrective actions that could be taken. For example, in the library use case "Return Item", the patron may have forgotten to bring the item with them.]
1. Payment could be declined, system shows an error message to customer and asks to choose a new or repeat the same payment method
 // no valid shipping or billing information

### Other

N/A

---
### ID

UC-03

### Title

Gift wrapping purchases

### Description

Customer checkouts items in the cart they are intending to purchase.

### Primary Actor

Customer

### Secondary Actors (if applicable)

N/A
### Preconditions (if applicable)

Customer must have checked out their shopping cart

### Main Success Scenario

1. The customer selects the gift-wrap option for one or more items in their order.
2. The system adds a gift-wrap fee to the order total and displays a confirmation message.
3. The customer proceeds with the checkout process as usual.


### Alternative Success Scenarios (if applicable)

N/A

### Exceptions (if applicable)

N/A

### Other

N/A

---
### ID

UC-04

### Title

Modify Shopping Cart

### Description

Customer will be able to add, edit quantity's or delete shopping cart

### Primary Actor

Customer

### Secondary Actors (if applicable)

N/A
### Preconditions (if applicable)

Customer must have checked out their shopping cart

### Main Success Scenario

1. The customer selects the gift-wrap option for one or more items in their order.
2. The system adds a gift-wrap fee to the order total and displays a confirmation message.
3. The customer proceeds with the checkout process as usual.


### Alternative Success Scenarios (if applicable)

N/A

### Exceptions (if applicable)

N/A

### Other

N/A

--
### ID

UC-05

### Title

Register Customer 

### Description


### Primary Actor

Customer

### Secondary Actors (if applicable)

N/A
### Preconditions (if applicable)

N/A

### Main Success Scenario

1. Customer is prompted or decides to create a membership account
2. System asks if they are 18, if yes then continue
3. Required information is asked of the Customer (full name, phone number , email address,  
favourite era/genre, artist, NZ or AUS).
4. System check if information is valid and filled.
5. Customer is then asked to provide a password
6. Customer receives confirmation email with login details
7. Customer can now log in an continue to shop



### Alternative Success Scenarios (if applicable)

Customer continutes shopping without a membership

### Exceptions (if applicable)

* Customer is not 18
* Infomation is
### Other

N/A

--

R1 Add item to shopping cart
R2 Check out shopping cart
R3 Gift-wrap item(s) [optional step that incurs an extra charge]
R4 Modify shopping cart [including view shopping cart, remove item, update quantity]
R5 Register customer



### Business Rules

* Prospective members must be at least 18 years old 
  * This would be as simple as an option to check a box. Asking for birth date 
  

* Apply GST for Australian items shipped to NZ
* Must be offered the chance to gift wrap
* 
  



