/*
 * Copyright (C) 2016 Actinarium
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.actinarium.rhythm;

import android.graphics.Canvas;
import android.graphics.Rect;

/**
 * <p>Spec layer is a descriptor of a granular piece of overlay (e.g. a single line, a repeating line etc), which both
 * holds the configuration of its appearance (hence the spec) and is also capable of drawing itself onto the provided
 * canvas (hence the layer). Unlike Drawables, where separate instances are required each time they are used, spec layer
 * instances are created per configuration and can be reused across many {@link RhythmDrawable}s (views,
 * overlays).</p><p>You can create custom spec layers by implementing this interface.</p>
 */
public interface RhythmSpecLayer {

    /**
     * Draw itself to the provided canvas within provided bounds according to internal configuration (if any)
     *
     * @param canvas         Canvas for the layer to draw itself to
     * @param drawableBounds Bounds where this layer should draw itself. Since these are the bounds of a {@link
     *                       RhythmDrawable} connected to the view, they are usually the same as the view’s bounds, so
     *                       you can use this parameter to get the view’s dimensions should you need them.
     */
    void draw(Canvas canvas, Rect drawableBounds);

}
