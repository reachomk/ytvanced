package defpackage;

import android.graphics.Rect;
import android.view.View;

/* renamed from: aol */
public abstract class aol {
    public final apn a;
    public int b = aocf.UNSET_ENUM_VALUE;
    public final Rect c = new Rect();

    public final int a() {
        return this.b != aocf.UNSET_ENUM_VALUE ? e() - this.b : 0;
    }

    public abstract int a(View view);

    public abstract void a(int i);

    public abstract int b();

    public abstract int b(View view);

    public abstract int c();

    public abstract int c(View view);

    public abstract int d();

    public abstract int d(View view);

    public abstract int e();

    public abstract int e(View view);

    public abstract int f();

    public abstract int f(View view);

    public abstract int g();

    public abstract int h();

    public static aol a(apn apn) {
        return new aoo(apn);
    }

    public static aol b(apn apn) {
        return new aon(apn);
    }

    /* synthetic */ aol(apn apn) {
        this.a = apn;
    }
}
