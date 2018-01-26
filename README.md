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
## Linear Seacrch




## Deployment

Add additional notes about how to deploy this on a live system

## Built With

* [Dropwizard](http://www.dropwizard.io/1.0.2/docs/) - The web framework used
* [Maven](https://maven.apache.org/) - Dependency Management
* [ROME](https://rometools.github.io/rome/) - Used to generate RSS Feeds

## Contributing

Please read [CONTRIBUTING.md](https://gist.github.com/PurpleBooth/b24679402957c63ec426) for details on our code of conduct, and the process for submitting pull requests to us.

## Versioning

We use [SemVer](http://semver.org/) for versioning. For the versions available, see the [tags on this repository](https://github.com/your/project/tags). 

## Authors

* **Billie Thompson** - *Initial work* - [PurpleBooth](https://github.com/PurpleBooth)

See also the list of [contributors](https://github.com/your/project/contributors) who participated in this project.

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

## Acknowledgments

* Hat tip to anyone who's code was used
* Inspiration
* etc

