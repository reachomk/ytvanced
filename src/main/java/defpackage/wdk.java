package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;

/* renamed from: wdk */
final /* synthetic */ class wdk implements OnDismissListener {
    private final wda a;

    wdk(wda wda) {
        this.a = wda;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        this.a.b();
    }
}
