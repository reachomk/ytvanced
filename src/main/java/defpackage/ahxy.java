package defpackage;

import android.text.TextUtils;
import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.Set;

/* renamed from: ahxy */
public final class ahxy implements ahyg, ajan, xcp {
    public static final ahyi a = new ahyb(acwc.MOBILE_BACK_BUTTON);
    private final acwe b;
    private final acwh c;
    private final xci d;
    private final xuu e;
    private final Set f = new HashSet();
    private final acxa g;
    private final ahye h = new ahye();
    private ahyh i;
    private acvx j;
    private String k;
    private apxu l;
    private ahyi m;
    private boolean n;
    private int o;

    public ahxy(xuu xuu, xci xci, acwe acwe, acwh acwh, acxa acxa) {
        this.e = (xuu) amqw.a((Object) xuu);
        this.d = (xci) amqw.a((Object) xci);
        this.b = (acwe) amqw.a((Object) acwe);
        this.c = (acwh) amqw.a((Object) acwh);
        this.g = (acxa) amqw.a((Object) acxa);
        b(f());
        this.m = a;
    }

    public final long e() {
        return 512;
    }

    public final bcuo[] a(ajam ajam) {
        return new bcuo[]{ajam.Q().a.a(ajcg.b(ajam.O(), 512)).a(ajcg.a(ajam.O(), 512)).a(new ahxx(this), ahya.a), ajam.t().a(ajcg.b(ajam.O(), 512)).a(ajcg.a(ajam.O(), 512)).a(new ahxz(this), ahyc.a)};
    }

