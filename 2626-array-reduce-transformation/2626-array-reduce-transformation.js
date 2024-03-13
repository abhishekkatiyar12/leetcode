/**
 * @param {number[]} nums
 * @param {Function} fn
 * @param {number} init
 * @return {number}
 */
var reduce = function(nums, fn, init) {
    var accu=init;
    if(nums.length===0){
        return accu;
    }
    
    // traversing the array
    for(var i = 0; i < nums.length; i++) {
        var number = nums[i];
        accu = fn(accu, number);
    }
    console.log(accu)
    return accu;
};