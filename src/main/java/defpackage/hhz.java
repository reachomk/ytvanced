package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: hhz */
final class hhz implements OnClickListener {
    private final /* synthetic */ hhk a;

    hhz(hhk hhk) {
        this.a = hhk;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        ahct ahct = this.a.m;
        if (ahct != null) {
            ahct.a();
        }
    }
}
