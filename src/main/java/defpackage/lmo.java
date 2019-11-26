package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.watch.nextgenwatch.swipey.TransparentHoleImageView;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: lmo */
public final class lmo implements eln, loe, lqn {
    public final lms a;
    public final lms b;
    public int c = 0;
    public int d;
    private final List e = new ArrayList();
    private final Rect f = new Rect();
    private boolean g;
    private final xmy h;
    private final long i;
    private lqk j;
    private lqk k;
    private View l;
    private int m;

    public lmo(View view) {
        amqw.a((Object) view);
        lmr lmr = new lmr();
        ffs ffs = new ffs();
        this.a = new lms(view, new lmq(this));
        this.b = new lms(view, new lmt(this));
        this.h = new xmy();
        this.i = (long) view.getResources().getInteger(R.integer.fade_duration_fast);
    }

    public final void a(View view) {
        amqw.b(this.l == null);
        this.l = view;
        c();
        b();
    }

    public final void b(View view) {
        amqw.b(this.l == view);
        lqk e = e();
        if (!(e == null || this.l == null)) {
            ((ViewGroup) e.e()).removeView(this.l);
        }
        this.l = null;
    }

    public final void a() {
        this.a.a();
        this.b.a();
    }

    public final void c(View view) {
        this.e.add(view);
        lqk e = e();
        if (e != null) {
            e.b(view);
        }
        e = this.k;
        if (e != null) {
            e.a(view);
        }
    }

    public final void d(View view) {
        this.e.remove(view);
        lqk e = e();
        if (e != null) {
            e.b(view);
        }
    }

    public final void a(float f) {
        lqk e = e();
        if (e != null) {
            e.setAlpha(f);
        }
    }

