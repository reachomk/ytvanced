package defpackage;

import android.text.TextUtils;
import java.util.Collection;
import java.util.HashSet;

/* renamed from: ywi */
public final /* synthetic */ class ywi implements aadl {
    private final ywa a;

    public ywi(ywa ywa) {
        this.a = ywa;
    }

    public final void a(aadk aadk) {
        ywa ywa = this.a;
        int d = aadk.d();
        int i = d - 1;
        if (d == 0) {
            throw null;
        } else if (i == 2) {
            Collection<String> b;
            Collection<String> b2;
            yvz a = ywa.a(aadk.a());
            synchronized (a.b) {
                b = a.b.b.b(a.a);
                b2 = a.b.c.b(a.a);
            }
            if (b != null) {
                for (String str : b) {
                    int a2;
                    synchronized (a.b) {
                        a2 = a.b.c.b(str, a.a) ? a.b.c.a(str) ^ 1 : 0;
                    }
                    if (a2 != 0) {
                        a.b.a.b().a(str).a();
                    }
                }
            }
            if (b2 != null) {
                Iterable hashSet = new HashSet();
                for (String str2 : b2) {
                    aadq a3 = a.b.a.a(str2);
                    if (a3 instanceof ykk) {
                        apsz apsz = (apsz) ((ykk) a3).getEntity();
                        apsy e = apsz.e();
                        e.a();
                        for (String equals : apsz.b()) {
                            if (!TextUtils.equals(equals, a.a)) {
                                e.a((String) r4.next());
                            }
                        }
                        hashSet.add(ykk.a((apsz) e.a(a.b.a)));
                    }
                }
                if (!hashSet.isEmpty()) {
                    a.b.a.b().a(hashSet).a();
                }
            }
        }
    }
}
