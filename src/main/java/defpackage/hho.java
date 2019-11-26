package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: hho */
final class hho implements OnClickListener {
    private final /* synthetic */ hhk a;

    hho(hhk hhk) {
        this.a = hhk;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        ahcu ahcu = this.a.n;
        if (ahcu != null) {
            if (i == 0) {
                ahcu.a();
            } else if (i == 1) {
                ahcu.b();
            }
        }
    }
}
