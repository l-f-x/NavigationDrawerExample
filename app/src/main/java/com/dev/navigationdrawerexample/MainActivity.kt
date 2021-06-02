package com.dev.navigationdrawerexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.dev.navigationdrawerexample.databinding.ActivityMainBinding
import com.google.android.material.navigation.NavigationView
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.topAppBar.setNavigationOnClickListener {
            binding.drawerLayout.openDrawer(binding.mainActivityNavigationView)
        }
        binding.mainActivityNavigationView.setNavigationItemSelectedListener { menuItem ->
            when(menuItem.itemId){
                R.id.shop->{ Snackbar.make(binding.topAppBar,"Shop",Snackbar.LENGTH_SHORT).show()}
                R.id.report_problem->{Snackbar.make(binding.topAppBar,"Any Bugs?",Snackbar.LENGTH_SHORT).show()}
            }
            binding.drawerLayout.closeDrawer(binding.mainActivityNavigationView)
            true
        }
    }


}