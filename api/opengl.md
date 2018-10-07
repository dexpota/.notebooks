# OpenGL

## Buffer types

- Interleaved buffers: all attributes are memorized inside the same buffer, their values are interleaved;
A1 B1 C1 A2 B2 C2 A3 B3 C3 | A4 B4 C4 A5 B5 C5;
- Separated buffers: at least two attributes are memorized in two different buffers;
A1 A2 A3 A4 A5; B1 B2 B3 B4 B5; C1 C2 C3 C4 C5
- Indexed buffers: the attributes are memorized inside one or multiple buffers, an array of indices gives the order to access these buffers;