    public final void a(lqk lqk) {
        int i = this.c;
        if (this.k != lqk) {
            if (i < 2) {
                d();
            }
            this.j = this.k;
            this.k = lqk;
            c();
            b();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x00bf  */
    /* JADX WARNING: Missing block: B:7:0x0014, code skipped:
            if (r0 != 5) goto L_0x00cd;
     */
    public final void b() {
        /*
        r8 = this;
        r0 = r8.c;
        r1 = 2;
        r2 = 3;
        r3 = "State = %s";
        r4 = 0;
        r5 = 1;
        if (r0 == 0) goto L_0x0085;
    L_0x000a:
        if (r0 == r5) goto L_0x00ad;
    L_0x000c:
        if (r0 == r1) goto L_0x00bd;
    L_0x000e:
        r1 = 5;
        r6 = 4;
        if (r0 == r2) goto L_0x0018;
    L_0x0012:
        if (r0 == r6) goto L_0x0051;
    L_0x0014:
        if (r0 == r1) goto L_0x0071;
    L_0x0016:
        goto L_0x00cd;
    L_0x0018:
        if (r0 != r2) goto L_0x001c;
    L_0x001a:
        r2 = 1;
        goto L_0x001d;
    L_0x001c:
        r2 = 0;
    L_0x001d:
        defpackage.amqw.b(r2, r3, r0);
        r0 = r8.k;
        if (r0 == 0) goto L_0x004c;
    L_0x0024:
        r2 = r8.l;
        if (r2 == 0) goto L_0x0033;
    L_0x0028:
        r0 = r0.e();
        r0 = (android.view.ViewGroup) r0;
        r2 = r8.l;
        r0.addView(r2);
    L_0x0033:
        r0 = 0;
    L_0x0034:
        r2 = r8.e;
        r2 = r2.size();
        if (r0 >= r2) goto L_0x004c;
    L_0x003c:
        r2 = r8.k;
        r7 = r8.e;
        r7 = r7.get(r0);
        r7 = (android.view.View) r7;
        r2.a(r7);
        r0 = r0 + 1;
        goto L_0x0034;
    L_0x004c:
        r0 = r8.c;
        r0 = r0 + r5;
        r8.c = r0;
    L_0x0051:
        if (r0 != r6) goto L_0x0055;
    L_0x0053:
        r2 = 1;
        goto L_0x0056;
    L_0x0055:
        r2 = 0;
    L_0x0056:
        defpackage.amqw.b(r2, r3, r0);
        r0 = r8.k;
        r0 = r8.b(r0);
        if (r0 == 0) goto L_0x0064;
    L_0x0061:
        r0.b(r5);
    L_0x0064:
        r0 = r8.b;
        r0 = r8.a(r0);
        if (r0 != 0) goto L_0x00cd;
    L_0x006c:
        r0 = r8.c;
        r0 = r0 + r5;
        r8.c = r0;
    L_0x0071:
        if (r0 != r1) goto L_0x0074;
    L_0x0073:
        r4 = 1;
    L_0x0074:
        defpackage.amqw.b(r4, r3, r0);
        r8.a();
        r0 = r8.k;
        r8.c(r0);
        r0 = r8.c;
        r0 = r0 + r5;
        r8.c = r0;
        return;
    L_0x0085:
        if (r0 != 0) goto L_0x0089;
    L_0x0087:
        r6 = 1;
        goto L_0x008a;
    L_0x0089:
        r6 = 0;
    L_0x008a:
        defpackage.amqw.b(r6, r3, r0);
        r0 = r8.j;
        r0 = r8.b(r0);
        if (r0 == 0) goto L_0x00a8;
    L_0x0095:
        r0.a(r4);
        r6 = r8.f;
        r6.setEmpty();
        r0 = r0.d();
        r0 = (com.google.android.apps.youtube.app.watch.nextgenwatch.swipey.TransparentHoleImageView) r0;
        r6 = r8.f;
        r0.a(r6);
    L_0x00a8:
        r0 = r8.c;
        r0 = r0 + r5;
        r8.c = r0;
    L_0x00ad:
        if (r0 != r5) goto L_0x00b1;
    L_0x00af:
        r6 = 1;
        goto L_0x00b2;
    L_0x00b1:
        r6 = 0;
    L_0x00b2:
        defpackage.amqw.b(r6, r3, r0);
        r8.d();
        r0 = r8.c;
        r0 = r0 + r5;
        r8.c = r0;
    L_0x00bd:
        if (r0 != r1) goto L_0x00c0;
    L_0x00bf:
        r4 = 1;
    L_0x00c0:
        defpackage.amqw.b(r4, r3, r0);
        r8.d = r2;
        r8.a();
        r0 = r8.a;
        r0.b();
    L_0x00cd:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lmo.b():void");
    }

    private final void c() {
        a();
        this.c = 0;
    }

    private final void d() {
        c(this.j);
        if (this.j != null) {
            for (int i = 0; i < this.e.size(); i++) {
                this.j.b((View) this.e.get(i));
            }
            if (this.l != null) {
                ((ViewGroup) this.j.e()).removeView(this.l);
            }
            this.j.setAlpha(1.0f);
            this.j = null;
        }
        lqk lqk = this.k;
        if (lqk != null) {
            xqc b = b(lqk);
            if (b != null) {
                b.a(false);
            }
        }
    }

    private final lqk e() {
        return this.c >= 2 ? this.k : this.j;
    }

    public final void a(boolean z) {
        this.g = z;
    }

    public final void a(int i, float f) {
        Object obj = (this.m != 0 && i == 0) ? 1 : null;
        this.m = i;
        lqk e = e();
        xqc b = b(e);
        if (b != null) {
            if (i != 0 && this.g) {
                if (b.e() != 2) {
                    b.a(false);
                }
                this.f.set(e.g().a().i());
                this.f.offset(i, 0);
            } else if (obj != null) {
                if (b.e() != 0) {
                    b.b(false);
                }
                this.f.setEmpty();
            }
            ((TransparentHoleImageView) b.d()).a(this.f);
        }
    }

    public final boolean a(lms lms) {
        a();
        lqk e = e();
        if (e != null) {
            xqc b = b(e);
            if (!(b == null || b.e() == 0 || !abe.H(b.d()))) {
                lms.b();
                return true;
            }
        }
        return false;
    }

    private final xqc b(lqk lqk) {
        xqc xqc = null;
        if (!(lqk == null || lqk.e() == null)) {
            amqp amqp = (amqp) lqk.getTag(R.id.swipey_player_thumbnail_holder);
            if (amqp != null) {
                return (xqc) amqp.c();
            }
            TransparentHoleImageView transparentHoleImageView = (TransparentHoleImageView) lqk.e().findViewById(R.id.swipey_player_thumbnail);
            if (transparentHoleImageView != null) {
                xqc xnz = new xnz(transparentHoleImageView, this.i, this.h, 4);
            }
            lqk.setTag(R.id.swipey_player_thumbnail_holder, amqp.c(xqc));
        }
        return xqc;
    }

    private final void c(lqk lqk) {
        xqc b = b(lqk);
        View view = b != null ? (TransparentHoleImageView) b.d() : null;
        if (view != null) {
            this.h.a(view);
        }
    }
}
