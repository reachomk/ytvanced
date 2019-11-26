package defpackage;

import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Handler;
import java.util.HashSet;
import java.util.Set;

/* renamed from: ahry */
public final class ahry extends ahor implements ahqo {
    public final ahwk a;
    public final ahqp b;
    public final ahpn c = ahpn.a();
    public final Set e = new HashSet();
    public final Set f = new HashSet();
    public ahsb g;
    public boolean h;
    public ahqn i = ahqn.RECTANGULAR;
    public float j;
    public float k;
    public boolean m;
    private final ahpn n = ahpn.a();
    private final ahpn o = ahpn.a();
    private final baem p;
    private final float[] q = new float[16];
    private final Set r = new HashSet();
    private float s;
    private float t;
    private float u;
    private float v;
    private float w;

    ahry(Handler handler, ahxb ahxb, ahsi ahsi, float f, baem baem, ahsq ahsq) {
        amqw.a((Object) handler);
        amqw.a((Object) ahxb);
        amqw.a((Object) ahsi);
        this.p = (baem) amqw.a((Object) baem);
        amqw.a((Object) ahsq);
        this.a = new ahwk(ahxb, ahsq);
        this.c.b(0.0f, 0.0f, ahsg.a);
        this.c.a(this.n);
        this.b = new ahqp(handler, this.n, this.o, ahsi, this, this.a, ahsq);
        b(f);
        a(this.b);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(16384);
        ahsl.b();
    }

    public final void d(ahnj ahnj) {
        amqw.a((Object) ahnj);
        if (this.m) {
            a(ahnj);
            this.m = false;
        }
        super.d(ahnj);
        ahsb ahsb = this.g;
        if (ahsb != null) {
            ahsb.a(ahnj.a);
        }
        Matrix.invertM(this.q, 0, ahnj.a, 0);
        this.p.b(this.q);
        GLES20.glClear(16640);
        ahsl.b();
    }

    public final void a(ahse ahse) {
        amqw.a((Object) ahse);
        ahsh ahsh = ahse.d;
        float f = ahsh.a + ahsh.c;
        float f2 = ahsh.b + ahsh.d;
        if (!(ahsl.a(f, this.u, 0.1f) || ahsl.a(f2, this.v, 0.1f))) {
            this.u = f;
            this.v = f2;
            ahsb ahsb = this.g;
            if (ahsb != null) {
                ahsb.a(f, f2);
            }
            d();
            c();
        }
        super.a(ahse);
    }

    private final void d() {
        double tan = Math.tan(Math.toRadians((double) ((this.v + this.u) / 4.0f))) * 1.399999976158142d;
        double d = (double) ahsg.a;
        Double.isNaN(d);
        float f = (float) (tan * d);
        tan = (double) (f + f);
        d = (double) ((float) Math.atan((double) (1.0f / this.w)));
        double sin = Math.sin(d);
        Double.isNaN(tan);
        this.s = (float) Math.abs(sin * tan);
        d = Math.cos(d);
        Double.isNaN(tan);
        this.t = (float) Math.abs(tan * d);
    }

    public final void bd_() {
        this.a.b();
        super.bd_();
    }

    public final void c(boolean z) {
        ahqp ahqp = this.b;
        if (z) {
            if (!ahqp.c) {
                ahqp.c = true;
                ahsf ahsf = ahqp.b;
                ahsf.a.obtainMessage(1, ahsf).sendToTarget();
                ahqp.f = true;
            }
        } else if (ahqp.c) {
            ahqp.c = false;
            ahqp.a.b();
            ahqp.f = true;
        }
    }

    public final void a(float f) {
        this.b.a(f);
    }

    public final void a(ahnj ahnj) {
        amqw.a((Object) ahnj);
        Object obj = ahnj.a;
        amqw.a(obj);
        amqw.a(obj.length == 16);
        float f = obj[6];
        float toDegrees = (float) Math.toDegrees((double) (-(Math.sqrt((double) (1.0f - (f * f))) >= 0.009999999776482582d ? (float) Math.atan2((double) (-obj[2]), (double) obj[10]) : 0.0f)));
        double toDegrees2 = Math.toDegrees(-Math.asin((double) obj[6]));
        this.n.c();
        this.n.a(toDegrees, 0.0f, 1.0f);
        this.n.a((float) toDegrees2, 1.0f, 0.0f);
        this.o.c();
        this.o.a(toDegrees, 0.0f, 1.0f);
    }

    public final void a(ahsd ahsd) {
        this.e.add(ahsd);
    }

    public final void b(ahsd ahsd) {
        this.e.remove(ahsd);
    }

    public final void a(ahsc ahsc) {
        this.r.add(ahsc);
    }

    public final void b(ahsc ahsc) {
        this.r.remove(ahsc);
    }

    public final void b(float f) {
        this.w = f;
        d();
        c();
    }

    public final void c() {
        float f;
        float f2 = this.w;
        if (f2 < 1.0f) {
            f = this.t;
            f2 *= f;
            this.j = f2;
            this.k = f;
            float f3 = f;
            f = f2;
            f2 = f3;
        } else {
            f = this.s;
            this.j = f;
            f2 = f / f2;
            this.k = f2;
        }
        if (this.h) {
            f *= 1.42f;
            this.j = f;
            f2 *= 1.42f;
            this.k = f2;
        }
        ahqp ahqp = this.b;
        ahqp.g = f;
        ahqp.h = f2;
        if (ahqp.d == aaju.RECTANGULAR_2D || ahqp.d == aaju.RECTANGULAR_3D) {
            ahqp.c();
        }
        for (ahsc a : this.r) {
            a.a(this.j, this.k);
        }
    }

    public final void a(boolean z) {
        for (ahsa a : this.f) {
            a.a(z);
        }
    }
}
