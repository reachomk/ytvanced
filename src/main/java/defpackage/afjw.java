package defpackage;

import android.content.Context;
import android.os.Build.VERSION;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: afjw */
public final class afjw extends afki implements afkh {
    public static final afkn a = afkn.SURFACE;
    public afkh b;
    private final afjx c;
    private final List d = new ArrayList();
    private final HashMap e;
    private boolean f;
    private boolean h;
    private boolean i;
    private boolean j;
    private afkj k;
    private afkn l;
    private boolean m;
    private float n;
    private float o;

    public afjw(Context context, afjx afjx) {
        super(context);
        this.c = (afjx) amqw.a((Object) afjx);
        this.e = new HashMap();
        this.l = a;
    }

    /* Access modifiers changed, original: protected|final */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.l != afkn.APPLICATION) {
            afkh afkh = this.b;
            if (afkh != null) {
                removeView(afkh.f());
                this.b = null;
            }
            this.b = b(this.l);
            if (afjw.b(this.l, this.f, this.h)) {
                this.e.put(this.l, this.b);
            }
            addView(this.b.f());
        }
        if (this.i) {
            this.i = false;
            this.b.a(this.k);
            if (this.j) {
                c(0);
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onMeasure(int i, int i2) {
        int childCount = getChildCount() - 1;
        if (childCount >= 0) {
            View childAt = getChildAt(childCount);
            childAt.measure(i, i2);
            setMeasuredDimension(childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
            return;
        }
        setMeasuredDimension(0, 0);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount() - 1;
        if (childCount >= 0) {
            getChildAt(childCount).layout(0, 0, i3 - i, i4 - i2);
        }
    }

    public final void a(afkj afkj) {
        this.k = afkj;
        if (p()) {
            this.i = false;
            this.b.a(afkj);
            return;
        }
        this.i = true;
    }

    public final aewz g() {
        return p() ? this.b.g() : null;
    }

    public final ofb h() {
        return p() ? this.b.h() : null;
    }

    public final Surface k() {
        return p() ? this.b.k() : null;
    }

    public final View f() {
        afkh afkh = this.b;
        return afkh != null ? afkh.f() : null;
    }

    public final SurfaceHolder l() {
        return p() ? this.b.l() : null;
    }

    public final void a(int i, int i2) {
        amqw.b(p(), (Object) "MediaView method called before surface created");
        this.b.a(i, i2);
    }

    public final int a() {
        amqw.b(p(), (Object) "MediaView method called before surface created");
        int a = this.b.a();
        return a == 0 ? getMeasuredWidth() : a;
    }

    public final int b() {
        amqw.b(p(), (Object) "MediaView method called before surface created");
        int b = this.b.b();
        return b == 0 ? getMeasuredHeight() : b;
    }

    public final void c(int i) {
        if (p()) {
            this.j = false;
            this.b.c(i);
            return;
        }
        this.j = true;
    }

    public final void c() {
        if (p()) {
            this.b.c();
        }
        this.j = false;
    }

    public final boolean n() {
        return p() && this.b.n();
    }

    public final void a(boolean z, float f, float f2) {
        this.m = z;
        this.n = f;
        this.o = f2;
    }

    public final void d() {
        if (p()) {
            this.b.d();
        }
    }

    public final void i() {
        afkh afkh = this.b;
        if (afkh != null) {
            afkh.i();
        }
    }

    public final void m() {
        if (p()) {
            this.b.m();
            this.b = null;
        }
        q();
    }

    private final void q() {
        for (afjt m : this.e.values()) {
            m.m();
        }
        this.e.clear();
    }

    public final void a(afkn afkn) {
        if (afkn == this.l) {
            if (p()) {
                this.b.a(this.m, this.n, this.o);
            }
            return;
        }
        amqw.a(afkn != afkn.APPLICATION, (Object) "Media view type can only be set to application secure surface at creation time");
        if (this.l != afkn.APPLICATION) {
            amqw.a(this.k);
            this.l = afkn;
            String.valueOf(afkn).length();
            afkh afkh = this.b;
            this.b = b(afkn);
            this.b.a(this.k);
            addView(this.b.f());
            this.b.a(this.m, this.n, this.o);
            if (afkh != null) {
                afkh.a(null);
                if (VERSION.SDK_INT <= 19 || (this.m && afkh.o() == afkn.SURFACE)) {
                    this.d.add(afkh);
                } else {
                    removeView(afkh.f());
                    afkh.m();
                }
            }
        }
    }

    public final void a(afkn afkn, boolean z, boolean z2) {
        this.f = z;
        this.h = z2;
        if (!z && !z2) {
            q();
            a(afkn);
        } else if (afkn == this.l) {
            if (p()) {
                this.b.a(this.m, this.n, this.o);
            }
        } else {
            amqw.a(afkn != afkn.APPLICATION, (Object) "Media view type can only be set to application secure surface at creation time");
            if (this.l != afkn.APPLICATION) {
                amqw.a(this.k);
                this.l = afkn;
                afkh afkh = this.b;
                boolean containsKey = this.e.containsKey(afkn);
                if (containsKey) {
                    this.b = (afkh) this.e.get(afkn);
                } else {
                    this.b = b(afkn);
                    if (afjw.b(this.b.o(), z, z2)) {
                        this.e.put(this.b.o(), this.b);
                    }
                }
                this.b.a(this.k);
                if (!containsKey || indexOfChild(this.b.f()) < 0) {
                    addView(this.b.f());
                } else {
                    this.b.f().setVisibility(0);
                    bringChildToFront(this.b.f());
                }
                this.b.a(this.m, this.n, this.o);
                if (afkh != null) {
                    afkh.a(null);
                    afkh.f().setVisibility(8);
                    if (!afjw.b(afkh.o(), z, z2)) {
                        if (VERSION.SDK_INT <= 19 || (this.m && afkh.o() == afkn.SURFACE)) {
                            this.d.add(afkh);
                        } else {
                            removeView(afkh.f());
                            afkh.m();
                        }
                    }
                }
            }
        }
    }

    private static boolean b(afkn afkn, boolean z, boolean z2) {
        int ordinal = afkn.ordinal();
        if (ordinal != 3) {
            return ordinal != 7 ? false : z2;
        } else {
            return z;
        }
    }

    public final afkn o() {
        afkh afkh = this.b;
        return afkh == null ? afkn.UNKNOWN : afkh.o();
    }

    @Deprecated
    public final boolean j() {
        afkh afkh = this.b;
        return afkh != null && afkh.j();
    }

    public final void e() {
        a(a);
    }

    public final void a(afkm afkm) {
        if (p()) {
            this.b.a(afkm);
        }
    }

    public final void a(boolean z, byte[] bArr, long j) {
        if (p()) {
            this.b.a(z, bArr, j);
        }
    }

    public final void a(Surface surface) {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            afkh afkh = (afkh) it.next();
            if (surface != afkh.k()) {
                removeView(afkh.f());
                afkh.m();
                it.remove();
            }
        }
    }

    private final afkh b(afkn afkn) {
        int ordinal = afkn.ordinal();
        if (ordinal == 0 || ordinal == 3) {
            return new afkc(getContext());
        }
        if (ordinal == 4) {
            return new afke(getContext());
        }
        if (ordinal == 5) {
            return new afkd(getContext());
        }
        if (ordinal == 6 || ordinal == 7) {
            return this.c.a(afkn, getContext(), this.m);
        }
        throw new UnsupportedOperationException("Requested view is not supported.");
    }

    public final boolean p() {
        return this.b != null;
    }
}
