package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: jek */
final /* synthetic */ class jek implements OnClickListener {
    private final jed a;
    private final jfb b;

    jek(jed jed, jfb jfb) {
        this.a = jed;
        this.b = jfb;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        jed jed = this.a;
        jfb jfb = this.b;
        jed.h = jfb.b();
        jed.f.setText(jed.h);
        jed.l = jfb.a();
        dialogInterface.dismiss();
    }
}
