package defpackage;

import android.view.View;
import android.view.View.OnLongClickListener;

/* renamed from: cmv */
public final class cmv implements OnLongClickListener {
    public coj a;

    cmv() {
    }

    public final boolean onLongClick(View view) {
        coj coj = this.a;
        if (coj == null) {
            return false;
        }
        if (cok.c == null) {
            cok.c = new cpv();
        }
        cok.c.a = view;
        boolean booleanValue = ((Boolean) coj.a.m().a(coj, cok.c)).booleanValue();
        cok.c.a = null;
        return booleanValue;
    }
}
