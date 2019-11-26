package defpackage;

import android.graphics.PointF;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

/* renamed from: ans */
public class ans extends apn implements aqe, atm {
    private final anu A;
    private int B;
    private int[] C;
    private ant a;
    private boolean b;
    public int c;
    public aol d;
    public boolean e;
    public boolean f;
    public boolean g;
    public anw h;
    private boolean w;
    private int x;
    private int y;
    private final anr z;

    public ans() {
        this(1, false);
    }

    public void a(RecyclerView recyclerView) {
    }

    /* Access modifiers changed, original: 0000 */
    public void a(apw apw, aqh aqh, anr anr, int i) {
    }

    public final boolean i() {
        return true;
    }

    public ans(int i, boolean z) {
        this.c = 1;
        this.e = false;
        this.f = false;
        this.g = false;
        this.w = true;
        this.x = -1;
        this.y = aocf.UNSET_ENUM_VALUE;
        this.h = null;
        this.z = new anr();
        this.A = new anu();
        this.B = 2;
        this.C = new int[2];
        b(i);
        a(null);
        if (this.e) {
            this.e = false;
            t();
        }
    }

    public apr g() {
        return new apr(-2, -2);
    }

    public final void a(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.j;
        apw apw = recyclerView.e;
        aqh aqh = recyclerView.L;
        if (accessibilityEvent != null) {
            boolean z = true;
            if (!(recyclerView.canScrollVertically(1) || this.j.canScrollVertically(-1) || this.j.canScrollHorizontally(-1) || this.j.canScrollHorizontally(1))) {
                z = false;
            }
            accessibilityEvent.setScrollable(z);
            apa apa = this.j.m;
            if (apa != null) {
                accessibilityEvent.setItemCount(apa.a());
            }
        }
        if (w() > 0) {
            accessibilityEvent.setFromIndex(p());
            accessibilityEvent.setToIndex(r());
        }
    }

    public final Parcelable j() {
        anw anw = this.h;
        if (anw != null) {
            return new anw(anw);
        }
        anw = new anw();
        if (w() > 0) {
            n();
            int i = this.b ^ this.f;
            anw.c = i;
            View I;
            if (i != 0) {
                I = I();
                anw.b = this.d.c() - this.d.b(I);
                anw.a = apn.c(I);
            } else {
                I = H();
                anw.a = apn.c(I);
                anw.b = this.d.a(I) - this.d.b();
            }
        } else {
            anw.b();
        }
        return anw;
    }

    public final void a(Parcelable parcelable) {
        if (parcelable instanceof anw) {
            this.h = (anw) parcelable;
            t();
        }
    }

    public boolean k() {
        return this.c == 0;
    }

    public boolean l() {
        return this.c == 1;
    }

    public void aB_() {
        a(null);
        if (!this.g) {
            this.g = true;
            t();
        }
    }

