package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;

/* renamed from: jfo */
final class jfo implements OnDismissListener {
    private final /* synthetic */ jfm a;

    jfo(jfm jfm) {
        this.a = jfm;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        this.a.b = false;
    }
}
