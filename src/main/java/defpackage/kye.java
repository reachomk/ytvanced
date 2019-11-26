package defpackage;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import com.google.android.apps.youtube.app.ui.swipetocontainer.SwipeToContainerFrameLayout;
import com.google.android.youtube.R;

/* renamed from: kye */
public final class kye implements eii, ejc, gcs, kyn, xcp {
    public final Activity a;
    public final nt b;
    public final acwa c;
    public final eif d;
    public final eid e;
    public final bdfp f = bdfi.h();
    public final kyg g;
    public final fjz h;
    public SwipeToContainerFrameLayout i;
    public FrameLayout j;
    public apxu k;
    public boolean l;
    public apxu m;
    public gcl n;
    public Object o;
    private final SharedPreferences p;
    private final fkc q;
    private final fga r;
    private final fjg s;
    private final xol t;
    private boolean u;
    private boolean v;

    public kye(Activity activity, xci xci, Bundle bundle, SharedPreferences sharedPreferences, fkc fkc, nt ntVar, fga fga, acwa acwa, eif eif, fjg fjg, exu exu, xol xol, eid eid, fjz fjz) {
        this.a = activity;
        this.p = sharedPreferences;
        this.q = fkc;
        this.b = ntVar;
        this.r = fga;
        this.c = acwa;
        this.d = eif;
        this.s = fjg;
        this.t = xol;
        apxu apxu = null;
        byte[] byteArray = bundle != null ? bundle.getByteArray("on_swipe_left_endpoint") : null;
        if (byteArray != null) {
            try {
                apxu = (apxu) anxl.parseFrom(apxu.d, byteArray, anxa.c());
            } catch (anyg unused) {
            }
        }
        this.k = apxu;
        this.e = eid;
        this.g = new kyg(this);
        this.h = fjz;
        xci.a((Object) this);
        exu.a(new kyh(this));
    }

    public final void a() {
        if (this.k == null) {
            FrameLayout frameLayout = this.j;
            if (frameLayout != null) {
                SwipeToContainerFrameLayout swipeToContainerFrameLayout = this.i;
                swipeToContainerFrameLayout.g = null;
                swipeToContainerFrameLayout.removeView(frameLayout);
                this.j = null;
            }
            return;
        }
        if (this.j == null) {
            SwipeToContainerFrameLayout swipeToContainerFrameLayout2 = this.i;
            if (swipeToContainerFrameLayout2.h) {
                swipeToContainerFrameLayout2.g = this;
                LayoutInflater.from(this.a).inflate(R.layout.swipe_to_camera_container, this.i);
                this.j = (FrameLayout) this.i.findViewById(R.id.swipe_to_camera_container);
            }
        }
    }