    public final void b(int i) {
        if (i == 0 || i == 1) {
            a(null);
            if (i != this.c || this.d == null) {
                aol b;
                if (i != 0) {
                    b = aol.b((apn) this);
                } else {
                    b = aol.a((apn) this);
                }
                this.d = b;
                this.z.a = this.d;
                this.c = i;
                t();
                return;
            }
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("invalid orientation:");
        stringBuilder.append(i);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    private final void F() {
        if (this.c == 1 || !m()) {
            this.f = this.e;
        } else {
            this.f = this.e ^ 1;
        }
    }

    public final View c(int i) {
        int w = w();
        if (w == 0) {
            return null;
        }
        int c = i - apn.c(i(0));
        if (c >= 0 && c < w) {
            View i2 = i(c);
            if (apn.c(i2) == i) {
                return i2;
            }
        }
        return super.c(i);
    }

    /* Access modifiers changed, original: protected */
    @Deprecated
    public int f(aqh aqh) {
        return aqh.a() ? this.d.e() : 0;
    }

    private final void a(aqh aqh, int[] iArr) {
        int f = f(aqh);
        int i = this.a.f;
        int i2 = i == -1 ? 0 : f;
        if (i != -1) {
            f = 0;
        }
        iArr[0] = f;
        iArr[1] = i2;
    }

    public void a(RecyclerView recyclerView, int i) {
        aqc any = new any(recyclerView.getContext());
        any.b = i;
        a(any);
    }

    public final PointF d(int i) {
        if (w() == 0) {
            return null;
        }
        boolean z = false;
        int i2 = 1;
        if (i < apn.c(i(0))) {
            z = true;
        }
        if (z != this.f) {
            i2 = -1;
        }
        if (this.c == 0) {
            return new PointF((float) i2, 0.0f);
        }
        return new PointF(0.0f, (float) i2);
    }

    public void c(apw apw, aqh aqh) {
        if (!(this.h == null && this.x == -1) && aqh.b() == 0) {
            b(apw);
            return;
        }
        int i;
        int i2;
        int c;
        int i3;
        anw anw = this.h;
        if (anw != null && anw.a()) {
            this.x = this.h.a;
        }
        n();
        this.a.a = false;
        F();
        View B = B();
        anr anr = this.z;
        if (!anr.e || this.x != -1 || this.h != null) {
            View c2;
            anr.a();
            anr anr2 = this.z;
            anr2.d = this.f ^ this.g;
            if (!aqh.g) {
                i = this.x;
                if (i != -1) {
                    if (i < 0 || i >= aqh.b()) {
                        this.x = -1;
                        this.y = aocf.UNSET_ENUM_VALUE;
                    } else {
                        anr2.b = this.x;
                        anw anw2 = this.h;
                        boolean z;
                        if (anw2 == null || !anw2.a()) {
                            if (this.y == aocf.UNSET_ENUM_VALUE) {
                                c2 = c(this.x);
                                if (c2 == null) {
                                    if (w() > 0) {
                                        anr2.d = (this.x < apn.c(i(0))) == this.f;
                                    }
                                    anr2.b();
                                } else if (this.d.e(c2) > this.d.e()) {
                                    anr2.b();
                                } else if (this.d.a(c2) - this.d.b() < 0) {
                                    anr2.c = this.d.b();
                                    anr2.d = false;
                                } else if (this.d.c() - this.d.b(c2) < 0) {
                                    anr2.c = this.d.c();
                                    anr2.d = true;
                                } else {
                                    if (anr2.d) {
                                        i = this.d.b(c2) + this.d.a();
                                    } else {
                                        i = this.d.a(c2);
                                    }
                                    anr2.c = i;
                                }
                            } else {
                                z = this.f;
                                anr2.d = z;
                                if (z) {
                                    anr2.c = this.d.c() - this.y;
                                } else {
                                    anr2.c = this.d.b() + this.y;
                                }
                            }
                            this.z.e = true;
                        } else {
                            z = this.h.c;
                            anr2.d = z;
                            if (z) {
                                anr2.c = this.d.c() - this.h.b;
                            } else {
                                anr2.c = this.d.b() + this.h.b;
                            }
                            this.z.e = true;
                        }
                    }
                }
            }
            if (w() != 0) {
                c2 = B();
                if (c2 != null) {
                    apr apr = (apr) c2.getLayoutParams();
                    if (!apr.l_() && apr.c() >= 0 && apr.c() < aqh.b()) {
                        anr2.a(c2, apn.c(c2));
                        this.z.e = true;
                    }
                }
                if (this.b == this.g) {
                    c2 = anr2.d ? this.f ? d(apw, aqh) : e(apw, aqh) : this.f ? e(apw, aqh) : d(apw, aqh);
                    if (c2 != null) {
                        anr2.b(c2, apn.c(c2));
                        if (!aqh.g && h() && (this.d.a(c2) >= this.d.c() || this.d.b(c2) < this.d.b())) {
                            if (anr2.d) {
                                i = this.d.c();
                            } else {
                                i = this.d.b();
                            }
                            anr2.c = i;
                        }
                        this.z.e = true;
                    }
                }
            }
            anr2.b();
            anr2.b = this.g ? aqh.b() - 1 : 0;
            this.z.e = true;
        } else if (B != null && (this.d.a(B) >= this.d.c() || this.d.b(B) <= this.d.b())) {
            this.z.a(B, apn.c(B));
        }
        ant ant = this.a;
        ant.f = ant.k >= 0 ? 1 : -1;
        int[] iArr = this.C;
        iArr[0] = 0;
        iArr[1] = 0;
        a(aqh, iArr);
        int max = Math.max(0, this.C[0]) + this.d.b();
        i = Math.max(0, this.C[1]) + this.d.f();
        if (aqh.g) {
            i2 = this.x;
            if (!(i2 == -1 || this.y == aocf.UNSET_ENUM_VALUE)) {
                View c3 = c(i2);
                if (c3 != null) {
                    if (this.f) {
                        c = (this.d.c() - this.d.b(c3)) - this.y;
                    } else {
                        c = this.y - (this.d.a(c3) - this.d.b());
                    }
                    if (c <= 0) {
                        i -= c;
                    } else {
                        max += c;
                    }
                }
            }
        }
        anr anr3 = this.z;
        c = (anr3.d ? !this.f : this.f) ? -1 : 1;
        a(apw, aqh, anr3, c);
        for (i2 = w() - 1; i2 >= 0; i2--) {
            View i4 = i(i2);
            aqj d = RecyclerView.d(i4);
            if (!d.b()) {
                if (!d.j() || d.m() || this.j.m.b) {
                    h(i2);
                    apw.c(i4);
                    this.j.h.c(d);
                } else {
                    g(i2);
                    apw.a(d);
                }
            }
        }
        this.a.m = G();
        ant ant2 = this.a;
        ant2.j = aqh.g;
        ant2.i = 0;
        anr anr4 = this.z;
        if (anr4.d) {
            b(anr4);
            ant2 = this.a;
            ant2.h = max;
            a(apw, ant2, aqh, false);
            ant = this.a;
            i3 = ant.b;
            i2 = ant.d;
            max = ant.c;
            if (max > 0) {
                i += max;
            }
            a(this.z);
            ant = this.a;
            ant.h = i;
            ant.d += ant.e;
            a(apw, ant, aqh, false);
            ant = this.a;
            i = ant.b;
            max = ant.c;
            if (max > 0) {
                f(i2, i3);
                ant2 = this.a;
                ant2.h = max;
                a(apw, ant2, aqh, false);
                i3 = this.a.b;
            }
        } else {
            a(anr4);
            ant2 = this.a;
            ant2.h = i;
            a(apw, ant2, aqh, false);
            ant2 = this.a;
            i = ant2.b;
            i2 = ant2.d;
            i3 = ant2.c;
            if (i3 > 0) {
                max += i3;
            }
            b(this.z);
            ant2 = this.a;
            ant2.h = max;
            ant2.d += ant2.e;
            a(apw, ant2, aqh, false);
            ant = this.a;
            i3 = ant.b;
            max = ant.c;
            if (max > 0) {
                e(i2, i);
                ant ant3 = this.a;
                ant3.h = max;
                a(apw, ant3, aqh, false);
                i = this.a.b;
            }
        }
        if (w() > 0) {
            if ((this.f ^ this.g) != 0) {
                max = a(i, apw, aqh, true);
                i3 += max;
                i2 = b(i3, apw, aqh, false);
                i3 += i2;
                i += max;
            } else {
                max = b(i3, apw, aqh, true);
                i += max;
                i2 = a(i, apw, aqh, false);
                i3 = (i3 + max) + i2;
            }
            i += i2;
        }
        if (aqh.k && w() != 0 && !aqh.g && h()) {
            List list = apw.d;
            i2 = list.size();
            c = apn.c(i(0));
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < i2; i7++) {
                aqj aqj = (aqj) list.get(i7);
                if (!aqj.m()) {
                    if ((aqj.c() < c) != this.f) {
                        i5 += this.d.e(aqj.a);
                    } else {
                        i6 += this.d.e(aqj.a);
                    }
                }
            }
            this.a.l = list;
            if (i5 > 0) {
                f(apn.c(H()), i3);
                ant = this.a;
                ant.h = i5;
                ant.c = 0;
                ant.a();
                a(apw, this.a, aqh, false);
            }
            if (i6 > 0) {
                e(apn.c(I()), i);
                ant = this.a;
                ant.h = i6;
                ant.c = 0;
                ant.a();
                a(apw, this.a, aqh, false);
            }
            this.a.l = null;
        }
        if (aqh.g) {
            this.z.a();
        } else {
            aol aol = this.d;
            aol.b = aol.e();
        }
        this.b = this.g;
    }

    public void a(aqh aqh) {
        this.h = null;
        this.x = -1;
        this.y = aocf.UNSET_ENUM_VALUE;
        this.z.a();
    }

    private final int a(int i, apw apw, aqh aqh, boolean z) {
        int c = this.d.c() - i;
        if (c <= 0) {
            return 0;
        }
        int i2 = -c(-c, apw, aqh);
        i += i2;
        if (z) {
            int c2 = this.d.c() - i;
            if (c2 > 0) {
                this.d.a(c2);
                return c2 + i2;
            }
        }
        return i2;
    }

    private final int b(int i, apw apw, aqh aqh, boolean z) {
        int b = i - this.d.b();
        if (b <= 0) {
            return 0;
        }
        int i2 = -c(b, apw, aqh);
        i += i2;
        if (z) {
            i -= this.d.b();
            if (i > 0) {
                this.d.a(-i);
                i2 -= i;
            }
        }
        return i2;
    }

    private final void a(anr anr) {
        e(anr.b, anr.c);
    }

    private final void e(int i, int i2) {
        this.a.c = this.d.c() - i2;
        ant ant = this.a;
        ant.e = !this.f ? 1 : -1;
        ant.d = i;
        ant.f = 1;
        ant.b = i2;
        ant.g = aocf.UNSET_ENUM_VALUE;
    }

    private final void b(anr anr) {
        f(anr.b, anr.c);
    }

    private final void f(int i, int i2) {
        this.a.c = i2 - this.d.b();
        ant ant = this.a;
        ant.d = i;
        ant.e = !this.f ? -1 : 1;
        ant.f = -1;
        ant.b = i2;
        ant.g = aocf.UNSET_ENUM_VALUE;
    }

    /* Access modifiers changed, original: protected */
    public boolean m() {
        return v() == 1;
    }

    /* Access modifiers changed, original: final */
    public final void n() {
        if (this.a == null) {
            this.a = new ant();
        }
    }

    public void e(int i) {
        this.x = i;
        this.y = aocf.UNSET_ENUM_VALUE;
        anw anw = this.h;
        if (anw != null) {
            anw.b();
        }
        t();
    }

    public void a_(int i, int i2) {
        this.x = i;
        this.y = i2;
        anw anw = this.h;
        if (anw != null) {
            anw.b();
        }
        t();
    }

    public int a(int i, apw apw, aqh aqh) {
        if (this.c == 1) {
            return 0;
        }
        return c(i, apw, aqh);
    }

    public int b(int i, apw apw, aqh aqh) {
        return this.c != 0 ? c(i, apw, aqh) : 0;
    }

    public int d(aqh aqh) {
        return i(aqh);
    }

    public int e(aqh aqh) {
        return i(aqh);
    }

    public final int g(aqh aqh) {
        return k(aqh);
    }

    public final int h(aqh aqh) {
        return k(aqh);
    }

    public int b(aqh aqh) {
        return j(aqh);
    }

    public int c(aqh aqh) {
        return j(aqh);
    }

    public final int i(aqh aqh) {
        int i = 0;
        if (w() != 0) {
            n();
            aol aol = this.d;
            View b = b(this.w ^ 1);
            View c = c(this.w ^ 1);
            boolean z = this.w;
            boolean z2 = this.f;
            if (!(w() == 0 || aqh.b() == 0 || b == null || c == null)) {
                i = z2 ? Math.max(0, (aqh.b() - Math.max(apn.c(b), apn.c(c))) - 1) : Math.max(0, Math.min(apn.c(b), apn.c(c)));
                if (z) {
                    return Math.round((((float) i) * (((float) Math.abs(aol.b(c) - aol.a(b))) / ((float) (Math.abs(apn.c(b) - apn.c(c)) + 1)))) + ((float) (aol.b() - aol.a(b))));
                }
            }
        }
        return i;
    }

    private final int k(aqh aqh) {
        if (w() == 0) {
            return 0;
        }
        n();
        aol aol = this.d;
        View b = b(this.w ^ 1);
        View c = c(this.w ^ 1);
        boolean z = this.w;
        if (w() == 0 || aqh.b() == 0 || b == null || c == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(apn.c(b) - apn.c(c)) + 1;
        }
        return Math.min(aol.e(), aol.b(c) - aol.a(b));
    }

    public final int j(aqh aqh) {
        if (w() == 0) {
            return 0;
        }
        n();
        aol aol = this.d;
        View b = b(this.w ^ 1);
        View c = c(this.w ^ 1);
        boolean z = this.w;
        if (w() == 0 || aqh.b() == 0 || b == null || c == null) {
            return 0;
        }
        if (z) {
            return (int) ((((float) (aol.b(c) - aol.a(b))) / ((float) (Math.abs(apn.c(b) - apn.c(c)) + 1))) * ((float) aqh.b()));
        }
        return aqh.b();
    }

    private final void a(int i, int i2, boolean z, aqh aqh) {
        this.a.m = G();
        this.a.f = i;
        int[] iArr = this.C;
        iArr[0] = 0;
        iArr[1] = 0;
        a(aqh, iArr);
        int max = Math.max(0, this.C[0]);
        int max2 = Math.max(0, this.C[1]);
        ant ant = this.a;
        int i3 = i != 1 ? max : max2;
        ant.h = i3;
        if (i != 1) {
            max = max2;
        }
        ant.i = max;
        max = -1;
        View I;
        ant ant2;
        if (i == 1) {
            ant.h = i3 + this.d.f();
            I = I();
            ant2 = this.a;
            if (!this.f) {
                max = 1;
            }
            ant2.e = max;
            max = apn.c(I);
            ant = this.a;
            ant2.d = max + ant.e;
            ant.b = this.d.b(I);
            i = this.d.b(I) - this.d.c();
        } else {
            I = H();
            ant2 = this.a;
            ant2.h += this.d.b();
            ant2 = this.a;
            if (this.f) {
                max = 1;
            }
            ant2.e = max;
            max = apn.c(I);
            ant = this.a;
            ant2.d = max + ant.e;
            ant.b = this.d.a(I);
            i = (-this.d.a(I)) + this.d.b();
        }
        ant ant3 = this.a;
        ant3.c = i2;
        if (z) {
            ant3.c = i2 - i;
        }
        ant3.g = i;
    }

    private final boolean G() {
        return this.d.g() == 0 && this.d.d() == 0;
    }

    /* Access modifiers changed, original: 0000 */
    public void a(aqh aqh, ant ant, apo apo) {
        int i = ant.d;
        if (i >= 0 && i < aqh.b()) {
            apo.a(i, Math.max(0, ant.g));
        }
    }

    public final void a(int i, apo apo) {
        boolean z;
        int i2;
        anw anw = this.h;
        int i3 = -1;
        if (anw == null || !anw.a()) {
            F();
            z = this.f;
            i2 = this.x;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            anw = this.h;
            z = anw.c;
            i2 = anw.a;
        }
        if (!z) {
            i3 = 1;
        }
        int i4 = i2;
        for (i2 = 0; i2 < this.B && i4 >= 0 && i4 < i; i2++) {
            apo.a(i4, 0);
            i4 += i3;
        }
    }

    public final void a(int i, int i2, aqh aqh, apo apo) {
        if (this.c != 0) {
            i = i2;
        }
        if (w() != 0 && i != 0) {
            n();
            a(i > 0 ? 1 : -1, Math.abs(i), true, aqh);
            a(aqh, this.a, apo);
        }
    }

    private final int c(int i, apw apw, aqh aqh) {
        if (!(w() == 0 || i == 0)) {
            n();
            this.a.a = true;
            int i2 = i > 0 ? 1 : -1;
            int abs = Math.abs(i);
            a(i2, abs, true, aqh);
            ant ant = this.a;
            int a = ant.g + a(apw, ant, aqh, false);
            if (a >= 0) {
                if (abs > a) {
                    i = i2 * a;
                }
                this.d.a(-i);
                this.a.k = i;
                return i;
            }
        }
        return 0;
    }

    public final void a(String str) {
        if (this.h == null) {
            RecyclerView recyclerView = this.j;
            if (recyclerView != null) {
                recyclerView.a(str);
            }
        }
    }

    private final void a(apw apw, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 > i) {
            while (true) {
                i2--;
                if (i2 >= i) {
                    a(i2, apw);
                } else {
                    return;
                }
            }
        }
        while (i > i2) {
            a(i, apw);
            i--;
        }
    }

