package com.example.customdailogbottomshitandroid.utils

import android.app.Dialog
import android.content.Context
import android.view.LayoutInflater
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.customdailogbottomshitandroid.R
import com.example.customdailogbottomshitandroid.databinding.CustomDialogLayoutBinding

class DialogUtils {

    companion object {

        fun customDialog(context: Context){

            val dialog = AlertDialog.Builder(context ,0).create()
            val binding = CustomDialogLayoutBinding.inflate(LayoutInflater.from(context))
            dialog.setView(binding.root)
            binding.btnOk.setOnClickListener {
                Toast.makeText(context,"",Toast.LENGTH_SHORT).show()
                dialog.dismiss()
            }
            dialog.setCanceledOnTouchOutside(false)
            dialog.show()
        }
    }
}