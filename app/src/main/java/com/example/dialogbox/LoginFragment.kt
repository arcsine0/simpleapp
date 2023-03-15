package com.example.dialogbox

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.util.Log
import android.widget.Button
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.dialogbox.databinding.FragmentLoginBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [LoginFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class LoginFragment : Fragment() {
    // TODO: Rename and change types of parameters

    private var _binding: FragmentLoginBinding? = null

    private val binding get() = _binding!!

    private val dataModel: Data by activityViewModels()

//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//
//    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentLoginBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var username = R.id.username.toString()
        var email = R.id.email.toString()
        var pass = R.id.pass.toString()

        val signUp = view.findViewById<Button>(R.id.signUp)

        binding.signUp.setOnClickListener {
            dataModel.username.value = username
            dataModel.email.value = email
            dataModel.pass.value = pass

            findNavController().navigate(R.id.action_loginFragment_to_dashboardFragment)
        }
    }

    override fun onStart() {
        super.onStart()
        print("SimpleApp is starting!")
    }

    override fun onPause() {
        super.onPause()
        print("Hey! You paused the app!")
    }

    override fun onResume() {
        super.onResume()
        print("There you go, now continue!")
    }

    override fun onStop() {
        super.onStop()
        print("Well I guess you're done with the login page")
    }

    override fun onDestroy() {
        super.onDestroy()
        print("Woah there calm down buddy")
    }

    fun print(msg: String){
        Log.d("Activity State ",msg)
    }


}