    private final void a(apw apw, ant ant) {
        if (ant.a && !ant.m) {
            int i = ant.g;
            int i2 = ant.i;
            int w;
            if (ant.f == -1) {
                w = w();
                if (i >= 0) {
                    int d = (this.d.d() - i) + i2;
                    View i3;
                    if (this.f) {
                        for (i = 0; i < w; i++) {
                            i3 = i(i);
                            if (this.d.a(i3) < d || this.d.d(i3) < d) {
                                a(apw, 0, i);
                                break;
                            }
                        }
                    } else {
                        w--;
                        for (i = w; i >= 0; i--) {
                            i3 = i(i);
                            if (this.d.a(i3) < d || this.d.d(i3) < d) {
                                a(apw, w, i);
                                break;
                            }
                        }
                    }
                }
            } else if (i >= 0) {
                i -= i2;
                w = w();
                if (this.f) {
                    w--;
                    for (i2 = w; i2 >= 0; i2--) {
                        View i4 = i(i2);
                        if (this.d.b(i4) > i || this.d.c(i4) > i) {
                            a(apw, w, i2);
                            return;
                        }
                    }
                } else {
                    for (i2 = 0; i2 < w; i2++) {
                        View i5 = i(i2);
                        if (this.d.b(i5) > i || this.d.c(i5) > i) {
                            a(apw, 0, i2);
                            return;
                        }
                    }
                }
            }
        }
    }

