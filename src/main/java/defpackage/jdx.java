package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: jdx */
final /* synthetic */ class jdx implements OnClickListener {
    private final jdv a;

    jdx(jdv jdv) {
        this.a = jdv;
    }

    public final void onClick(View view) {
        jdv jdv = this.a;
        if (jdv.d != null || jdv.a(jdv.c) != null) {
            if (jdv.d == null) {
                jdv.d = jdv.a(jdv.c).create();
            }
            jdv.d.show();
        }
    }
}
