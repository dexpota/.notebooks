# OpenGL

> OpenGL is platform indipendent API which enables the use of programmable GPU

## Pipeline

1. The **vertex buffers** are filled with **vertex attributes** (attributes
   such as positions, texture coordinates) and passed to the **vertex shader**;
	- Along with the **vertex array object** (**VAO**) an **element array** is given to
	  the pipeline, this is a vector of indices which gives the order of the
	vertices inside the buffers;
2. Each vertex with its attributes is processed by the **vertex shader**;
	- Usually the vertex shader is used to project the points onto the **screen
	  space**;
3. The projected vertices are assembled into primitives using the **element array**;
	- Triangle primitive: The triangles are assembled by taking groups of three
	  indices from the **element array**;
	- Triangle strip: The strip of triangles is built starting from the first
	  three indices, the others triangles are assembled starting from the last
two vertices of the previous triangle along with a new vertex from the element
array;
	- Triangle fan: the first vertex is the center of the fan, the triangles
	  are built by taking all the couples from the element array;
4. The projected triangles are clippend and rasterized into fragments;
5. The generated fragments are processed by the fragment shader;
6. The result is passed to the **frame buffer** to visualize;

## Buffer types

- Interleaved buffers: all attributes are memorized inside the same buffer, their values are interleaved;
A1 B1 C1 A2 B2 C2 A3 B3 C3 | A4 B4 C4 A5 B5 C5;
- Separated buffers: at least two attributes are memorized in two different buffers;
A1 A2 A3 A4 A5; B1 B2 B3 B4 B5; C1 C2 C3 C4 C5
- Indexed buffers: the attributes are memorized inside one or multiple buffers, an array of indices gives the order to access these buffers;

## Glossary

- **Uniform state**: is the set of data which is constant between different
  stages of the pipeline and between different passes, a texture is an example
of data;
