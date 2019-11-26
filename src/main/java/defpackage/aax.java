package defpackage;

import android.view.View;
import android.view.ViewParent;

/* renamed from: aax */
public final class aax {
    public boolean a;
    private ViewParent b;
    private ViewParent c;
    private final View d;
    private int[] e;

    public aax(View view) {
        this.d = view;
    }

    public final void a(boolean z) {
        if (this.a) {
            abe.B(this.d);
        }
        this.a = z;
    }

    public final boolean a() {
        return a(0);
    }

    public final boolean a(int i) {
        return d(i) != null;
    }

    public final boolean b(int i) {
        return a(i, 0);
    }

    public final boolean a(int i, int i2) {
        if (a(i2)) {
            return true;
        }
        if (this.a) {
            View view = this.d;
            for (ViewParent parent = this.d.getParent(); parent != null; parent = parent.getParent()) {
                if (abo.a(parent, view, this.d, i, i2)) {
                    a(i2, parent);
                    abo.b(parent, view, this.d, i, i2);
                    return true;
                }
                if (parent instanceof View) {
                    view = (View) parent;
                }
            }
        }
        return false;
    }

    public final void b() {
        c(0);
    }

    public final void c(int i) {
        ViewParent d = d(i);
        if (d != null) {
            abo.a(d, this.d, i);
            a(i, null);
        }
    }

    public final boolean a(int i, int i2, int i3, int i4, int[] iArr) {
        return a(i, i2, i3, i4, iArr, 0, null);
    }

    public final boolean a(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        int[] iArr3 = iArr;
        if (this.a) {
            ViewParent d = d(i5);
            if (d != null) {
                if (i != 0 || i2 != 0 || i3 != 0 || i4 != 0) {
                    int i6;
                    int i7;
                    int[] iArr4;
                    if (iArr3 == null) {
                        i6 = 0;
                        i7 = 0;
                    } else {
                        this.d.getLocationInWindow(iArr3);
                        i6 = iArr3[0];
                        i7 = iArr3[1];
                    }
                    if (iArr2 == null) {
                        int[] c = c();
                        c[0] = 0;
                        c[1] = 0;
                        iArr4 = c;
                    } else {
                        iArr4 = iArr2;
                    }
                    abo.a(d, this.d, i, i2, i3, i4, i5, iArr4);
                    if (iArr3 != null) {
                        this.d.getLocationInWindow(iArr3);
                        iArr3[0] = iArr3[0] - i6;
                        iArr3[1] = iArr3[1] - i7;
                    }
                    return true;
                } else if (iArr3 != null) {
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                }
            }
        }
        return false;
    }

    public final boolean a(int i, int i2, int[] iArr, int[] iArr2) {
        return a(i, i2, iArr, iArr2, 0);
    }

    public final boolean a(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        if (this.a) {
            ViewParent d = d(i3);
            if (d != null) {
                if (i != 0 || i2 != 0) {
                    int i4;
                    int i5;
                    if (iArr2 == null) {
                        i4 = 0;
                        i5 = 0;
                    } else {
                        this.d.getLocationInWindow(iArr2);
                        i4 = iArr2[0];
                        i5 = iArr2[1];
                    }
                    if (iArr == null) {
                        iArr = c();
                    }
                    iArr[0] = 0;
                    iArr[1] = 0;
                    abo.a(d, this.d, i, i2, iArr, i3);
                    if (iArr2 != null) {
                        this.d.getLocationInWindow(iArr2);
                        iArr2[0] = iArr2[0] - i4;
                        iArr2[1] = iArr2[1] - i5;
                    }
                    if (iArr[0] == 0 && iArr[1] == 0) {
                        return false;
                    }
                    return true;
                } else if (iArr2 != null) {
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                }
            }
        }
        return false;
    }

    public final boolean a(float f, float f2, boolean z) {
        if (this.a) {
            ViewParent d = d(0);
            if (d != null) {
                return abo.a(d, this.d, f, f2, z);
            }
        }
        return false;
    }

    public final boolean a(float f, float f2) {
        if (this.a) {
            ViewParent d = d(0);
            if (d != null) {
                return abo.a(d, this.d, f, f2);
            }
        }
        return false;
    }

    private final ViewParent d(int i) {
        if (i != 0) {
            return this.c;
        }
        return this.b;
    }

    private final void a(int i, ViewParent viewParent) {
        if (i != 0) {
            this.c = viewParent;
        } else {
            this.b = viewParent;
        }
    }

    private final int[] c() {
        if (this.e == null) {
            this.e = new int[2];
        }
        return this.e;
    }
}
