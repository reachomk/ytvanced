package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: hhm */
final class hhm implements OnClickListener {
    private final /* synthetic */ hhk a;

    hhm(hhk hhk) {
        this.a = hhk;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        ahct ahct = this.a.o;
        if (ahct != null) {
            ahct.a();
        }
    }
}
