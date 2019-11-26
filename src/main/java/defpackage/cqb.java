package defpackage;

import android.content.Context;
import android.view.View;
import com.facebook.litho.ComponentHost;

/* renamed from: cqb */
public final class cqb {
    public cqi a;
    public css b;
    public cma c;
    public Object d;
    public ComponentHost e;
    public boolean f;
    public int g;
    public csd h;
    public int i;
    public int j;
    public int k;

    cqb(cma cma, ComponentHost componentHost, Object obj, cpd cpd) {
        this(cma, componentHost, obj, cpd.a, cpd.b, cpd.h, cpd.l, cpd.m, cpd.n);
    }

    public static boolean a(int i) {
        return (i & 1) != 0;
    }

    cqb(cma cma, ComponentHost componentHost, Object obj, cqi cqi, css css, int i, int i2, int i3, csd csd) {
        this.g = 0;
        if (this.e != null) {
            throw new RuntimeException("Calling init() on a MountItem that has not been released!");
        } else if (cma != null) {
            this.c = cma;
            this.d = obj;
            this.e = componentHost;
            this.j = i;
            this.g = i2;
            this.i = i3;
            this.h = csd;
            if (cqi != null) {
                this.a = cqi;
            }
            if (css != null) {
                this.b = css;
            }
            Object obj2 = this.d;
            if (obj2 instanceof View) {
                View view = (View) obj2;
                if (view.isClickable()) {
                    this.k |= 1;
                }
                if (view.isLongClickable()) {
                    this.k |= 2;
                }
                if (view.isFocusable()) {
                    this.k |= 4;
                }
                if (view.isEnabled()) {
                    this.k |= 8;
                }
                if (view.isSelected()) {
                    this.k |= 16;
                }
            }
        } else {
            throw new RuntimeException("Calling init() on a MountItem with a null Component!");
        }
    }

    public final void a(cpd cpd) {
        this.c = cpd.d;
        if (this.c != null) {
            this.j = cpd.h;
            this.g = cpd.l;
            this.i = cpd.m;
            this.h = cpd.n;
            this.a = null;
            this.b = null;
            cqi cqi = cpd.a;
            if (cqi != null) {
                this.a = cqi;
            }
            css css = cpd.b;
            if (css != null) {
                this.b = css;
                return;
            }
            return;
        }
        throw new RuntimeException("Trying to update a MountItem with a null Component!");
    }

    public final boolean a() {
        return this.h != null;
    }

    public final boolean b() {
        if (this.c == null || this.g == 2) {
            return false;
        }
        cqi cqi = this.a;
        if ((cqi != null && cqi.c()) || this.c.s()) {
            return true;
        }
        return false;
    }

    /* Access modifiers changed, original: final */
    public final void a(Context context) {
        cma cma = this.c;
        Object obj = this.d;
        cpy a = cnk.a(context, cma);
        if (a != null) {
            a.a(obj);
        }
    }
}
