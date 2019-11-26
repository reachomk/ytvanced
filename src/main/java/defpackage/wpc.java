package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnShowListener;

/* renamed from: wpc */
final /* synthetic */ class wpc implements OnShowListener {
    private final woy a;

    wpc(woy woy) {
        this.a = woy;
    }

    public final void onShow(DialogInterface dialogInterface) {
        woy woy = this.a;
        if (woy.j.i.size() > 0) {
            woy.a.a(woy.j.i, null);
        }
    }
}
