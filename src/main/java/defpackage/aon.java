package defpackage;

import android.view.View;

/* renamed from: aon */
final class aon extends aol {
    aon(apn apn) {
        super(apn);
    }

    public final int c() {
        apn apn = this.a;
        return apn.v - apn.A();
    }

    public final int d() {
        return this.a.v;
    }

    public final void a(int i) {
        this.a.k(i);
    }

    public final int b() {
        return this.a.y();
    }

    public final int e(View view) {
        apr apr = (apr) view.getLayoutParams();
        return (apn.g(view) + apr.topMargin) + apr.bottomMargin;
    }

    public final int f(View view) {
        apr apr = (apr) view.getLayoutParams();
        return (apn.f(view) + apr.leftMargin) + apr.rightMargin;
    }

    public final int b(View view) {
        return apn.k(view) + ((apr) view.getLayoutParams()).bottomMargin;
    }

    public final int a(View view) {
        return apn.i(view) - ((apr) view.getLayoutParams()).topMargin;
    }

    public final int c(View view) {
        this.a.a(view, this.c);
        return this.c.bottom;
    }

    public final int d(View view) {
        this.a.a(view, this.c);
        return this.c.top;
    }

    public final int e() {
        apn apn = this.a;
        return (apn.v - apn.y()) - this.a.A();
    }

    public final int f() {
        return this.a.A();
    }

    public final int g() {
        return this.a.t;
    }

    public final int h() {
        return this.a.s;
    }
}
