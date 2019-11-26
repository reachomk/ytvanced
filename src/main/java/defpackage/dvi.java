package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

/* renamed from: dvi */
final class dvi implements OnCancelListener {
    private final /* synthetic */ dvg a;

    dvi(dvg dvg) {
        this.a = dvg;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.a.finish();
    }
}
