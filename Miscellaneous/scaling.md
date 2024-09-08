```
default:
width=unspecified, initial-scale=device dependent

--> device has an internal width (typically much bigger than device-width), so that browser could render the website as if on desktop
--> then it will be zoomed-out to be contained in the browser window

width=unspecified, initial-scale=specified

--> width is not decided
--> for 1.0, this will scale it the width of device-width
--> generally, it will be width = device-width * scaling
--> then it will be zoomed-in/out properly contained in the browser window

width=specified, initial-scale=specified
--> width is what you specified, unless
--> first calculate width* = width * scaling
--> if this is < device-width, browser will extend the width, so that width* = width * scaling = device-width

width=specified, initial-scale=unspecified
--> width is just what you specified
--> I belive you could drop initial-scale=1, if you just use width=device-width
```

