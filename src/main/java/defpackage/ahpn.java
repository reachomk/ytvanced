package defpackage;

import android.opengl.Matrix;
import java.util.LinkedList;
import java.util.List;

/* renamed from: ahpn */
public final class ahpn {
    public float[] a;
    public float[] b;
    public float[] c;
    public float[] d;
    private final float[] e = new float[16];
    private float[] f;
    private float[] g;
    private ahpn h;
    private final List i = new LinkedList();
    private boolean j = true;

    private ahpn() {
    }

    public static ahpn a() {
        ahpn ahpn = new ahpn();
        ahpn.a = new float[16];
        ahpn.f = new float[16];
        ahpn.b = new float[16];
        ahpn.c = new float[16];
        ahpn.d = new float[16];
        ahpn.g = new float[16];
        Matrix.setIdentityM(ahpn.b, 0);
        Matrix.setIdentityM(ahpn.a, 0);
        Matrix.setIdentityM(ahpn.f, 0);
        Matrix.setIdentityM(ahpn.c, 0);
        Matrix.setIdentityM(ahpn.d, 0);
        Matrix.setIdentityM(ahpn.g, 0);
        return ahpn;
    }

    /* renamed from: b */
    public final ahpn clone() {
        ahpn ahpn = new ahpn();
        ahpn.a = (float[]) this.a.clone();
        ahpn.f = (float[]) this.f.clone();
        ahpn.b = (float[]) this.b.clone();
        ahpn.c = (float[]) this.c.clone();
        ahpn.d = (float[]) this.d.clone();
        ahpn.g = (float[]) this.g.clone();
        ahpn.a(this.h);
        ahpn.j = this.j;
        return ahpn;
    }

    public final void a(float f) {
        Matrix.setIdentityM(this.f, 0);
        Matrix.rotateM(this.f, 0, f, 0.0f, 1.0f, 0.0f);
        e();
    }

    public final void a(float f, float f2, float f3) {
        Matrix.rotateM(this.f, 0, f, f2, f3, 0.0f);
        e();
    }

    public final void c() {
        Matrix.setIdentityM(this.f, 0);
        e();
    }

    public final void b(float f, float f2, float f3) {
        Matrix.translateM(this.b, 0, f, f2, f3);
        d();
        e();
    }

    public final void d() {
        Matrix.multiplyMM(this.g, 0, this.b, 0, this.c, 0);
        e();
    }

    public final void e() {
        Matrix.multiplyMM(this.e, 0, this.f, 0, this.g, 0);
        Matrix.multiplyMM(this.a, 0, this.e, 0, this.d, 0);
        ahpn ahpn = this.h;
        if (ahpn != null && this.j) {
            Matrix.multiplyMM(this.e, 0, ahpn.a, 0, this.a, 0);
            System.arraycopy(this.e, 0, this.a, 0, 16);
        }
        for (ahpn e : this.i) {
            e.e();
        }
    }

    public final void a(ahpn ahpn) {
        if (ahpn != null) {
            this.h = ahpn;
            ahpn.i.add(this);
            e();
        }
    }

    public final void a(boolean z) {
        this.j = z;
        e();
    }
}
