package defpackage;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* renamed from: cdy */
final class cdy {
    public final brz a;
    public final List b = new ArrayList();
    public final brl c;
    public boolean d;
    public cdx e;
    public boolean f;
    public cdx g;
    public Bitmap h;
    public cdx i;
    private final Handler j;
    private final bwd k;
    private boolean l;
    private brj m;

    cdy(bqy bqy, brz brz, int i, int i2, bsr bsr, Bitmap bitmap) {
        bwd bwd = bqy.a;
        brl b = bqy.b(bqy.a());
        brj brj = (brj) bqy.b(bqy.a()).d().b(((cgg) ((cgg) cgg.b(bup.a).c()).d()).b(i, i2));
        this.c = b;
        Handler handler = new Handler(Looper.getMainLooper(), new cdz(this));
        this.k = bwd;
        this.j = handler;
        this.m = brj;
        this.a = brz;
        a(bsr, bitmap);
    }

    /* Access modifiers changed, original: final */
    public final void a(bsr bsr, Bitmap bitmap) {
        chw.a((Object) bsr);
        this.h = (Bitmap) chw.a((Object) bitmap);
        this.m = (brj) this.m.b(new cgg().a(bsr));
    }

    /* Access modifiers changed, original: final */
    public final int a() {
        return this.a.d();
    }

    public final void b() {
        this.d = false;
    }

    /* Access modifiers changed, original: final */
    public final Bitmap c() {
        cdx cdx = this.e;
        if (cdx == null) {
            return this.h;
        }
        return cdx.b;
    }

    public final void d() {
        if (this.d && !this.l) {
            cdx cdx = this.i;
            if (cdx != null) {
                this.i = null;
                a(cdx);
                return;
            }
            this.l = true;
            int c = this.a.c();
            long uptimeMillis = SystemClock.uptimeMillis();
            this.a.b();
            this.g = new cdx(this.j, this.a.e(), uptimeMillis + ((long) c));
            ((brj) this.m.b(cgg.b(new chi(Double.valueOf(Math.random()))))).a(this.a).a(this.g);
        }
    }

    public final void e() {
        Bitmap bitmap = this.h;
        if (bitmap != null) {
            this.k.a(bitmap);
            this.h = null;
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(cdx cdx) {
        this.l = false;
        if (this.f) {
            this.j.obtainMessage(2, cdx).sendToTarget();
        } else if (this.d) {
            if (cdx.b != null) {
                e();
                cdx cdx2 = this.e;
                this.e = cdx;
                int size = this.b.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    ((cea) this.b.get(size)).c();
                }
                if (cdx2 != null) {
                    this.j.obtainMessage(2, cdx2).sendToTarget();
                }
            }
            d();
        } else {
            this.i = cdx;
        }
    }
}
