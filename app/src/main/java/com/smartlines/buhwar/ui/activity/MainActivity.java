package com.smartlines.buhwar.ui.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;
import com.smartlines.buhwar.R;
import com.smartlines.buhwar.ui.fragment.estadisticas.EstadisticasFragment;
import com.smartlines.buhwar.ui.fragment.helper.InfoFragment;
import com.smartlines.buhwar.ui.fragment.incidencias.InicidenciasFragment;
import com.smartlines.buhwar.ui.fragment.sos.SosFragment;
import com.smartlines.buhwar.ui.fragment.visitante.VisitaFragment;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener,
        DrawerLayout.DrawerListener {

    private DrawerLayout drawerLayout;
    private Button btnPanico;
    private Fragment guadiasFragment;
    private Fragment infoFragment;
    private Fragment visitaFragment;
    private  Fragment sosFragment;
    private  Fragment incidenciasFragment;
    private  Fragment estadisticaFragment;

    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        infoFragment = InfoFragment.newInstance();
        visitaFragment = VisitaFragment.newInstance();
        sosFragment = SosFragment.newInstance();
        incidenciasFragment = InicidenciasFragment.newInstance();
        estadisticaFragment = EstadisticasFragment.newInstance();
        fragmentManager = getSupportFragmentManager();
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar((Toolbar) findViewById(R.id.toolbar));

        drawerLayout = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawerLayout, toolbar, R.string.navigation_drawer_open,
                R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = findViewById(R.id.navigation_view);
        navigationView.setNavigationItemSelectedListener(this);

        MenuItem menuItem = navigationView.getMenu().getItem(0);
        onNavigationItemSelected(menuItem);
        menuItem.setChecked(true);
        drawerLayout.addDrawerListener(this);
        View header = navigationView.getHeaderView(0);
        header.findViewById(R.id.header_title).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, getString(R.string.title_click),
                        Toast.LENGTH_SHORT).show();
            }
        });
        btnPanico = (Button) findViewById(R.id.btnPanico);
        btnPanico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                Toast.makeText(MainActivity.this, "Panico",
                        Toast.LENGTH_SHORT).show();
            }
        });



    }

    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.nav_info:
                setTitle("ASP Solutions");
                fragmentManager.beginTransaction()
                    .replace(R.id.fragment_content,infoFragment)
                    .addToBackStack(null)
                    .commit();


                drawerLayout.closeDrawer(GravityCompat.START);
                break;

            case R.id.nav_rondin:
                setTitle("Rondin");
                drawerLayout.closeDrawer(GravityCompat.START);
                Intent i =new Intent(MainActivity.this,RondinMapActivity.class);
                startActivity(i);
                break;
            case R.id.nav_visitas:
                setTitle("Visitas");
                //drawerLayout.closeDrawer(GravityCompat.START);
                fragmentManager.beginTransaction()
                        .replace(R.id.fragment_content,visitaFragment)
                        .addToBackStack(null)
                        .commit();
                drawerLayout.closeDrawer(GravityCompat.START);
                break;
            case R.id.nav_sos:
                setTitle("S. O. S.");
                fragmentManager.beginTransaction()
                        .replace(R.id.fragment_content,sosFragment)
                        .addToBackStack(null)
                        .commit();
                drawerLayout.closeDrawer(GravityCompat.START);
                break;
            case R.id.nav_estdisticaas:
                setTitle("Estadisticas");
                fragmentManager.beginTransaction()
                        .replace(R.id.fragment_content,estadisticaFragment)
                        .addToBackStack(null)
                        .commit();
                drawerLayout.closeDrawer(GravityCompat.START);                break;
            case R.id.nav_inicidencias:
                setTitle("S. O. S.");
                fragmentManager.beginTransaction()
                        .replace(R.id.fragment_content,incidenciasFragment)
                        .addToBackStack(null)
                        .commit();
                drawerLayout.closeDrawer(GravityCompat.START);
                break;
        }

        return true;
    }

    @Override
    public void onDrawerSlide(@NonNull View view, float v) {
        //cambio en la posición del drawer
    }

    @Override
    public void onDrawerOpened(@NonNull View view) {
        //el drawer se ha abierto completamente
        Toast.makeText(this, getString(R.string.navigation_drawer_open),
                Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDrawerClosed(@NonNull View view) {
        //el drawer se ha cerrado completamente
    }

    @Override
    public void onDrawerStateChanged(int i) {
        //cambio de estado, puede ser STATE_IDLE, STATE_DRAGGING or STATE_SETTLING
    }

}