    public final void a(ahkf ahkf) {
        int i = ahkf.e;
        int i2 = i - 1;
        apxu apxu = null;
        if (i == 0) {
            throw null;
        } else if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 3) {
                    if (a(ahkf.d)) {
                        d();
                        b(ahkf.d);
                    }
                    a(ahkf.b);
                } else if (i2 == 4) {
                    if (a(ahkf.d)) {
                        d();
                        b(ahkf.d);
                        a(ahkf.b);
                    }
                    aafv aafv = ahkf.c;
                    if (this.n) {
                        apxu = ahxy.c(this.l);
                    }
                    ahye ahye = this.h;
                    String str = this.k;
                    if (aafv != null) {
                        ahye.a(aafv.b(), str, apxu);
                        ahye.c = aafv.b();
                        if (aafv.i != null) {
                            Object ahyd = new ahyd(ahye);
                            aafl aafl = aafv.i;
                            if (aafl != null) {
                                amqw.a(ahyd);
                                aafc aafc = aafl.a;
                                if (aafc != null) {
                                    aafc.a(ahyd);
                                }
                                aafc = aafl.b;
                                if (aafc != null) {
                                    aafc.a(ahyd);
                                }
                                aafc = aafl.c;
                                if (aafc != null) {
                                    aafc.a(ahyd);
                                }
                                aafc = aafl.d;
                                if (aafc != null) {
                                    aafc.a(ahyd);
                                }
                                aafc = aafl.e;
                                if (aafc != null) {
                                    aafc.a(ahyd);
                                }
                                aafc = aafl.f;
                                if (aafc != null) {
                                    aafc.a(ahyd);
                                }
                                aafc = aafl.g;
                                if (aafc != null) {
                                    aafc.a(ahyd);
                                }
                                aafc aafc2 = aafl.h;
                                if (aafc2 != null) {
                                    aafc2.a(ahyd);
                                }
                            }
                        }
                        a(5);
                    }
                }
            } else if (a(ahkf.d)) {
                d();
                b(ahkf.d);
            }
        } else {
            d();
        }
    }

    public final void a(ahkn ahkn) {
        this.k = ahkn.e;
        if (!TextUtils.isEmpty(this.k)) {
            this.h.a(this.k);
        }
        if (this.o != 1) {
            ahye ahye = this.h;
            aakj aakj = ahkn.c;
            String str = ahkn.f;
            apxu c = this.n ? ahxy.c(this.l) : null;
            if (aakj != null && !TextUtils.isEmpty(str)) {
                if (!ahye.a.contains(ByteBuffer.wrap(aakj.x()))) {
                    byte[] x = aakj.x();
                    acxf a = ahye.a(c);
                    if (a != null) {
                        ahye.d.a(new acvs(x), a);
                        ahye.d.a(a, str);
                    } else {
                        ahye.d.a(new acvs(x));
                        ahye.d.a(str);
                    }
                    ahye.a.add(ByteBuffer.wrap(aakj.x()));
                }
            }
        }
    }

    public final acvx a() {
        return this.j;
    }

    public final void b() {
        d();
        this.f.clear();
        c(f());
        this.n = false;
    }

    private final void d() {
        this.h.a(this.k);
        this.l = null;
        if (!(this.n || this.j == null)) {
            ahye ahye = this.h;
            ahye.a.clear();
            ahye.b = null;
            ahye.c = null;
            ahye.a(null);
            this.m.a(this.j);
        }
        a(1);
    }

    private final boolean a(apxu apxu) {
        if (this.o != 1) {
            apxu apxu2 = this.l;
            if (apxu2 != null && apxu2.equals(apxu)) {
                return false;
            }
        }
        return true;
    }

    public final void c() {
        acvx acvx = this.h.d;
        this.i = ahyh.a(acvx != null ? acvx.d() : null, acwc.MOBILE_BACK_BUTTON);
    }

    public final void a(ahyh ahyh) {
        this.i = ahyh;
    }

    private final void b(apxu apxu) {
        if (this.n) {
            a(2);
        } else {
            this.m.a(this.j, apxu, this.i);
            a(3);
        }
        this.l = apxu;
        this.i = null;
    }

    private final void a(aakj aakj) {
        apxu c = this.n ? ahxy.c(this.l) : null;
        ahye ahye = this.h;
        String str = this.k;
        if (aakj != null) {
            ahye.a(aakj.x(), str, c);
            ahye.b = aakj.x();
            a(4);
        }
    }

    private final void c(acvx acvx) {
        if (this.j != acvx) {
            d();
            this.j = acvx;
            this.h.a(acvx);
        }
    }

    public final void a(acvx acvx) {
        c(acvx);
        this.n = true;
    }

    public final void b(acvx acvx) {
        c(acvx);
        this.n = false;
    }

    private final acvx f() {
        return new acvj(this.e, this.d, this.b, this.c, this.g);
    }

    private static apxu c(apxu apxu) {
        if (apxu == null) {
            return null;
        }
        anxo anxo;
        azfd azfd = (azfd) azfa.h.createBuilder();
        azfd.a(apxu.b);
        azfa azfa = (azfa) ((anxl) azfd.build());
        anxr access$000 = anxl.checkIsLite(avjd.b);
        apxu.a(access$000);
        if (apxu.h.a(access$000.d)) {
            Object obj;
            access$000 = anxl.checkIsLite(avjd.b);
            apxu.a(access$000);
            Object b = apxu.h.b(access$000.d);
            if (b == null) {
                obj = access$000.b;
            } else {
                obj = access$000.a(b);
            }
            anxo = (avjh) ((anxo) ((avjf) obj).toBuilder());
        } else {
            anxo = (avjh) avjf.h.createBuilder();
        }
        apxx apxx = (apxx) ((anxo) apxu.toBuilder());
        anxr anxr = avjd.b;
        anxo.copyOnWrite();
        avjf avjf = (avjf) anxo.instance;
        if (azfa != null) {
            avjf.g = azfa;
            avjf.a |= 1024;
            apxx.a(anxr, (avjf) ((anxl) anxo.build()));
            return (apxu) ((anxl) apxx.build());
        }
        throw new NullPointerException();
    }

    public final void a(acvx acvx, apxu apxu) {
        if (this.j != acvx && this.o != 1) {
            this.j = acvx;
            this.h.a(acvx);
            this.n = false;
            b(apxu);
            ahye ahye = this.h;
            String str = this.k;
            byte[] bArr = ahye.b;
            if (bArr != null) {
                ahye.d.a(new acvs(bArr));
                ahye.d.a(str);
            }
            bArr = ahye.c;
            if (bArr != null) {
                ahye.d.a(new acvs(bArr));
                ahye.d.a(str);
            }
        }
    }

    public final void a(ahyi ahyi) {
        this.m = (ahyi) amqw.a((Object) ahyi);
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahkf.class, ahkn.class};
        } else if (i == 0) {
            a((ahkf) obj);
            return null;
        } else if (i == 1) {
            a((ahkn) obj);
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    private final void a(int i) {
        this.o = i;
        for (ahyf a : this.f) {
            a.a();
        }
    }
}