    private final int a(apw apw, ant ant, aqh aqh, boolean z) {
        int i = ant.c;
        int i2 = ant.g;
        if (i2 != aocf.UNSET_ENUM_VALUE) {
            if (i < 0) {
                ant.g = i2 + i;
            }
            a(apw, ant);
        }
        i2 = ant.c + ant.h;
        anu anu = this.A;
        while (true) {
            if ((!ant.m && i2 <= 0) || !ant.a(aqh)) {
                break;
            }
            anu.a = 0;
            anu.b = false;
            anu.c = false;
            anu.d = false;
            a(apw, aqh, ant, anu);
            if (!anu.b) {
                int i3 = ant.b;
                int i4 = anu.a;
                ant.b = i3 + (ant.f * i4);
                if (!(anu.c && ant.l == null && aqh.g)) {
                    ant.c -= i4;
                    i2 -= i4;
                }
                i3 = ant.g;
                if (i3 != aocf.UNSET_ENUM_VALUE) {
                    i3 += i4;
                    ant.g = i3;
                    i4 = ant.c;
                    if (i4 < 0) {
                        ant.g = i3 + i4;
                    }
                    a(apw, ant);
                }
                if (z) {
                    if (anu.d) {
                        break;
                    }
                }
            } else {
                break;
            }
        }
        return i - ant.c;
    }

