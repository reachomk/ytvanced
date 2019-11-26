package defpackage;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

@qlp
/* renamed from: qjx */
public final class qjx extends qjq {
    private final pdm a;

    public qjx(pdm pdm) {
        this.a = pdm;
    }

    public final void i() {
    }

    public final qcs n() {
        return null;
    }

    public final roj o() {
        return null;
    }

    public final qcs p() {
        return null;
    }

    public final qcs q() {
        return null;
    }

    public final String a() {
        return this.a.a;
    }

    public final List b() {
        List<pcg> list = this.a.b;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (pcg pcg : list) {
            arrayList.add(new roi(pcg.a(), pcg.b(), pcg.c()));
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

    public final double f() {
        return this.a.f;
    }

    public final String g() {
        return this.a.g;
    }

    public final String h() {
        return this.a.h;
    }

    public final void a(qcs qcs) {
        qct.a(qcs);
    }

    public final void b(qcs qcs) {
        this.a.a((View) qct.a(qcs));
    }

    public final void a(qcs qcs, qcs qcs2, qcs qcs3) {
        qct.a(qcs2);
        qct.a(qcs3);
        qct.a(qcs);
    }

    public final void c(qcs qcs) {
        qct.a(qcs);
    }

    public final boolean j() {
        return this.a.i;
    }

    public final boolean k() {
        return this.a.j;
    }

    public final Bundle l() {
        return this.a.k;
    }

    public final rmt m() {
        pbl pbl = this.a.l;
        return pbl != null ? pbl.a() : null;
    }
}
