/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var map = function(arr, fn) {
    const myArray = [];
    for(var i=0;i<arr.length;i++){
        var number=arr[i];
        var result=fn(number,i);
        myArray.push(result);
    }
return myArray;
};