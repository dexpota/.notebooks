# Python's recipies

- Define a partial application of a function, it returns a function with the given arguments already filled in;

```python
from functools import partial

partial(min, key=abs)
```

- Get the pick usage of system memory, only for unix systems;

```python
import resource

resource.getrusage(resource.RUSAGE_SELF.ru_maxrss)
```

## Libraries

### PIL

- Create a new image;
```python
image = Image.new("RGB", (256, 256))
pixels = image.load()
pixels[i, j] # the ith, jth pixel as a tuple
image.size # returns the size of the image
```

- Create an image from a numpy array;;
```python
PIL.Image.fromarray(array, "L") # the second parameter is the mode
```

### Numpy

- Array creation;
```python
np.array([], dtype=np.uint16) # and specify the data type
np.frombuffer(b, dtype=np.uint16) # create an array loading data from the buffer
```

- Array attributes;
```python
array[row, column, depth]
array.shape # is a tuple (height(rows), width(columns), depth)
array.nbytes # returns the dimension in bytes
```

- Convert a flat index into a coordinate inside a matrix;
```python
np.unravel_index(indices, dims, order="c")

np.unravel_index([22, 41, 37], (7, 6))
# ([3, 6, 6], [4, 5, 1])
```

- Add a column to a matrix;
```python
a = np.eye(3)
np.c_[a, np.ones(3)]
np.c_[np.ones(3), a, np.ones(3)]
```

- Add a row to a matrix;
```python
a = np.eye(3)
np.r_[a, [np.ones(3)]]
```

- Returns a matrix of random values;
```python
np.random.rand(d0, d1, d2, d3, ..., dn)
```

### Matplotlib

- Assign a color based on a value;
```python
plt.scatter(xs, ys, c=ys)
```

- Save a plot without axes and frame;
```python
fig = plt.figure(frameon=None)
ax = plt.Axes(fix, [0, 0, 1, 1])
ax.set_axis_off()
fig.add_axes(ax)
# ...
fig.save_fig("output.png")
```


### argparse

- Use an argument as a flag;
```python
parser.add_argument("-f", action="store_true", default=False)
```

### scipy

#### Convolution and correlation

The convolution and correlation between two matrices is computed for each position of the filter onto the matrix as the sum of the multiplication between the values of the matrices in the current configuration;

- The center of the filter is rounded up, for example the center of 2 by 2 matrix is 1,1;


```
[[1, 2, 0, 0], 
 [5, 3, 0, 4],
 [0, 0, 0, 7],
 [9, 3, 0, 0]]
```

```
[[1, 1, 1], 
 [1, 1, 0],
 [1, 0, 0]]
```

- **mode**: how the matrix is extended outside the borders;
	- **reflect**: the matrix is reflected outside the border;
```
[[1, 1, 2],
 [1, 1, 2],
 [5, 5, 3]]
```
	- **constant**: a constant value is used outside the borders;
```
[[k, k, k],
 [k, 1, 2],
 [k, 5, 3]]
```
	- **nearest**: the nearest value is used;
```
[[1, 1, 2],
 [1, 1, 2],
 [5, 5, 3]]
```
	- **mirror**: the matrix is mirrored;
```
[[3, 5, 3],
 [2, 1, 2],
 [3, 5, 3]]
```
	- **wrap**: the matrix is wrapped around;
```
[[0, 9, 3],
 [0, 1, 2],
 [4, 5, 3]]
```

- **origin**: it is possible to move the center of the filter by passing a tuple with the offset from the computer center;

- The convolution differs from the correlation in that the filter is rotated by 180°;
