package defpackage;

import com.google.android.youtube.R;

/* renamed from: alpd */
public final class alpd extends alpa {
    public final int a(arwh arwh) {
        if (arwh == null) {
            return 0;
        }
        int ordinal = arwh.ordinal();
        if (ordinal == 178) {
            return R.drawable.quantum_ic_person_add_grey600_18;
        }
        if (ordinal == 217) {
            return R.drawable.quantum_ic_done_white_24;
        }
        if (ordinal != 359) {
            return ordinal != 391 ? super.a(arwh) : R.drawable.quantum_ic_link_white_24;
        } else {
            return R.drawable.quantum_ic_more_horiz_white_24;
        }
    }
}
