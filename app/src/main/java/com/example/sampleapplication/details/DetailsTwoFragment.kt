package com.example.sampleapplication.details

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.sampleapplication.R
import com.example.sampleapplication.base.BaseFragment
import com.example.sampleapplication.databinding.FragmentDetailsTwoBinding

class DetailsTwoFragment : BaseFragment(){

    lateinit var mBinding: FragmentDetailsTwoBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        mBinding = FragmentDetailsTwoBinding.inflate(inflater, container, false)
        return mBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mBinding.btnNext.setOnClickListener {
            requireActivity().finish()
        }
        mBinding.btnNext1.setOnClickListener {
            val intent = Intent()
            intent.putExtra("id", R.id.action_first_to_second)
            requireActivity().setResult(Activity.RESULT_OK, intent)
            requireActivity().finish()
        }
    }
}