package com.example.routes;

import androidx.fragment.app.FragmentActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);

       LatLng cjlt = new LatLng(15.945464, 120.479299);
       LatLng npv = new LatLng(15.952434, 120.486488);
       LatLng EE = new LatLng(15.947583, 120.508581);

       //tine
       LatLng a = new LatLng(15.945500, 120.478970);
       LatLng b = new LatLng(15.947413, 120.479237);
        LatLng c = new LatLng(15.949040, 120.479198);
        LatLng d = new LatLng(15.951326, 120.479358);
        LatLng e = new LatLng(15.954189, 120.478896);
        LatLng f = new LatLng(15.957058, 120.477818);
        LatLng g = new LatLng(15.958479, 120.478156);
        LatLng h = new LatLng(15.960079, 120.478132);


        // nels


       LatLng aa = new LatLng(15.952338, 120.487029);
       LatLng bb = new LatLng(15.954468, 120.486833);
       LatLng cc = new LatLng( 15.954821, 120.486525);
       LatLng dd = new LatLng(15.955580, 120.486643 );
       LatLng eee = new LatLng( 15.956098, 120.486605);
       LatLng ff = new LatLng( 15.956312, 120.486887);
       LatLng gg = new LatLng( 15.957808, 120.486904);
       LatLng cornersalabas = new LatLng( 15.957916, 120.488870);
       LatLng cA = new LatLng( 15.961258, 120.488746);
       LatLng cB = new LatLng(15.965445, 120.488546);

      //edrian

       LatLng aaa = new LatLng(15.947775, 120.508545);
       LatLng bbb = new LatLng( 15.947936, 120.511443);
       LatLng ccc = new LatLng(15.946618, 120.518856);
       LatLng dmchurch = new LatLng( 15.945050, 120.5250470);
       LatLng ddd = new LatLng( 15.953553, 120.529363);
       LatLng ebe = new LatLng( 15.956039, 120.530007);
       LatLng fff = new LatLng( 15.963100, 120.530817);
       LatLng ggg = new LatLng( 15.965142, 120.532147);
       LatLng hhh = new LatLng( 15.969595, 120.533623);
       LatLng iii = new LatLng( 15.974814, 120.535416);
       LatLng jjj = new LatLng( 15.975901, 120.536135);
       LatLng k = new LatLng(15.976617, 120.536381);
       LatLng l = new LatLng(15.977917, 120.536899);
       LatLng intersctnurda = new LatLng( 15.979407, 120.537533);




       LatLng danel = new LatLng(15.961693, 120.477634);
       LatLng intersection = new LatLng(15.968441, 120.488649);
       LatLng bbbridge = new LatLng(15.971133, 120.488806);
       LatLng pbbridge = new LatLng(15.973090, 120.488719);
       LatLng bridge = new LatLng(15.973515, 120.488417);
       LatLng cabridge = new LatLng(15.974364, 120.487814);
       LatLng paoling = new LatLng( 15.976229, 120.488447);

       LatLng KalA = new LatLng(15.975630, 120.492624);
       LatLng KalB = new LatLng(15.976671, 120.497841);
       LatLng KalC = new LatLng(15.979168, 120.509716);
       LatLng KalD = new LatLng(15.982430, 120.525890);
       LatLng KalE = new LatLng(15.981486, 120.530934);
       LatLng KalF = new LatLng(15.979743, 120.536809);
       LatLng KalG = new LatLng(15.975206, 120.545410);
       LatLng KalH = new LatLng(15.974715, 120.547404);
       LatLng KalI = new LatLng(15.974549, 120.554607);
       LatLng shell = new LatLng(15.975639, 120.563809);
       LatLng corner = new LatLng(15.979951, 120.563424);
       LatLng corner2 = new LatLng(15.981779, 120.560220);
       LatLng UCU = new LatLng(15.981452, 120.560228);


        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(-34, 151);
        mMap.addMarker(new MarkerOptions().position(cjlt).title("Christine's house").snippet("Torzar Residence").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN)));
        mMap.addMarker(new MarkerOptions().position(npv).title("Nelyn's house").snippet("Ventigan Residence").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE)));
        mMap.addMarker(new MarkerOptions().position(EE).title("Edrian's house").snippet("Estabillo Residence").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));
        mMap.addMarker(new MarkerOptions().position(UCU).title("Urdaneta City University").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(cjlt));



        mMap.addPolyline(new PolylineOptions()
        .add(cjlt, a, b, c, d, e, f, g, h, danel, intersection, bbbridge, pbbridge, bridge, cabridge, paoling, KalA, KalB, KalC, KalD, KalE, KalF, KalG, KalH, KalI, shell, corner, corner2, UCU)
        .width(10)
        .color(Color.BLUE));

       mMap.addPolyline(new PolylineOptions()
       .add(npv, aa, bb, cc, eee, ff, gg, cornersalabas, cA, cB, intersection, bbbridge, pbbridge, cabridge, paoling, KalA, KalB, KalC, KalD, KalE, KalF, KalG, KalH, KalI, shell, corner, corner2, UCU)
       .width(7)
       .color(Color.RED));

      mMap.addPolyline(new PolylineOptions()
      .add(EE, aaa, bbb, ccc, dmchurch, ddd, ebe, fff, ggg, hhh, iii, jjj, k, l, intersctnurda, KalG, KalH, KalI, shell, corner, corner2, UCU)
      .width(4)
      .color(Color.YELLOW));



    }
}