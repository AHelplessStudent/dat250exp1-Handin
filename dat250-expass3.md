# DAT250: Software Technology Experiment Assignment 3


>Tip: If the screenshots are hard to read, go to the repository and look at them directly.

## Installation:

- Checked the Checksum with openssl. (1st screenshot is the websites checksum, 2nd is my result.)

![image1](https://github.com/AHelplessStudent/dat250exp1-Handin/blob/main/ImagesExpass3/expass3_MongoDBChecksumWebsite.png)

![image2](https://github.com/AHelplessStudent/dat250exp1-Handin/blob/main/ImagesExpass3/expass3_MongoDBChecksumLocal.png)

## Experiment 1:

- Insert step: (Screenshot shows the data which was added.)

![image3](https://github.com/AHelplessStudent/dat250exp1-Handin/blob/main/ImagesExpass3/expass3_Experiment1_Insert.png)

- Query step: (Screenshot shows every command in the step)

![image4](https://github.com/AHelplessStudent/dat250exp1-Handin/blob/main/ImagesExpass3/expass3_Experiment1_Query.png)

- Remove step: (Screenshot shows every command in the step)
  
![image5](https://github.com/AHelplessStudent/dat250exp1-Handin/blob/main/ImagesExpass3/expass3_Experiment1_Remove.png)

- Update step: (Screenshot shows the data after all commands were executed.)

![image6](https://github.com/AHelplessStudent/dat250exp1-Handin/blob/main/ImagesExpass3/expass3_Experiment1_Update.png)

- Bulk Write step: (Screenshot shows every command in the step)

![image7](https://github.com/AHelplessStudent/dat250exp1-Handin/blob/main/ImagesExpass3/expass3_Experiment1_bulkWrite.png)

## Experiment 2:

### Map-Reduce Examples:

Screenshots below show the entire tutorial.

- Inserting data:
  
![image8](https://github.com/AHelplessStudent/dat250exp1-Handin/blob/main/ImagesExpass3/expass3_Experiment2_Insert.png)

- "Return the Total Price Per Customer"

![image9](https://github.com/AHelplessStudent/dat250exp1-Handin/blob/main/ImagesExpass3/expass3_Experiment2_Declare%20and%20use%20variables.png)

![image13](https://github.com/AHelplessStudent/dat250exp1-Handin/blob/main/ImagesExpass3/expass3_Experiment2_Query%20result%20variables.png)

- "Aggregation Alternative

![image10](https://github.com/AHelplessStudent/dat250exp1-Handin/blob/main/ImagesExpass3/expass3_Experiment2_Aggregation_Alternative.png)

- "Calcutlate Order and Total Quantity with Average Quantity Per Item"

![image11](https://github.com/AHelplessStudent/dat250exp1-Handin/blob/main/ImagesExpass3/expass3_Experiment2_functions2.png)

- "Aggregation Alternative"

![image12](https://github.com/AHelplessStudent/dat250exp1-Handin/blob/main/ImagesExpass3/expass3_Experiment2_Aggregation_Alternative2.png)

### Creating my own Map-Reduce Function:

I chose to implement a Function which returns all the products sold, with the gross sales and quantities. 

<code>
var mapFunction = function() {
 for (var idx = 0; idx < this.items.length; idx++) {        
    var key = this.items[idx].sku;        
    var value = { count: 1, price: this.items[idx].price, qty: this.items[idx].qty };         
		
    emit(key, value);     
  } 
}
</code>

<code>
var reduceFunction = function(keySku, countObjVals) {
  reducedVal = { count: 0, totalPrice: 0, qty: 0 };  

  for (var i = 0; i < countObjVals.length; i++) {   
    reducedVal.count += countObjVals[i].count;   
    reducedVal.totalPrice += countObjVals[i].price;   
    reducedVal.qty += countObjVals[i].qty; 
  }  

  return reducedVal; 
}  
</code>

Output: 
  
![image13](https://github.com/AHelplessStudent/dat250exp1-Handin/blob/main/ImagesExpass3/expass3_Experiment2_Custom.png)

The function is useful, because it shows which products are being bought the most, while also showing the gross revenues for each product. As well as showing the amount bought of each product. 
  
Could be made more useful with specifying dates for a weekly/monthly overview of sales. And the addition of net revenue could make it even more useful.

  
### Technical problems and Pending issues: 

I had no techinacal problems downloading or using MongoDB.

There are no pending issues left. 
