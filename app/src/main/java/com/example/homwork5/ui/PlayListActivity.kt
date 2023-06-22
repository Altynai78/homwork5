package com.example.homwork5.ui

import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.example.homwork5.bace.BaseActivity
import com.example.homwork5.ui.MainActivity.Companion.KEY_FOR_ID

class PlaylistActivity : BaseActivity<ActivityPlaylistBinding, PlaylistViewModel>() {
    override fun inflateViewBinding(): ActivityPlaylistBinding {
        return ActivityPlaylistBinding.inflate(layoutInflater)
    }

    override fun setViewModel(): PlaylistViewModel {
        return ViewModelProvider(this)[PlaylistViewModel::class.java]
    }

    override fun checkInternet() {
        super.checkInternet()
        ConnectionLiveData(application).observe(this) {
            if (it){
                binding.clNoInternet.isVisible = false
                binding.llMainLayout.isVisible = true
            } else {
                binding.clNoInternet.isVisible = true
                binding.llMainLayout.isVisible = false
            }
        }
    }

    override fun setUI() {
        super.setUI()
        Toast.makeText(this, intent.getStringExtra(KEY_FOR_ID), Toast.LENGTH_SHORT).show()
    }


}