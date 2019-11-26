package defpackage;

import android.net.Uri;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: aagt */
public final class aagt implements afqj {
    public List A;
    public List B;
    public List C;
    public List D;
    public List E;
    public List F;
    public List G;
    public List H;
    public List I;
    public List J;
    public List K;
    public List L;
    public List M;
    public List N;
    public List O;
    public List P;
    public Uri Q;
    public Uri R;
    public long S;
    public int T;
    public boolean U;
    public boolean V;
    public aovw W;
    public ajwf X;
    public long Y;
    public boolean Z;
    public final int a;
    public boolean aa;
    public Uri ab;
    public aagr ac;
    public aagr ad;
    public List ae;
    public List af;
    public boolean ag;
    public aagh ah;
    public List ai;
    public List aj;
    public List ak;
    public Pattern al;
    private ateq am;
    private aajx an;
    public List b;
    public String c;
    public String d;
    public String e;
    public String f;
    public byte[] g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    public aagc m;
    public String n;
    public int o;
    public aakj p;
    public aajs q;
    public aakh r;
    public aajj s;
    public awcq t;
    public Uri u;
    public List v;
    public List w;
    public List x;
    public List y;
    public List z;

    public aagt() {
        this(2);
    }

    public aagt(int i) {
        this.a = i;
        this.U = true;
        this.m = aagc.UNKNOWN;
        this.T = -1;
        this.aa = false;
        this.am = (ateq) aten.j.createBuilder();
    }

    public final aagt a(arlv arlv, aajx aajx) {
        if (aajx != null) {
            this.an = aajx;
        }
        if (!arlv.d.isEmpty()) {
            try {
                Uri a = xvt.a(arlv.d);
                if (a.getHost().equals("s0.2mdn.net") && a.getPath().equals("/instream/html5/survey/survey.html")) {
                    this.ag = true;
                }
            } catch (MalformedURLException unused) {
                xtl.d("Badly formed media file uri - ignoring");
            }
        }
        if (aahv.o().contains(Integer.valueOf(arlv.c))) {
            this.am.a(arlv);
        } else {
            this.am.b(arlv);
        }
        return this;
    }

    public final aagt a(Uri uri) {
        if (this.A == null) {
            this.A = new ArrayList();
        }
        this.A.add(uri);
        return this;
    }

    /* renamed from: a */
    public final aagr b() {
        if (this.q == null) {
            ateq ateq = this.am;
            if (ateq != null && (ateq.b() > 0 || this.am.d() > 0)) {
                aajx aajx = this.an;
                if (aajx != null) {
                    this.q = aajx.a((aten) ((anxl) this.am.build()), this.j, ((long) this.o) * 1000);
                } else {
                    throw new IllegalStateException("Builder must have a VideoStreamingDataFactory");
                }
            }
        }
        if (this.r == null) {
            this.r = new aakh();
        }
        if (this.s == null) {
            this.s = aajj.b;
        }
        aagr aagr = r2;
        aagr aagr2 = new aagr(this.b, this.j, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, this.E, this.Q, this.R, this.U, this.S, this.T, this.V, this.W, this.X, this.Y, this.Z, this.aa, this.ab, this.ac, this.ad, this.ae, this.af, this.ah, this.ai, this.aj, this.ak, this.ag, this.al);
        return aagr;
    }
}
