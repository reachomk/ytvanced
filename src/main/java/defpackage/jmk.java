package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: jmk */
final /* synthetic */ class jmk implements OnClickListener {
    private final jml a;

    jmk(jml jml) {
        this.a = jml;
    }

    public final void onClick(View view) {
        jml jml = this.a;
        jml.d();
        if (!jml.b.hasFocus()) {
            jml.b.requestFocus();
            xpr.b(jml.b);
        }
    }
}
