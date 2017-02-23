# CircularTimeSeekBar

What is this?
-------------
Circular Time Seek Bar is a custom seek bar like used in Iphone.  It works similarly to the Iphone alarm seek bar for the calculating the time between the starting and ending.

**Note**: that the start/stop thumbs scroller (the thing you drag around) can be either a solid-color circle or a custom drawable (like a PNG image).


Requirements
------------
- Android 3.0 or later (Minimum SDK level 11)
- Android Studio (to compile and use)

Sample usage
------------
    ...
     <demogame.com.circulartimeseekbar.TimeSeekBar
        android:id="@+id/circular"
        android:layout_width="350dp"
        android:layout_height="350dp"
        android:layout_centerInParent="true"
        android:padding="30dp"
        range:arc_color="@color/colorAccent"
        range:arc_dash_size="20dp"
        range:border_color="#505090"
        range:border_thickness="20dp"
        android:rotation="270"
        range:end_angle="0"
        range:end_thumb_image="@drawable/circle_shape"
        range:start_angle="0"
        range:start_thumb_color="#035392"
        range:start_thumb_size="18dp"
        range:thumb_size="18dp" />
    ...

Explanation of attributes
-------------------------
Here are some short explanations for the attributes provided by the view. You can leave out any of them, values will get set to default ones.

- `arc_color`: (**refference**) Color of the arc drawn between two thumbs.
- `arc_dash_size`: (**dimension**) Define dash size of the arc drawn between two thumbs.
- `start_angle`: (**float**) The position of the slider start thumb, a degrees based value of the angle (0-360).
- `end_angle`: (**float**) The position of the slider end thumb, a degrees based value of the angle (0-360).
- `border_thickness`: (**dimension**) How thick should the slider border be (this can be a 0-dimension).
- `border_color`: (**color**) Recolors the slider border to the specified color.
- `thumb_size`: (**dimension**) Radius of the slider thumb (thumb is the slider's movable part). May be overridden with specific values for start/end thumbs.
- `end_thumb_size`: (**dimension**) Radius of the end slider thumb (thumb is the slider's movable part). This value will override `thumb_size` for end thumb.
- `start_thumb_size`: (**dimension**) Radius of the start slider thumb (thumb is the slider's movable part). This value will override `thumb_size` for start thumb.
- `start_thumb_image`: (**reference**) Set this to use an image instead of a colored circle for the slider start thumb.
- `end_thumb_image`: (**reference**) Set this to use an image instead of a colored circle for the slider end thumb.
- `start_thumb_color`: (**color**) Set this to use a colored circle instead of an image for the slider start thumb.
- `end_thumb_color`: (**color**) Set this to use a colored circle instead of an image for the slider end thumb.

**Note** that `thumb color` and `thumb image` are mutually exclusive, you can't use both.
