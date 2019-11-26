package com.google.android.apps.youtube.app.watch.nextgenwatch.flexy;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.aaw;
import defpackage.amqw;
import defpackage.apn;
import defpackage.aux;
import defpackage.eys;
import defpackage.eyt;
import defpackage.lig;
import defpackage.lij;
import defpackage.lik;

public class FlexyBehavior extends aux {
    public boolean a = false;
    private final int b;
    private final eys c;
    private final lij d;
    private final lik e;
    private boolean f = true;

    public FlexyBehavior(Context context, lij lij, lik lik) {
        this.d = lij;
        this.e = lik;
        this.c = new lig(this, lij);
        this.b = ViewConfiguration.get(context).getScaledMinimumFlingVelocity();
    }

    public final boolean a(View view, int i) {
        if (this.f) {
            RecyclerView b = b(view);
            if (b != null) {
                apn apn = b.n;
                if (apn instanceof eyt) {
                    ((eyt) apn).a.add((eys) amqw.a(this.c));
                }
            }
            i &= 2;
            if (!this.e.e() && i == 2) {
                return true;
            }
        }
        return false;
    }

    public final void a(CoordinatorLayout coordinatorLayout, int i, int[] iArr) {
        if (this.f) {
            boolean z = i > 0;
            if (z && e()) {
                i = Math.min(Math.max(0, b() - c()), i);
                iArr[1] = i;
                this.e.b(b() - i);
                if (coordinatorLayout.getParent() != null) {
                    coordinatorLayout.getParent().requestDisallowInterceptTouchEvent(true);
                }
            }
            a(z);
        }
    }

    public final void a(CoordinatorLayout coordinatorLayout, View view, int i, int i2) {
        if (this.f && i2 < 0 && f()) {
            this.e.b(b() + Math.min(Math.max(0, d() - b()), Math.abs(i2)));
            if (coordinatorLayout.getParent() != null) {
                coordinatorLayout.getParent().requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    public final boolean a(View view, float f) {
        if (this.f) {
            a(f < 0.0f);
        }
        return false;
    }

    public final boolean b(float f) {
        float abs = Math.abs(f);
        if (!this.f || abs < ((float) this.b) || f <= 0.0f || !e()) {
            return false;
        }
        this.d.a(1, true);
        return true;
    }

    private final void a(boolean z) {
        boolean z2 = this.a;
        int i = 1;
        if (!(z || f())) {
            i = 0;
        }
        this.a = z2 | i;
    }

    private final int b() {
        return this.e.b();
    }

    private final int c() {
        return this.e.d();
    }

    private final int d() {
        return this.e.c();
    }

    private final boolean e() {
        return b() > c();
    }

    private final boolean f() {
        return b() < d();
    }

    private final RecyclerView b(View view) {
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        if ((view instanceof aaw) && (view instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() > 0) {
                return b(viewGroup.getChildAt(0));
            }
        }
        return null;
    }
}
