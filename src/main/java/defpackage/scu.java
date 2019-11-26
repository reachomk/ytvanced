package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: scu */
final class scu implements OnClickListener {
    private final /* synthetic */ scs a;

    scu(scs scs) {
        this.a = scs;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.c.cancel();
    }
}
