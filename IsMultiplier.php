<?php
//Function to check divisibility of numbers in an array by 4 or 6
function result($arrayinput,$size) 
{  
    // iterate from 0 to length of the array 
   
    for ($num = 0; $num < $size; $num++) 
    {  
        // Short-circuit operator is used  
        if ($arrayinput[$num] % 4 == 0 && $arrayinput[$num] % 6 == 0) 
            echo $arrayinput[$num], " "; 
    } 
} 
  
// Driver code 
      
// input the array values 
 $arrayinput = array(0.3,0.5,0.6);
 $size = sizeof($arrayinput);
  
// Calling function 
result($arrayinput,$size);  
?>