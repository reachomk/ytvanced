package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

/* renamed from: scv */
final class scv implements OnCancelListener {
    private final /* synthetic */ scs a;

    scv(scs scs) {
        this.a = scs;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.a.c.cancel();
    }
}
