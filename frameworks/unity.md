# Unity

## Components

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

- *Unilt shaders*: this types of shaders do not write into the **depth buffer**;
	- this shader will be replaced to generate the depth texture, unless deferred shading is used;

## Gotchas

- `Raycast` only works if the object has a `Mesh Collider` component;
- The `update` method of a disabled object is never called;
