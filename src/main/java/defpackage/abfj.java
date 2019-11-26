package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: abfj */
public final class abfj extends aaml {
    public boolean A;
    public String B;
    public boolean C;
    public Integer D;
    public String E;
    public int F;
    public int G;
    public int H;
    public int I;
    public awav J;
    public int K;
    public amul L;
    public final List M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    private final xuu S;
    private final Set T;
    private String U;
    private final int V;
    private final int W;
    public String a;
    public String b;
    public String c;
    public int d = -1;
    public boolean e = false;
    public boolean p = false;
    public boolean q = false;
    public boolean r = false;
    public byte[] s;
    public String t;
    public String u;
    public long v;
    public int w;
    public int x;
    public int y;
    public boolean z;

    public abfj(aamd aamd, afpt afpt, xuu xuu, Set set) {
        super("player", aamd, afpt, aall.ENABLED);
        String str = "";
        this.u = str;
        this.v = -1;
        this.w = -1;
        this.x = 0;
        this.y = 0;
        this.z = false;
        this.A = false;
        this.B = str;
        this.C = false;
        this.D = null;
        this.N = 1;
        this.O = 1;
        this.P = 1;
        this.E = str;
        this.F = -1;
        this.G = -1;
        this.H = 0;
        this.V = -1;
        this.W = -1;
        this.I = -1;
        this.Q = 1;
        this.K = -1;
        this.R = 1;
        this.M = new ArrayList();
        this.S = xuu;
        this.T = set;
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        amqw.a(this.a);
        xvd.a(this.j);
        ashy i = i();
        boolean z = true;
        amqw.b((i.a & 256) != 0);
        ashf ashf = i.j;
        if (ashf == null) {
            ashf = ashf.b;
        }
        boolean z2 = false;
        for (atwo atwo : ashf.a) {
            if (atwo.d.equals("ms")) {
                if (atwo.b == 2) {
                    z2 = true;
                }
            }
        }
        amqw.b(z2);
        if ((i.a & 2) != 0) {
            return;
        }
        if (!this.r) {
            amqw.b(this.x != -1);
            if (this.D == null) {
                if (!(this.q || this.i)) {
                    z = false;
                }
                amqw.b(z);
            }
        } else if (!this.q) {
            xvd.a(this.E);
        }
    }

    public final Map f() {
        if (this.f == null) {
            super.f();
            if (this.U == null) {
                this.U = this.S.a(9);
            }
            this.f.put("id", this.a);
            this.f.put("t", this.U);
        }
        return this.f;
    }

