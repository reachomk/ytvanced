package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: ahnd */
public class ahnd extends ahor implements ahnc {
    public final ahou a;
    public boolean b = false;
    public ahnf c;
    private boolean e = true;
    private List f;

    public ahnd(ahou ahou) {
        this.a = ahou;
    }

    public void d(ahnj ahnj) {
        if (!f()) {
            List<ahmr> list = this.f;
            if (list != null) {
                for (ahmr a : list) {
                    a.a(this.b, ahnj.b);
                }
            }
        }
        super.d(ahnj);
    }

    public final boolean f(ahnj ahnj) {
        return !f() && this.e && this.a.a(ahnj).a();
    }

    public void a(boolean z, ahnj ahnj) {
        this.b = z;
        Iterator it = iterator();
        while (it.hasNext()) {
            ((ahqb) it.next()).a(z, ahnj);
        }
    }

    public void e(ahnj ahnj) {
        ahnf ahnf = this.c;
        if (ahnf != null && this.e && this.b) {
            ahnf.a();
        }
    }

    public final void a(boolean z) {
        this.e = z;
        Iterator it = iterator();
        while (it.hasNext()) {
            ahqb ahqb = (ahqb) it.next();
            if (ahqb instanceof ahnc) {
                ((ahnc) ahqb).a(z);
            }
        }
    }

    public final void b(float f, float f2, float f3) {
        super.b(f, f2, f3);
        this.a.a.b(f, f2, f3);
    }

    public final void a(ahmr ahmr) {
        if (this.f == null) {
            this.f = new ArrayList();
        }
        this.f.add(ahmr);
    }

    public final void b(float f, float f2) {
        this.a.a(f, f2);
    }
}
