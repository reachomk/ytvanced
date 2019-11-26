package defpackage;

import android.view.View;
import android.view.View.OnFocusChangeListener;

/* renamed from: jmp */
final /* synthetic */ class jmp implements OnFocusChangeListener {
    private final jml a;

    jmp(jml jml) {
        this.a = jml;
    }

    public final void onFocusChange(View view, boolean z) {
        jml jml = this.a;
        if (z) {
            jmh jmh = jml.g;
            if (jmh != null) {
                ((eyy) jmh.a.n).w = false;
            }
            if (!jml.h) {
                jml.c.setVisibility(4);
                jml.c.startAnimation(jml.d);
                jml.h = true;
            }
        }
    }
}
