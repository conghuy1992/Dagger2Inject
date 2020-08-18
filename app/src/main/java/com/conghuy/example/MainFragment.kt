package com.conghuy.example

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.conghuy.example.databinding.MainFragmentBinding
import com.conghuy.example.di.MyApplication
import javax.inject.Inject

class MainFragment : Fragment() {
    var index: Int = 0

    @Inject
    lateinit var networkApi: NetworkApi
    private lateinit var binding: MainFragmentBinding
    override fun onAttach(context: Context) {
        (requireActivity().applicationContext as MyApplication).appComponent.inject(this)
        super.onAttach(context)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(
            inflater, R.layout.main_fragment, container, false
        )
        //        binding.setViewModel(viewModel);
        binding.lifecycleOwner = this
        return binding.root
        //here data must be an instance of the class MarsDataProvider
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView() {
        //        TextView userAvailable = (TextView) v.findViewById(R.id.target);

        index = requireActivity().intent.getIntExtra("key", 0)
        networkApi.age += index
        binding.target.text = "MainFragment $index worked: ${networkApi.name} - ${networkApi.age}"
        binding.next.setOnClickListener {
            var i = Intent(activity, MyActivity::class.java)
            i.putExtra("key",   networkApi.age )
            startActivity(i)
        }
    }
}