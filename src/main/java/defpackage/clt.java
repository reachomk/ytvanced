package defpackage;

import android.util.SparseArray;
import android.view.ViewOutlineProvider;
import com.facebook.yoga.YogaEdge;
import com.facebook.yoga.YogaPositionType;
import java.util.ArrayList;

/* renamed from: clt */
public final class clt implements clu {
    public byte a;
    public cqi b;
    public YogaPositionType c;
    public cly d;
    public int e;
    public int f;
    public cvu g;
    public String h;
    public boolean i;
    private clw j;

    clt() {
    }

    public final clw a() {
        if (this.j == null) {
            this.j = new clw();
        }
        return this.j;
    }

    public final cqi b() {
        if (this.b == null) {
            this.b = new cqi();
        }
        return this.b;
    }

    public final void a(coz coz) {
        coj coj;
        int i;
        cqi cqi = this.b;
        if (cqi != null) {
            cqi D;
            cqi D2;
            float f;
            if ((cqi.C & 8) != 0) {
                coz.a(cqi.k);
            }
            if ((cqi.C & 16) != 0) {
                coz.D().b(cqi.m);
            }
            if ((cqi.C & 131072) != 0) {
                coz.b(cqi.l);
            }
            if ((cqi.C & 32) != 0) {
                coz.c(cqi.n);
            }
            if ((cqi.C & 262144) != 0) {
                coj = cqi.o;
                D = coz.D();
                D.C = 262144 | D.C;
                D.o = coj;
            }
            if ((cqi.C & 4194304) != 0) {
                String str = cqi.p;
                D = coz.D();
                D.C = 4194304 | D.C;
                D.p = str;
            }
            if ((cqi.C & 16777216) != 0) {
                CharSequence charSequence = cqi.q;
                D = coz.D();
                D.C = 16777216 | D.C;
                D.q = charSequence;
            }
            if ((cqi.C & 64) != 0) {
                coj = cqi.r;
                D2 = coz.D();
                D2.C |= 64;
                D2.r = coj;
            }
            if ((cqi.C & 128) != 0) {
                coj = cqi.s;
                D2 = coz.D();
                D2.C |= 128;
                D2.s = coj;
            }
            if ((cqi.C & 256) != 0) {
                coj = cqi.u;
                D2 = coz.D();
                D2.C |= 256;
                D2.u = coj;
            }
            if ((cqi.C & 512) != 0) {
                coj = cqi.t;
                D2 = coz.D();
                D2.C |= 512;
                D2.t = coj;
            }
            if ((cqi.C & 1024) != 0) {
                coj = cqi.v;
                D2 = coz.D();
                D2.C |= 1024;
                D2.v = coj;
            }
            if ((cqi.C & 2048) != 0) {
                coj = cqi.w;
                D2 = coz.D();
                D2.C |= 2048;
                D2.w = coj;
            }
            if ((cqi.C & 4096) != 0) {
                coj = cqi.x;
                D2 = coz.D();
                D2.C |= 4096;
                D2.x = coj;
            }
            if ((cqi.C & 8192) != 0) {
                coj = cqi.y;
                D2 = coz.D();
                D2.C |= 8192;
                D2.y = coj;
            }
            if ((cqi.C & 1) != 0) {
                coz.a(cqi.a);
            }
            if ((cqi.C & 16384) != 0) {
                f = cqi.d;
                D2 = coz.D();
                D2.C |= 16384;
                D2.d = f;
            }
            if ((cqi.C & 32768) != 0) {
                ViewOutlineProvider viewOutlineProvider = cqi.e;
                D2 = coz.D();
                D2.C |= 32768;
                D2.e = viewOutlineProvider;
            }
            if ((cqi.C & 65536) != 0) {
                boolean z = cqi.f;
                D2 = coz.D();
                D2.C |= 65536;
                D2.f = z;
            }
            if ((cqi.C & 8388608) != 0) {
                coz.D().a(cqi.g);
            }
            Object obj = cqi.b;
            if (obj != null) {
                coz.a(obj);
            }
            SparseArray sparseArray = cqi.c;
            if (sparseArray != null) {
                coz.a(sparseArray);
            }
            i = cqi.z;
            if (i != 0) {
                coz.D().b(i == 1);
            }
            i = cqi.A;
            if (i != 0) {
                coz.b(i == 1);
            }
            i = cqi.B;
            if (i != 0) {
                D2 = coz.D();
                if (i != 1) {
                    D2.B = 2;
                } else {
                    D2.B = 1;
                }
            }
            if ((cqi.C & 524288) != 0) {
                f = cqi.h;
                coz.p();
                coz.D().a(f);
            }
            if ((cqi.C & 1048576) != 0) {
                f = cqi.i;
                coz.p();
                coz.D().b(f);
            }
            if ((cqi.C & 2097152) != 0) {
                float f2 = cqi.j;
                coz.p();
                coz.D().c(f2);
            }
        }
        if (((long) (this.a & 32)) != 0) {
            coz.a(this.g);
        }
        byte b = this.a;
        if (((long) (b & 64)) != 0) {
            coz.B = this.h;
        }
        if (((long) (b & 2)) != 0) {
            coz.a(this.c);
        }
        if (((long) (this.a & 4)) != 0) {
            for (int i2 = 0; i2 < this.d.a(); i2++) {
                coz.d(this.d.a(i2), this.d.b(i2));
            }
        }
        if (((long) (this.a & 8)) != 0) {
            coz.e(this.e);
        }
        if (((long) (this.a & 16)) != 0) {
            coz.h(this.f);
        }
        if (this.i) {
            coz.p();
        }
        clw clw = this.j;
        if (clw != null) {
            int i3;
            clv clv;
            YogaEdge a;
            if ((clw.a & 1) != 0) {
                coz.a(clw.e);
            }
            if ((clw.a & 64) != 0) {
                coz.d(0);
            }
            if ((clw.a & 128) != 0) {
                coz.a(false);
            }
            coj<YogaEdge> coj2 = null;
            if ((clw.a & 32768) != 0) {
                coz.a((cvl) coj2);
            }
            if ((clw.a & 16777216) != 0) {
                coz.p();
            }
            if ((clw.a & 65536) != 0) {
                coz.d(clw.b);
            }
            if ((clw.a & Long.MIN_VALUE) != 0) {
                coj = clw.c;
                coz.h |= Long.MIN_VALUE;
                coz.v = coz.a(coz.v, coj);
            }
            if ((clw.a & 131072) != 0) {
                coz.q();
            }
            if ((clw.a & 262144) != 0) {
                coz.s();
            }
            if ((clw.a & 524288) != 0) {
                coz.e(clw.d);
            }
            if ((clw.a & 1048576) != 0) {
                coz.r();
            }
            if ((clw.a & 1099511627776L) != 0) {
                coz.h |= 2147483648L;
                coz.A = coz.a(coz.A, (coj) coj2);
            }
            if ((clw.a & 8388608) != 0) {
                coz.a(clw.B);
            }
            if ((clw.a & 2199023255552L) != 0) {
                i = clw.E;
                coz.h |= 4294967296L;
                coz.N = i;
            }
            if ((clw.a & 4611686018427387904L) != 0) {
                crr crr = clw.C;
                if (coz.I == null) {
                    coz.I = new ArrayList(1);
                }
                coz.I.add(crr);
            }
            long j = clw.a;
            if ((33554432 & j) != 0) {
                coz.s = 0.0f;
            }
            if ((67108864 & j) != 0) {
                coz.t = 0.0f;
            }
            if ((j & 2) != 0) {
                coz.c(clw.f);
            }
            if ((clw.a & 1024) != 0) {
                i3 = 0;
                while (true) {
                    clv = clw.o;
                    if (i3 >= clv.c) {
                        break;
                    }
                    coz.c(clv.a[i3], clv.b[i3]);
                    i3++;
                }
            }
            if ((clw.a & 4) != 0) {
                coz.c(0.0f);
            }
            if ((clw.a & 8) != 0) {
                coz.d(clw.g);
            }
            if ((clw.a & 16) != 0) {
                coz.e(clw.h);
            }
            if ((clw.a & 32) != 0) {
                coz.c(clw.i);
            }
            if ((clw.a & 134217728) != 0) {
                coz.f(clw.j);
            }
            if ((clw.a & 2147483648L) != 0) {
                coz.g(clw.q);
            }
            if ((clw.a & 2048) != 0) {
                coz.f(clw.r);
            }
            if ((clw.a & 4294967296L) != 0) {
                coz.h(clw.s);
            }
            if ((clw.a & 4096) != 0) {
                coz.g(clw.t);
            }
            if ((clw.a & 8589934592L) != 0) {
                coz.i(clw.u);
            }
            if ((clw.a & 17179869184L) != 0) {
                coz.j(clw.v);
            }
            if ((clw.a & 8192) != 0) {
                coz.i(clw.w);
            }
            if ((clw.a & 34359738368L) != 0) {
                coz.k(clw.x);
            }
            if ((clw.a & 16384) != 0) {
                coz.j(clw.y);
            }
            if ((clw.a & 68719476736L) != 0) {
                coz.l(clw.z);
            }
            if ((clw.a & 4194304) != 0) {
                coz.m(clw.A);
            }
            if ((clw.a & 8796093022208L) != 0) {
                coz.n();
            }
            if ((clw.a & 256) != 0) {
                for (i3 = 0; i3 < clw.k.a(); i3++) {
                    coz.a(clw.k.a(i3), clw.k.b(i3));
                }
            }
            if ((clw.a & 268435456) != 0) {
                i3 = 0;
                while (true) {
                    clv = clw.l;
                    if (i3 >= clv.c) {
                        break;
                    }
                    coz.a(clv.a[i3], clv.b[i3]);
                    i3++;
                }
            }
            if ((clw.a & 536870912) != 0) {
                for (YogaEdge a2 : coj2) {
                    coz.a(a2);
                }
            }
            if ((clw.a & 512) != 0) {
                for (i3 = 0; i3 < clw.m.a(); i3++) {
                    coz.b(clw.m.a(i3), clw.m.b(i3));
                }
            }
            if ((clw.a & 1073741824) != 0) {
                i3 = 0;
                while (true) {
                    clv = clw.n;
                    if (i3 >= clv.c) {
                        break;
                    }
                    coz.b(clv.a[i3], clv.b[i3]);
                    i3++;
                }
            }
            if ((clw.a & 2097152) != 0) {
                for (i3 = 0; i3 < clw.p.a(); i3++) {
                    a2 = clw.p.a(i3);
                    int b2 = clw.p.b(i3);
                    if (coz.C == null) {
                        coz.C = new cog();
                    }
                    coz.h |= 33554432;
                    coz.C.a(a2, (float) b2);
                }
            }
            if ((clw.a & 137438953472L) != 0) {
                coz.a(clw.D);
            }
            if ((clw.a & 274877906944L) != 0) {
                coz.h |= 536870912;
                coz.n = coj2;
                coz.p();
            }
            if ((clw.a & 549755813888L) != 0) {
                coz.h |= 1073741824;
                coz.o = 0;
                coz.p();
            }
            if ((clw.a & 4398046511104L) != 0) {
                coz.h |= 8589934592L;
            }
        }
    }
}
