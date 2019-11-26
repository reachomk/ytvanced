package defpackage;

import com.google.android.youtube.R;

/* renamed from: zay */
public final class zay extends alpa implements akvp {
    public final int a(arwh arwh) {
        if (arwh == null) {
            return super.a(null);
        }
        int ordinal = arwh.ordinal();
        if (ordinal == 37) {
            return R.drawable.quantum_ic_notifications_grey600_24;
        }
        if (ordinal == 74) {
            return R.drawable.quantum_ic_cancel_grey600_24;
        }
        if (ordinal == 87) {
            return R.drawable.quantum_ic_delete_grey600_24;
        }
        if (ordinal == 178) {
            return R.drawable.quantum_ic_person_add_grey600_24;
        }
        if (ordinal != 215) {
            return ordinal != 353 ? super.a(arwh) : R.drawable.quantum_ic_content_copy_grey600_24;
        } else {
            return R.drawable.quantum_ic_notifications_off_grey600_24;
        }
    }
}