    /* Access modifiers changed, original: 0000 */
    public void a(apw apw, aqh aqh, ant ant, anu anu) {
        View a = ant.a(apw);
        if (a == null) {
            anu.b = true;
            return;
        }
        int z;
        int f;
        int i;
        int i2;
        apr apr = (apr) a.getLayoutParams();
        if (ant.l == null) {
            if (this.f == (ant.f == -1)) {
                b(a);
            } else {
                b(a, 0);
            }
        } else {
            if (this.f == (ant.f == -1)) {
                a(a);
            } else {
                a(a, 0);
            }
        }
        e(a);
        anu.a = this.d.e(a);
        if (this.c == 1) {
            if (m()) {
                z = this.u - z();
                f = z - this.d.f(a);
            } else {
                f = x();
                z = this.d.f(a) + f;
            }
            if (ant.f == -1) {
                i = ant.b;
                i2 = i - anu.a;
            } else {
                i2 = ant.b;
                i = anu.a + i2;
            }
        } else {
            f = y();
            z = this.d.f(a) + f;
            int i3;
            if (ant.f == -1) {
                i = ant.b;
                i2 = i - anu.a;
                i3 = z;
                z = i;
                i = i3;
                int i4 = i2;
                i2 = f;
                f = i4;
            } else {
                i = ant.b;
                i2 = anu.a + i;
                i3 = f;
                f = i;
                i = z;
                z = i2;
                i2 = i3;
            }
        }
        apn.a(a, f, i2, z, i);
        if (apr.l_() || apr.m_()) {
            anu.c = true;
        }
        anu.d = a.hasFocusable();
    }

