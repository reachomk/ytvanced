package defpackage;

import java.util.Map;

/* renamed from: kqy */
public final class kqy implements kvt {
    private final dwk a;
    private final kra b;
    private krl c;
    @Deprecated
    private ajzh d;
    private String e;
    private apxu f;
    private apxu[] g;
    private apxu[] h;
    private apxu[] i;

    public kqy(dwk dwk, kra kra) {
        this.a = dwk;
        this.b = kra;
    }

    public final void a(ajzh ajzh, String str, apxu apxu, apxu[] apxuArr, apxu[] apxuArr2, apxu[] apxuArr3) {
        this.d = ajzh;
        this.e = str;
        this.f = apxu;
        this.g = apxuArr;
        this.h = apxuArr2;
        this.i = apxuArr3;
    }

    public final void a(krl krl) {
        this.c = krl;
    }

    public final void a() {
        this.c.b(this.f);
    }

    public final boolean b() {
        if (this.a.a()) {
            return f().a;
        }
        return this.d.f();
    }

    private final kri f() {
        return (kri) this.a.a(this.e, kri.class, "PSP15CState", krb.a, null);
    }

    public final /* bridge */ /* synthetic */ Object c() {
        return awqc.PROMOTED_SPARKLES15_CLICK_BEHAVIOR_TYPE_NOOP;
    }

    public final /* bridge */ /* synthetic */ Object d() {
        return awqc.PROMOTED_SPARKLES15_CLICK_BEHAVIOR_TYPE_OPEN_AD;
    }

    public final /* synthetic */ void a(Map map, Object[] objArr) {
        for (awqm awqm : (awqm[]) objArr) {
            Object a = awqg.a(awqm.b);
            if (a == null) {
                a = awqg.PROMOTED_SPARKLES_CLICK_LOCATION_UNKNOWN;
            }
            map.put(a, awqm);
        }
    }

    public final /* bridge */ /* synthetic */ Object e() {
        return awqc.PROMOTED_SPARKLES15_CLICK_BEHAVIOR_TYPE_UNKNOWN;
    }

    public final /* synthetic */ Integer b(Object obj) {
        awqm awqm = (awqm) obj;
        return (awqm == null || (awqm.a & 2) == 0) ? null : Integer.valueOf(awqm.c);
    }

    public final /* synthetic */ Object c(Object obj) {
        awqm awqm = (awqm) obj;
        Object obj2 = awqc.PROMOTED_SPARKLES15_CLICK_BEHAVIOR_TYPE_UNKNOWN;
        if (awqm != null) {
            if (b()) {
                if ((awqm.a & 8) != 0) {
                    obj2 = awqc.a(awqm.e);
                    if (obj2 == null) {
                        return awqc.PROMOTED_SPARKLES15_CLICK_BEHAVIOR_TYPE_UNKNOWN;
                    }
                }
            } else if ((awqm.a & 4) != 0) {
                obj2 = awqc.a(awqm.d);
                if (obj2 == null) {
                    return awqc.PROMOTED_SPARKLES15_CLICK_BEHAVIOR_TYPE_UNKNOWN;
                }
            }
        }
        return obj2;
    }
}
