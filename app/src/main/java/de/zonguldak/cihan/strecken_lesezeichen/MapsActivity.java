package de.zonguldak.cihan.strecken_lesezeichen;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;


public class MapsActivity extends FragmentActivity {

    private GoogleMap mMap; // Might be null if Google Play services APK is not available.
    private String formatForDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        setUpMapIfNeeded();

        mMap.setMyLocationEnabled(true);

/*        float zoomLevel = 17f;
        LatLng zuhause = new LatLng(51.174318, 6.831817);

        //automove camera to home
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(zuhause, zoomLevel));


        //Marker Zuhause
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(51.1743318, 6.831817))
                .title("Mein Zuhause"));

*/
        //automove germany
        float zoomlevel = 5.7f;
        LatLng germany = new LatLng(51.013879, 10.286731);

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(germany, zoomlevel));


        //Marker New York + Einwohnerzahl
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(40.754408, -73.983969))
                .title("New York")
                .snippet("Einwohnerzahl: 8,405,837"));

        //Marker Köln + Einwohnerzahl
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(50.937548, 6.955467))
                .title("Köln")
                .snippet("Einwohnerzahl: 1.034.175"));

        //Marker Düsseldorf + Einwohnerzahl
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(51.228029, 6.776070))
                .title("Düsseldorf")
                .snippet("Einwohnerzahl: 598,686"));


        //3D buildings!
        mMap.setBuildingsEnabled(true);

        //MapType Normal
        mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);


        formatForDisplay = "%.2f";
        mMap.setOnMapLongClickListener(new GoogleMap.OnMapLongClickListener() {
            @Override
            public void onMapLongClick(LatLng LatLng) {

                //move camera to click-point
                //mMap.animateCamera(CameraUpdateFactory.newLatLng(LatLng));

                Toast.makeText(getApplicationContext(), "Latitude: " + String.format(formatForDisplay, LatLng.latitude) + " Longitude: " + String.format(formatForDisplay, LatLng.longitude), Toast.LENGTH_LONG).show();
            }

        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        setUpMapIfNeeded();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.maps, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()) {
            case R.id.normal:
                mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
                return true;
            case R.id.hybrid:
                mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
                return true;
            case R.id.terrain:
                mMap.setMapType(GoogleMap.MAP_TYPE_TERRAIN);
                return true;
            default:
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * Sets up the map if it is possible to do so (i.e., the Google Play services APK is correctly
     * installed) and the map has not already been instantiated.. This will ensure that we only ever
     * call {@link #setUpMap()} once when {@link #mMap} is not null.
     * <p>
     * If it isn't installed {@link SupportMapFragment} (and
     * {@link com.google.android.gms.maps.MapView MapView}) will show a prompt for the user to
     * install/update the Google Play services APK on their device.
     * <p>
     * A user can return to this FragmentActivity after following the prompt and correctly
     * installing/updating/enabling the Google Play services. Since the FragmentActivity may not
     * have been completely destroyed during this process (it is likely that it would only be
     * stopped or paused), {@link #onCreate(Bundle)} may not be called again so we should call this
     * method in {@link #onResume()} to guarantee that it will be called.
     */
    private void setUpMapIfNeeded() {
        // Do a null check to confirm that we have not already instantiated the map.
        if (mMap == null) {
            // Try to obtain the map from the SupportMapFragment.
            mMap = ((SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map))
                    .getMap();
            // Check if we were successful in obtaining the map.
            if (mMap != null) {
                setUpMap();
            }
        }
    }





    /**
     * This is where we can add markers or lines, add listeners or move the camera. In this case, we
     * just add a marker near Africa.
     * <p>
     * This should only be called once and when we are sure that {@link #mMap} is not null.
     */

private void setUpMap() {
//        mMap.addMarker(new MarkerOptions().position(new LatLng(0, 0)).title("Marker"));
    }
}
