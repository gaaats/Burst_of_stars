package com.moonton.mo.gaaaaaaememem

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.moonton.mo.R
import com.moonton.mo.databinding.FragmentGaaaaame4Binding
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.random.Random


class Gaaaaame4Fragment : Fragment() {
    var eachMissileDamage = 30

    private val timeForReloadingMissiles: Int = 1
    var missileCounter = 0

    var enemyHealth = 100
    var totalDamge = 0

    private var fragmentGameeeBinding: FragmentGaaaaame4Binding? = null
    private val binding
        get() = fragmentGameeeBinding ?: throw RuntimeException("FragmentGameeeBinding = null")


    private val listMissile by lazy {
        listOf(
            binding.imgMissile1,
            binding.imgMissile2,
            binding.imgMissile3,
            binding.imgMissile4,
            binding.imgMissile5,
            binding.imgMissile6,
            binding.imgMissile7,
            binding.imgMissile8,
            binding.imgMissile9,
            binding.imgMissile10,
        ).shuffled()
    }

    private fun generateRandomDamage() = Random.nextInt(from = 1, until = eachMissileDamage)

    private var totalBalance = 1000

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentGameeeBinding = FragmentGaaaaame4Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {


            var ttt = "$totalDamge/100"
            binding.enemyHealth.text = ttt


            binding.btnMakeDamage.setOnClickListener {

                missileCounter++

                val damage = generateRandomDamage()
                totalDamge += damage

                Snackbar.make(
                    binding.root,
                    "Hummer made $damage gold",
                    Snackbar.LENGTH_LONG
                ).show()

                ttt = "$totalDamge/100"
                binding.enemyHealth.text = ttt

                enemyHealth -= damage

                makeBtnUnActiove()
                launchSingleMissile()

                binding.progBarHalth.progress = totalDamge

                if (missileCounter == 10 || totalDamge >= 100) {
                    if (totalDamge >= 100) {
                        lifecycleScope.launch {
                            Toast.makeText(
                                requireContext(),
                                "Done! Earn 154 points!",
                                Toast.LENGTH_SHORT
                            ).show()
                            delay(2000)
                            findNavController().navigate(R.id.action_gaaaaame4Fragment_to_gaaaaaaaame5Fragment)
                        }

                    } else {
                        lifecycleScope.launch {
                            Toast.makeText(
                                requireContext(),
                                "Lose! Lose 154 points!",
                                Toast.LENGTH_SHORT
                            ).show()
                            delay(2000)
                            findNavController().navigate(R.id.action_gaaaaame4Fragment_to_gaaaaaaaame5Fragment)
                        }
                    }
//                    makeExplosionAndGoNext()

                } else {
                    makeExplosion()
                }
            }


        } catch (e: Exception) {
            vfvvf()
        }


        super.onViewCreated(view, savedInstanceState)
    }

    private fun makeExplosion() {
        lifecycleScope.launch {

            binding.lotExplosion.visibility = View.VISIBLE
            delay(1200)
            binding.lotExplosion.visibility = View.GONE

        }
    }

    private fun makeExplosionAndGoNext() {
        lifecycleScope.launch {

            binding.lotExplosion.visibility = View.VISIBLE
            delay(1200)
            binding.lotExplosion.visibility = View.GONE

            findNavController().navigate(R.id.action_gaaaaame4Fragment_to_gaaaaaaaame5Fragment)

        }
    }

    private fun makeBtnUnActiove() {

        if (missileCounter == 10) {
            binding.btnMakeDamage.alpha = 0.3f
            binding.btnMakeDamage.isEnabled = false
            binding.btnMakeDamage.text = "All missiles already used"

        } else {
            lifecycleScope.launch {
                var counter = 1
                binding.btnMakeDamage.alpha = 0.3f
                binding.btnMakeDamage.isEnabled = false

                repeat(counter) {
                    if (counter > 0) {
                        binding.btnMakeDamage.text = "Reloading...$counter"
                        delay(1000)
                        counter -= 1
                    }
                }
                binding.btnMakeDamage.text = "use hummer"
                binding.btnMakeDamage.alpha = 1f
                binding.btnMakeDamage.isEnabled = true
            }
        }
    }

    private fun makeMissileNormal() {
        for (i in listMissile) {
            i.alpha = 1f
        }
    }


    private fun launchSingleMissile() {

        for (i in listMissile) {
            if (i.alpha == 1f) {
                i.alpha = 0.3f
                return
            }
        }
    }


    override fun onPause() {
        onDestroy()
        super.onPause()
    }

    override fun onDestroy() {
        fragmentGameeeBinding = null
        super.onDestroy()
    }

    private fun vfvvf() {
        Snackbar.make(
            binding.root,
            "Some error...",
            Snackbar.LENGTH_LONG
        ).show()
        requireActivity().onBackPressed()
    }


}