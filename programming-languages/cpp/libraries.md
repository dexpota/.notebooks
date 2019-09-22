# Libraries

## Boost Python

- How to call a python method or function from cpp;
	- when you have an instance of type object;
```cpp
f();
f.attr("method")();
```
	- when you have a pointer to a PyObject;
```cpp
call<ResultType>(f, ...);
call_method<ResultType>(obj, "method", ...);
```
- The function or method arguments are copied by default but they can be passed by reference using ptr and ref objects;

- How to raise a Python exception from cpp;
```cpp
PyErr_SetString(PyExec_ValueError, "message");
boost::python::throw_error_already_set();
```
