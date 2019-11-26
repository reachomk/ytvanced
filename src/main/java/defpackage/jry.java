package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: jry */
final /* synthetic */ class jry implements OnClickListener {
    private final jrx a;

    jry(jrx jrx) {
        this.a = jrx;
    }

    public final void onClick(View view) {
        jrx jrx = this.a;
        Object obj = jrx.c;
        if (obj != null && (obj.a & 128) != 0) {
            Object obj2 = obj.i;
            if (obj2 == null) {
                obj2 = apxu.d;
            }
            jrx.a(obj, amul.a(obj2));
        }
    }
}
