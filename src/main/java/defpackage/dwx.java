package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: dwx */
final /* synthetic */ class dwx implements OnClickListener {
    private final dwv a;

    dwx(dwv dwv) {
        this.a = dwv;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        dwv dwv = this.a;
        dwv.b.startActivity(dwv.d());
    }
}
