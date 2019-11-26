package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: vik */
final class vik {
    public final boolean a;
    public final List b;
    public final anko c;
    public int d = -1;
    public boolean e;
    public wxf f;
    private int g = 0;

    vik(aakj aakj) {
        boolean z;
        List<aogi> q = aakj.q();
        if (!(q == null || q.isEmpty())) {
            for (aogi aogi : q) {
                Iterator it = aogi.c.iterator();
                if (it.hasNext()) {
                    if ((((aogm) it.next()).a & 32) != 0) {
                        z = true;
                        this.a = z;
                        this.b = new ArrayList();
                        this.c = anko.f();
                        this.e = false;
                        this.f = null;
                    }
                }
            }
        }
        z = false;
        this.a = z;
        this.b = new ArrayList();
        this.c = anko.f();
        this.e = false;
        this.f = null;
    }

    /* Access modifiers changed, original: final */
    public final vio a() {
        int i = this.d;
        if (i != -1) {
            if (i < 0 || i >= this.b.size()) {
                afpc.a(2, afpf.ad, "activeAdSequenceIndex out of bounds.");
            } else {
                i = this.g;
                if (i >= 0 && i < ((vir) this.b.get(this.d)).size()) {
                    return (vio) ((vir) this.b.get(this.d)).get(this.g);
                }
                afpc.a(2, afpf.ad, "activeAdSequenceOffsetIndex out of bounds.");
                return null;
            }
        }
        return null;
    }

    /* Access modifiers changed, original: final */
    public final void a(vio vio) {
        if (vio != null) {
            for (int i = 0; i < this.b.size(); i++) {
                for (int i2 = 0; i2 < ((vir) this.b.get(i)).size(); i2++) {
                    if (vio.equals(((vir) this.b.get(i)).get(i2))) {
                        this.d = i;
                        this.g = i2;
                        return;
                    }
                }
            }
            xtl.c("Tried to set active AdUnitState to an AUS that doesn't exist for the break. This should never happen");
            return;
        }
        this.d = -1;
        this.g = 0;
    }

    /* Access modifiers changed, original: final */
    public final vir b() {
        int i = this.d + 1;
        return i < this.b.size() ? (vir) this.b.get(i) : null;
    }
}
