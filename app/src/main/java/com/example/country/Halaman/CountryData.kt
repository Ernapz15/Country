package com.example.country.Halaman

import com.example.country.R
import java.util.ArrayList

object CountryData {
    private val Countryname = arrayOf(
        "Indonesia",
        "Malaysia",
        "Thailand",
        "Singapura",
        "Filipina",
        "Vietnam",
        "Brunei",
        "Laos",
        "Myanmar",
        "Kamboja"
    )

    private val CountryDetail = arrayOf(
        "Indonesia adalah negara kepulauan terbesar di dunia, terletak di Asia Tenggara. Dengan lebih dari 17.000 pulau, Indonesia memiliki keanekaragaman budaya, bahasa, dan tradisi yang luar biasa. Bali, salah satu pulau terkenal di Indonesia, adalah tujuan pariwisata populer dengan pantai-pantai yang indah dan budaya yang kaya.",
        "Malaysia adalah negara multikultural yang kaya akan sejarah dan warisan. Kuala Lumpur, ibu kotanya, menawarkan kontras antara pencakar langit modern seperti Petronas Twin Towers dan kuil-kuil tradisional yang indah.",
        "Thailand, yang sering disebut sebagai \"The Land of Smiles,\" dikenal karena keramahan penduduknya. Negara ini memiliki warisan budaya yang kaya, termasuk kuil-kuil Buddha yang indah di Bangkok, serta pantai-pantai eksotis di Phuket dan Krabi.",
        "Singapura adalah negara kota yang sangat maju dan modern. Terkenal dengan kebijakan efisiensinya, negara ini menawarkan berbagai atraksi wisata seperti Universal Studios, Gardens by the Bay, dan hiburan malam yang hidup di Clarke Quay.",
        "Filipina adalah negara kepulauan yang menawarkan keindahan alam yang menakjubkan. Dari pantai putih di Boracay hingga terumbu karang spektakuler di Palawan, negara ini adalah surga bagi pecinta alam.",
        "Vietnam memiliki sejarah yang kaya dengan pengaruh budaya Prancis yang masih terlihat dalam arsitektur dan masakan. Kota-kota seperti Hanoi dan Ho Chi Minh City menawarkan pengalaman budaya yang unik, sementara Halong Bay adalah salah satu tujuan wisata alam terbaik di dunia.",
        "Negara kecil Brunei terkenal dengan kekayaannya yang besar karena sumber daya alamnya, terutama minyak dan gas. Ia juga memiliki masjid-masjid megah seperti Masjid Sultan Omar Ali Saifuddien.",
        "Laos adalah negara dengan lanskap pegunungan yang indah dan sungai-sungai yang memikat seperti Mekong. Vientiane, ibu kotanya, adalah kota dengan arsitektur yang indah dan budaya yang ramah.",
        "Myanmar memiliki warisan budaya yang kuat, terutama ditemukan di Kuil Angkor Wat yang menakjubkan di Bagan. Selain itu, negara ini memiliki keindahan alam yang belum terjamah seperti Danau Inle dan pegunungan di utara.",
        "Kamboja terkenal dengan Kuil Angkor Wat yang ikonik, yang merupakan salah satu situs bersejarah terbesar di dunia. Selain itu, negara ini memiliki pantai-pantai yang indah di sepanjang pantai Teluk Thailand dan kehidupan pedesaan yang mempesona."
    )



    private val CountryImages = intArrayOf(
        R.drawable.indonesia,
        R.drawable.malaysia,
        R.drawable.thailand,
        R.drawable.singapura,
        R.drawable.filipina,
        R.drawable.vietnam,
        R.drawable.brunei_darusalam,
        R.drawable.laos,
        R.drawable.myanmar,
        R.drawable.kamboja
    )

    val listData: ArrayList<Country>
        get() {
            val list = arrayListOf<Country>()
            for (position in Countryname.indices) {
                val Country = Country()
                Country.name= Countryname[position]
                Country.detail = CountryDetail[position]
                Country.photo = CountryImages[position]
                list.add(Country)
            }
            return list
        }
}