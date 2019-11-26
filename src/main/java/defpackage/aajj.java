package defpackage;

import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: aajj */
public final class aajj implements Parcelable {
    public static final Creator CREATOR = new aaji();
    public static final float[] a = new float[]{0.25f, 0.5f, 0.75f, 1.0f, 1.25f, 1.5f, 2.0f};
    public static final aajj b = new aajj(f);
    private static final awdg f = awdg.J;
    public final awdg c;
    public Set d;
    public boolean e = false;
    private Set g;
    private Set h;
    private aoku i;
    private atzk j;

    public aajj(awdg awdg) {
        this.c = (awdg) amqw.a((Object) awdg);
    }

    public final int describeContents() {
        return 0;
    }

    public final synchronized aoku a() {
        if (this.i == null) {
            aoku aoku;
            awdg awdg = this.c;
            if ((awdg.a & 33554432) != 0) {
                aoku = awdg.q;
                if (aoku == null) {
                    aoku = aoku.c;
                }
            } else {
                aoku = aoku.c;
            }
            this.i = aoku;
        }
        return this.i;
    }

    public final boolean b() {
        awdg awdg = this.c;
        if ((awdg.a & 2097152) != 0) {
            aokw aokw = awdg.n;
            if (aokw == null) {
                aokw = aokw.c;
            }
            if (aokw.b) {
                return true;
            }
        }
        return false;
    }

    public final boolean c() {
        awdg awdg = this.c;
        if ((awdg.b & 32) != 0) {
            aopp aopp = awdg.w;
            if (aopp == null) {
                aopp = aopp.e;
            }
            if (aopp.b) {
                return true;
            }
        }
        return false;
    }

    public final boolean d() {
        awdg awdg = this.c;
        if ((awdg.b & 32) != 0) {
            aopp aopp = awdg.w;
            if (aopp == null) {
                aopp = aopp.e;
            }
            if (aopp.c) {
                return true;
            }
        }
        return false;
    }

    public final boolean e() {
        awdg awdg = this.c;
        if ((awdg.b & 32) != 0) {
            aopp aopp = awdg.w;
            if (aopp == null) {
                aopp = aopp.e;
            }
            if (aopp.d) {
                return true;
            }
        }
        return false;
    }

    public final boolean f() {
        awdg awdg = this.c;
        if ((awdg.a & 8192) != 0) {
            aosb aosb = awdg.i;
            if (aosb == null) {
                aosb = aosb.n;
            }
            if (aosb.j) {
                return true;
            }
        }
        return false;
    }

    public final boolean g() {
        awdg awdg = this.c;
        if ((awdg.a & 8192) == 0) {
            return false;
        }
        aosb aosb = awdg.i;
        if (aosb == null) {
            aosb = aosb.n;
        }
        if (aosb.f) {
            return true;
        }
        return false;
    }

    public final int h() {
        int i;
        awdg awdg = this.c;
        if ((awdg.a & 8192) != 0) {
            aosb aosb = awdg.i;
            if (aosb == null) {
                aosb = aosb.n;
            }
            i = aosb.g;
        } else {
            i = 0;
        }
        return i == 0 ? 2000 : i;
    }

    public final boolean i() {
        awdg awdg = this.c;
        if ((awdg.a & 16384) != 0) {
            aoth aoth = awdg.j;
            if (aoth == null) {
                aoth = aoth.k;
            }
            int a = aotj.a(aoth.b);
            if (a != 0 && a == 3) {
                return true;
            }
        }
        return false;
    }

    public final boolean j() {
        awdg awdg = this.c;
        if ((awdg.b & 512) != 0) {
            aouk aouk = awdg.A;
            if (aouk == null) {
                aouk = aouk.e;
            }
            if (aouk.b) {
                return true;
            }
        }
        return false;
    }

    public final boolean k() {
        awdg awdg = this.c;
        if ((awdg.b & 512) != 0) {
            aouk aouk = awdg.A;
            if (aouk == null) {
                aouk = aouk.e;
            }
            if (aouk.d) {
                return true;
            }
        }
        return false;
    }

