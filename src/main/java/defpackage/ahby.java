package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

/* renamed from: ahby */
final /* synthetic */ class ahby implements OnCancelListener {
    private final ahbz a;

    ahby(ahbz ahbz) {
        this.a = ahbz;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        ahbz ahbz = this.a;
        ahbz.l.onClick(ahbz.j);
    }
}
