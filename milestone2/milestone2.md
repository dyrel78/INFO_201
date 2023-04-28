# INFO 201 Milestone 2

Dyrel Lumiwes 2962217

Suggestions from GitHub CoPilot were considered or used to help complete the Relationship's in the ERD, Success Scenarios and with SALT diagrams. ChatGPT was used to convert the ERD data types from Java style to SQL.

### Ask about cart
* ABout about having "has" and "is of type"
* ASk about having character limits on var char and what not
* Ask about Cart and shits
  
## **Summary Report**

Overall, the ERD included is a visual proposal of JV-LoFi's new database. It constitues entities and relationship's that are central in the list of 5 key requirements provided by the stake holder. Since it is of implementation level, it contains Foreign and Primary Keys to indicate which tuples require referencing as well as SQL data types.

In this ERD I resolved the following relationships.
 * A sale can contain many products and a product may be part of many sales. 
 * A music item can have many producers and a producer can produce many music items
 
 I solved these many to many problems by adding SaleDetail and Producer_Album.

 So a sale must have one or more sale details, The order details are linked to one and only one sale. sale details must be linked to one and only one product, and a product may have many sales.

 So a music item must have one or more producer album, The producer album are linked to one and only one music item. Producer album must also be linked to one and only one producer, and a producer may have many producer albums.



The use case list provided are again derived from the aforementioned 5 requirements.

The PlantUML SALT diagrams show potentialy mockup of how these forms will be presented to an end user. They include key information that is needed by the system or by the customer. Information that the client has mentioned as a requirement for their system(i.e Custom address or Member email).


#### Assumptions
* After every transaction, stock numbers are updated.
* Product can either be a Music Item or an Accesory
* Customer address is not needed at registration as this can be take at checkout.
* GST is added at checkout, thus will not show when view chart is shown. Same for shipping
*  Each producer can have multiple albums associated with them. 
* Within an album there can be multiple producers
* Each customer has a Unique customer ID
* Each Sale is associated with a Customer through the customerID.
* Customer is prompted with registration upon checkout



### Business Rules
* Prospective members must be at least 18 years old 
  * This would be as simple as an option to check a box. Asking for birth date. 
* Apply GST for Australian items shipped to NZ
* Must be offered the chance to gift wrap.
* Apply NZ GST tax when a NZ customer is purchasing products from Australia
* Customers are able to view and purchase items across every store
  
### **View Cart Lo-Fi UI Mock-Up**
https://isgb.otago.ac.nz/info201/lumdy690/project/blob/main/milestone2/ViewCart.puml

### **Register a new Customer Lo-Fi UI Mock-Up**
https://isgb.otago.ac.nz/info201/lumdy690/project/blob/main/milestone2/RegisterCustomer.puml

### **HV Lo-Fi ERD**
https://isgb.otago.ac.nz/info201/lumdy690/project/blob/main/milestone2/ERD_SQL.puml


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

Item must be in stock. Item page must be running

### Main Success Scenario

1. Customer browses or searches for an item they want to purchase.
2. Customer clicks onto the item's page, if it is in stock they will click "Add to Cart"
3. The item is added to the shopping cart and displays a message to say it has been added
4. The customer can continue shopping or proceed to checkout
   
### Alternative Success Scenarios (if applicable)

NA

### Exceptions (if applicable)

* Item might not be in stock
  * Prevent user from adding to cart and send message to staff to order more stock
* Server might be down
  * Better protection or server load management



---
### ID

UC-02

### Title

View Cart

### Description

Customer Views Cart

### Primary Actor

Customer

### Secondary Actors (if applicable)

N/A
### Preconditions (if applicable)

### Main Success Scenario

1. Customer clicks View Cart button
2. Drop down display showcases what is currently in the cart
3. Summary of items is displayed

### Alternative Success Scenarios (if applicable)

1. Customer can hover over Cart button
2. Show's compact version of cart order, able to modify if need be.

### Exceptions (if applicable)

N/A
### Other

N/A

---
### ID

UC-03

### Title

Checkout Cart

### Description

Customer checkouts items in the cart they are intending to purchase.

### Primary Actor

Customer

### Secondary Actors (if applicable)

N/A
### Preconditions (if applicable)

