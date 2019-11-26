package defpackage;

import java.util.Iterator;

/* renamed from: alut */
final /* synthetic */ class alut implements anij {
    private final aluo a;
    private final Object b;
    private final Object c;

    alut(aluo aluo, Object obj, Object obj2) {
        this.a = aluo;
        this.b = obj;
        this.c = obj2;
    }

    public final anjv a() {
        aluo aluo = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        aluu aluu = new aluu();
        aluu.a = obj2;
        aluo.a.c().a();
        aluu.c = 1;
        long a = aluo.a.a().a();
        if (a > 0) {
            long b = aluo.c.b() + (a - aluo.c.a());
            if (b <= 0) {
                b = -1;
            }
            aluu.b = b;
        } else {
            aluu.b = a;
        }
        aluo.d.a(obj, aluu);
        aluo.e.addAndGet(aluu.c);
        if (aluo.e.get() > aluo.b) {
            Iterator it = aluo.d.a().keySet().iterator();
            while (aluo.e.get() > aluo.b) {
                if (it.hasNext()) {
                    aluo.d.b(it.next());
                }
            }
        }
        return anjf.a(null);
    }
}