    public final String a() {
        afkr k = k();
        k.a("videoId", this.a);
        k.a("isOfflineRequest", this.q);
        k.a("isAdRequest", this.r);
        k.a("playlistId", aali.b(this.c));
        k.a("playlistIndex", (long) aali.a(this.d));
        k.a("allowControversialContent", this.e);
        k.a("allowAdultContent", this.p);
        k.a("dataExpiredForSeconds", (long) aali.a(this.I));
        k.a("autoplay", this.z);
        k.a(ahhv.AUTONAV, this.A);
        k.a("scriptedPlay", this.C);
        int i = this.N;
        int i2 = i - 1;
        if (i != 0) {
            k.a("adSystem", (long) i2);
            i = this.O;
            i2 = i - 1;
            if (i != 0) {
                k.a("adType", (long) i2);
                i = this.P;
                i2 = i - 1;
                if (i != 0) {
                    k.a("instreamType", (long) i2);
                    k.a("hostVideoId", aali.b(this.E));
                    k.a("playerParams", aali.b(this.b));
                    k.a("startWalltime", (long) this.V);
                    k.a("manifestDuration", (long) this.W);
                    i = this.Q;
                    i2 = i - 1;
                    if (i != 0) {
                        k.a("offlineDownloadUserChoice", (long) i2);
                        i = this.R;
                        i2 = i - 1;
                        if (i != 0) {
                            k.a("offlineStorageFormat", (long) i2);
                            k.a("offlineSourceVeType", (long) this.K);
                            byte[] bArr = this.s;
                            if (bArr == null) {
                                bArr = zzp.a;
                            }
                            k.a("offlineSharingWrappedKey", bArr);
                            k.a("serializedThirdPartyEmbedConfig", this.t);
                            return k.a();
                        }
                        throw null;
                    }
                    throw null;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }

    public final /* synthetic */ anzd c() {
        int i;
        awat awat;
        atek atek = (atek) ateh.n.createBuilder();
        boolean z = this.p;
        atek.copyOnWrite();
        ateh ateh = (ateh) atek.instance;
        ateh.a |= 8;
        ateh.e = z;
        z = this.e;
        atek.copyOnWrite();
        ateh = (ateh) atek.instance;
        ateh.a |= 4;
        ateh.d = z;
        z = this.q;
        atek.copyOnWrite();
        ateh = (ateh) atek.instance;
        ateh.a |= 32;
        ateh.g = z;
        if (!TextUtils.isEmpty(this.a)) {
            atek.a(this.a);
        }
        awas awas = (awas) awat.g.createBuilder();
        if (!TextUtils.isEmpty(this.b)) {
            atek.c(this.b);
        }
        if (!TextUtils.isEmpty(this.c)) {
            atek.b(this.c);
            int i2 = this.d;
            if (i2 >= 0) {
                atek.a(i2);
            }
        }
        byte[] bArr = this.s;
        if (bArr != null) {
            anvu a = anvu.a(bArr);
            atek.copyOnWrite();
            ateh ateh2 = (ateh) atek.instance;
            if (a != null) {
                ateh2.a |= 4096;
                ateh2.k = a;
            } else {
                throw new NullPointerException();
            }
        }
        String str;
        if (this.r) {
            aoil aoil = (aoil) aoim.f.createBuilder();
            i = this.N;
            aoil.copyOnWrite();
            aoim aoim = (aoim) aoil.instance;
            if (i != 0) {
                aoim.a |= 1;
                aoim.b = i - 1;
                i = this.O;
                aoil.copyOnWrite();
                aoim = (aoim) aoil.instance;
                if (i != 0) {
                    aoim.a |= 2;
                    aoim.c = i - 1;
                    i = this.P;
                    aoil.copyOnWrite();
                    aoim = (aoim) aoil.instance;
                    if (i != 0) {
                        aoim.a |= 4;
                        aoim.d = i - 1;
                        str = this.E;
                        aoil.copyOnWrite();
                        aoim = (aoim) aoil.instance;
                        if (str != null) {
                            aoim.a |= 16;
                            aoim.e = str;
                            aoim aoim2 = (aoim) ((anxl) aoil.build());
                            awas.copyOnWrite();
                            awat = (awat) awas.instance;
                            if (aoim2 != null) {
                                awat.c = aoim2;
                                awat.a |= 2;
                            } else {
                                throw new NullPointerException();
                            }
                        }
                        throw new NullPointerException();
                    }
                    throw new NullPointerException();
                }
                throw new NullPointerException();
            }
            throw new NullPointerException();
        }
        awan awan;
        awam awam = (awam) awan.s.createBuilder();
        for (abfa a2 : this.T) {
            a2.a(awam);
        }
        if (!TextUtils.isEmpty(this.u)) {
            str = this.u;
            awam.copyOnWrite();
            awan = (awan) awam.instance;
            if (str != null) {
                awan.a |= 2;
                awan.b = str;
            } else {
                throw new NullPointerException();
            }
        }
        long j = this.v;
        if (j != -1) {
            awam.a(j);
        }
        i = this.w;
        if (i != -1) {
            awam.a(i);
        }
        i = this.y;
        if (i != -1) {
            awam.b(i);
        }
        Integer num = this.D;
        if (!(num == null || num.intValue() == -1)) {
            awam.d(this.D.intValue());
        }
        i = this.F;
        if (i != -1) {
            awam.copyOnWrite();
            awan = (awan) awam.instance;
            awan.a |= 128;
            awan.h = i;
        }
        i = this.G;
        if (i != -1) {
            awam.copyOnWrite();
            awan = (awan) awam.instance;
            awan.a |= 256;
            awan.i = i;
        }
        i = this.H;
        awam.copyOnWrite();
        awan = (awan) awam.instance;
        awan.a |= 512;
        awan.j = i;
        boolean z2 = this.z;
        awam.copyOnWrite();
        awan = (awan) awam.instance;
        awan.a |= 4096;
        awan.l = z2;
        z2 = this.A;
        awam.copyOnWrite();
        awan = (awan) awam.instance;
        awan.a |= 67108864;
        awan.p = z2;
        awam.a(this.B);
        z2 = this.C;
        awam.copyOnWrite();
        awan = (awan) awam.instance;
        awan.a |= 2048;
        awan.k = z2;
        awam.c(this.x);
        amul amul = this.L;
        if (!(amul == null || amul.isEmpty())) {
            arkk arkk = (arkk) arkl.f.createBuilder();
            arkk.a(this.L);
            awam.a(arkk);
        }
        if (this.V > 0 && this.W > 0) {
            awao awao = (awao) awap.d.createBuilder();
            int i3 = this.V;
            awao.copyOnWrite();
            awap awap = (awap) awao.instance;
            awap.a |= 1;
            awap.b = (long) i3;
            i3 = this.W;
            awao.copyOnWrite();
            awap = (awap) awao.instance;
            awap.a |= 2;
            awap.c = (long) i3;
            awam.copyOnWrite();
            awan = (awan) awam.instance;
            awan.r = (awap) ((anxl) awao.build());
            awan.a |= 1073741824;
        }
        awas.a(awam);
        if (this.I != -1) {
            awaw awaw = (awaw) awax.c.createBuilder();
            i = this.I;
            awaw.copyOnWrite();
            awax awax = (awax) awaw.instance;
            awax.a |= 1;
            awax.b = i;
            awax awax2 = (awax) ((anxl) awaw.build());
            awas.copyOnWrite();
            awat = (awat) awas.instance;
            if (awax2 != null) {
                awat.e = awax2;
                awat.a |= 8;
            } else {
                throw new NullPointerException();
            }
        }
        awav awav = this.J;
        if (awav != null) {
            awas.copyOnWrite();
            awat = (awat) awas.instance;
            awat.d = awav;
            awat.a |= 4;
        }
        if (!(this.Q == 1 && this.K == -1 && this.R == 1)) {
            awaq awaq = (awaq) awar.e.createBuilder();
            i = this.Q;
            awaq.copyOnWrite();
            awar awar = (awar) awaq.instance;
            if (i != 0) {
                awar.a = 1 | awar.a;
                awar.b = i - 1;
                int i4 = this.K;
                awaq.copyOnWrite();
                awar awar2 = (awar) awaq.instance;
                awar2.a |= 2;
                awar2.c = i4;
                i4 = this.R;
                awaq.copyOnWrite();
                awar2 = (awar) awaq.instance;
                if (i4 != 0) {
                    awar2.a |= 4;
                    awar2.d = i4 - 1;
                    awas.copyOnWrite();
                    awat awat2 = (awat) awas.instance;
                    awat2.f = (awar) ((anxl) awaq.build());
                    awat2.a |= 16;
                } else {
                    throw new NullPointerException();
                }
            }
            throw new NullPointerException();
        }
        atek.copyOnWrite();
        ateh = (ateh) atek.instance;
        ateh.f = (awat) ((anxl) awas.build());
        ateh.a |= 16;
        List list = this.M;
        atek.copyOnWrite();
        ateh = (ateh) atek.instance;
        if (!ateh.l.a()) {
            ateh.l = anxl.mutableCopy(ateh.l);
        }
        anvf.addAll(list, ateh.l);
        String str2 = this.t;
        if (str2 != null) {
            atek.copyOnWrite();
            ateh = (ateh) atek.instance;
            ateh.a |= 65536;
            ateh.m = str2;
        }
        return atek;
    }
}
