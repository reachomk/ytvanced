package defpackage;

import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;
import com.google.android.exoplayer2.drm.ExoMediaCrypto;
import com.google.android.exoplayer2.ext.vp9.VpxDecoder;
import com.google.android.exoplayer2.ext.vp9.VpxLibrary;
import com.google.android.exoplayer2.ext.vp9.VpxOutputBuffer;

/* renamed from: oex */
public class oex extends nys {
    private boolean A;
    private long B;
    private long C;
    private Surface D;
    private ofb E;
    private int F;
    private boolean G;
    private boolean H;
    private boolean I;
    private int J;
    private int K;
    private long L;
    private int M;
    private int N;
    private int O;
    private long P;
    private long Q;
    private pae R;
    private odk S;
    private final int e;
    private final int f;
    private final boolean g;
    private final boolean h;
    private final long i;
    private final int j;
    private final boolean k;
    private final pak l;
    private final nzy m;
    private final ozl n;
    private final odj o;
    private final odw p;
    private final int q;
    private nzw r;
    private nzw s;
    private VpxDecoder t;
    private oey u;
    private VpxOutputBuffer v;
    private odu w;
    private odu x;
    private int y;
    private boolean z;

    public oex(long j, Handler handler, pah pah, int i) {
        this(j, handler, pah, i, false, Runtime.getRuntime().availableProcessors(), 4, 4);
    }

    private static boolean c(long j) {
        return j < -30000;
    }

    public oex(long j, Handler handler, pah pah, int i, boolean z, int i2, int i3, int i4) {
        super(2);
        this.h = false;
        this.i = j;
        this.j = i;
        this.p = null;
        this.k = false;
        this.g = z;
        this.q = i2;
        this.e = i3;
        this.f = i4;
        this.C = -9223372036854775807L;
        B();
        this.m = new nzy();
        this.n = new ozl();
        this.o = odj.a();
        this.l = new pak(handler, pah);
        this.F = -1;
        this.y = 0;
    }

    public final int a(nzw nzw) {
        if (VpxLibrary.a()) {
            if ("video/x-vnd.on2.vp9".equalsIgnoreCase(nzw.i)) {
                return nys.a(null, nzw.l) ? 20 : 2;
            }
        }
        return 0;
    }

    public final void a(long j, long j2) {
        if (!this.I) {
            int a;
            if (this.r == null) {
                this.o.clear();
                a = a(this.m, this.o, true);
                if (a == -5) {
                    b(this.m.a);
                } else if (a == -4) {
                    oxz.b(this.o.isEndOfStream());
                    this.H = true;
                    this.I = true;
                    return;
                } else {
                    return;
                }
            }
            y();
            if (this.t != null) {
                odk odk;
                while (true) {
                    try {
                        odg odg = this.v;
                        if (odg == null) {
                            this.v = (VpxOutputBuffer) ((odm) this.t.c());
                            odg = this.v;
                            if (odg == null) {
                                break;
                            }
                            odk odk2 = this.S;
                            odk2.f += odg.skippedOutputBufferCount;
                            this.O -= odg.skippedOutputBufferCount;
                        }
                        if (!odg.isEndOfStream()) {
                            if (this.B == -9223372036854775807L) {
                                this.B = j;
                            }
                            long j3 = this.v.timeUs;
                            long j4 = j3 - j;
                            if (this.F == -1) {
                                if (!oex.c(j4)) {
                                    break;
                                }
                                VpxOutputBuffer vpxOutputBuffer = this.v;
                                odk odk3 = this.S;
                                odk3.f++;
                                vpxOutputBuffer.release();
                            } else {
                                pae pae;
                                this.n.a(j3 - this.Q);
                                j3 = SystemClock.elapsedRealtime() * 1000;
                                a = this.c;
                                if (this.A) {
                                    if (a != 2) {
                                        break;
                                    }
                                    j3 -= this.P;
                                    if (oex.c(j4)) {
                                        if (j3 <= 100000) {
                                        }
                                    }
                                    if (j == this.B) {
                                        break;
                                    }
                                    if (j4 < -500000) {
                                        a = b(j);
                                        if (a != 0) {
                                            odk = this.S;
                                            odk.i++;
                                            b(this.O + a);
                                            w();
                                            break;
                                        }
                                    }
                                    if (!oex.c(j4)) {
                                        if (j4 >= 30000) {
                                            break;
                                        }
                                        pae = this.R;
                                        if (pae != null) {
                                            System.nanoTime();
                                            pae.a();
                                        }
                                        b(this.v);
                                    } else {
                                        a(this.v);
                                    }
                                }
                                pae = this.R;
                                if (pae != null) {
                                    System.nanoTime();
                                    pae.a();
                                }
                                b(this.v);
                            }
                            this.O--;
                            this.v = null;
                        } else if (this.y == 2) {
                            x();
                            y();
                        } else {
                            this.v.release();
                            this.v = null;
                            this.I = true;
                        }
                    } catch (oez e) {
                        throw nyy.a(e);
                    }
                }
                while (true) {
                    VpxDecoder vpxDecoder = this.t;
                    if (vpxDecoder != null && this.y != 2 && !this.H) {
                        odj odj = this.u;
                        if (odj == null) {
                            this.u = (oey) ((odj) vpxDecoder.b());
                            odj = this.u;
                            if (odj == null) {
                                break;
                            }
                        }
                        if (this.y != 1) {
                            boolean z = false;
                            int a2 = !this.G ? a(this.m, odj, false) : -4;
                            if (a2 != -3) {
                                if (a2 != -5) {
                                    if (!this.u.isEndOfStream()) {
                                        this.u.c();
                                        odu odu = this.w;
                                        if (odu != null) {
                                            a2 = odu.f();
                                            if (a2 == 1) {
                                                throw nyy.a(this.w.g());
                                            } else if (a2 != 4) {
                                                z = true;
                                            }
                                        }
                                        this.G = z;
                                        if (z) {
                                            break;
                                        }
                                        nzw nzw = this.s;
                                        if (nzw != null) {
                                            this.n.a(this.u.c, nzw);
                                            this.s = null;
                                        }
                                        this.u.d();
                                        odj odj2 = this.u;
                                        odj2.d = this.m.a.u;
                                        this.t.a(odj2);
                                        this.O++;
                                        this.z = true;
                                        odk = this.S;
                                        odk.c++;
                                        this.u = null;
                                    } else {
                                        this.H = true;
                                        this.t.a(this.u);
                                        this.u = null;
                                        break;
                                    }
                                }
                                b(this.m.a);
                            } else {
                                break;
                            }
                        }
                        odj.setFlags(4);
                        this.t.a(this.u);
                        this.u = null;
                        this.y = 2;
                        break;
                    }
                    break;
                }
                ozn.a();
                this.S.a();
            }
        }
    }

