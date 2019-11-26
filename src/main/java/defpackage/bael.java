package defpackage;

import android.media.AudioTrack;
import android.os.Handler;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: bael */
public final class bael implements nno {
    public final baes a;
    public final nnn b = new nnn();
    private final Handler c;
    private int d = 0;
    private long e;
    private long f;
    private boolean g;
    private long h;
    private int i;
    private int j;
    private final baee k;
    private baef l;
    private boolean m;
    private ByteBuffer n;
    private ByteBuffer o;
    private boolean p = false;
    private boolean q;
    private boolean r;
    private long s;
    private boolean t;
    private boolean u;
    private boolean v;

    public bael(Handler handler, baes baes, baee baee) {
        this.a = baes;
        this.c = handler;
        this.k = (baee) nwf.a((Object) baee);
    }

    public final void b(nmx nmx) {
        this.i = nmx.q;
        this.m = "audio/raw".equals(nmx.b);
        this.j = nmx.r;
        this.v = true;
    }

    public final void a(nmx nmx) {
        if (!this.v) {
            b(nmx);
        }
        a(nmx.r, nmx.q);
    }

    public final void a(int i, int i2) {
        this.v = false;
        boolean z = true;
        nwf.a(this.i > 0);
        if (i2 <= 0) {
            z = false;
        }
        nwf.a(z);
        if (!this.m) {
            this.j = i;
        }
        try {
            this.l = this.k.a(this.j, this.i);
            i = baet.a(this.l.a());
            i2 = AudioTrack.getMinBufferSize(this.j, 4, 2) * this.l.a();
            if (baet.a < 21) {
                i = Math.max(i, i2);
            }
            int i3 = i;
            this.o = ByteBuffer.allocateDirect(baet.a(2)).order(ByteOrder.LITTLE_ENDIAN);
            this.p = false;
            this.b.a("audio/raw", this.l.a(), this.j, 2, i3);
        } catch (Exception e) {
            Throwable baeg = new baeg(e);
            Handler handler = this.c;
            if (!(handler == null || this.a == null)) {
                handler.post(new baeo(this, baeg));
            }
            throw new nlq(baeg);
        }
    }

    public final void d() {
        this.t = true;
        this.b.c();
    }

    public final void e() {
        this.t = false;
        this.b.g();
    }

    public final boolean a() {
        return this.b.f();
    }

    public final long b() {
        long a = this.b.a(h());
        if (a != Long.MIN_VALUE) {
            if (!this.g) {
                a = Math.max(this.e, a);
            }
            this.e = a;
            this.g = false;
        }
        return this.e;
    }

    public final void f() {
        baef baef = this.l;
        if (baef != null) {
            baef.b();
            this.n = null;
            this.p = false;
        }
        this.d = 0;
        this.b.i();
    }

    public final void a(long j) {
        baef baef = this.l;
        if (baef != null) {
            this.n = null;
            baef.b();
            this.p = false;
        }
        this.b.h();
        this.g = true;
        this.f = j;
        this.e = j;
        this.h = 0;
        this.q = false;
        this.u = false;
    }

    public final void a(float f) {
        this.b.a(f);
    }

    public final boolean a(ByteBuffer byteBuffer) {
        return a(byteBuffer, byteBuffer.position(), byteBuffer.remaining(), false);
    }

    public final boolean a(ByteBuffer byteBuffer, int i, int i2, boolean z) {
        if (z) {
            this.b.d();
            return true;
        }
        if (this.b.a()) {
            z = this.r;
            boolean f = this.b.f();
            this.r = f;
            if (z && !f && this.t) {
                long j;
                long elapsedRealtime = SystemClock.elapsedRealtime() - this.s;
                long j2 = this.b.d;
                if (j2 == -1) {
                    j = -1;
                } else {
                    j = j2 / 1000;
                }
                Handler handler = this.c;
                if (!(handler == null || this.a == null)) {
                    handler.post(new baep(this, j, elapsedRealtime));
                }
            }
        } else {
            try {
                int i3 = this.d;
                if (i3 != 0) {
                    this.b.a(i3);
                } else {
                    this.d = this.b.b();
                }
                this.r = false;
                if (this.t) {
                    this.b.c();
                }
            } catch (nnu e) {
                Handler handler2 = this.c;
                if (!(handler2 == null || this.a == null)) {
                    handler2.post(new baen(this, e));
                }
                throw new nlq(e);
            }
        }
        ByteBuffer byteBuffer2 = this.n;
        if (byteBuffer2 == null || !byteBuffer2.hasRemaining()) {
            this.n = byteBuffer.duplicate();
            this.n.position(i);
            this.n.limit(i + i2);
        }
        boolean a = this.l.a(this.n);
        g();
        return a;
    }

    public final void c() {
        this.u = true;
    }

    private final boolean h() {
        return this.u && !a();
    }

    public final void g() {
        if (this.l != null && !this.q) {
            Object obj = null;
            while (true) {
                if (!(this.p && obj == null)) {
                    boolean b = this.l.b(this.o);
                    this.p = b;
                    if (!b) {
                        if (h() && !this.q) {
                            this.b.e();
                            this.q = true;
                        }
                        return;
                    }
                }
                long a = (long) baet.a(this.o.limit(), this.l.a());
                long a2 = this.f + baet.a(this.h + a, this.j);
                try {
                    nnn nnn = this.b;
                    ByteBuffer byteBuffer = this.o;
                    int a3 = nnn.a(byteBuffer, byteBuffer.position(), this.o.limit(), a2);
                    this.s = SystemClock.elapsedRealtime();
                    if ((a3 & 1) != 0) {
                        this.g = true;
                    }
                    if ((a3 & 2) != 0) {
                        this.o.clear();
                        this.h += a;
                        obj = 1;
                    } else {
                        obj = null;
                    }
                    if (obj == null) {
                        return;
                    }
                } catch (nnt e) {
                    Handler handler = this.c;
                    if (!(handler == null || this.a == null)) {
                        handler.post(new baeq(this, e));
                    }
                    throw new nlq(e);
                }
            }
        }
    }
}