    /* Access modifiers changed, original: final */
    public final boolean o() {
        if (!(this.t == 1073741824 || this.s == 1073741824)) {
            int w = w();
            for (int i = 0; i < w; i++) {
                LayoutParams layoutParams = i(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
        }
        return false;
    }

    /* Access modifiers changed, original: final */
    public final int f(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.c == 1) ? 1 : aocf.UNSET_ENUM_VALUE : this.c == 0 ? 1 : aocf.UNSET_ENUM_VALUE : this.c == 1 ? -1 : aocf.UNSET_ENUM_VALUE : this.c == 0 ? -1 : aocf.UNSET_ENUM_VALUE : (this.c == 1 || !m()) ? 1 : -1 : (this.c == 1 || !m()) ? -1 : 1;
    }

    private final View H() {
        return i(this.f ? w() - 1 : 0);
    }

    private final View I() {
        return i(!this.f ? w() - 1 : 0);
    }

    private final View b(boolean z) {
        if (this.f) {
            return a(w() - 1, -1, z, true);
        }
        return a(0, w(), z, true);
    }

    private final View c(boolean z) {
        if (this.f) {
            return a(0, w(), z, true);
        }
        return a(w() - 1, -1, z, true);
    }

    private final View d(apw apw, aqh aqh) {
        return a(apw, aqh, 0, w(), aqh.b());
    }

    private final View e(apw apw, aqh aqh) {
        return a(apw, aqh, w() - 1, -1, aqh.b());
    }

    /* Access modifiers changed, original: 0000 */
    public View a(apw apw, aqh aqh, int i, int i2, int i3) {
        n();
        int b = this.d.b();
        int c = this.d.c();
        int i4 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View i5 = i(i);
            int c2 = apn.c(i5);
            if (c2 >= 0 && c2 < i3) {
                if (((apr) i5.getLayoutParams()).l_()) {
                    if (view2 == null) {
                        view2 = i5;
                    }
                } else if (this.d.a(i5) < c && this.d.b(i5) >= b) {
                    return i5;
                } else {
                    if (view == null) {
                        view = i5;
                    }
                }
            }
            i += i4;
        }
        return view != null ? view : view2;
    }

