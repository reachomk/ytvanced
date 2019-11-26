package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: hhw */
final class hhw implements OnClickListener {
    private final /* synthetic */ hhk a;

    hhw(hhk hhk) {
        this.a = hhk;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        ahcs ahcs = this.a.l;
        if (ahcs != null) {
            ahcs.a();
        }
    }
}
