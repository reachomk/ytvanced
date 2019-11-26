package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;

/* renamed from: hkd */
final /* synthetic */ class hkd implements OnDismissListener {
    private final hka a;

    hkd(hka hka) {
        this.a = hka;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        ((acvx) this.a.a.a.get()).a();
    }
}
