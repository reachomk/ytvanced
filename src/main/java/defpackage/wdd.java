package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;

/* renamed from: wdd */
final /* synthetic */ class wdd implements OnDismissListener {
    private final wda a;

    wdd(wda wda) {
        this.a = wda;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        this.a.b();
    }
}
