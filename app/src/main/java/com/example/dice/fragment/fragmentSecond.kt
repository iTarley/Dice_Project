package com.example.dice.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.example.dice.MainActivity
import com.example.dice.R


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [fragmentSecond.newInstance] factory method to
 * create an instance of this fragment.
 */
class fragmentSecond : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment fragmentSecond.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            fragmentSecond().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val btnRandom = view.findViewById<Button>(R.id.btnRandom)

        btnRandom.setOnClickListener(){
            rollDice1()
            rollDice2()

        }
    }

    private fun rollDice1() {
        val dice = MainActivity.Dice(6)
        val diceroll = dice.roll()
        val diceImage = view?.findViewById<ImageView>(R.id.dice1)
        when (diceroll) {
            1 -> diceImage?.setImageResource(R.drawable.dice_1)
            2 -> diceImage?.setImageResource(R.drawable.dice_2)
            3 -> diceImage?.setImageResource(R.drawable.dice_3)
            4 -> diceImage?.setImageResource(R.drawable.dice_4)
            5 -> diceImage?.setImageResource(R.drawable.dice_5)
            6 -> diceImage?.setImageResource(R.drawable.dice_6)

        }

    }
    private fun rollDice2() {
        val dice = MainActivity.Dice(6)
        val diceroll = dice.roll()
        val diceImage = view?.findViewById<ImageView>(R.id.dice2)
        when (diceroll) {
            1 -> diceImage?.setImageResource(R.drawable.dice_1)
            2 -> diceImage?.setImageResource(R.drawable.dice_2)
            3 -> diceImage?.setImageResource(R.drawable.dice_3)
            4 -> diceImage?.setImageResource(R.drawable.dice_4)
            5 -> diceImage?.setImageResource(R.drawable.dice_5)
            6 -> diceImage?.setImageResource(R.drawable.dice_6)

        }

    }

}

