package de.tu_chemnitz.tomkr.augmentedmaps.sensor;

import de.tu_chemnitz.tomkr.augmentedmaps.datatypes.basetypes.Orientation;

/**
 * Created by Tom Kretzschmar on 11.09.2017.
 *
 */

public interface OrientationListener {

    void onOrientationChange(Orientation values);
}