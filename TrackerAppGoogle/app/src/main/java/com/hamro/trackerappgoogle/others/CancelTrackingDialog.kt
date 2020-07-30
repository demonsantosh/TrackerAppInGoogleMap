package com.hamro.trackerappgoogle.others

import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.DialogFragment
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.hamro.trackerappgoogle.R

class CancelTrackingDialog : DialogFragment() {
    private var yesListiner: (()-> Unit)?=null
    fun setYesListiner(listiner : () -> Unit){
        yesListiner=listiner
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return MaterialAlertDialogBuilder(requireContext(), R.style.AlertDialogTheme)
            .setTitle("Cancel the Run?")
            .setMessage("Are you sure to cancel the current run and delete all its data?")
            .setIcon(R.drawable.ic_delete)
            .setPositiveButton("Yes") { _, _ ->
               yesListiner?.let { yes ->
                   yes()
               }
            }
            .setNegativeButton("No") { dialogInterface, _ ->
                dialogInterface.cancel()
            }
            .create()
    }
}