package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.os.Build.VERSION;
import android.util.SparseArray;

/* renamed from: agn */
abstract class agn extends ConstantState {
    public ColorStateList A;
    public Mode B;
    public boolean C;
    public boolean D;
    private int E = 160;
    private SparseArray F;
    private boolean G;
    private boolean H;
    private boolean I;
    private final agi a;
    private Resources b;
    public int c;
    public int d;
    public Drawable[] e;
    public int f;
    public boolean g;
    public boolean h;
    public Rect i;
    public boolean j;
    public boolean k;
    public int l;
    public int m;
    public int n;
    public int o;
    public boolean p;
    public int q;
    public boolean r;
    public boolean s;
    public boolean t;
    public int u;
    public int v;
    public int w;
    public boolean x;
    public ColorFilter y;
    public boolean z;

    agn(agn agn, agi agi, Resources resources) {
        int i = 0;
        this.g = false;
        this.j = false;
        this.t = true;
        this.v = 0;
        this.w = 0;
        this.a = agi;
        Resources resources2 = resources != null ? resources : agn != null ? agn.b : null;
        this.b = resources2;
        int a = agi.a(resources, agn != null ? agn.E : 0);
        this.E = a;
        if (agn != null) {
            this.c = agn.c;
            this.d = agn.d;
            this.G = true;
            this.H = true;
            this.g = agn.g;
            this.j = agn.j;
            this.t = agn.t;
            this.I = agn.I;
            this.u = agn.u;
            this.v = agn.v;
            this.w = agn.w;
            this.x = agn.x;
            this.y = agn.y;
            this.z = agn.z;
            this.A = agn.A;
            this.B = agn.B;
            this.C = agn.C;
            this.D = agn.D;
            if (agn.E == a) {
                if (agn.h) {
                    this.i = new Rect(agn.i);
                    this.h = true;
                }
                if (agn.k) {
                    this.l = agn.l;
                    this.m = agn.m;
                    this.n = agn.n;
                    this.o = agn.o;
                    this.k = true;
                }
            }
            if (agn.p) {
                this.q = agn.q;
                this.p = true;
            }
            if (agn.r) {
                this.s = agn.s;
                this.r = true;
            }
            Drawable[] drawableArr = agn.e;
            this.e = new Drawable[drawableArr.length];
            int i2 = agn.f;
            this.f = i2;
            SparseArray sparseArray = agn.F;
            if (sparseArray != null) {
                this.F = sparseArray.clone();
            } else {
                this.F = new SparseArray(i2);
            }
            int i3 = this.f;
            while (i < i3) {
                Drawable drawable = drawableArr[i];
                if (drawable != null) {
                    ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.F.put(i, constantState);
                    } else {
                        this.e[i] = drawableArr[i];
                    }
                }
                i++;
            }
            return;
        }
        this.e = new Drawable[10];
        this.f = 0;
    }

    /* Access modifiers changed, original: 0000 */
    public void a() {
        throw null;
    }

    public void b(int i, int i2) {
        throw null;
    }

    public final int getChangingConfigurations() {
        return this.c | this.d;
    }

    public final int a(Drawable drawable) {
        int i = this.f;
        if (i >= this.e.length) {
            b(i, i + 10);
        }
        drawable.mutate();
        drawable.setVisible(false, true);
        drawable.setCallback(this.a);
        this.e[i] = drawable;
        this.f++;
        this.d = drawable.getChangingConfigurations() | this.d;
        b();
        this.i = null;
        this.h = false;
        this.k = false;
        this.G = false;
        return i;
    }

    /* Access modifiers changed, original: final */
    public final void b() {
        this.p = false;
        this.r = false;
    }

    public final void c() {
        SparseArray sparseArray = this.F;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                this.e[this.F.keyAt(i)] = b(((ConstantState) this.F.valueAt(i)).newDrawable(this.b));
            }
            this.F = null;
        }
    }

    private final Drawable b(Drawable drawable) {
        if (VERSION.SDK_INT >= 23) {
            drawable.setLayoutDirection(this.u);
        }
        drawable = drawable.mutate();
        drawable.setCallback(this.a);
        return drawable;
    }

    public final Drawable b(int i) {
        Drawable drawable = this.e[i];
        if (drawable != null) {
            return drawable;
        }
        SparseArray sparseArray = this.F;
        if (sparseArray != null) {
            int indexOfKey = sparseArray.indexOfKey(i);
            if (indexOfKey >= 0) {
                Drawable b = b(((ConstantState) this.F.valueAt(indexOfKey)).newDrawable(this.b));
                this.e[i] = b;
                this.F.removeAt(indexOfKey);
                if (this.F.size() == 0) {
                    this.F = null;
                }
                return b;
            }
        }
        return null;
    }

    /* Access modifiers changed, original: final */
    public final void a(Resources resources) {
        if (resources != null) {
            this.b = resources;
            int a = agi.a(resources, this.E);
            int i = this.E;
            this.E = a;
            if (i != a) {
                this.k = false;
                this.h = false;
            }
        }
    }

    public final boolean canApplyTheme() {
        int i = this.f;
        Drawable[] drawableArr = this.e;
        for (int i2 = 0; i2 < i; i2++) {
            Drawable drawable = drawableArr[i2];
            if (drawable == null) {
                ConstantState constantState = (ConstantState) this.F.get(i2);
                if (constantState != null && constantState.canApplyTheme()) {
                    return true;
                }
            } else if (drawable.canApplyTheme()) {
                return true;
            }
        }
        return false;
    }

    /* Access modifiers changed, original: protected|final */
    public final void d() {
        this.k = true;
        c();
        int i = this.f;
        Drawable[] drawableArr = this.e;
        this.m = -1;
        this.l = -1;
        int i2 = 0;
        this.o = 0;
        this.n = 0;
        while (i2 < i) {
            Drawable drawable = drawableArr[i2];
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (intrinsicWidth > this.l) {
                this.l = intrinsicWidth;
            }
            intrinsicWidth = drawable.getIntrinsicHeight();
            if (intrinsicWidth > this.m) {
                this.m = intrinsicWidth;
            }
            intrinsicWidth = drawable.getMinimumWidth();
            if (intrinsicWidth > this.n) {
                this.n = intrinsicWidth;
            }
            int minimumHeight = drawable.getMinimumHeight();
            if (minimumHeight > this.o) {
                this.o = minimumHeight;
            }
            i2++;
        }
    }

    public final synchronized boolean e() {
        if (this.G) {
            return this.H;
        }
        c();
        this.G = true;
        int i = this.f;
        Drawable[] drawableArr = this.e;
        int i2 = 0;
        while (i2 < i) {
            if (drawableArr[i2].getConstantState() != null) {
                i2++;
            } else {
                this.H = false;
                return false;
            }
        }
        this.H = true;
        return true;
    }
}
