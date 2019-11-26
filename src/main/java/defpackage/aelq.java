package defpackage;

import android.net.Uri;

/* renamed from: aelq */
final class aelq {
    public Uri a;
    public long b = 0;
    public long c = 0;
    public long d;
    public final oeo e;
    public final aajk f;
    public final /* synthetic */ aeln g;
    private Uri h;
    private Uri i;
    private String j = null;
    private long k = 0;
    private final boolean l;
    private boolean m;

    public aelq(aeln aeln, Uri uri, boolean z, aajk aajk) {
        this.g = aeln;
        this.a = (Uri) amqw.a((Object) uri);
        this.e = (oeo) aeln.a.get();
        this.d = aeln.c.b();
        this.l = z;
        this.m = false;
        this.f = aajk;
    }

    public final synchronized String a() {
        if (this.j == null) {
            return null;
        }
        long b = this.g.c.b();
        long j = this.k;
        aeln aeln = this.g;
        if (b - j > aeln.b + aeln.g) {
            return null;
        }
        return this.j;
    }

    public final void b() {
        this.a = aell.a(this.a);
        this.b = this.g.c.b();
    }

    public final synchronized void a(Uri uri, Uri uri2) {
        this.h = uri;
        this.i = uri2;
        this.j = uri2.getAuthority();
        this.k = this.g.c.b();
    }

    public final synchronized aelo c() {
        return new aelj(this.h, this.i);
    }

    public final synchronized void d() {
        long j;
        if (this.l) {
            if (this.m) {
                j = this.c;
                j = Math.max(1000, j + j);
            } else {
                j = 0;
            }
            this.c = j;
            j = Math.min(j, this.g.b);
            this.c = j;
        } else {
            j = Math.max(this.c, this.g.b);
            j += j;
            this.c = j;
        }
        this.c = Math.min(86400000, j);
        this.d = this.g.c.b() + this.c;
        this.m = true;
    }

    public final synchronized void e() {
        this.c = 0;
        this.d = this.g.c.b() + this.g.b;
        this.m = false;
    }
}
