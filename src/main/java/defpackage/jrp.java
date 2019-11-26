package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: jrp */
final /* synthetic */ class jrp implements OnClickListener {
    private final jro a;

    jrp(jro jro) {
        this.a = jro;
    }

    public final void onClick(View view) {
        jro jro = this.a;
        Object obj = jro.c;
        Object obj2 = obj.l;
        if (obj2 == null) {
            obj2 = apxu.d;
        }
        jro.a(obj, amul.a(obj2));
    }
}
