package defpackage;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: jtd */
public final class jtd extends apv {
    public final Map a = new HashMap();
    public final Set b = new HashSet();
    private final acvx c;
    private final aaas d;
    private final Rect e = new Rect();
    private boolean f;

    public jtd(acvx acvx, aaas aaas) {
        this.c = acvx;
        this.d = aaas;
    }

    public final void a(RecyclerView recyclerView, int i) {
        if (i != 1) {
            if (i == 0) {
                this.f = false;
            }
            return;
        }
        this.f = true;
    }

    public final void a(RecyclerView recyclerView, int i, int i2) {
        Object obj = null;
        if (this.f || (i == 0 && i2 == 0)) {
            obj = 1;
        }
        if (!this.a.isEmpty() && obj != null) {
            Iterator it = this.a.entrySet().iterator();
            while (it.hasNext()) {
                Entry entry = (Entry) it.next();
                jtc jtc = (jtc) entry.getValue();
                if (abe.H(jtc.a) && jtc.a.getGlobalVisibleRect(this.e)) {
                    it.remove();
                    this.b.add(entry.getKey());
                    byte[] bArr = jtc.b;
                    if (bArr != null) {
                        this.c.a(bArr, null);
                    }
                    apxu apxu = jtc.c;
                    if (apxu != null) {
                        this.d.a(apxu, null);
                    }
                }
            }
        }
    }

    public final void a(Object obj, View view, byte[] bArr, apxu apxu) {
        if (obj != null && view != null) {
            if ((bArr != null || apxu != null) && !this.b.contains(obj)) {
                this.a.put(obj, new jtc(view, bArr, apxu));
            }
        }
    }
}