    public final float l() {
        awdg awdg = this.c;
        if ((awdg.a & 64) == 0) {
            return 1.0f;
        }
        aoxy aoxy = awdg.e;
        if (aoxy == null) {
            aoxy = aoxy.f;
        }
        return Math.min(1.0f, (float) Math.pow(10.0d, (double) ((-aoxy.b) / 20.0f)));
    }

    public final boolean m() {
        awdg awdg = this.c;
        if ((awdg.a & 64) != 0) {
            aoxy aoxy = awdg.e;
            if (aoxy == null) {
                aoxy = aoxy.f;
            }
            if (aoxy.c) {
                return true;
            }
        }
        return false;
    }

    public final boolean n() {
        awdg awdg = this.c;
        if ((awdg.a & 64) != 0) {
            aoxy aoxy = awdg.e;
            if (aoxy == null) {
                aoxy = aoxy.f;
            }
            if (aoxy.d) {
                return true;
            }
        }
        return false;
    }

    public final boolean o() {
        awdg awdg = this.c;
        if ((awdg.a & 64) != 0) {
            aoxy aoxy = awdg.e;
            if (aoxy == null) {
                aoxy = aoxy.f;
            }
            if (aoxy.e) {
                return true;
            }
        }
        return false;
    }

    public final int p() {
        awdg awdg = this.c;
        if ((awdg.b & 2) == 0) {
            return 0;
        }
        aqti aqti = awdg.u;
        if (aqti == null) {
            aqti = aqti.c;
        }
        return aqti.b;
    }

    public final long q() {
        long j;
        awdg awdg = this.c;
        if ((awdg.b & 256) != 0) {
            aqsq aqsq = awdg.z;
            if (aqsq == null) {
                aqsq = aqsq.h;
            }
            j = aqsq.b;
        } else {
            j = 0;
        }
        return j == 0 ? Long.MAX_VALUE : j;
    }

    public final List r() {
        awdg awdg = this.c;
        if ((awdg.b & 256) == 0) {
            return Collections.emptyList();
        }
        aqsq aqsq = awdg.z;
        if (aqsq == null) {
            aqsq = aqsq.h;
        }
        return aajj.a(new anyc(aqsq.d, aqsq.e));
    }

    public final boolean s() {
        awdg awdg = this.c;
        if ((awdg.b & 256) != 0) {
            aqsq aqsq = awdg.z;
            if (aqsq == null) {
                aqsq = aqsq.h;
            }
            if (aqsq.f) {
                return true;
            }
        }
        return false;
    }

    public final boolean t() {
        awdg awdg = this.c;
        if ((awdg.a & 2) != 0) {
            arhh arhh = awdg.d;
            if (arhh == null) {
                arhh = arhh.bv;
            }
            if (arhh.f) {
                return true;
            }
        }
        return false;
    }

    public final boolean u() {
        awdg awdg = this.c;
        if ((awdg.a & 2) != 0) {
            arhh arhh = awdg.d;
            if (arhh == null) {
                arhh = arhh.bv;
            }
            if (arhh.bo) {
                return true;
            }
        }
        return false;
    }

    public final boolean v() {
        awdg awdg = this.c;
        if ((awdg.a & 2) != 0) {
            arhh arhh = awdg.d;
            if (arhh == null) {
                arhh = arhh.bv;
            }
            if (arhh.h) {
                return true;
            }
        }
        return false;
    }

    public final int w() {
        int i;
        awdg awdg = this.c;
        if ((awdg.a & 2) != 0) {
            arhh arhh = awdg.d;
            if (arhh == null) {
                arhh = arhh.bv;
            }
            i = arhh.l;
        } else {
            i = 0;
        }
        return i == 0 ? 25000 : i;
    }

