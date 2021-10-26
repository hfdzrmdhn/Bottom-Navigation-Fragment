package com.bottnav.id;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import android.view.MenuItem;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import android.view.LayoutInflater;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import android.view.Menu;
import android.view.MenuInflater;
import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {
	
	private Toolbar toolbar;
	private ActionBar toolbarTitle;
	private BottomNavigationView bottomNav;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		toolbar = findViewById(R.id.toolbar_include);
		setSupportActionBar(toolbar);
		toolbarTitle = getSupportActionBar();
		
		bottomNav = findViewById (R.id.bottom_navigation);
		getSupportFragmentManager().beginTransaction().replace(R.id.frame_container , new FragmentC1()).commit();
		bottomNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener(){
			@Override
			public boolean onNavigationItemSelected(MenuItem item){
				Fragment selectedFragment = null;
				switch(item.getItemId()){
					case R.id.mHome:
						selectedFragment = new FragmentC1();
						toolbarTitle.setTitle("BukaToko");
						getSupportActionBar().show();
						break;
					case R.id.mProduk:
						selectedFragment = new FragmentC2();
						toolbarTitle.setTitle("Produk");
						getSupportActionBar().show();
						break;
					case R.id.mChat:
						selectedFragment = new FragmentC3();
						toolbarTitle.setTitle("Chat");
						getSupportActionBar().show();
						break;
					case R.id.mPenjualan:
						selectedFragment = new FragmentC4();
						toolbarTitle.setTitle("Penjualan");
						getSupportActionBar().show();
						break;
					case R.id.mLainnya:
						selectedFragment = new FragmentC5();
						toolbarTitle.setTitle("Aplikasi");
						getSupportActionBar().show();
						break;
					
				}
				getSupportFragmentManager().beginTransaction().replace(R.id.frame_container , selectedFragment).commit();
				return true;
			}
		});
	}

	
}

