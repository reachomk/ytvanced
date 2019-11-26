package defpackage;

import java.util.ArrayList;

/* renamed from: dn */
public class dn extends dh {
    public final ArrayList af = new ArrayList();

    public void a() {
        this.af.clear();
        super.a();
    }

    public final void a(dh dhVar) {
        this.af.remove(dhVar);
        dhVar.r = null;
    }

    public final void a(int i, int i2) {
        super.a(i, i2);
        i = this.af.size();
        for (i2 = 0; i2 < i; i2++) {
            ((dh) this.af.get(i2)).a(this.w + this.A, this.x + this.B);
        }
    }

    public final void m() {
        super.m();
        ArrayList arrayList = this.af;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                dh dhVar = (dh) this.af.get(i);
                dhVar.a(h(), i());
                if (!(dhVar instanceof dg)) {
                    dhVar.m();
                }
            }
        }
    }

    public void b() {
        m();
        ArrayList arrayList = this.af;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                dh dhVar = (dh) this.af.get(i);
                if (dhVar instanceof dn) {
                    ((dn) dhVar).b();
                }
            }
        }
    }

    public final void a(cz czVar) {
        super.a(czVar);
        int size = this.af.size();
        for (int i = 0; i < size; i++) {
            ((dh) this.af.get(i)).a(czVar);
        }
    }
}