    public final float x() {
        float f;
        awdg awdg = this.c;
        if ((awdg.a & 2) != 0) {
            arhh arhh = awdg.d;
            if (arhh == null) {
                arhh = arhh.bv;
            }
            f = arhh.n;
        } else {
            f = 0.0f;
        }
        return f == 0.0f ? 0.75f : f;
    }

    public final int y() {
        int i;
        awdg awdg = this.c;
        if ((awdg.a & 2) != 0) {
            arhh arhh = awdg.d;
            if (arhh == null) {
                arhh = arhh.bv;
            }
            i = arhh.o;
        } else {
            i = 0;
        }
        return i == 0 ? 50 : i;
    }

    public final int z() {
        int i;
        awdg awdg = this.c;
        if ((awdg.a & 2) != 0) {
            arhh arhh = awdg.d;
            if (arhh == null) {
                arhh = arhh.bv;
            }
            i = arhh.D;
        } else {
            i = 0;
        }
        return i == 0 ? 389 : i;
    }

    public final int A() {
        int i;
        awdg awdg = this.c;
        if ((awdg.a & 2) != 0) {
            arhh arhh = awdg.d;
            if (arhh == null) {
                arhh = arhh.bv;
            }
            i = arhh.E;
        } else {
            i = 0;
        }
        return i == 0 ? 38 : i;
    }

    public final int B() {
        awdg awdg = this.c;
        int i = 0;
        if ((awdg.a & 1) != 0) {
            aqhl aqhl = awdg.c;
            if (aqhl == null) {
                aqhl = aqhl.d;
            }
            if ((aqhl.a & 1) != 0) {
                aqhl = this.c.c;
                if (aqhl == null) {
                    aqhl = aqhl.d;
                }
                aqhj aqhj = aqhl.b;
                if (aqhj == null) {
                    aqhj = aqhj.e;
                }
                i = aqhj.b;
            }
        }
        return i == 0 ? 120000 : i;
    }

    public final int C() {
        awdg awdg = this.c;
        int i = 0;
        if ((awdg.a & 1) != 0) {
            aqhl aqhl = awdg.c;
            if (aqhl == null) {
                aqhl = aqhl.d;
            }
            if ((aqhl.a & 1) != 0) {
                aqhl = this.c.c;
                if (aqhl == null) {
                    aqhl = aqhl.d;
                }
                aqhj aqhj = aqhl.b;
                if (aqhj == null) {
                    aqhj = aqhj.e;
                }
                i = aqhj.c;
            }
        }
        return i == 0 ? 120000 : i;
    }

    public final int D() {
        awdg awdg = this.c;
        if ((awdg.a & 1) != 0) {
            aqhl aqhl = awdg.c;
            if (aqhl == null) {
                aqhl = aqhl.d;
            }
            if ((aqhl.a & 1) != 0) {
                aqhl = this.c.c;
                if (aqhl == null) {
                    aqhl = aqhl.d;
                }
                aqhj aqhj = aqhl.b;
                if (aqhj == null) {
                    aqhj = aqhj.e;
                }
                return aqhj.d;
            }
        }
        return 0;
    }

    public final boolean E() {
        awdg awdg = this.c;
        if ((awdg.a & 2) != 0) {
            arhh arhh = awdg.d;
            if (arhh == null) {
                arhh = arhh.bv;
            }
            if (arhh.bn) {
                return true;
            }
        }
        return false;
    }

    public final int F() {
        int i;
        awdg awdg = this.c;
        if ((awdg.a & 2) != 0) {
            arhh arhh = awdg.d;
            if (arhh == null) {
                arhh = arhh.bv;
            }
            i = arhh.p;
        } else {
            i = 0;
        }
        return i == 0 ? 8000 : i;
    }

    public final int G() {
        int i;
        awdg awdg = this.c;
        if ((awdg.a & 2) != 0) {
            arhh arhh = awdg.d;
            if (arhh == null) {
                arhh = arhh.bv;
            }
            i = arhh.q;
        } else {
            i = 0;
        }
        return i == 0 ? 8000 : i;
    }

