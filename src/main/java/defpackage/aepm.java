package defpackage;

import android.content.Context;
import android.net.Uri;
import android.view.Surface;
import android.view.SurfaceHolder;
import java.util.Map;

/* renamed from: aepm */
public class aepm implements aepr, aeps {
    public aepr a;
    private final aeps b;

    public aepm(aeps aeps) {
        this.b = aeps;
    }

    public void a(Context context, Uri uri, Map map) {
        this.b.a(context, uri, map);
    }

    public final void a() {
        this.b.a();
    }

    public final void b() {
        this.b.b();
    }

    public final void c() {
        this.b.c();
    }

    public final void d() {
        this.b.d();
    }

    public final void e() {
        this.b.e();
    }

    public final int f() {
        return this.b.f();
    }

    public final int g() {
        return this.b.g();
    }

    public final int h() {
        return this.b.h();
    }

    public final void a(long j) {
        this.b.a(j);
    }

    public final void a(float f, float f2) {
        this.b.a(f, f2);
    }

    public final void a(int i) {
        this.b.a(i);
    }

    public final void a(SurfaceHolder surfaceHolder) {
        this.b.a(surfaceHolder);
    }

    public final void a(Surface surface) {
        this.b.a(surface);
    }

    public void a(aepr aepr) {
        this.a = aepr;
    }

    public final boolean a(int i, int i2) {
        aepr aepr = this.a;
        return aepr != null ? aepr.a(i, i2) : false;
    }

    public final boolean b(int i, int i2) {
        aepr aepr = this.a;
        return aepr != null ? aepr.b(i, i2) : false;
    }

    public final void i() {
        aepr aepr = this.a;
        if (aepr != null) {
            aepr.i();
        }
    }

    public final void j() {
        aepr aepr = this.a;
        if (aepr != null) {
            aepr.j();
        }
    }

    public void b(int i) {
        c(i);
    }

    public final void a(aeps aeps, int i, int i2) {
        aepr aepr = this.a;
        if (aepr != null) {
            aepr.a(this, i, i2);
        }
    }

    public final void a(aeps aeps) {
        aepr aepr = this.a;
        if (aepr != null) {
            aepr.a(this);
        }
    }

    public final void c(int i) {
        aepr aepr = this.a;
        if (aepr != null) {
            aepr.b(i);
        }
    }
}
