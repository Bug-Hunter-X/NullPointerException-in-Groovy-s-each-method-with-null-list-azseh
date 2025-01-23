```groovy
def myMethod(List<String> list) {
    list?.each { element ->
        println element
    }
}

//Alternative solution using null check
def myMethod2(List<String> list) {
  if(list != null){
    list.each { element ->
        println element
    }
  }
}

myMethod(null)
myMethod2(null) 
```