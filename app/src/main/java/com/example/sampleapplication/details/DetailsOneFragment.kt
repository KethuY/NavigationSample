package com.example.sampleapplication.details

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.sampleapplication.R
import com.example.sampleapplication.base.BaseFragment
import com.example.sampleapplication.databinding.FragmentDetailsOneBinding

class DetailsOneFragment : BaseFragment(){

    lateinit var mBinding: FragmentDetailsOneBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        mBinding = FragmentDetailsOneBinding.inflate(inflater, container, false)
        return mBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mBinding.btnNext.setOnClickListener {
            findNavController().navigate(R.id.action_detailsOneFragment_to_detailsTwoFragment)
        }
    }
}