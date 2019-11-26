package defpackage;

import android.graphics.drawable.Drawable;
import com.facebook.yoga.YogaAlign;
import com.facebook.yoga.YogaDirection;
import com.facebook.yoga.YogaEdge;
import com.facebook.yoga.YogaPositionType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;

/* renamed from: clz */
public abstract class clz {
    private cmg a;
    public cma b;
    public cqw c;

    public abstract cma c();

    public abstract clz d();

    /* Access modifiers changed, original: protected|final */
    public final void a(cmg cmg, cma cma) {
        this.c = new cqw(cmg);
        this.b = cma;
        this.a = cmg;
        this.b.i = this.a.g();
        cma cma2 = this.a.h;
        if (cma2 != null) {
            this.b.k = cma2.l;
        }
    }

    public final clz a(String str) {
        if (str == null) {
            cmg cmg = this.a;
            cnh cnh = cmg.d;
            if (cnh != null) {
                cma cma = cmg.h;
                Object b = cma != null ? cma.b() : "unknown component";
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(b).length() + 99);
                stringBuilder.append("Setting a null key from ");
                stringBuilder.append(b);
                stringBuilder.append(" which is usually a mistake! If it is not, explicitly set the String 'null'");
                cnh.a(2, stringBuilder.toString());
            }
            str = "null";
        }
        cma cma2 = this.b;
        cma2.n = true;
        cma2.m = str;
        return d();
    }

    /* Access modifiers changed, original: protected|final */
    public final void e() {
        this.a = null;
        this.b = null;
        this.c = null;
    }

    protected static void a(int i, BitSet bitSet, String[] strArr) {
        if (bitSet != null) {
            int i2 = 0;
            if (bitSet.nextClearBit(0) < i) {
                ArrayList arrayList = new ArrayList();
                while (i2 < i) {
                    if (!bitSet.get(i2)) {
                        arrayList.add(strArr[i2]);
                    }
                    i2++;
                }
                String valueOf = String.valueOf(Arrays.toString(arrayList.toArray()));
                String str = "The following props are not marked as optional and were not supplied: ";
                throw new IllegalStateException(valueOf.length() == 0 ? new String(str) : str.concat(valueOf));
            }
        }
    }

    public final clz a(YogaDirection yogaDirection) {
        clw a = this.b.l().a();
        a.a |= 1;
        a.e = yogaDirection;
        return d();
    }

    public final clz b(YogaAlign yogaAlign) {
        clw a = this.b.l().a();
        a.a |= 2;
        a.f = yogaAlign;
        return d();
    }

    public final clz a(YogaPositionType yogaPositionType) {
        clt l = this.b.l();
        l.a = (byte) (l.a | 2);
        l.c = yogaPositionType;
        return d();
    }

    public final clz a(float f) {
        clw a = this.b.l().a();
        a.a |= 8;
        a.g = f;
        return d();
    }

    public final clz b(float f) {
        clw a = this.b.l().a();
        a.a |= 16;
        a.h = f;
        return d();
    }

    public final clz c(float f) {
        clw a = this.b.l().a();
        a.a |= 134217728;
        a.j = f;
        return d();
    }

    public final clz d(float f) {
        int a = this.c.a(f);
        clw a2 = this.b.l().a();
        a2.a |= 32;
        a2.i = a;
        return d();
    }

    public final clz a(YogaEdge yogaEdge, float f) {
        clw a = this.b.l().a();
        a.a |= 268435456;
        if (a.l == null) {
            a.l = new clv();
        }
        a.l.a(yogaEdge, f);
        return d();
    }

    public final clz b(YogaEdge yogaEdge, float f) {
        int a = this.c.a(f);
        clw a2 = this.b.l().a();
        a2.a |= 256;
        if (a2.k == null) {
            a2.k = new cly();
        }
        a2.k.a(yogaEdge, a);
        return d();
    }

    public final clz c(YogaEdge yogaEdge, float f) {
        clw a = this.b.l().a();
        a.a |= 1073741824;
        if (a.n == null) {
            a.n = new clv();
        }
        a.n.a(yogaEdge, f);
        return d();
    }

    public final clz d(YogaEdge yogaEdge, float f) {
        int a = this.c.a(f);
        clw a2 = this.b.l().a();
        a2.a |= 512;
        if (a2.m == null) {
            a2.m = new cly();
        }
        a2.m.a(yogaEdge, a);
        return d();
    }

    public final clz a(clo clo) {
        clw a = this.b.l().a();
        if (clo != null) {
            a.a |= 137438953472L;
            a.D = clo;
        }
        return d();
    }

    public final clz a(YogaEdge yogaEdge, int i) {
        clt l = this.b.l();
        l.a = (byte) (l.a | 4);
        if (l.d == null) {
            l.d = new cly();
        }
        l.d.a(yogaEdge, i);
        return d();
    }

    public final clz e(YogaEdge yogaEdge, float f) {
        clw a = this.b.l().a();
        a.a |= 1024;
        if (a.o == null) {
            a.o = new clv();
        }
        a.o.a(yogaEdge, f);
        return d();
    }

    public final clz f(YogaEdge yogaEdge, float f) {
        return a(yogaEdge, this.c.a(f));
    }

    public final clz e(float f) {
        clw a = this.b.l().a();
        a.a |= 2147483648L;
        a.q = f;
        return d();
    }

    public final clz f(float f) {
        int a = this.c.a(f);
        clt l = this.b.l();
        l.a = (byte) (l.a | 8);
        l.e = a;
        return d();
    }

    public final clz g(float f) {
        clw a = this.b.l().a();
        a.a |= 4294967296L;
        a.s = f;
        return d();
    }

    public final clz h(float f) {
        int a = this.c.a(f);
        clw a2 = this.b.l().a();
        a2.a |= 2048;
        a2.r = a;
        return d();
    }

    public final clz i(float f) {
        clw a = this.b.l().a();
        a.a |= 8589934592L;
        a.u = f;
        return d();
    }

    public final clz j(float f) {
        int a = this.c.a(f);
        clw a2 = this.b.l().a();
        a2.a |= 4096;
        a2.t = a;
        return d();
    }

    public final clz k(float f) {
        clw a = this.b.l().a();
        a.a |= 17179869184L;
        a.v = f;
        return d();
    }

    public final clz l(float f) {
        int a = this.c.a(f);
        clt l = this.b.l();
        l.a = (byte) (l.a | 16);
        l.f = a;
        return d();
    }

    public final clz a(int i) {
        clw a = this.b.l().a();
        a.a |= 8192;
        a.w = i;
        return d();
    }

    public final clz m(float f) {
        clw a = this.b.l().a();
        a.a |= 34359738368L;
        a.x = f;
        return d();
    }

    public final clz n(float f) {
        return a(this.c.a(f));
    }

    public final clz o(float f) {
        clw a = this.b.l().a();
        a.a |= 68719476736L;
        a.z = f;
        return d();
    }

    public final clz p(float f) {
        int a = this.c.a(f);
        clw a2 = this.b.l().a();
        a2.a |= 16384;
        a2.y = a;
        return d();
    }

    public final clz q(float f) {
        clw a = this.b.l().a();
        a.a |= 4194304;
        a.A = f;
        return d();
    }

    public final clz g(YogaEdge yogaEdge, float f) {
        int a = this.c.a(f);
        clw a2 = this.b.l().a();
        a2.a |= 2097152;
        if (a2.p == null) {
            a2.p = new cly();
        }
        a2.p.a(yogaEdge, a);
        return d();
    }

    private final clz a(cvl cvl) {
        cvu a = cvs.a(cvl);
        clt l = this.b.l();
        l.a = (byte) (l.a | 32);
        l.g = a;
        return d();
    }

    @Deprecated
    public final clz a(Drawable drawable) {
        if (drawable instanceof cvl) {
            return a((cvl) drawable);
        }
        return a(new cvn(drawable));
    }

    public final clz f() {
        this.b.l().i = true;
        return d();
    }

    public final clz a(coj coj) {
        this.b.l().b().a(coj);
        return d();
    }

    public final clz b(coj coj) {
        this.b.l().b().c(coj);
        return d();
    }

    public final clz c(coj coj) {
        this.b.l().b().d(coj);
        return d();
    }

    public final clz a(boolean z) {
        this.b.l().b().b(z);
        return d();
    }

    public final clz d(coj coj) {
        clw a = this.b.l().a();
        a.a |= 65536;
        a.b = coj;
        return d();
    }

    public final clz e(coj coj) {
        clw a = this.b.l().a();
        a.a |= 524288;
        a.d = coj;
        return d();
    }

    public clz a(CharSequence charSequence) {
        this.b.l().b().a(charSequence);
        return d();
    }

    public final clz a(Object obj) {
        this.b.l().b().a(obj);
        return d();
    }

    public final clz b(String str) {
        clt l = this.b.l();
        l.a = (byte) (l.a | 64);
        l.h = str;
        return d();
    }

    public final clz c(String str) {
        clw a = this.b.l().a();
        a.a |= 8388608;
        a.B = str;
        if (this.b.l().a().E == 0) {
            b(crr.b);
        }
        return d();
    }

    public final clz a(crr crr) {
        clw a = this.b.l().a();
        a.a |= 4611686018427387904L;
        a.C = crr;
        return d();
    }

    public final clz r(float f) {
        this.b.l().b().b(f);
        return d();
    }

    public final clz s(float f) {
        this.b.l().b().a(f);
        return d();
    }

    public final clz t(float f) {
        this.b.l().b().c(f);
        return d();
    }

    public final clz b(int i) {
        if (i != 0) {
            clw a = this.b.l().a();
            a.a |= 2199023255552L;
            a.E = i;
            return d();
        }
        throw new IllegalArgumentException("TransitionKeyType must not be null");
    }
}
