package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;

/* renamed from: jgo */
final /* synthetic */ class jgo implements OnDismissListener {
    private final jgm a;

    jgo(jgm jgm) {
        this.a = jgm;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        jgm jgm = this.a;
        jgm.a.b(jgm);
    }
}
