package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Vibrator;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: ahys */
public final class ahys implements ahyl, ahyq, ahzl, ahzx, OnLayoutChangeListener, t {
    private final Set A;
    private final ahzq B;
    private boolean C;
    private boolean D;
    private ahyv E;
    private ajmp F;
    private final Runnable G;
    public final Context a;
    public final akkq b;
    public final aiug c;
    public final ahzg d;
    public final aizy e;
    public final acys f;
    public final Handler g;
    public final ahyo h;
    public final List i = new ArrayList(6);
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public ahzw n;
    public ajmq o;
    public String p;
    public String q;
    public ajuj r;
    public final ahzi s;
    public Vibrator t;
    public final ahyz u;
    public final ahza v;
    private final aaas w;
    private final aicq x;
    private final ViewGroup y;
    private final acvx z;

    public ahys(Context context, ahyo ahyo, ahzi ahzi, akkq akkq, aaas aaas, aicq aicq, aiug aiug, ViewGroup viewGroup, ahzg ahzg, aizy aizy, afqv afqv, afti afti, acvx acvx) {
        String str = "";
        this.p = str;
        this.q = str;
        this.G = new ahyu(this);
        this.a = (Context) amqw.a((Object) context);
        this.s = ahzi;
        this.b = (akkq) amqw.a((Object) akkq);
        this.w = (aaas) amqw.a((Object) aaas);
        this.x = (aicq) amqw.a((Object) aicq);
        this.c = (aiug) amqw.a((Object) aiug);
        this.y = (ViewGroup) amqw.a((Object) viewGroup);
        this.d = (ahzg) amqw.a((Object) ahzg);
        this.e = (aizy) amqw.a((Object) aizy);
        this.f = new acys(afqv, afti, "iv");
        this.z = acvx;
        this.h = (ahyo) amqw.a((Object) ahyo);
        ahyo = this.h;
        ahyo.a = this;
        ahyo.addOnLayoutChangeListener(this);
        this.g = new Handler(context.getMainLooper());
        this.B = new ahzq(context, this);
        this.A = Collections.newSetFromMap(new WeakHashMap());
        afti.a(new ahyr(this));
        this.u = new ahyz(this);
        this.v = new ahza(this);
    }

    public final void B_() {
    }

    public final void C_() {
    }

    public final void aw_() {
    }

    public final void c() {
    }

    public final void d() {
    }

    public final void a(af afVar) {
        f();
    }

