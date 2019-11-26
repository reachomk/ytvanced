package defpackage;

import android.app.Activity;
import android.support.design.appbar.AppBarLayout;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import com.google.android.youtube.R;

/* renamed from: jpz */
public final class jpz {
    public boolean a;
    public int b = 1;
    public jqa c;
    public bctz d;
    public jqj e;
    public enx f;
    public RecyclerView g;
    public jri h;
    public final LinearLayout i;
    public bcuo j;
    public final int k;
    private jqm l;
    private final AppBarLayout m;
    private final jqp n;

    public jpz(Activity activity, LinearLayout linearLayout, AppBarLayout appBarLayout, jqa jqa, jqp jqp) {
        this.i = linearLayout;
        this.m = appBarLayout;
        this.n = jqp;
        this.c = jqa;
        this.k = activity.getResources().getDimensionPixelSize(R.dimen.filter_bar_height) + activity.getResources().getDimensionPixelSize(R.dimen.filter_bar_separator_height);
    }

    public final boolean a() {
        return this.j != null;
    }

    public final void a(int i) {
        if (this.b != i) {
            this.b = i;
            if (i != 1) {
                int i2 = 0;
                if (this.i.getParent() == null && ((ViewGroup) this.i.getParent()) != this.m) {
                    xpr.a(this.i, this.c.b());
                    this.m.addView(this.i, 1);
                    LayoutParams layoutParams = this.i.getLayoutParams();
                    int i3 = this.c.a;
                    if (i3 == -2 || i3 == 1 || i3 == 2 || i3 == 4 || i3 == 5) {
                        if (layoutParams.height != 0) {
                            layoutParams.height = 0;
                            this.i.setLayoutParams(layoutParams);
                        }
                        this.i.setVisibility(0);
                    } else {
                        i3 = layoutParams.height;
                        int i4 = this.k;
                        if (i3 != i4) {
                            layoutParams.height = i4;
                            this.i.setLayoutParams(layoutParams);
                        }
                    }
                    if (this.c.b()) {
                        d();
                    }
                    i = this.c.a;
                    if (i == 1 || i == 4) {
                        b(1500);
                    } else if (i == 2) {
                        f();
                    } else if (i == -2 || i == 5) {
                        e();
                    } else if (i == 3) {
                        this.i.post(new jqi(this, new jqd(this)));
                    }
                }
                eg egVar = (eg) this.i.getLayoutParams();
                if (egVar != null) {
                    if (this.b != 5 && this.m.getChildCount() > 0) {
                        i2 = ((eg) this.m.getChildAt(0).getLayoutParams()).a;
                    }
                    if (i2 != egVar.a) {
                        egVar.a = i2;
                        return;
                    }
                    return;
                }
                return;
            }
            if (a()) {
                this.j.b();
            }
            this.j = null;
            b();
            ViewGroup viewGroup = (ViewGroup) this.i.getParent();
            if (viewGroup == this.m) {
                viewGroup.removeView(this.i);
            }
        }
    }

    public final void b() {
        jqm jqm = this.l;
        if (jqm != null) {
            RecyclerView recyclerView = this.g;
            AppBarLayout appBarLayout = this.m;
            if (!jqm.a) {
                jqm.a = true;
                if (recyclerView == null || appBarLayout == null) {
                    xtl.d("Disabled PartialPullListener but did not remove it, as one or more of the target  views was null.");
                } else {
                    recyclerView.post(new jql(jqm, recyclerView));
                    appBarLayout.post(new jqo(jqm, appBarLayout));
                }
            }
        }
        c();
    }

    public final void c() {
        jri jri = this.h;
        if (jri != null && !jri.a) {
            enx enx = this.f;
            if (enx != null) {
                enx.a(1);
            }
            this.h.a = true;
            RecyclerView recyclerView = this.g;
            if (recyclerView != null) {
                recyclerView.post(new jqg(this));
            }
        }
    }

    /* JADX WARNING: Missing block: B:11:0x0032, code skipped:
            if (r1 >= defpackage.jqp.b) goto L_0x0034;
     */
    public final void d() {
        /*
        r6 = this;
        r0 = r6.a;
        if (r0 != 0) goto L_0x007c;
    L_0x0004:
        r0 = 1;
        r6.a = r0;
        r0 = r6.n;
        if (r0 != 0) goto L_0x000c;
    L_0x000b:
        goto L_0x0075;
    L_0x000c:
        r1 = r0.a();
        r2 = 3;
        if (r1 >= r2) goto L_0x0075;
    L_0x0013:
        r1 = r0.d;
        r2 = -1;
        r4 = "feed_filter_bar_tutorial_last_shown_timestamp";
        r4 = r1.getLong(r4, r2);
        r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1));
        if (r1 == 0) goto L_0x0034;
    L_0x0021:
        r1 = r0.e;
        r1 = r1.a();
        r1 = r1 - r4;
        r3 = 0;
        r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1));
        if (r5 < 0) goto L_0x0075;
    L_0x002e:
        r3 = defpackage.jqp.b;
        r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1));
        if (r5 < 0) goto L_0x0075;
    L_0x0034:
        r1 = r0.a;
        if (r1 == 0) goto L_0x0075;
    L_0x0038:
        r2 = r0.c;
        r3 = r0.f;
        r3 = r3.getResources();
        r4 = 2131952388; // 0x7f130304 float:1.9541217E38 double:1.0533244335E-314;
        r3 = r3.getString(r4);
        r4 = r0.a;
        r4 = r4.a();
        r2 = r4.a(r2);
        r2 = r2.c(r3);
        r3 = 2;
        r2 = r2.e(r3);
        r2 = r2.d(r3);
        r3 = -1;
        r2 = r2.c(r3);
        r2 = (defpackage.albx) r2;
        r3 = new jqs;
        r3.<init>(r0);
        r0 = r2.a(r3);
        r0 = r0.b();
        r1.a(r0);
    L_0x0075:
        r0 = r6.e;
        if (r0 == 0) goto L_0x007c;
    L_0x0079:
        r0.a();
    L_0x007c:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jpz.d():void");
    }

    public final void e() {
        this.f.a(3);
        this.h = new jri(this.i, this.k, new jqk(this));
        this.g.a(this.h);
        f();
    }

    private final void f() {
        this.l = new jqm(this);
        ec ecVar = this.l;
        RecyclerView recyclerView = this.g;
        AppBarLayout appBarLayout = this.m;
        if (recyclerView == null || appBarLayout == null) {
            xtl.c("Could not attach PartialPullListener listener as one or more target views was null.");
            return;
        }
        recyclerView.a((apv) ecVar);
        appBarLayout.a(ecVar);
    }

    public final void b(int i) {
        this.i.post(new jqf(this, i));
    }
}
