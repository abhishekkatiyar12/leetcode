/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var filter = function(arr, fn) {
    
    // created an array
    const myArray = [];

    // traversing the array
    for(var i = 0; i < arr.length; i++) {
        var number = arr[i];
        var result = fn(number, i);
        // Check if the result is truthy
        if (result) {
            myArray.push(arr[i]);
        }
    }
    return myArray;
};