    private final View J() {
        return g(0, w());
    }

    private final View K() {
        return g(w() - 1, -1);
    }

    public final int p() {
        View a = a(0, w(), false, true);
        if (a == null) {
            return -1;
        }
        return apn.c(a);
    }

    public int q() {
        View a = a(0, w(), true, false);
        if (a == null) {
            return -1;
        }
        return apn.c(a);
    }

    public final int r() {
        View a = a(w() - 1, -1, false, true);
        if (a != null) {
            return apn.c(a);
        }
        return -1;
    }

    public final int s() {
        View a = a(w() - 1, -1, true, false);
        if (a != null) {
            return apn.c(a);
        }
        return -1;
    }

    private final View a(int i, int i2, boolean z, boolean z2) {
        n();
        int i3 = 320;
        int i4 = !z ? 320 : 24579;
        if (!z2) {
            i3 = 0;
        }
        if (this.c == 0) {
            return this.k.a(i, i2, i4, i3);
        }
        return this.l.a(i, i2, i4, i3);
    }

    private final View g(int i, int i2) {
        n();
        if (i2 <= i && i2 >= i) {
            return i(i);
        }
        View a;
        int a2 = this.d.a(i(i));
        int b = this.d.b();
        int i3 = a2 < b ? 16388 : 4097;
        a2 = a2 < b ? 16644 : 4161;
        if (this.c == 0) {
            a = this.k.a(i, i2, a2, i3);
        } else {
            a = this.l.a(i, i2, a2, i3);
        }
        return a;
    }

    public View a(View view, int i, apw apw, aqh aqh) {
        F();
        if (w() != 0) {
            int f = f(i);
            if (f != aocf.UNSET_ENUM_VALUE) {
                View K;
                n();
                a(f, (int) (((float) this.d.e()) * 0.33333334f), false, aqh);
                ant ant = this.a;
                ant.g = aocf.UNSET_ENUM_VALUE;
                ant.a = false;
                a(apw, ant, aqh, true);
                if (f == -1) {
                    if (this.f) {
                        K = K();
                    } else {
                        K = J();
                    }
                } else if (this.f) {
                    K = J();
                } else {
                    K = K();
                }
                if (f == -1) {
                    view = H();
                } else {
                    view = I();
                }
                if (!view.hasFocusable()) {
                    return K;
                }
                if (K != null) {
                    return view;
                }
                return null;
            }
        }
        return null;
    }

    public boolean h() {
        return this.h == null && this.b == this.g;
    }

    public final void a(View view, View view2) {
        a("Cannot drop a view during a scroll or layout calculation");
        n();
        F();
        int c = apn.c(view);
        int c2 = apn.c(view2);
        c = c < c2 ? 1 : -1;
        if (this.f) {
            if (c == 1) {
                a_(c2, this.d.c() - (this.d.a(view2) + this.d.e(view)));
            } else {
                a_(c2, this.d.c() - this.d.b(view2));
            }
        } else if (c == -1) {
            a_(c2, this.d.a(view2));
        } else {
            a_(c2, this.d.b(view2) - this.d.e(view));
        }
    }
}
