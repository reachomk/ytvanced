package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: jem */
final /* synthetic */ class jem implements OnClickListener {
    private final jed a;
    private final jfb b;

    jem(jed jed, jfb jfb) {
        this.a = jed;
        this.b = jfb;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        jed jed = this.a;
        jfb jfb = this.b;
        jed.g = jfb.b();
        jed.e.setText(jed.g);
        jed.k = jfb.a();
        dialogInterface.dismiss();
    }
}
