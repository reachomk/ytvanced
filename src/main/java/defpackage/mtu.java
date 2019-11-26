package defpackage;

import android.app.ActionBar;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.view.Window;

/* renamed from: mtu */
public final class mtu implements xoc, xpe {
    public final Context a;
    public final mtx b;
    public final xoa c;
    public final boolean d;
    public int e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public final xot o;
    public boolean p;
    private final msh q;
    private final ActionBar r;
    private final Window s;
    private int t;
    private boolean u;

    public mtu(Context context, msh msh, mtx mtx, aiuf aiuf, xot xot) {
        int i;
        this.a = (Context) amqw.a((Object) context, (Object) "context cannot be null");
        this.q = (msh) amqw.a((Object) msh, (Object) "activityProxy cannot be null");
        this.b = (mtx) amqw.a((Object) mtx, (Object) "listener cannot be null");
        this.o = xot;
        this.r = msh.a();
        this.s = msh.c();
        this.i = msh.b();
        this.t = msh.b();
        this.c = new xoa(context, msh.a.getWindowManager(), this);
        this.e = context.getResources().getConfiguration().orientation;
        try {
            if ((context.getPackageManager().getActivityInfo(msh.a.getComponentName(), 0).configChanges & 128) != 0) {
                i = 1;
                this.d = i ^ 1;
                this.j = true;
                this.n = true;
                this.k = false;
                this.l = false;
                this.f = true;
                amqw.a((Object) aiuf, (Object) "playerOverlaysLayout cannot be null");
                xot.a((xpe) this);
                aiuf.a((xol) xot);
            }
        } catch (NameNotFoundException unused) {
        }
        i = 0;
        this.d = i ^ 1;
        this.j = true;
        this.n = true;
        this.k = false;
        this.l = false;
        this.f = true;
        amqw.a((Object) aiuf, (Object) "playerOverlaysLayout cannot be null");
        xot.a((xpe) this);
        aiuf.a((xol) xot);
    }

    public final void a(int i) {
        int i2 = i & 4;
        if (i2 != 0 && (i & 1) == 0) {
            throw new IllegalArgumentException("Can not set FULLSCREEN_FLAG_FULLSCREEN_WHEN_DEVICE_LANDSCAPE without setting FULLSCREEN_FLAG_CONTROL_ORIENTATION");
        }
        boolean z = this.k;
        int i3 = 0;
        this.j = (i & 1) != 0;
        this.n = (i & 2) != 0;
        boolean z2 = i2 != 0;
        this.k = z2;
        this.l = (i & 8) != 0;
        if (z2) {
            this.c.enable();
        } else if (z && this.e == 1) {
            this.c.disable();
        }
        xot xot = this.o;
        if (!(!this.l || this.r == null || this.s.hasFeature(9))) {
            i3 = 1;
        }
        xot.c(i3 ^ 1);
    }

    public final void a(boolean z, int i) {
        if (z && this.k && !this.g && !this.h) {
            this.b.a(true);
        }
    }

    public final void b(boolean z, int i) {
        this.h = false;
        if (!this.f || !this.j) {
            return;
        }
        if (z) {
            if (this.k && !this.g) {
                this.b.a(true);
            }
        } else if (a()) {
            if (this.d) {
                this.b.a(false);
            }
            b(this.i);
        }
    }

    public final void k() {
        if (this.f && this.g && this.n) {
            this.b.a();
        }
    }

    public final boolean a() {
        return this.t != this.i;
    }

    public final void b(int i) {
        int i2 = this.i;
        if (this.q.b() != this.t) {
            this.i = this.q.b();
        }
        if (i == i2) {
            i = this.i;
        }
        this.t = i;
        this.q.a.setRequestedOrientation(i);
    }

    public final int b() {
        int i = 0;
        int i2 = (this.j | (!this.n ? 0 : 2)) | (!this.k ? 0 : 4);
        if (this.l) {
            i = 8;
        }
        return i2 | i;
    }

    public final void c() {
        if (this.n) {
            xot xot = this.o;
            int i = 1;
            if (!(this.p || this.u)) {
                i = 0;
            }
            xot.a(i);
        }
    }

    public final void d() {
        this.o.b(2);
        c();
    }

    public final void a(boolean z) {
        this.u = z;
        c();
    }
}