    public final int H() {
        int i;
        awdg awdg = this.c;
        if ((awdg.a & 2) != 0) {
            arhh arhh = awdg.d;
            if (arhh == null) {
                arhh = arhh.bv;
            }
            i = arhh.r;
        } else {
            i = 0;
        }
        return i == 0 ? 1 : i;
    }

    public final int I() {
        int i;
        awdg awdg = this.c;
        if ((awdg.a & 2) != 0) {
            arhh arhh = awdg.d;
            if (arhh == null) {
                arhh = arhh.bv;
            }
            i = arhh.t;
        } else {
            i = 0;
        }
        if (i != 0) {
            return i;
        }
        return 2;
    }

    public final int J() {
        awdg awdg = this.c;
        if ((awdg.a & 2) != 0) {
            arhh arhh = awdg.d;
            if (arhh == null) {
                arhh = arhh.bv;
            }
            if (arhh.u != 0) {
                arhh = this.c.d;
                if (arhh == null) {
                    arhh = arhh.bv;
                }
                return arhh.u;
            }
        }
        return 11000;
    }

    public final int K() {
        awdg awdg = this.c;
        if ((awdg.a & 2) != 0) {
            arhh arhh = awdg.d;
            if (arhh == null) {
                arhh = arhh.bv;
            }
            if (arhh.v != 0) {
                arhh = this.c.d;
                if (arhh == null) {
                    arhh = arhh.bv;
                }
                return arhh.v;
            }
        }
        return 10000;
    }

    public final int L() {
        int i;
        awdg awdg = this.c;
        if ((awdg.a & 2) != 0) {
            arhh arhh = awdg.d;
            if (arhh == null) {
                arhh = arhh.bv;
            }
            i = arhh.y;
        } else {
            i = 0;
        }
        return i == 0 ? 2500 : i;
    }

    public final int M() {
        int i;
        awdg awdg = this.c;
        if ((awdg.a & 2) != 0) {
            arhh arhh = awdg.d;
            if (arhh == null) {
                arhh = arhh.bv;
            }
            i = arhh.z;
        } else {
            i = 0;
        }
        return i == 0 ? 5000 : i;
    }

    public final boolean N() {
        awdg awdg = this.c;
        if ((awdg.a & 2) != 0) {
            arhh arhh = awdg.d;
            if (arhh == null) {
                arhh = arhh.bv;
            }
            if (arhh.ai) {
                return true;
            }
        }
        return false;
    }

    public final float O() {
        float f;
        awdg awdg = this.c;
        if ((awdg.a & 2) != 0) {
            arhh arhh = awdg.d;
            if (arhh == null) {
                arhh = arhh.bv;
            }
            f = arhh.ak;
        } else {
            f = 0.0f;
        }
        return f <= 0.0f ? 10.0f : f;
    }

    public final float P() {
        float f;
        awdg awdg = this.c;
        if ((awdg.a & 2) != 0) {
            arhh arhh = awdg.d;
            if (arhh == null) {
                arhh = arhh.bv;
            }
            f = arhh.ax;
        } else {
            f = 0.0f;
        }
        return f <= 0.0f ? 10.0f : f;
    }

    public final boolean Q() {
        awdg awdg = this.c;
        if ((awdg.a & 2) != 0) {
            arhh arhh = awdg.d;
            if (arhh == null) {
                arhh = arhh.bv;
            }
            if (arhh.O) {
                return true;
            }
        }
        return false;
    }

    public final boolean R() {
        awdg awdg = this.c;
        if ((awdg.a & 2) != 0) {
            arhh arhh = awdg.d;
            if (arhh == null) {
                arhh = arhh.bv;
            }
            if (arhh.au) {
                return true;
            }
        }
        return false;
    }

    public final int S() {
        awdg awdg = this.c;
        if ((awdg.a & 2) == 0) {
            return 0;
        }
        arhh arhh = awdg.d;
        if (arhh == null) {
            arhh = arhh.bv;
        }
        return arhh.B;
    }