    /* Access modifiers changed, original: final */
    public final void f() {
        ajmq ajmq = this.o;
        if (ajmq != null) {
            ajmv e = ajmq.e();
            if (e != null) {
                ajmp ajmp = this.E;
                if (ajmp != null) {
                    e.b(ajmp);
                    this.E = null;
                }
                ajmp = this.F;
                if (ajmp != null) {
                    e.b(ajmp);
                    this.F = null;
                }
                for (ahzj e2 : this.i) {
                    e2.e();
                }
                e.a(ahzj.class);
            }
            this.o = null;
        }
        ahzw ahzw = this.n;
        if (ahzw != null) {
            ahzw.a(false);
        }
        this.i.clear();
        this.h.c();
        if (this.j) {
            this.j = false;
            j();
            k();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x001e  */
    /* JADX WARNING: Removed duplicated region for block: B:66:? A:{SYNTHETIC, RETURN, ORIG_RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ea  */
    public final void a(defpackage.ajmq r13, defpackage.aakj r14) {
        /*
        r12 = this;
        r0 = r12.i;
        r0 = r0.isEmpty();
        if (r0 != 0) goto L_0x000b;
    L_0x0008:
        r12.f();
    L_0x000b:
        r12.o = r13;
        r0 = 0;
        if (r14 == 0) goto L_0x0019;
    L_0x0010:
        r14 = r14.a;
        r14 = r14.t;
        if (r14 == 0) goto L_0x0019;
    L_0x0016:
        r14 = r14.a;
        goto L_0x001a;
    L_0x0019:
        r14 = r0;
    L_0x001a:
        r1 = 0;
        r2 = 1;
        if (r14 == 0) goto L_0x00e2;
    L_0x001e:
        r12.r = r14;
        r3 = new ahyv;
        r4 = r14.b;
        r3.<init>(r12, r4);
        r12.E = r3;
        r3 = new ahyt;
        r4 = 0;
        r6 = r14.b;
        r8 = -10000; // 0xffffffffffffd8f0 float:NaN double:NaN;
        r6 = r6 + r8;
        r8 = java.lang.Math.max(r4, r6);
        r10 = defpackage.ajms.DEFAULT;
        r11 = defpackage.ajmr.NOT_DRAWABLE;
        r6 = r3;
        r7 = r12;
        r6.<init>(r7, r8, r10, r11);
        r12.F = r3;
        r3 = r12.o;
        r3 = r3.e();
        if (r3 == 0) goto L_0x00e2;
    L_0x0049:
        r4 = r12.F;
        r3.a(r4);
        r4 = r12.E;
        r3.a(r4);
        r14 = r14.a;
        r4 = r14.length;
        r5 = 0;
    L_0x0057:
        if (r5 >= r4) goto L_0x00e2;
    L_0x0059:
        r6 = r14[r5];
        r6 = r6.b;
        if (r6 == 0) goto L_0x00de;
    L_0x005f:
        r7 = r12.B;
        r8 = r6.u;
        r9 = r8 + -1;
        if (r8 == 0) goto L_0x00dd;
    L_0x0067:
        if (r9 == r2) goto L_0x0092;
    L_0x0069:
        r8 = 2;
        if (r9 == r8) goto L_0x0088;
    L_0x006c:
        r8 = 3;
        if (r9 == r8) goto L_0x007e;
    L_0x006f:
        r8 = 4;
        if (r9 == r8) goto L_0x0074;
    L_0x0072:
        r8 = r0;
        goto L_0x009b;
    L_0x0074:
        r8 = new ahzu;
        r9 = r7.a;
        r7 = r7.b;
        r8.<init>(r9, r7, r6);
        goto L_0x009b;
    L_0x007e:
        r8 = new ahzp;
        r9 = r7.a;
        r7 = r7.b;
        r8.<init>(r9, r7, r6);
        goto L_0x009b;
    L_0x0088:
        r8 = new ahzs;
        r9 = r7.a;
        r7 = r7.b;
        r8.<init>(r9, r7, r6);
        goto L_0x009b;
    L_0x0092:
        r8 = new ahzr;
        r9 = r7.a;
        r7 = r7.b;
        r8.<init>(r9, r7, r6);
    L_0x009b:
        if (r8 == 0) goto L_0x00ab;
    L_0x009d:
        r6 = r12.b;
        r8.a(r6);
        r6 = r12.i;
        r6.add(r8);
        r3.a(r8);
        goto L_0x00de;
    L_0x00ab:
        r6 = r6.u;
        if (r6 != 0) goto L_0x00b2;
    L_0x00af:
        r6 = "null";
        goto L_0x00bc;
    L_0x00b2:
        if (r6 == 0) goto L_0x00dc;
    L_0x00b4:
        if (r6 == 0) goto L_0x00db;
    L_0x00b6:
        r6 = r6 + -1;
        r6 = java.lang.Integer.toString(r6);
    L_0x00bc:
        r6 = java.lang.String.valueOf(r6);
        r7 = r6.length();
        r8 = new java.lang.StringBuilder;
        r7 = r7 + 61;
        r8.<init>(r7);
        r7 = "Error creating creator EndscreenElement, ignoring it. Style: ";
        r8.append(r7);
        r8.append(r6);
        r6 = r8.toString();
        defpackage.xtl.d(r6);
        goto L_0x00de;
    L_0x00db:
        throw r0;
    L_0x00dc:
        throw r0;
    L_0x00dd:
        throw r0;
    L_0x00de:
        r5 = r5 + 1;
        goto L_0x0057;
    L_0x00e2:
        r14 = r12.i;
        r14 = r14.isEmpty();
        if (r14 != 0) goto L_0x011a;
    L_0x00ea:
        r12.l();
        r13 = r13.d();
        r0 = r12.E;
        r0 = r0.a(r13);
        if (r0 == 0) goto L_0x00fe;
    L_0x00f9:
        r0 = r12.E;
        r0.a(r1, r2, r2);
    L_0x00fe:
        r0 = r12.i;
        r0 = r0.iterator();
    L_0x0104:
        r3 = r0.hasNext();
        if (r3 == 0) goto L_0x011a;
    L_0x010a:
        r3 = r0.next();
        r3 = (defpackage.ahzj) r3;
        r4 = r3.a(r13);
        if (r4 == 0) goto L_0x0104;
    L_0x0116:
        r3.a(r1, r2, r2);
        goto L_0x0104;
    L_0x011a:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahys.a(ajmq, aakj):void");
    }

    private final void l() {
        if (g()) {
            this.g.post(this.G);
        }
    }

    public final boolean g() {
        return this.d.a().isEmpty() ^ 1;
    }

    public final void a(ahzj ahzj) {
        ahyo ahyo = this.h;
        ahys.a(ahzj.i, ahzj.g);
        if (ahzj.b().getParent() == null) {
            ahyo.addView(ahzj.b());
            ahzj.b().startAnimation(ahzj.h);
        }
        this.f.a(ahzj.b.p);
        a(ahzj.b.t);
    }

    public final void b(ahzj ahzj) {
        ahzj.b().clearAnimation();
        ahzj.b().startAnimation(ahzj.i);
    }

    public final void c(ahzj ahzj) {
        if (ahzj.d()) {
            this.D = this.e.c();
            this.e.j();
            this.f.a(ahzj.b.q);
            if (this.n == null) {
                this.n = new ahzw(this.a, this, this.y);
            }
            ahzw ahzw = this.n;
            ahzw.c = ahzj;
            ahzy ahzy = ahzw.b;
            if (ahzy != null) {
                ahzj.a(ahzy);
            }
            if (ahzw.b.a.getParent() == null) {
                ahzw.b.a.clearAnimation();
                ahzw.e.reset();
                ahzw.a.addView(ahzw.b.a);
                ahzw.b.a.startAnimation(ahzw.d);
            }
            ahzw.b();
            this.g.post(new ahyw(this));
            return;
        }
        d(ahzj);
    }

    public final void h() {
        m();
        if (this.D) {
            this.e.a();
            this.x.f();
        }
    }

    private final void m() {
        ahzw ahzw = this.n;
        if (ahzw != null) {
            ahzw.a(true);
            xrn.a(this.y.getRootView());
        }
    }

    public final void d(ahzj ahzj) {
        apxu apxu = ahzj.b.o;
        if (apxu != null) {
            this.w.a(apxu, null);
            m();
        }
    }

    public final void i() {
        this.f.a(this.n.c.b.r);
        m();
        if (this.D) {
            this.e.a();
            this.x.f();
        }
    }

    public final void a(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 1) {
            return;
        }
        if (this.e.c()) {
            this.e.b();
        } else {
            this.e.a();
        }
    }

    public final void j() {
        if (!this.j || this.k || this.l || this.C) {
            ViewGroup viewGroup = this.h;
            if (viewGroup.getVisibility() != 0) {
                return;
            }
            if (viewGroup.c.hasEnded() || !viewGroup.c.hasStarted()) {
                ahyo.a(viewGroup);
                viewGroup.startAnimation(viewGroup.c);
                return;
            }
            return;
        }
        ahyo ahyo = this.h;
        ahys.a(ahyo.c, ahyo.d);
        ahyo.setVisibility(0);
        if (ahyo.b.hasEnded() || !ahyo.b.hasStarted()) {
            ahyo.startAnimation(ahyo.b);
        }
        l();
        a(this.r.e);
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (!this.j) {
            return;
        }
        if (i != i5 || i3 != i7 || i2 != i6 || i4 != i8) {
            l();
        }
    }

    public final void k() {
        for (ahyx a : this.A) {
            a.a();
        }
    }

    private static void a(Animation animation, AnimationListener animationListener) {
        animation.setAnimationListener(null);
        animation.cancel();
        animation.setAnimationListener(animationListener);
    }

    private final void a(byte[] bArr) {
        if (bArr != null) {
            this.z.a(bArr, null);
        }
    }

    public final void a(boolean z) {
        this.h.a(z);
    }

    public final void b(boolean z) {
        if (this.C != z) {
            this.C = z;
            j();
        }
    }
}
