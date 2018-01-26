# Searching Algorithm

Searching means to find whether a particular value is present in an array or not.

## Linear Seacrch
Linear Search is also called as sequential search, is a very simple method use for searching an array for a particular value.
Linear search is mostly used to search an unordered list of elements .
### Algorithm
```
LinearSearch(array,size,serachValue)
{
    position = -1;
    i=1;
    while i<=size
    {
        if array[i]==searchValue then
          position = i;
    }
    return the position;
}

```
### Time Complexity
```
Linear Search executes in O(n) time where n is the number of elements in the array
```
## Binary Seacrch
Binary Search is searching algorithm that works efficiently with a sorted list

### Algorithm
```
BinarySearch(array,lower_bound,upper_bound,value)
{
    initialize: begining = lower_bound
                end = upper_bound
                position = -1
    while begining <= end:
        set: mid = (begining+end)/2
        if array[mid]== value then
            set: position = mid
        else if array[mid]>value:
            set: end = mid-1
        else
            set: beg = mid + 1
        end if
    end while
    return position
}

```
### Mechanism / Example

```
Consider the array A[ ] that is initialized as 
A[ ] = {0,1,2,3,4,5,6,7,8,9,10}
the value to be search is value=4
begining=0
end = 10
mid = (0+10)/2 = 5
************************************************************************************
Now value = 4 and A[mid] = 5 so, A[5] is greater than the value , therefore we serach 
for the value in first half.
So we change end and mid
Now end = mid-1=5-1=4 , begining = 0 
mid = (0+4)/2 = 2
*************************************************************************************
Again, Value=4 and A[2] = 2
Now A[2] is less than the value so 
begining = mid + 1 = 2+1 = 3
end = 4
mid = (3+4)/2 = 3
************************************************************************************
Again, value = 4 and A[3]=3
Now A[3] is lwss than the value so
so begining = mid + 1 = 3 + 1 = 4
end = 4
mid = (4+4)/2 = 4
finally, a[mid] = value 
so, find at postion mid = 4

```
### Complexity
```
This algoriithm run in log(n) time.
```
## Interpolation Search

### Description


The **interpolation search** is an improvement over binary search, where the values in a sorted array are uniformly distributed. Binary search always go to middle element to check the value. On the other hand interpolation search may go to different position according to the key value.
To find the position we use the formula:<br/>

    position = lower_bound + [(x-array[0])*(high-lower_bound)/(array[high]-array[lower_bound])]
    
### Time Complexity

> If elements are uniformly distributed then it take O(log log n) time.<br/>
> In worst case it can take upto O(n)<br/>
#### Given a list of numbers a[] = {1,3,5,7,9,11,13,15,17,19,21}. Search the value 19 using interpolation search.

    Low = o, high = 10, val = 19
    a[low]=1, a[high] = 21
    position = low + (high-low)*((val-a[low])/(a[high]-a[low]))
    		 = 0 + (10-0)*((19-1)/(21-1))
    		 = 0 + 10*0.9 = 9
    a[position] = a[9] = 19 which is equal to the value to be searched.