    public final boolean T() {
        awdg awdg = this.c;
        if ((awdg.a & 2) != 0) {
            arhh arhh = awdg.d;
            if (arhh == null) {
                arhh = arhh.bv;
            }
            if (arhh.C) {
                return true;
            }
        }
        return false;
    }

    public final boolean U() {
        awdg awdg = this.c;
        if ((awdg.a & 2) != 0) {
            arhh arhh = awdg.d;
            if (arhh == null) {
                arhh = arhh.bv;
            }
            if (arhh.bd) {
                return true;
            }
        }
        return false;
    }

    public final boolean V() {
        awdg awdg = this.c;
        if ((awdg.a & 2) != 0) {
            arhh arhh = awdg.d;
            if (arhh == null) {
                arhh = arhh.bv;
            }
            if (arhh.bm) {
                return true;
            }
        }
        return false;
    }

    public final boolean W() {
        awdg awdg = this.c;
        if ((awdg.a & 2) != 0) {
            arhh arhh = awdg.d;
            if (arhh == null) {
                arhh = arhh.bv;
            }
            if (arhh.F) {
                return true;
            }
        }
        return false;
    }

    public final int X() {
        int i;
        awdg awdg = this.c;
        if ((awdg.a & 2) != 0) {
            arhh arhh = awdg.d;
            if (arhh == null) {
                arhh = arhh.bv;
            }
            i = arhh.G;
        } else {
            i = 0;
        }
        return i == 0 ? 3 : i;
    }

    public final boolean Y() {
        awdg awdg = this.c;
        if ((awdg.a & 2) != 0) {
            arhh arhh = awdg.d;
            if (arhh == null) {
                arhh = arhh.bv;
            }
            if (arhh.R) {
                return true;
            }
        }
        return false;
    }

    /* Access modifiers changed, original: final */
    public final boolean Z() {
        awdg awdg = this.c;
        if ((awdg.a & 2) != 0) {
            arhh arhh = awdg.d;
            if (arhh == null) {
                arhh = arhh.bv;
            }
            if (arhh.ab) {
                return true;
            }
        }
        return false;
    }

    public final float aa() {
        awdg awdg = this.c;
        if ((awdg.a & 2) == 0) {
            return 0.0f;
        }
        arhh arhh = awdg.d;
        if (arhh == null) {
            arhh = arhh.bv;
        }
        return arhh.aV;
    }

    public final float ab() {
        awdg awdg = this.c;
        if ((awdg.a & 2) == 0) {
            return 0.0f;
        }
        arhh arhh = awdg.d;
        if (arhh == null) {
            arhh = arhh.bv;
        }
        return arhh.aW;
    }

    public final boolean ac() {
        awdg awdg = this.c;
        if ((awdg.a & 2) != 0) {
            arhh arhh = awdg.d;
            if (arhh == null) {
                arhh = arhh.bv;
            }
            if (arhh.U) {
                return true;
            }
        }
        return false;
    }

    public final int ad() {
        awdg awdg = this.c;
        if ((awdg.a & 2) == 0) {
            return 0;
        }
        arhh arhh = awdg.d;
        if (arhh == null) {
            arhh = arhh.bv;
        }
        return arhh.aK;
    }

    public final boolean ae() {
        awdg awdg = this.c;
        if ((awdg.a & 2) != 0) {
            arhh arhh = awdg.d;
            if (arhh == null) {
                arhh = arhh.bv;
            }
            if (arhh.Y) {
                return true;
            }
        }
        return false;
    }

    public final boolean af() {
        awdg awdg = this.c;
        if ((awdg.a & 2) != 0) {
            arhh arhh = awdg.d;
            if (arhh == null) {
                arhh = arhh.bv;
            }
            if (arhh.ac) {
                return true;
            }
        }
        return false;
    }

    public final boolean ag() {
        awdg awdg = this.c;
        if ((awdg.a & 2) != 0) {
            arhh arhh = awdg.d;
            if (arhh == null) {
                arhh = arhh.bv;
            }
            if (arhh.af) {
                return true;
            }
        }
        return false;
    }

