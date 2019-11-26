package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: vdn */
public class vdn implements vdg {
    private static final long a = TimeUnit.SECONDS.toMillis(15);
    private final zyw b;
    private final aoqb c;
    private List d;
    private List e;
    private apxn f;

    public vdn(zyw zyw) {
        aoqb aoqb;
        this.b = (zyw) amqw.a((Object) zyw);
        apxn a = zyw.a();
        if (a != null) {
            auya auya = a.i;
            if (auya == null) {
                auya = auya.J;
            }
            aoqb = auya.s;
            if (aoqb == null) {
                aoqb = aoqb.m;
            }
        } else {
            aoqb = aoqb.m;
        }
        this.c = aoqb;
    }

    public final String a() {
        if (this.c.i.isEmpty()) {
            return "googleads.g.doubleclick.net";
        }
        return this.c.i;
    }

    public final String b() {
        if (this.c.j.isEmpty()) {
            return "/pagead/ads";
        }
        return this.c.j;
    }

    public final long c() {
        long j = this.c.h;
        return j <= 0 ? a : j;
    }

    public final boolean d() {
        aoqb aoqb = this.c;
        return (aoqb.a & 4096) != 0 ? aoqb.k : false;
    }

    public final boolean e() {
        aoot l = l();
        if (l != null) {
            aogc aogc = l.e;
            if (aogc == null) {
                aogc = aogc.d;
            }
            if (aogc.b) {
                return true;
            }
        }
        return false;
    }

    public final boolean f() {
        aoot l = l();
        if (l != null) {
            aogc aogc = l.e;
            if (aogc == null) {
                aogc = aogc.d;
            }
            if (aogc.c) {
                return true;
            }
        }
        return false;
    }

    public final List g() {
        List list = this.e;
        if (list == null || list.isEmpty()) {
            Collection arrayList = new ArrayList();
            aoot l = l();
            if (l != null) {
                for (aoqh aoqh : new anyc(l.c, aoot.d)) {
                    arrayList.add(Integer.valueOf(aoqh.e));
                }
            }
            this.e = amul.a(arrayList);
        }
        return this.e;
    }

    public final List h() {
        List list = this.d;
        if (list == null || list.isEmpty()) {
            this.d = new ArrayList();
            aoot l = l();
            if (l != null) {
                for (aoue aoue : l.b) {
                    List list2 = this.d;
                    Object a = aouh.a(aoue.b);
                    if (a == null) {
                        a = aouh.ANDROID_PLAY_STORE_ENDPOINT_INTENT_TYPE_UNKNOWN;
                    }
                    list2.add(a);
                }
            }
        }
        return this.d;
    }

    public final boolean i() {
        aoot l = l();
        if (l == null) {
            return false;
        }
        return l.f;
    }

    private final aoot l() {
        if (this.f == null) {
            this.f = this.b.a();
        }
        apxn apxn = this.f;
        if (apxn == null || (apxn.a & 32) == 0) {
            return null;
        }
        aoot aoot = apxn.f;
        if (aoot == null) {
            aoot = aoot.i;
        }
        return aoot;
    }

    public final boolean j() {
        aoot l = l();
        if (l == null) {
            return false;
        }
        return l.g;
    }

    public final Object k() {
        aoot l = l();
        if (l == null || (l.a & 32768) == 0) {
            return null;
        }
        Object obj = l.h;
        if (obj == null) {
            obj = avwi.h;
        }
        return obj;
    }
}
