package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.util.SparseIntArray;

/* renamed from: ajlg */
public final class ajlg implements ajks {
    private static final SparseIntArray e;
    public final ajkp a;
    public final ajlh b;
    public wq c;
    public vl d;
    private final Context f;
    private final Handler g;
    private final bcaa h;
    private final bcaa i;
    private final bcaa j;
    private final Runnable k = new ajlf(this);

    public ajlg(Context context, Handler handler, bcaa bcaa, ajkp ajkp, bcaa bcaa2, Class cls, ajlh ajlh) {
        Object ajli = new ajli(context, cls);
        this.f = context;
        this.g = (Handler) amqw.a((Object) handler);
        this.h = (bcaa) amqw.a((Object) bcaa);
        this.a = (ajkp) amqw.a((Object) ajkp);
        this.j = (bcaa) amqw.a(ajli);
        this.i = bcaa2;
        this.b = (ajlh) amqw.a((Object) ajlh);
    }

    public final void a() {
        if (this.c == null) {
            f();
        }
        if (!this.c.b()) {
            this.c.a((PendingIntent) this.i.get());
            this.c.a(true);
            this.c.a(g().a());
        }
    }

    private final void f() {
        if (this.c == null) {
            this.c = (wq) this.j.get();
            this.c.a();
            this.c.a((wv) this.h.get());
            wq wqVar = this.c;
            xu h = h();
            h.a(0, 0);
            h.b = this.b.a();
            wqVar.a(h.a());
            this.c.e();
        }
    }

    public final void b() {
        wq wqVar = this.c;
        if (wqVar != null) {
            this.d = null;
            wqVar.a(false);
            wqVar = this.c;
            xu h = h();
            h.a(1, 0);
            h.b = this.b.c();
            wqVar.a(h.a());
        }
    }

    public final void c() {
        wq wqVar = this.c;
        if (wqVar != null) {
            if (wqVar.b()) {
                b();
            }
            this.c.c();
            this.c = null;
        }
    }

    public final void d() {
        wq wqVar = this.c;
        if (wqVar != null && !wqVar.b()) {
            this.c.a(null);
        }
    }

    public final wq e() {
        xak.a();
        f();
        return this.c;
    }

    public final void a(int i) {
        long j = 0;
        if (!(this.c == null || (i & 3335) == 0)) {
            ajkp ajkp = this.a;
            long j2 = !ajkp.e ? 0 : 6;
            if (ajkp.c) {
                j2 |= 16;
            }
            if (ajkp.d) {
                j2 |= 32;
            }
            if (ajkp.f) {
                j2 |= 256;
            }
            int i2 = e.get(this.a.b, 8);
            xu h = h();
            h.a(i2, this.a.h);
            h.b = this.b.a(j2);
            this.c.a(h.a());
        }
        if (this.c != null && (i & 744) != 0) {
            if (this.a.l == null && (i & 64) != 0) {
                j = 500;
            }
            this.g.removeCallbacks(this.k);
            this.d = g();
            this.g.postDelayed(this.k, j);
        }
    }

    private final vl g() {
        String charSequence = this.a.j.toString();
        vl vlVar = new vl();
        vlVar.a("android.media.metadata.ARTIST", charSequence);
        vlVar.a("android.media.metadata.ALBUM_ARTIST", charSequence);
        vlVar.a("android.media.metadata.TITLE", this.a.i.toString());
        vlVar.a("android.media.metadata.DURATION", this.a.g);
        if (this.a.k.length() != 0) {
            vlVar.a("android.media.metadata.ALBUM", this.a.k.toString());
        }
        Bitmap bitmap = this.a.l;
        if (bitmap != null) {
            vlVar.a("android.media.metadata.ALBUM_ART", bitmap);
        }
        return vlVar;
    }

    private final xu h() {
        xu xuVar = new xu();
        for (ajld ajld : this.b.d()) {
            if (ajld.e()) {
                xz xzVar = new xz(ajld.a(), this.f.getString(ajld.c()), ajld.b());
                if (ajld.d() != null) {
                    xzVar.d = ajld.d();
                }
                xuVar.a.add(new xx(xzVar.a, xzVar.b, xzVar.c, xzVar.d));
            }
        }
        Bundle b = this.b.b();
        int i = 3;
        if (this.a.n == 3) {
            i = 4;
        }
        b.putInt("android.media.session.extra.LEGACY_STREAM_TYPE", i);
        xuVar.e = b;
        return xuVar;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        e = sparseIntArray;
        sparseIntArray.put(2, 3);
        e.put(3, 2);
        e.put(4, 1);
        e.put(5, 6);
        e.put(6, 6);
        e.put(7, 1);
        e.put(8, 7);
        e.put(9, 3);
        e.put(10, 2);
    }
}
