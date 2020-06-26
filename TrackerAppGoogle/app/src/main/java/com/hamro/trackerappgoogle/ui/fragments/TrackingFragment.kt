package com.hamro.trackerappgoogle.ui.fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.hamro.trackerappgoogle.R
import com.hamro.trackerappgoogle.ui.viewmodels.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class TrackingFragment : Fragment(R.layout.fragment_tracking) {

    private val viewModel: MainViewModel by viewModels()
}