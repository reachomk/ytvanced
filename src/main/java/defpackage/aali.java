package defpackage;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: aali */
public abstract class aali {
    private byte[] a;
    private String b;
    private aall c = aall.DISABLED;
    private final Object d = new Object();
    private volatile ashy e;
    public Map f;
    public boolean g;
    public boolean h;
    public boolean i;
    public String j;
    public final String k;
    public final String l;
    public final afpt m;
    public xhs n;
    public int o = 1;
    private final Boolean p;
    private final aamd q;

    public aali(String str, aamd aamd, afpt afpt, aall aall, boolean z, String str2, Boolean bool) {
        this.l = (String) amqw.a((Object) str);
        this.q = (aamd) amqw.a((Object) aamd);
        this.m = (afpt) amqw.a((Object) afpt);
        this.c = (aall) amqw.a((Object) aall);
        this.h = z;
        this.k = str2;
        this.p = bool;
    }

    protected static int a(int i) {
        return i >= 0 ? i : 0;
    }

    public static String b(String str) {
        return str == null ? "" : str;
    }

    public String a() {
        return "NO_CACHE_KEY_VALUE";
    }

    public abstract void b();

    /* Access modifiers changed, original: protected */
    public boolean j() {
        return true;
    }

    public final void a(aall aall) {
        if (aall != aall.DISABLED) {
            if ("NO_CACHE_KEY_VALUE".equals(a())) {
                throw new UnsupportedOperationException("You must override getCacheKey() in order to use forced caching.");
            }
        }
        this.c = aall;
    }

    public final boolean d() {
        return this.c != aall.DISABLED;
    }

    public final boolean e() {
        return this.c == aall.ENABLED;
    }

    public Map f() {
        if (this.f == null) {
            this.f = new HashMap();
        }
        return this.f;
    }

    public final void a(byte[] bArr) {
        amqw.a((Object) bArr);
        this.a = bArr;
    }

    public final void a(anvu anvu) {
        amqw.a(anvu != null);
        this.a = anvu.d();
    }

    public final void a(String str) {
        xvd.a(str);
        this.b = str;
    }

    public final void g() {
        a(zzp.b);
    }

    public final void h() {
        b();
        if (this.a == null) {
            throw new IllegalArgumentException("Must set clickTrackingParams.");
        }
    }

    public final ashy i() {
        if (this.e == null) {
            synchronized (this.d) {
                if (this.e == null) {
                    ashy ashy;
                    ashl ashl;
                    asib asib = (asib) ((anxo) this.q.a().toBuilder());
                    asin asin = (asin) ((anxo) asib.b().toBuilder());
                    if (this.m.g()) {
                        String c = this.m.c();
                        asin.copyOnWrite();
                        asik asik = (asik) asin.instance;
                        if (c != null) {
                            asik.a |= 8;
                            asik.b = c;
                        } else {
                            throw new NullPointerException();
                        }
                    }
                    Boolean bool = this.p;
                    if (bool != null) {
                        asin.a(bool.booleanValue());
                    }
                    asib.a(asin);
                    if (this.a != null) {
                        ashi ashi = (ashi) ashj.c.createBuilder();
                        anvu a = anvu.a(this.a);
                        ashi.copyOnWrite();
                        ashj ashj = (ashj) ashi.instance;
                        if (a != null) {
                            ashj.a |= 1;
                            ashj.b = a;
                            asib.copyOnWrite();
                            ashy = (ashy) asib.instance;
                            ashy.g = (ashj) ((anxl) ashi.build());
                            ashy.a |= 32;
                        } else {
                            throw new NullPointerException();
                        }
                    }
                    if (!TextUtils.isEmpty(this.b)) {
                        String str = this.b;
                        asib.copyOnWrite();
                        ashy = (ashy) asib.instance;
                        if (str != null) {
                            ashy.a |= 64;
                            ashy.h = str;
                        } else {
                            throw new NullPointerException();
                        }
                    }
                    ashn ashn = (ashn) ((anxo) asib.a().toBuilder());
                    int i = this.o;
                    if (i != 1) {
                        ashn.copyOnWrite();
                        ashl = (ashl) ashn.instance;
                        if (i != 0) {
                            ashl.b |= 1024;
                            ashl.y = i - 1;
                        } else {
                            throw new NullPointerException();
                        }
                    }
                    String str2 = this.j;
                    if (str2 != null) {
                        ashn.copyOnWrite();
                        ashl = (ashl) ashn.instance;
                        ashl.a |= 2097152;
                        ashl.l = str2;
                    }
                    asib.a(ashn);
                    if (this.i) {
                        asid asid = (asid) ((anxo) asib.c().toBuilder());
                        asid.copyOnWrite();
                        asia asia = (asia) asid.instance;
                        asia.a |= 8192;
                        asia.d = true;
                        asib.a(asid);
                    }
                    this.e = (ashy) ((anxl) asib.build());
                }
            }
        }
        return this.e;
    }

    protected static void a(String... strArr) {
        int i = 0;
        for (int i2 = 0; i2 < 2; i2++) {
            if (!TextUtils.isEmpty(strArr[i2])) {
                i++;
            }
        }
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        amqw.b(z);
    }

    /* Access modifiers changed, original: protected|final */
    public final afkr k() {
        afkr afkr = new afkr();
        afkr.a("serviceName", this.l);
        byte[] bArr = this.a;
        if (bArr == null) {
            bArr = zzp.b;
        }
        afkr.a("clickTrackingParams", bArr);
        afkr.a("identity", this.m.a());
        return afkr;
    }

    public final boolean l() {
        return this.p != null;
    }

    public amul m() {
        return amul.g();
    }
}
