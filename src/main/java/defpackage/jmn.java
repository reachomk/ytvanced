package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: jmn */
final /* synthetic */ class jmn implements OnClickListener {
    private final jml a;

    jmn(jml jml) {
        this.a = jml;
    }

    public final void onClick(View view) {
        jml jml = this.a;
        jml.b.clearFocus();
        jmh jmh = jml.g;
        if (jmh != null) {
            jmh.a();
        }
        xpr.a(jml.b);
        if (jml.e) {
            jml.d();
            jml.a(true);
            return;
        }
        jml.d();
        jml.e();
    }
}
