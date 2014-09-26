package de.zonguldak.cihan.strecken_lesezeichen;

import android.graphics.Canvas;

import com.google.android.gms.maps.MapView;

/**
 * Created by cihan on 26.09.14.
 */
public class MapOverlay {
    public boolean draw(Canvas canvas, MapView mapView,
                        boolean shadow, long when) {
  /*
        super.draw(canvas, mapView, shadow, when);

        //---translate the GeoPoint to screen pixels---
        Point screenPts = new Point();
        mapView.getProjection().toPixels(p, screenPts);

        //---add the marker---
        Bitmap bmp = BitmapFactory.decodeResource(
                getResources(), R.drawable.pink);
        canvas.drawBitmap(bmp, screenPts.x, screenPts.y-32, null);
//  */
        return true;
    }
}
