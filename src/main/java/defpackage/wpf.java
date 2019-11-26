package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

/* renamed from: wpf */
final /* synthetic */ class wpf implements OnCancelListener {
    private final woy a;

    wpf(woy woy) {
        this.a = woy;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        woy woy = this.a;
        if (woy.j.j.size() > 0) {
            woy.a.a(woy.j.j, null);
        }
    }
}