    public final boolean v() {
        return this.I;
    }

    public boolean u() {
        if (!this.G) {
            if (this.r != null && ((t() || this.v != null) && (this.A || this.F == -1))) {
                this.C = -9223372036854775807L;
                return true;
            } else if (this.C != -9223372036854775807L) {
                if (SystemClock.elapsedRealtime() < this.C) {
                    return true;
                }
                this.C = -9223372036854775807L;
                return false;
            }
        }
        return false;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(boolean z) {
        this.S = new odk();
        this.l.a(this.S);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(long j, boolean z) {
        this.H = false;
        this.I = false;
        A();
        this.B = -9223372036854775807L;
        this.N = 0;
        if (this.t != null) {
            w();
        }
        if (z) {
            z();
        } else {
            this.C = -9223372036854775807L;
        }
        this.n.a();
    }

    /* Access modifiers changed, original: protected */
    public void p() {
        this.M = 0;
        this.L = SystemClock.elapsedRealtime();
        this.P = SystemClock.elapsedRealtime() * 1000;
    }

    /* Access modifiers changed, original: protected|final */
    public final void q() {
        this.C = -9223372036854775807L;
        D();
    }

    /* Access modifiers changed, original: protected|final */
    public final void r() {
        this.r = null;
        this.G = false;
        B();
        A();
        try {
            a(null);
            x();
        } finally {
            this.l.b(this.S);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(nzw[] nzwArr, long j) {
        this.Q = j;
    }

    private final void w() {
        this.G = false;
        this.O = 0;
        if (this.y != 0) {
            x();
            y();
            return;
        }
        this.u = null;
        VpxOutputBuffer vpxOutputBuffer = this.v;
        if (vpxOutputBuffer != null) {
            vpxOutputBuffer.release();
            this.v = null;
        }
        this.t.d();
        this.z = false;
    }

    private final void x() {
        this.u = null;
        this.v = null;
        this.y = 0;
        this.z = false;
        this.O = 0;
        VpxDecoder vpxDecoder = this.t;
        if (vpxDecoder != null) {
            vpxDecoder.e();
            this.t = null;
            odk odk = this.S;
            odk.b++;
        }
        b(null);
    }

    private final void a(odu odu) {
        odu = this.x;
        this.x = null;
        c(odu);
    }

    private final void b(odu odu) {
        odu odu2 = this.w;
        this.w = odu;
        c(odu2);
    }

    private final void c(odu odu) {
        if (odu != null && odu != this.w && odu != this.x) {
            odw odw = null;
            odw.a(odu);
        }
    }

    private final void b(nzw nzw) {
        nzw nzw2 = this.r;
        this.r = nzw;
        this.s = nzw;
        if ((ozp.a(this.r.l, nzw2 != null ? nzw2.l : null) ^ 1) != 0) {
            if (this.r.l == null) {
                a(null);
            } else {
                throw nyy.a(new IllegalStateException("Media requires a DrmSessionManager"));
            }
        }
        if (this.x != this.w) {
            if (this.z) {
                this.y = 1;
            } else {
                x();
                y();
            }
        }
        this.l.a(this.r);
    }

    private final void a(VpxOutputBuffer vpxOutputBuffer) {
        b(1);
        vpxOutputBuffer.release();
    }

    private final void b(VpxOutputBuffer vpxOutputBuffer) {
        int i = vpxOutputBuffer.mode;
        Object obj = (i != 1 || this.D == null) ? null : 1;
        Object obj2 = (i != 0 || this.E == null) ? null : 1;
        this.P = SystemClock.elapsedRealtime() * 1000;
        if (obj2 == null && obj == null) {
            a(vpxOutputBuffer);
            return;
        }
        int i2 = vpxOutputBuffer.width;
        int i3 = vpxOutputBuffer.height;
        if (!(this.J == i2 && this.K == i3)) {
            this.J = i2;
            this.K = i3;
            this.l.a(i2, i3, 0, 1.0f);
        }
        if (obj2 == null) {
            VpxDecoder vpxDecoder = this.t;
            if (vpxDecoder.vpxRenderFrame(vpxDecoder.a, this.D, vpxOutputBuffer) != -1) {
                vpxOutputBuffer.release();
            } else {
                throw new oez("Buffer render failed.");
            }
        }
        this.E.a(vpxOutputBuffer);
        this.N = 0;
        odk odk = this.S;
        odk.e++;
        if (!this.A) {
            this.A = true;
            this.l.a(this.D);
        }
    }

    private final void b(int i) {
        odk odk = this.S;
        odk.g += i;
        this.M += i;
        int i2 = this.N + i;
        this.N = i2;
        odk.h = Math.max(i2, odk.h);
        i = this.j;
        if (i > 0 && this.M >= i) {
            D();
        }
    }

    public void a(int i, Object obj) {
        if (i == 1) {
            a((Surface) obj, null);
        } else if (i == 10000) {
            a(null, (ofb) obj);
        } else if (i == 6) {
            this.R = (pae) obj;
        }
    }

    private final void a(Surface surface, ofb ofb) {
        int i = 1;
        boolean z = surface == null || ofb == null;
        oxz.b(z);
        if (this.D != surface || this.E != ofb) {
            this.D = surface;
            this.E = ofb;
            if (surface != null) {
                this.F = 1;
            } else {
                i = ofb != null ? 0 : -1;
                this.F = i;
            }
            if (i != -1) {
                VpxDecoder vpxDecoder = this.t;
                if (vpxDecoder != null) {
                    vpxDecoder.b = i;
                }
                C();
                A();
                if (this.c == 2) {
                    z();
                }
            } else {
                B();
                A();
            }
        } else if (this.F != -1) {
            C();
            if (this.A) {
                this.l.a(this.D);
            }
        }
    }

    private final void y() {
        if (this.t == null) {
            ExoMediaCrypto h;
            b(this.x);
            odu odu = this.w;
            if (odu != null) {
                h = odu.h();
                if (h == null && this.w.g() == null) {
                    return;
                }
            }
            h = null;
            ExoMediaCrypto exoMediaCrypto = h;
            try {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                int i = this.r.j;
                this.t = new VpxDecoder(this.e, this.f, i != -1 ? i : 786432, exoMediaCrypto, false, this.g, this.q);
                this.t.b = this.F;
                ozn.a();
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                this.l.a(this.t.a(), elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
                odk odk = this.S;
                odk.a++;
            } catch (oez e) {
                throw nyy.a(e);
            }
        }
    }

    private final void z() {
        this.C = this.i > 0 ? SystemClock.elapsedRealtime() + this.i : -9223372036854775807L;
    }

    private final void A() {
        this.A = false;
    }

    private final void B() {
        this.J = -1;
        this.K = -1;
    }

    private final void C() {
        int i = this.J;
        if (i != -1 || this.K != -1) {
            this.l.a(i, this.K, 0, 1.0f);
        }
    }

    private final void D() {
        if (this.M > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.l.a(this.M, elapsedRealtime - this.L);
            this.M = 0;
            this.L = elapsedRealtime;
        }
    }
}