At least 1 items must be in the cart for checkout

### Main Success Scenario

1. Customer selects shopping cart icon/button on home page (**See UC-2**)
2. System displays summary of the current order
3. Option also presented to select if some items are to be gift wrapped and sent elsewhere ( **See UC-4**)
4. If Customer is happy, click next, System then asks for shipping and billing information (etc. customer address and email).
5. Customer enters this relevent information
6. System asks user to register or log in if they are a member (**See UC-06**).
7. System displays summary of the order again and then asks for payment information
8. Customer selects a payments method and confirms payment sucess.
9.  Confirmation message is displayed.
10. Email is sent by the system to the customer which contains order details and shipping information
11. Stock numbers are updated



### Alternative Success Scenarios (if applicable)

1. Shopping Cart may be saved
2. Payment information and customer details are saved securely
3. Customer is prompted to create a membership account


### Exceptions (if applicable)

1. Payment could be declined, system shows an error message to customer and asks to choose a new or repeat the same payment method
2. If the customer does not enter their shipping and billing information, they will not be able to complete the purchase.

### Other

N/A

---

### ID

UC-04

### Title

Gift wrapping purchases

### Description

Customer checkouts items in the cart they are intending to purchase and that they want gift wrapped.

### Primary Actor

Customer

### Secondary Actors (if applicable)

N/A
### Preconditions (if applicable)

Customer must have checked out their shopping cart

### Main Success Scenario

1. Customer checkouts cart (**See UC-03**)
2. The customer prompted with the choise to gift-wrap  one or more items in their order.
3.  System asks for optional additional address for gift wrapped order.
4. The system adds a gift-wrap fee to the order total and displays a confirmation message.
5. The customer proceeds with the checkout process as usual.


### Alternative Success Scenarios (if applicable)

Customer may choose to gift wrap and then change their mind, option to remove should be present.

### Exceptions (if applicable)

N/A

### Other

N/A

---
### ID

UC-05

### Title

Modify Shopping Cart

### Description

Customer will be able to edit quantity's in the shopping cart

### Primary Actor

Customer

### Secondary Actors (if applicable)

N/A
### Preconditions (if applicable)

Customer must have checked out their shopping cart

### Main Success Scenario

Customer modifies something

1. Customer clicks checkout cart
2. Customer is shown a summary of the current contents of the cart.
3. Customer can then edit (either add or decrease), the amount of 1 item they have or delete the item.
4. Page refreshes, cart updated.

### Alternative Success Scenarios (if applicable)

N/A

### Exceptions (if applicable)

* Stock issues: If customer edits cart to add more products and there is no more in stock, an error message should occur and they should not be able to finalize the edit.
### Other

N/A

--
### ID

UC-06

### Title

Register Customer 

### Description


### Primary Actor

Customer

### Secondary Actors (if applicable)

N/A
### Preconditions (if applicable)

Customer must not have a registered account

### Main Success Scenario

1. Customer is prompted when checking out (**See UC03**)or decides to create a membership account.
2. Customer taken to a registration page where vital information is asked of the Customer (age,full name, phone number , email address,  
favourite era/genre, artist, NZ or AUS).
1. System check if information is valid and filled.
2. Customer is then asked to provide a password
3. Customer receives confirmation email with login details
4. Customer can now log in an continue to shop



### Alternative Success Scenarios (if applicable)

Customer continutes shopping without a membership

### Exceptions (if applicable)

* Customer is not 18
* Infomation is invalid, they should receive an error message.
* 
### Other

N/A

--


### Business Rules

* Prospective members must be at least 18 years old 
  * This would be as simple as an option to check a box. Asking for birth date 

* Apply GST for Australian items shipped to NZ
* Must be offered the chance to gift wrap
* 
  
--
### ID

UC-07

### Title

Delete Item from Cart 

### Description

Remove all instances of an item within a cart

### Primary Actor

Customer

### Secondary Actors (if applicable)

N/A
### Preconditions (if applicable)

Customer must have an item in the cart to delete
### Main Success Scenario

1. Customer views cart(**See UC-2**)
2. Customer clicks remove button next to item
3. Item(s) is deleted
   


### Alternative Success Scenarios (if applicable)


### Exceptions (if applicable)
 
### Other

N/A

--






  


