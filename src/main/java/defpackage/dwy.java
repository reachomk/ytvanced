package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: dwy */
final /* synthetic */ class dwy implements OnClickListener {
    private final dwv a;

    dwy(dwv dwv) {
        this.a = dwv;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        dwv dwv = this.a;
        dwv.b.startActivity(dwv.d());
    }
}
