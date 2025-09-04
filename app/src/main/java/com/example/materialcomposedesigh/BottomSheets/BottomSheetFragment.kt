import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.core.content.ContextCompat
import com.example.materialcomposedesigh.R
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class MyBottomSheetFragment : BottomSheetDialogFragment() {

    companion object {
        private const val ARG_EXPAND_FULLY = "expand_fully"

        fun newInstance(expandFully: Boolean): MyBottomSheetFragment {
            val fragment = MyBottomSheetFragment()
            val args = Bundle()
            args.putBoolean(ARG_EXPAND_FULLY, expandFully)
            fragment.arguments = args
            return fragment
        }
    }

    override fun onStart() {
        super.onStart()

        val expandFully = arguments?.getBoolean(ARG_EXPAND_FULLY, false) ?: false

        val bottomSheet =
            dialog?.findViewById<View>(com.google.android.material.R.id.design_bottom_sheet)
        bottomSheet?.background = ContextCompat.getDrawable(requireContext(), R.drawable.bg_rounded_corners)
        bottomSheet?.clipToOutline = true
        val behavior = BottomSheetBehavior.from(bottomSheet!!)

        if (expandFully) {
            // Устанавливаем высоту на весь экран
            bottomSheet.layoutParams.height = ViewGroup.LayoutParams.MATCH_PARENT
            bottomSheet.requestLayout()

            behavior.state = BottomSheetBehavior.STATE_EXPANDED
        } else {
            // Высота наполовину экрана
            bottomSheet.layoutParams.height = ViewGroup.LayoutParams.MATCH_PARENT
            bottomSheet.requestLayout()
            behavior.state = BottomSheetBehavior.STATE_HALF_EXPANDED
            behavior.isFitToContents = false
            behavior.expandedOffset = 0
        }

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.bottom_sheet_content, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val hideButton = view.findViewById<Button>(R.id.button_hide_bottom_sheet)
        hideButton.setOnClickListener {
            dismiss()
        }
    }

}


