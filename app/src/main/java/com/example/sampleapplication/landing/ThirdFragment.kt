package com.example.sampleapplication.landing

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.result.ActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.navigation.fragment.findNavController
import com.example.sampleapplication.R
import com.example.sampleapplication.base.BaseFragment
import com.example.sampleapplication.databinding.FragmentThirdBinding
import com.example.sampleapplication.details.DetailsActivity

class ThirdFragment : BaseFragment() {
    lateinit var mBinding: FragmentThirdBinding
    private val startForResult = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result: ActivityResult ->
        if (result.resultCode == Activity.RESULT_OK) {
            val intent = result.data
            val id = intent?.getIntExtra("id", 0)
            if (id != null) {
                findNavController().navigate(R.id.action_third_to_second)
            }
        }
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        mBinding = FragmentThirdBinding.inflate(inflater, container, false)
        return mBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mBinding.btnNext.setOnClickListener {
            startForResult.launch(Intent(requireActivity(), DetailsActivity::class.java))
        }
    }
}