    public final synchronized Set ah() {
        if (this.g == null) {
            arhh arhh = this.c.d;
            if (arhh == null) {
                arhh = arhh.bv;
            }
            this.g = Collections.unmodifiableSet(new HashSet(arhh.am));
        }
        return this.g;
    }

    public final synchronized Set ai() {
        if (this.h == null) {
            Set unmodifiableSet;
            awdg awdg = this.c;
            if ((awdg.a & 2) != 0) {
                arhh arhh = awdg.d;
                if (arhh == null) {
                    arhh = arhh.bv;
                }
                if (!arhh.aC.isEmpty()) {
                    arhh arhh2 = this.c.d;
                    if (arhh2 == null) {
                        arhh2 = arhh.bv;
                    }
                    unmodifiableSet = Collections.unmodifiableSet(new HashSet(arhh2.aC));
                    this.h = unmodifiableSet;
                }
            }
            unmodifiableSet = Collections.emptySet();
            this.h = unmodifiableSet;
        }
        return this.h;
    }

    public final int aj() {
        int i;
        awdg awdg = this.c;
        if ((awdg.a & 2) != 0) {
            arhh arhh = awdg.d;
            if (arhh == null) {
                arhh = arhh.bv;
            }
            i = arhh.aJ;
        } else {
            i = 0;
        }
        return i == 0 ? 12 : i;
    }

    public final float ak() {
        float f;
        awdg awdg = this.c;
        if ((awdg.a & 2) != 0) {
            arhh arhh = awdg.d;
            if (arhh == null) {
                arhh = arhh.bv;
            }
            f = arhh.aI;
        } else {
            f = 0.0f;
        }
        return f == 0.0f ? 0.5f : f;
    }

    public final boolean a(aaju aaju) {
        awdg awdg = this.c;
        if ((awdg.a & 2) == 0) {
            return false;
        }
        arhh arhh = awdg.d;
        if (arhh == null) {
            arhh = arhh.bv;
        }
        int a = axag.a(arhh.aP);
        boolean z = true;
        if (a == 0) {
            a = 1;
        }
        a--;
        if (a != 2) {
            if (a != 3) {
                if (a != 4) {
                    return false;
                }
                return aaju.a();
            } else if (!(aaju == aaju.RECTANGULAR_2D || aaju == aaju.RECTANGULAR_3D || aaju == aaju.NOOP)) {
                z = false;
            }
        }
        return z;
    }

    public final int al() {
        awdg awdg = this.c;
        if ((awdg.a & 2) == 0) {
            return 0;
        }
        arhh arhh = awdg.d;
        if (arhh == null) {
            arhh = arhh.bv;
        }
        return arhh.aN;
    }

    public final boolean am() {
        awdg awdg = this.c;
        if ((awdg.a & 2) != 0) {
            arhh arhh = awdg.d;
            if (arhh == null) {
                arhh = arhh.bv;
            }
            if (arhh.X) {
                return true;
            }
        }
        return false;
    }

    public final boolean an() {
        awdg awdg = this.c;
        if ((awdg.a & 2) != 0) {
            arhh arhh = awdg.d;
            if (arhh == null) {
                arhh = arhh.bv;
            }
            if (arhh.aF) {
                return true;
            }
        }
        return false;
    }

    public final float ao() {
        awdg awdg = this.c;
        if ((awdg.a & 8192) == 0) {
            return 0.85f;
        }
        aosb aosb = awdg.i;
        if (aosb == null) {
            aosb = aosb.n;
        }
        return aosb.k;
    }

