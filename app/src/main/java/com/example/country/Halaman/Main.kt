package com.example.country.Halaman

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.country.R

class Main : AppCompatActivity() {
    private lateinit var rvCountry: RecyclerView
    private var list: ArrayList<Country> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main)
        val actionbar = supportActionBar
        actionbar!!.title= "ASEAN"

        rvCountry = findViewById(R.id.rv_Country)
        rvCountry.setHasFixedSize(true)

        list.addAll(CountryData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
//        TODO("Not yet implemented")
        rvCountry.layoutManager = LinearLayoutManager(this)
        val listCountryAdapter = ListCountryAdapter(list)
        rvCountry.adapter = listCountryAdapter

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_about, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.action_about -> {
                val moveIntent = Intent(this@Main, About::class.java)
                startActivity(moveIntent)
            }
        }
    }
}