package defpackage;

import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: wh */
class wh extends vw {
    private final WeakReference a;

    wh(wc wcVar) {
        this.a = new WeakReference(wcVar);
    }

    public final void b() {
    }

    public final void a(String str, Bundle bundle) {
        wc wcVar = (wc) this.a.get();
        if (wcVar != null) {
            wcVar.a(1, str, bundle);
        }
    }

    public void a() {
        wc wcVar = (wc) this.a.get();
        if (wcVar != null) {
            wcVar.a(8, null, null);
        }
    }

    public final void a(xs xsVar) {
        wc wcVar = (wc) this.a.get();
        if (wcVar != null) {
            wcVar.a(2, xsVar, null);
        }
    }

    public void a(vj vjVar) {
        wc wcVar = (wc) this.a.get();
        if (wcVar != null) {
            wcVar.a(3, vjVar, null);
        }
    }

    public void a(List list) {
        wc wcVar = (wc) this.a.get();
        if (wcVar != null) {
            wcVar.a(5, list, null);
        }
    }

    public void a(CharSequence charSequence) {
        wc wcVar = (wc) this.a.get();
        if (wcVar != null) {
            wcVar.a(6, charSequence, null);
        }
    }

    public final void a(boolean z) {
        wc wcVar = (wc) this.a.get();
        if (wcVar != null) {
            wcVar.a(11, Boolean.valueOf(z), null);
        }
    }

    public final void a(int i) {
        wc wcVar = (wc) this.a.get();
        if (wcVar != null) {
            wcVar.a(9, Integer.valueOf(i), null);
        }
    }

    public final void b(int i) {
        wc wcVar = (wc) this.a.get();
        if (wcVar != null) {
            wcVar.a(12, Integer.valueOf(i), null);
        }
    }

    public void a(Bundle bundle) {
        wc wcVar = (wc) this.a.get();
        if (wcVar != null) {
            wcVar.a(7, bundle, null);
        }
    }

    public void a(xq xqVar) {
        wc wcVar = (wc) this.a.get();
        if (wcVar != null) {
            Object wmVar;
            if (xqVar != null) {
                int i = xqVar.a;
                i = xqVar.b;
                int i2 = xqVar.c;
                i2 = xqVar.d;
                int i3 = xqVar.e;
                wmVar = new wm(i);
            } else {
                wmVar = null;
            }
            wcVar.a(4, wmVar, null);
        }
    }

    public final void c() {
        wc wcVar = (wc) this.a.get();
        if (wcVar != null) {
            wcVar.a(13, null, null);
        }
    }
}
