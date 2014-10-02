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
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
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

        //GPS Location aktiviert
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
        float zoomlevel = 5.75f;
        LatLng germany = new LatLng(51.013879, 10.479999);

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(germany, zoomlevel));


        float anchorX = 0.5f;
        float anchorY = 0.5f;

        //Marker New York + Einwohnerzahl
        mMap.addMarker(new MarkerOptions()
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.newyorkcity))
                .anchor(anchorX, anchorY)
                .position(new LatLng(40.754408, -73.983969))
                .title("New York")
                .snippet("Einwohnerzahl: 8,405,837"));

        //Marker Köln + Einwohnerzahl
        /*mMap.addMarker(new MarkerOptions()
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.koeln))
                .anchor(anchorX, anchorY)
                .position(new LatLng(50.937548, 6.955467))
                .title("Köln")
                .snippet("Einwohnerzahl: 1.034.175"));

        //Marker Düsseldorf + Einwohnerzahl
        mMap.addMarker(new MarkerOptions()
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.duesseldorf))
                .anchor(anchorX, anchorY)
                .position(new LatLng(51.228029, 6.776070))
                .title("Düsseldorf")
                .snippet("Einwohnerzahl: 598,686"));

        mMap.addMarker(new MarkerOptions()
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.zonguldak))
                .anchor(anchorX, anchorY)
                .position(new LatLng(41.456322, 31.798186))
                .title("Zonguldak")
                .snippet("Einwohnerzahl: 601.567"));*/

        //Marker alle Hauptstädte Europas + Einwohnerzahl + Fläche

        //Albanien Tirana
        mMap.addMarker(new MarkerOptions()
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.tirana))
                .anchor(anchorX, anchorY)
                .position(new LatLng(41.327542, 19.818553))
                .title("Tirana")
                .snippet("Einwohnerzahl: 418.495 Fläche: 41,8 km²"));

        //Andorra Andorra la Vella
        mMap.addMarker(new MarkerOptions()
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.andorra))
                .anchor(anchorX, anchorY)
                .position(new LatLng(42.506232, 1.521696))
                .title("Andorra la Vella")
                .snippet("Einwohnerzahl: 22.546 Fläche: 12 km²"));

        //Belgien Brüssel
        mMap.addMarker(new MarkerOptions()
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.bruessel))
                .anchor(anchorX, anchorY)
                .position(new LatLng(50.850207, 4.351701))
                .title("Brüssel")
                .snippet("Einwohnerzahl: 1.138.876 Fläche: 161,4 km²"));

        //Bosnien Sarajevo
        mMap.addMarker(new MarkerOptions()
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.sarajevo))
                .anchor(anchorX, anchorY)
                .position(new LatLng(43.856184, 18.412979))
                .title("Sarajevo")
                .snippet("Einwohnerzahl: 291.422 Fläche: 141,5 km²"));

        //Bulgarien Sofia
        mMap.addMarker(new MarkerOptions()
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.sofia))
                .anchor(anchorX, anchorY)
                .position(new LatLng(42.697451, 23.321887))
                .title("Sofia")
                .snippet("Einwohnerzahl: 1.271.743 Fläche: 492,092 km²"));

        //Dänemark Kopenhagen
        mMap.addMarker(new MarkerOptions()
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.kopenhagen))
                .anchor(anchorX, anchorY)
                .position(new LatLng(55.676011, 12.568177))
                .title("Kopenhagen")
                .snippet("Einwohnerzahl: 569.557 Fläche: 86,20 km²"));

        //Deutschland Berlin
        mMap.addMarker(new MarkerOptions()
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.berlin))
                .anchor(anchorX, anchorY)
                .position(new LatLng(52.519947, 13.404899))
                .title("Berlin")
                .snippet("Einwohnerzahl: 3.421.829 Fläche: 891,85 km²"));

        //Estland Tallinn
        mMap.addMarker(new MarkerOptions()
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.tallinn))
                .anchor(anchorX, anchorY)
                .position(new LatLng(59.436996, 24.753605))
                .title("Tallinn")
                .snippet("Einwohnerzahl: 429.899 Fläche: 159,2 km²"));

        //Finnland Helsinki
        mMap.addMarker(new MarkerOptions()
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.helsinki))
                .anchor(anchorX, anchorY)
                .position(new LatLng(60.173319, 24.941023))
                .title("Helsinki")
                .snippet("Einwohnerzahl: 604.380 Fläche: 715,55 km²"));


        //Frankreich Paris
        mMap.addMarker(new MarkerOptions()
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.paris))
                .anchor(anchorX, anchorY)
                .position(new LatLng(48.856572, 2.352296))
                .title("Paris")
                .snippet("Einwohnerzahl: 2.249.975 Fläche: 105,40 km²"));

        //Grischenland Athen
        mMap.addMarker(new MarkerOptions()
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.athen))
                .anchor(anchorX, anchorY)
                .position(new LatLng(37.9778385, 23.7123783))
                .title("Athen")
                .snippet("Einwohnerzahl: 664.046 Fläche: 38,964 km²"));

        //Irland Dublin
        mMap.addMarker(new MarkerOptions()
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.dublin))
                .anchor(anchorX, anchorY)
                .position(new LatLng(53.349772, -6.260246))
                .title("Dublin")
                .snippet("Einwohnerzahl: 527.612 Fläche: 115 km²"));

        //Island Reykjavík
        mMap.addMarker(new MarkerOptions()
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.reykjavik))
                .anchor(anchorX, anchorY)
                .position(new LatLng(64.133383, -21.932831))
                .title("Reykjavík")
                .snippet("Einwohnerzahl: 121.230 Fläche: 277,1 km²"));

        //Italien Rom
        mMap.addMarker(new MarkerOptions()
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.rom))
                .anchor(anchorX, anchorY)
                .position(new LatLng(41.872374, 12.480208))
                .title("Rom")
                .snippet("Einwohnerzahl: 2.863.322 Fläche: 1.285,306 km²"));

        //Kasachstan Astana
        mMap.addMarker(new MarkerOptions()
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.astana))
                .anchor(anchorX, anchorY)
                .position(new LatLng(51.166676, 71.433202))
                .title("Astana")
                .snippet("Einwohnerzahl: 814.401 Fläche: 710 km²"));

        //Kosovo Priština
        /*mMap.addMarker(new MarkerOptions()
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.helsinki))
                .anchor(anchorX, anchorY)
                .position(new LatLng(42.6577982, 21.1533456 ))
                .title("Helsinki")
                .snippet("Einwohnerzahl: 198.897 Fläche: 572 km²"));*/

        //Kroatien Zagreb
        mMap.addMarker(new MarkerOptions()
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.zagreb))
                .anchor(anchorX, anchorY)
                .position(new LatLng(45.814990, 15.981927))
                .title("Zagreb")
                .snippet("Einwohnerzahl: 790.017 Fläche: 641,355 km²"));

        //Lettland Riga
        mMap.addMarker(new MarkerOptions()
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.riga))
                .anchor(anchorX, anchorY)
                .position(new LatLng(56.9465363, 24.1048503))
                .title("Riga")
                .snippet("Einwohnerzahl: 699.203 Fläche: 307,17 km²"));

        //Liechtenstein Vaduz
        /*mMap.addMarker(new MarkerOptions()
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.zagreb))
                .anchor(anchorX, anchorY)
                .position(new LatLng(47.144863;9.5157663))
                .title("Vaduz")
                .snippet("Einwohnerzahl: 5229 Fläche: 17,3 km²"));*/

        //Litauen Vilnius
        mMap.addMarker(new MarkerOptions()
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.vilnius))
                .anchor(anchorX, anchorY)
                .position(new LatLng(54.6805808, 25.2775929))
                .title("Vilnius")
                .snippet("Einwohnerzahl: 537.152 Fläche: 401 km²"));

        //Luxemburg Luxemburg
        mMap.addMarker(new MarkerOptions()
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.luxemburg))
                .anchor(anchorX, anchorY)
                .position(new LatLng(49.6100036, 6.129596))
                .title("Luxemburg")
                .snippet("Einwohnerzahl: 107.247 Fläche: 51,5 km²"));

        //Malta Valletta
        mMap.addMarker(new MarkerOptions()
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.valletta))
                .anchor(anchorX, anchorY)
                .position(new LatLng(35.8977778, 14.5125))
                .title("Valletta")
                .snippet("Einwohnerzahl: 6295 Fläche: 0,84 km²"));

        //Mazedonien Skopje
        mMap.addMarker(new MarkerOptions()
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.skopje))
                .anchor(anchorX, anchorY)
                .position(new LatLng(41.9969797, 21.4379746))
                .title("Skopje")
                .snippet("Einwohnerzahl: 537.478 Fläche: 571,46 km²"));

        //Moldawien Kischinau
        mMap.addMarker(new MarkerOptions()
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.kischinau))
                .anchor(anchorX, anchorY)
                .position(new LatLng(47.026859, 28.841551))
                .title("Kischinau")
                .snippet("Einwohnerzahl: 723.500 Fläche: 120 km²"));

        //Monaco Monaco
        mMap.addMarker(new MarkerOptions()
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.monaco))
                .anchor(anchorX, anchorY)
                .position(new LatLng(43.7328818, 7.4166157))
                .title("Monaco")
                .snippet("Einwohnerzahl: 36.136 Fläche: 2,02 km²"));

        //Montenegro Podgorcia
        mMap.addMarker(new MarkerOptions()
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.podgorcia))
                .anchor(anchorX, anchorY)
                .position(new LatLng(42.442575, 19.268646))
                .title("Podgorcia")
                .snippet("Einwohnerzahl: 185.937 Fläche: 1.441 km²"));

        //Niederlande Amsterdam
        mMap.addMarker(new MarkerOptions()
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.amsterdam))
                .anchor(anchorX, anchorY)
                .position(new LatLng(52.3738007, 4.8909347))
                .title("Amsterdam")
                .snippet("Einwohnerzahl: 809.892 Fläche: 219 km²"));

        //Norwegen Oslo
        mMap.addMarker(new MarkerOptions()
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.oslo))
                .anchor(anchorX, anchorY)
                .position(new LatLng(59.9163218, 10.7506307))
                .title("Oslo")
                .snippet("Einwohnerzahl: 640.313 Fläche: 454 km²"));

        //Österreich Wien
        mMap.addMarker(new MarkerOptions()
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.wien))
                .anchor(anchorX, anchorY)
                .position(new LatLng(48.2118359, 16.3686609))
                .title("Wien")
                .snippet("Einwohnerzahl: 1.781.105 Fläche: 414,87 km²"));

        //Polen Warschau
        mMap.addMarker(new MarkerOptions()
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.warschau))
                .anchor(anchorX, anchorY)
                .position(new LatLng(52.2209206, 21.0110619))
                .title("Warschau")
                .snippet("Einwohnerzahl: 1.724.404 Fläche: 517,24 km²"));

        //Portugal Lissabon
        mMap.addMarker(new MarkerOptions()
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.lissabon))
                .anchor(anchorX, anchorY)
                .position(new LatLng(38.724326, -9.131235))
                .title("Lissabon")
                .snippet("Einwohnerzahl: 545.245 Fläche: 84,92 km²"));

        //Rumänien Bukarest
        mMap.addMarker(new MarkerOptions()
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.bukarest))
                .anchor(anchorX, anchorY)
                .position(new LatLng(44.437711, 26.097367))
                .title("Bukarest")
                .snippet("Einwohnerzahl: 1.883.425 Fläche: 228 km²"));

        //Russland Moskau
        mMap.addMarker(new MarkerOptions()
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.moskau))
                .anchor(anchorX, anchorY)
                .position(new LatLng(55.7566594, 37.6236595))
                .title("Moskau")
                .snippet("Einwohnerzahl: 11.503.501 Fläche: 2510 km²"));

        //San Marino San Marino
        /*mMap.addMarker(new MarkerOptions()
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.amsterdam))
                .anchor(anchorX, anchorY)
                .position(new LatLng(43.9321564, 12.4486256))
                .title("San Marino")
                .snippet("Einwohnerzahl: 4214 Fläche: 7,09 km²"));*/

        //Schweden Stockholm
        mMap.addMarker(new MarkerOptions()
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.stockholm))
                .anchor(anchorX, anchorY)
                .position(new LatLng(59.3295364, 18.0784665))
                .title("Stockholm")
                .snippet("Einwohnerzahl: 868.141 Fläche: 187 km²"));

        //Schweiz Bern
        mMap.addMarker(new MarkerOptions()
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.bern))
                .anchor(anchorX, anchorY)
                .position(new LatLng(46.9481228, 7.4513607))
                .title("Bern")
                .snippet("Einwohnerzahl: 128.848 Fläche: 51,60 km²"));

        //Serbien Belgrad
        mMap.addMarker(new MarkerOptions()
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.belgrad))
                .anchor(anchorX, anchorY)
                .position(new LatLng(802416, 20.465601))
                .title("Belgrad")
                .snippet("Einwohnerzahl: 1.233.796 Fläche: 359,96 km²"));

        //Slowakei Bratislava
        mMap.addMarker(new MarkerOptions()
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.bratislava))
                .anchor(anchorX, anchorY)
                .position(new LatLng(48.1455577, 17.1126404))
                .title("Bratislava")
                .snippet("Einwohnerzahl: 417.389 Fläche: 367,661 km²"));

        //Slowenien Ljubljana
        mMap.addMarker(new MarkerOptions()
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ljubljana))
                .anchor(anchorX, anchorY)
                .position(new LatLng(46.0514263, 14.5059655))
                .title("Ljubljana")
                .snippet("Einwohnerzahl: 278.638 Fläche: 275 km²"));

        //Spanien Madrid
        mMap.addMarker(new MarkerOptions()
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.madrid))
                .anchor(anchorX, anchorY)
                .position(new LatLng(40.4166909, -3.7003454))
                .title("Madrid")
                .snippet("Einwohnerzahl: 3.207.247 Fläche: 605,770 km²"));

        //Tschechien Prag
        mMap.addMarker(new MarkerOptions()
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.prag))
                .anchor(anchorX, anchorY)
                .position(new LatLng(50.0926869, 14.4231175))
                .title("Prag")
                .snippet("Einwohnerzahl: 1.243.201 Fläche: 496 km²"));

        //Türkei Ankara
        mMap.addMarker(new MarkerOptions()
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ankara))
                .anchor(anchorX, anchorY)
                .position(new LatLng(39.924845, 32.8606243))
                .title("Ankara")
                .snippet("Einwohnerzahl: 5.045.083 Fläche: 25.706 km²"));

        //Ukraine Kiew
        mMap.addMarker(new MarkerOptions()
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.kiew))
                .anchor(anchorX, anchorY)
                .position(new LatLng(50.45, 30.5233333))
                .title("Kiew")
                .snippet("Einwohnerzahl: 2.868.700 Fläche: 839 km²"));

        //Ungarn Budapest
        mMap.addMarker(new MarkerOptions()
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.budapest))
                .anchor(anchorX, anchorY)
                .position(new LatLng(47.4984056, 19.0407578))
                .title("Budapest")
                .snippet("Einwohnerzahl: 1.735.711 Fläche: 525,13 km²"));

        //Vatikanstadt Vatikanstadt
        mMap.addMarker(new MarkerOptions()
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.vatikan))
                .anchor(anchorX, anchorY)
                .position(new LatLng(41.9010408, 12.451464))
                .title("Vatikanstadt")
                .snippet("Einwohnerzahl: 842 Fläche: 0,44 km²"));

        //Vereinigtes Königreich London
        mMap.addMarker(new MarkerOptions()
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.london))
                .anchor(anchorX, anchorY)
                .position(new LatLng(51.5100949, -0.1248314))
                .title("London")
                .snippet("Einwohnerzahl: 8.416.535 Fläche: 1.572 km²"));

        //Weißrussland Minsk
        mMap.addMarker(new MarkerOptions()
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.minsk))
                .anchor(anchorX, anchorY)
                .position(new LatLng(53.9, 27.5666667))
                .title("Minsk")
                .snippet("Einwohnerzahl: 1.921.861 Fläche: 348,85 km²"));


        //3D buildings!
        mMap.setBuildingsEnabled(true);

        //MapType Normal
        mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);


        //Strings formatieren und auf 2 Nachkommastellen runden
        formatForDisplay = "%.2f";

        //Wenn man lange klickt wird der angeklickte Punkt mit seiner LatLng angezeigt (mit Formatierung)

        mMap.setOnMapLongClickListener(new GoogleMap.OnMapLongClickListener() {
            @Override
            public void onMapLongClick(LatLng LatLng) {

                //move camera to click-point
                //mMap.animateCamera(CameraUpdateFactory.newLatLng(LatLng));

                //Latitude und Longitude werden als Toast (LENGHT_LONG) angezeigt
                Toast.makeText(getApplicationContext(), "Latitude: " + String.format(formatForDisplay, LatLng.latitude) + " Longitude: " + String.format(formatForDisplay, LatLng.longitude), Toast.LENGTH_LONG).show();
            }

        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        setUpMapIfNeeded();
    }


    //Menu icons hinzufügen
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.maps, menu);
        return true;
    }


    //Icons werden angezeigt und sobald man drauf klickt, ändert sich jenachdem der MAP_TYPE
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.normal:
                mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
                return true;
            case R.id.hybrid:
                mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
                return true;
            case R.id.cacity:

            default:
        }
        return super.onOptionsItemSelected(item);
    }


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
