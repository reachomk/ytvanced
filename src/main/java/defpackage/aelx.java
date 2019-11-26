package defpackage;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: aelx */
public final class aelx {
    private final boolean a;
    private final xsc b;
    private final HashMap c = new HashMap();

    public aelx(xsc xsc, boolean z) {
        this.b = xsc;
        this.a = z;
    }

    public final synchronized void a(String str, double d) {
        c();
        aenj aenj = (aenj) this.c.get(str);
        if (aenj == null) {
            aenj = new aenj(this.a);
            this.c.put(str, aenj);
        }
        aenj.b = this.b.b();
        aenj.a.a(d);
    }

    public final synchronized aepg a() {
        return b(null);
    }

    public final synchronized aepg a(String str) {
        return b(str);
    }

    public final synchronized void b() {
        this.c.clear();
    }

    private final void c() {
        Iterator it = this.c.entrySet().iterator();
        while (it.hasNext()) {
            if (this.b.b() - ((aenj) ((Entry) it.next()).getValue()).b > 3600000) {
                it.remove();
            }
        }
    }

    private final aepg b(String str) {
        c();
        String str2 = null;
        aenj aenj = str2;
        for (String str3 : this.c.keySet()) {
            if (!TextUtils.equals(str3, str)) {
                aenj aenj2 = (aenj) this.c.get(str3);
                xsc xsc = this.b;
                if (aenj2 != null || aenj != null) {
                    if (aenj2 == null || aenj != null) {
                        if (aenj2 != null || aenj == null) {
                            double a;
                            double a2;
                            boolean a3 = aenk.a(aenj2, xsc);
                            boolean a4 = aenk.a(aenj, xsc);
                            if (a3 && a4) {
                                a = aenj.a.a();
                                a2 = aenj2.a.a();
                            } else if (!a3) {
                                if (!a4) {
                                    a = aenj.a.a();
                                    a2 = aenj2.a.a();
                                }
                            }
                            if (((int) (a - a2)) <= 0) {
                            }
                        }
                    }
                    aenj = (aenj) this.c.get(str3);
                    str2 = str3;
                }
            }
        }
        if (str2 == null) {
            return null;
        }
        return new aepg(str2, (int) aenj.a.a());
    }
}
