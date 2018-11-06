# Unity

## Framework

### Classes

- **MonoBehaviour** is the base class from which every other component derives;
	- This class defines three particular functions:
		- `void Start();` its called when a component is initialized;
		- `void Update();` its called for each frame;

- **Vector3** represents a direction inside a three dimensional space;
	- 
- **Raycast**, each ray is represented by an origin point, a direction and a
  distance;
	- An instance of this class could be used to determine a collision;

## Components

You can attach many **components** to a single instance of a Game Object of the
scene. You can access these components using the `MonoBehaviour`'s method
`GetComponent<Class>();`

### Canvas

> The `Canvas` is the component responsable of drawing the UI.

- `Render mode: overlay` in this rendering mode the UI is drawn on top of the
  entire scene;
	- this means that the canvas will be as large as the scene;
	- this means the canvas will control the `RectTransform` component;

- `Render mode: camera` in this rendering mode the UI is drawn only for the
  selected camera, if you wish do display different UIs for different cameras
this is the way;

- Every UI element must be a child of a Canvas;

## Shaders

- *Unilt shaders*: this types of shaders do not write into the **depth
  buffer**;
	- this shader will be replaced to generate the depth texture, unless
	  deferred shading is used;

## Gotchas

- `Raycast` only works if the object has a `Mesh Collider` component;
- The `update` method of a disabled object is never called;
