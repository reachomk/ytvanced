package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: aaps */
public final class aaps extends aaml {
    private final int A;
    public final List a = new ArrayList();
    public String b;
    public String c;
    public String d;
    public aqje e;
    public asbi p;
    public final List q;
    public avki r;
    public boolean s;
    public asbo t;
    public aqvv u;
    public int v;
    private final zzl w;
    private boolean x = false;
    private String y;
    private final String z;

    public aaps(String str, aamd aamd, afpt afpt, zzl zzl, boolean z) {
        super((String) amqw.a((Object) str), aamd, afpt, aall.ENABLED);
        str = "";
        this.b = str;
        this.c = str;
        this.d = str;
        this.e = null;
        this.q = new ArrayList();
        this.v = 1;
        this.A = 1;
        this.z = Locale.getDefault().toString();
        this.w = zzl;
        this.h = z;
    }

    public final aaps c(String str) {
        this.b = aali.b(str);
        return this;
    }

    public final aaps n() {
        this.x = true;
        return this;
    }

    public final aaps d(String str) {
        this.y = aali.b(str);
        return this;
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        aali.a(this.b, this.c);
    }

    public final String a() {
        afkr k = k();
        k.a("browseId", this.b);
        if ((this.w.b().a & 128) != 0) {
            avao avao = this.w.b().f;
            if (avao == null) {
                avao = avao.f;
            }
            if (avao.e) {
                k.a("language", this.z);
            }
        }
        k.a("continuation", this.c);
        k.a("params", this.y);
        k.a("query", this.d);
        k.a("offline", this.x);
        String str = "null";
        k.a("forceAdUrls", str);
        k.a("forceAdKeyword", null);
        k.a("forceAdGroupId", null);
        k.a("extendedPermissions", this.s);
        avki avki = this.r;
        if (avki != null) {
            avkk avkk = (avkk) ((anxo) avki.toBuilder());
            avkk.copyOnWrite();
            avki avki2 = (avki) avkk.instance;
            avki2.a &= -5;
            avki2.c = 0;
            k.a("browseNotificationsParams", ((avki) ((anxl) avkk.build())).toString());
        }
        String str2 = this.j;
        if (!TextUtils.isEmpty(str2)) {
            k.a("rawDeviceId", str2);
        }
        k.a("musicBrowseRequestDeepLinkUrl", str);
        return k.a();
    }

    public final amul m() {
        return amul.a(this.b);
    }

    public final /* synthetic */ anzd c() {
        String str;
        asbm asbm;
        asbp asbp = (asbp) asbm.u.createBuilder();
        boolean z = this.x;
        asbp.copyOnWrite();
        asbm asbm2 = (asbm) asbp.instance;
        asbm2.a |= 4096;
        asbm2.k = z;
        z = this.s;
        asbp.copyOnWrite();
        asbm2 = (asbm) asbp.instance;
        asbm2.a |= 2097152;
        asbm2.n = z;
        if (!TextUtils.isEmpty(this.b)) {
            str = this.b;
            asbp.copyOnWrite();
            asbm2 = (asbm) asbp.instance;
            if (str != null) {
                asbm2.a |= 2;
                asbm2.c = str;
            } else {
                throw new NullPointerException();
            }
        }
        if (!TextUtils.isEmpty(this.c)) {
            str = this.c;
            asbp.copyOnWrite();
            asbm2 = (asbm) asbp.instance;
            if (str != null) {
                asbm2.a |= 16;
                asbm2.f = str;
            } else {
                throw new NullPointerException();
            }
        }
        if (!TextUtils.isEmpty(this.d)) {
            str = this.d;
            asbp.copyOnWrite();
            asbm2 = (asbm) asbp.instance;
            if (str != null) {
                asbm2.a |= 8;
                asbm2.e = str;
            } else {
                throw new NullPointerException();
            }
        }
        if (!TextUtils.isEmpty(this.y)) {
            str = this.y;
            asbp.copyOnWrite();
            asbm2 = (asbm) asbp.instance;
            if (str != null) {
                asbm2.a |= 4;
                asbm2.d = str;
            } else {
                throw new NullPointerException();
            }
        }
        int i = this.v;
        if (i != 1) {
            asbp.copyOnWrite();
            asbm = (asbm) asbp.instance;
            if (i != 0) {
                asbm.a |= 4194304;
                asbm.q = i - 1;
            } else {
                throw new NullPointerException();
            }
        }
        List list = this.q;
        asbp.copyOnWrite();
        asbm = (asbm) asbp.instance;
        if (!asbm.p.a()) {
            asbm.p = anxl.mutableCopy(asbm.p);
        }
        anvf.addAll(list, asbm.p);
        avki avki = this.r;
        if (avki != null) {
            asbp.copyOnWrite();
            asbm = (asbm) asbp.instance;
            asbm.j = avki;
            asbm.a |= 1024;
        }
        if (TextUtils.isEmpty(null)) {
            if (!TextUtils.isEmpty(null)) {
                arkk arkk = (arkk) arkl.f.createBuilder();
                arkk.a(null);
                asbp.a(arkk);
            }
            asbi asbi = this.p;
            if (asbi != null) {
                asbp.copyOnWrite();
                asbm = (asbm) asbp.instance;
                asbm.l = asbi;
                asbm.a |= 32768;
            }
            aqje aqje = this.e;
            if (aqje != null) {
                asbp.copyOnWrite();
                asbm = (asbm) asbp.instance;
                asbm.m = aqje;
                asbm.a |= 1048576;
            }
            i = this.A;
            if (i != 1) {
                asbp.copyOnWrite();
                asbm2 = (asbm) asbp.instance;
                if (i != 0) {
                    asbm2.a |= 16777216;
                    asbm2.r = i - 1;
                } else {
                    throw new NullPointerException();
                }
            }
            list = this.a;
            asbp.copyOnWrite();
            asbm2 = (asbm) asbp.instance;
            if (!asbm2.o.a()) {
                asbm2.o = anxl.mutableCopy(asbm2.o);
            }
            anvf.addAll(list, asbm2.o);
            asbo asbo = this.t;
            if (asbo != null) {
                asbp.copyOnWrite();
                asbm2 = (asbm) asbp.instance;
                asbm2.t = asbo;
                asbm2.a |= 67108864;
            }
            aqvv aqvv = this.u;
            if (aqvv != null) {
                asbp.copyOnWrite();
                asbm2 = (asbm) asbp.instance;
                asbm2.s = aqvv;
                asbm2.a |= 33554432;
            }
            return asbp;
        }
        ((arkk) arkl.f.createBuilder()).copyOnWrite();
        throw new NullPointerException();
    }
}