    public final void b(apxu apxu) {
        if (gcl.a(apxu)) {
            this.k = apxu;
            a();
            SwipeToContainerFrameLayout swipeToContainerFrameLayout = this.i;
            if (swipeToContainerFrameLayout.h) {
                this.c.t().b(acwc.SWIPE_TO_CAMERA_START_ACTION, null);
                return;
            }
            SharedPreferences sharedPreferences = this.p;
            if (!(swipeToContainerFrameLayout.i || sharedPreferences == null)) {
                sharedPreferences.edit().putBoolean("enable_swipe_container", true).apply();
                swipeToContainerFrameLayout.i = true;
            }
            return;
        }
        this.k = null;
        d();
        a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006d A:{SKIP} */
    public final boolean b() {
        /*
        r7 = this;
        r0 = r7.a;
        r0 = r0.getResources();
        r0 = r0.getConfiguration();
        r0 = r0.orientation;
        r0 = defpackage.fka.a(r0);
        r1 = r7.s;
        r1 = r1.g();
        r2 = 1;
        r3 = 0;
        if (r1 == 0) goto L_0x003b;
    L_0x001a:
        r1 = r7.s;
        r1 = r1.a();
        if (r1 == 0) goto L_0x003b;
    L_0x0022:
        r1 = r7.s;
        r1 = r1.a();
        r1 = r1.a();
        r1 = defpackage.fix.b(r1);
        r4 = "FEwhat_to_watch";
        r1 = r4.equals(r1);
        if (r1 != 0) goto L_0x0039;
    L_0x0038:
        goto L_0x003b;
    L_0x0039:
        r1 = 1;
        goto L_0x003c;
    L_0x003b:
        r1 = 0;
    L_0x003c:
        r4 = r7.d;
        r4 = r4.c();
        r5 = defpackage.ejd.NONE;
        if (r4 == r5) goto L_0x0053;
    L_0x0046:
        r4 = r7.d;
        r4 = r4.c();
        r5 = defpackage.ejd.INLINE_MUTED;
        if (r4 != r5) goto L_0x0051;
    L_0x0050:
        goto L_0x0053;
    L_0x0051:
        r4 = 0;
        goto L_0x0054;
    L_0x0053:
        r4 = 1;
    L_0x0054:
        r5 = r7.l;
        if (r5 == 0) goto L_0x0068;
    L_0x0058:
        r5 = r7.n;
        if (r5 != 0) goto L_0x005d;
    L_0x005c:
        goto L_0x0068;
    L_0x005d:
        r5 = r5.ai;
        r5 = r5.b();
        if (r5 == 0) goto L_0x0066;
    L_0x0065:
        goto L_0x0068;
    L_0x0066:
        r5 = 1;
        goto L_0x0069;
    L_0x0068:
        r5 = 0;
    L_0x0069:
        r6 = r7.k;
        if (r6 == 0) goto L_0x0076;
    L_0x006d:
        if (r0 == 0) goto L_0x0076;
    L_0x006f:
        if (r1 == 0) goto L_0x0076;
    L_0x0071:
        if (r4 == 0) goto L_0x0076;
    L_0x0073:
        if (r5 != 0) goto L_0x0076;
    L_0x0075:
        return r2;
    L_0x0076:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kye.b():boolean");
    }

    public final void a(int i, float f) {
        a(f >= 0.5f);
        b(i, f);
    }

    public final void a(int i) {
        this.l = true;
        b(i, 1.0f);
        if (this.m == null) {
            kyg kyg = this.g;
            gcl gcl = kyg.e.n;
            if (gcl == null) {
                kyg.b = true;
            } else {
                gcl.aj.a();
            }
        }
        this.f.e_(new kyi(0));
        this.t.b(3);
    }

    public final void c() {
        this.l = false;
        this.r.b(2);
        if (this.n != null) {
            or a = this.b.a();
            a.a(this.n);
            a.a();
            if (!this.u) {
                this.n.aj.b();
            }
        }
        this.g.a();
        this.q.b(0);
        this.h.a(this.o);
        this.n = null;
        this.f.e_(new kyi(1));
        this.t.b();
        this.u = false;
        this.m = null;
    }

    private final void b(int i, float f) {
        kyg kyg = this.g;
        kyg.d = i;
        kyg.c = f;
        kyg.a = true;
        if (this.n == null) {
            this.q.b(3);
            this.o = this.h.a();
            this.r.a(2);
        }
        if (!this.v) {
            this.g.run();
        }
    }

    public final boolean a(apxu apxu) {
        this.m = apxu;
        return this.j != null && this.i.b();
    }

    private final boolean d() {
        return this.j != null && this.i.a();
    }

    public final void m() {
        this.u = true;
        d();
    }

    public final void l() {
        this.t.b(3);
    }

    public final void a(ejd ejd, ejd ejd2) {
        if (ejd2 != ejd.NONE) {
            d();
        }
    }

    public final void a(boolean z) {
        this.t.a(!z ? 1 : 2);
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahkr.class};
        } else if (i == 0) {
            int i2 = ((ahkr) obj).a;
            if (i2 == 0 || i2 == 4 || i2 == 7 || i2 == 8) {
                this.v = false;
                this.g.run();
                return null;
            }
            this.v = true;
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
