package defpackage;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

@qlp
/* renamed from: qki */
public final class qki extends qju {
    private final pdt a;

    public qki(pdt pdt) {
        this.a = pdt;
    }

    public final roj k() {
        return null;
    }

    public final qcs l() {
        return null;
    }

    public final qcs m() {
        return null;
    }

    public final void r() {
    }

    public final String a() {
        return this.a.a;
    }

    public final List b() {
        List<pcg> list = this.a.b;
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (pcg pcg : list) {
                arrayList.add(new roi(pcg.a(), pcg.b(), pcg.c()));
            }
        }
        return arrayList;
    }

    public final String c() {
        return this.a.c;
    }

    public final roo d() {
        pcg pcg = this.a.d;
        return pcg != null ? new roi(pcg.a(), pcg.b(), pcg.c()) : null;
    }

    public final String e() {
        return this.a.e;
    }

    public final String f() {
        return this.a.f;
    }

    public final double g() {
        Double d = this.a.g;
        if (d == null) {
            return -1.0d;
        }
        return d.doubleValue();
    }

    public final String h() {
        return this.a.h;
    }

    public final String i() {
        return this.a.i;
    }

    public final rmt j() {
        pbl pbl = this.a.j;
        return pbl != null ? pbl.a() : null;
    }

    public final qcs n() {
        Object obj = this.a.k;
        return obj != null ? qct.a(obj) : null;
    }

    public final Bundle o() {
        return this.a.l;
    }

    public final boolean p() {
        return this.a.m;
    }

    public final boolean q() {
        return this.a.n;
    }

    public final void a(qcs qcs) {
        qct.a(qcs);
    }

    public final void a(qcs qcs, qcs qcs2, qcs qcs3) {
        qct.a(qcs2);
        qct.a(qcs3);
        this.a.a((View) qct.a(qcs));
    }

    public final void b(qcs qcs) {
        qct.a(qcs);
    }
}
