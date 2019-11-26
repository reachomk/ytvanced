package defpackage;

import android.content.Context;
import android.view.View.MeasureSpec;

/* renamed from: czq */
public final class czq implements czo {
    private final ans a;

    public czq(ans ans) {
        this.a = ans;
    }

    public final void c() {
    }

    public czq(Context context, int i, boolean z) {
        this.a = new czp(i, false);
        this.a.o = false;
    }

    public final int a() {
        return this.a.c;
    }

    public final int d() {
        return this.a.p();
    }

    public final int i_() {
        return this.a.r();
    }

    public final int f() {
        return this.a.q();
    }

    public final int g() {
        return this.a.s();
    }

    public final int h() {
        return this.a.C();
    }

    public final apn b() {
        return this.a;
    }

    public final int a(int i, int i2, int i3, int i4) {
        double ceil;
        if (this.a.c != 0) {
            ceil = Math.ceil((double) (((float) i4) / ((float) i2)));
        } else {
            ceil = Math.ceil((double) (((float) i3) / ((float) i)));
        }
        i = (int) ceil;
        if (i >= 2) {
            return i <= 10 ? i : 10;
        } else {
            i = 2;
        }
    }

    public final int b(int i) {
        return this.a.c != 0 ? MeasureSpec.makeMeasureSpec(0, 0) : i;
    }

    public final int a(int i) {
        if (this.a.c != 0) {
            return i;
        }
        return MeasureSpec.makeMeasureSpec(0, 0);
    }

    public final /* synthetic */ czn a(int i, int i2) {
        return new czs(i, i2, a());
    }
}
