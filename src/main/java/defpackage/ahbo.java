package defpackage;

import java.util.HashSet;

/* renamed from: ahbo */
final /* synthetic */ class ahbo implements ahct {
    private final ahbk a;
    private final String b;

    ahbo(ahbk ahbk, String str) {
        this.a = ahbk;
        this.b = str;
    }

    public final void a() {
        ahbk ahbk = this.a;
        String str = this.b;
        if (ahbk.b.c()) {
            HashSet hashSet = new HashSet();
            if (str == null) {
                for (agqp agqp : ahbk.a().k().e()) {
                    if (hashSet.add(agqp.a())) {
                        agqy a = ahbk.a().k().a(agqp.a());
                        if (a != null && a.x()) {
                            ahbk.a().k().c(a.a());
                        }
                    }
                }
                return;
            }
            for (agqy agqy : ahbk.a().n().e(str)) {
                if (hashSet.add(agqy.a()) && agqy.x()) {
                    ahbk.a().n().a(str, agqy.a());
                }
            }
            return;
        }
        ahbk.c.a();
    }
}