    public final boolean ap() {
        if (VERSION.SDK_INT >= 23) {
            awdg awdg = this.c;
            if ((awdg.a & 2) != 0) {
                arhh arhh = awdg.d;
                if (arhh == null) {
                    arhh = arhh.bv;
                }
                if (arhh.bi) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean aq() {
        awdg awdg = this.c;
        if ((awdg.b & 2097152) != 0) {
            aqry aqry = awdg.I;
            if (aqry == null) {
                aqry = aqry.c;
            }
            if (aqry.b) {
                return true;
            }
        }
        return false;
    }

    public final synchronized atzk ar() {
        if (this.j == null) {
            atzk atzk;
            awdg awdg = this.c;
            if ((awdg.a & 1048576) != 0) {
                atzk = awdg.m;
                if (atzk == null) {
                    atzk = atzk.g;
                }
            } else {
                atzk = atzk.g;
            }
            this.j = atzk;
        }
        return this.j;
    }

    public final long as() {
        awdg awdg = this.c;
        if ((awdg.a & 128) == 0) {
            return 0;
        }
        awcc awcc = awdg.f;
        if (awcc == null) {
            awcc = awcc.g;
        }
        if ((awcc.a & 4) != 0) {
            awcc = this.c.f;
            if (awcc == null) {
                awcc = awcc.g;
            }
            azda azda = awcc.c;
            if (azda == null) {
                azda = azda.c;
            }
            return azda.b;
        }
        awcc = this.c.f;
        if (awcc == null) {
            awcc = awcc.g;
        }
        return (long) (awcc.b * 1000.0f);
    }

    public final long at() {
        awdg awdg = this.c;
        if ((awdg.a & 128) == 0) {
            return 0;
        }
        awcc awcc = awdg.f;
        if (awcc == null) {
            awcc = awcc.g;
        }
        return awcc.e;
    }

    public final long au() {
        awdg awdg = this.c;
        if ((awdg.a & 128) == 0) {
            return 0;
        }
        awcc awcc = awdg.f;
        if (awcc == null) {
            awcc = awcc.g;
        }
        return awcc.f;
    }

    public final float av() {
        awdg awdg = this.c;
        if ((awdg.b & 65536) == 0) {
            return 0.0f;
        }
        awgg awgg = awdg.F;
        if (awgg == null) {
            awgg = awgg.c;
        }
        return awgg.b;
    }

    public final long a(long j) {
        long j2;
        awdg awdg = this.c;
        if ((awdg.b & 128) != 0) {
            awtu awtu = awdg.y;
            if (awtu == null) {
                awtu = awtu.d;
            }
            j2 = awtu.b;
        } else {
            j2 = 0;
        }
        return j2 != 0 ? j2 : j;
    }

    public final boolean aw() {
        awdg awdg = this.c;
        if ((awdg.b & 8192) != 0) {
            axbf axbf = awdg.D;
            if (axbf == null) {
                axbf = axbf.n;
            }
            if (axbf.h) {
                return true;
            }
        }
        return false;
    }

    public final int ax() {
        awdg awdg = this.c;
        if ((awdg.b & 8192) == 0) {
            return 0;
        }
        axbf axbf = awdg.D;
        if (axbf == null) {
            axbf = axbf.n;
        }
        return axbf.j;
    }

    public final boolean ay() {
        awdg awdg = this.c;
        if ((awdg.b & 8192) != 0) {
            axbf axbf = awdg.D;
            if (axbf == null) {
                axbf = axbf.n;
            }
            if (axbf.m) {
                return true;
            }
        }
        return false;
    }

    public final long az() {
        long j;
        awdg awdg = this.c;
        if ((awdg.a & 4194304) != 0) {
            axvc axvc = awdg.o;
            if (axvc == null) {
                axvc = axvc.c;
            }
            j = axvc.b;
        } else {
            j = 0;
        }
        return j == 0 ? -1 : j;
    }

    public static List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (avae avae : list) {
            arrayList.add(Integer.valueOf(avae.b));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final boolean aA() {
        awdg awdg = this.c;
        if ((awdg.b & 4) != 0) {
            azfe azfe = awdg.v;
            if (azfe == null) {
                azfe = azfe.k;
            }
            if (azfe.b) {
                return true;
            }
        }
        return false;
    }

    public final boolean aB() {
        awdg awdg = this.c;
        if ((awdg.b & 4) != 0) {
            azfe azfe = awdg.v;
            if (azfe == null) {
                azfe = azfe.k;
            }
            if (azfe.d) {
                return true;
            }
        }
        return false;
    }

    public final boolean aC() {
        awdg awdg = this.c;
        if ((awdg.b & 4) != 0) {
            azfe azfe = awdg.v;
            if (azfe == null) {
                azfe = azfe.k;
            }
            if (azfe.i) {
                return true;
            }
        }
        return false;
    }

    public final boolean aD() {
        awdg awdg = this.c;
        if ((awdg.b & 4) != 0) {
            azfe azfe = awdg.v;
            if (azfe == null) {
                azfe = azfe.k;
            }
            if (azfe.g) {
                return true;
            }
        }
        return false;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(aF());
    }

    public final awdg aE() {
        awdf awdf = (awdf) awdg.J.createBuilder();
        try {
            awdf.mergeFrom(aF(), anxa.c());
            return (awdg) ((anxl) awdf.build());
        } catch (anyg unused) {
            return awdg.J;
        }
    }

    public final byte[] aF() {
        return this.c.toByteArray();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof aajj) && this.c.equals(((aajj) obj).c);
    }

    public final int hashCode() {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int hashCode = this.c.hashCode();
        StringBuilder stringBuilder = new StringBuilder(29);
        stringBuilder.append("PlayerConfigModel@");
        stringBuilder.append(hashCode);
        return stringBuilder.toString();
    }

    /* JADX WARNING: Missing block: B:11:0x0024, code skipped:
            if (r0 != 0) goto L_0x0028;
     */
    public final int a(int r4) {
        /*
        r3 = this;
        r0 = r3.c;
        r1 = r0.a;
        r1 = r1 & 2;
        r2 = 1;
        if (r1 == 0) goto L_0x0027;
    L_0x0009:
        r0 = r0.d;
        if (r0 != 0) goto L_0x000f;
    L_0x000d:
        r0 = defpackage.arhh.bv;
    L_0x000f:
        r0 = r0.c;
        r0 = r0 & 64;
        if (r0 != 0) goto L_0x0016;
    L_0x0015:
        goto L_0x0027;
    L_0x0016:
        r0 = r3.c;
        r0 = r0.d;
        if (r0 != 0) goto L_0x001e;
    L_0x001c:
        r0 = defpackage.arhh.bv;
    L_0x001e:
        r0 = r0.aj;
        r0 = defpackage.awms.a(r0);
        if (r0 == 0) goto L_0x0027;
    L_0x0026:
        goto L_0x0028;
    L_0x0027:
        r0 = 1;
    L_0x0028:
        if (r0 == r2) goto L_0x002b;
    L_0x002a:
        return r0;
    L_0x002b:
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aajj.a(int):int");
    }

    public final int aG() {
        awdg awdg = this.c;
        int i = 2;
        if ((awdg.a & 2) != 0) {
            arhh arhh = awdg.d;
            if (arhh == null) {
                arhh = arhh.bv;
            }
            i = auiv.a(arhh.aw);
            if (i == 0) {
                return 1;
            }
        }
        return i;
    }

    public final int b(int i) {
        awdg awdg = this.c;
        if ((awdg.a & 2) == 0) {
            return 2;
        }
        arhh arhh = awdg.d;
        if (arhh == null) {
            arhh = arhh.bv;
        }
        i = awmu.a(arhh.aH);
        if (i == 0) {
            i = 1;
        }
        return i;
    }

    public final int aH() {
        int a;
        awdg awdg = this.c;
        if ((awdg.b & 1024) != 0) {
            axur axur = awdg.B;
            if (axur == null) {
                axur = axur.g;
            }
            a = axup.a(axur.e);
            if (a != 0) {
                return a;
            }
            return 1;
        }
        a = 1;
        return a;
    }
}
