package defpackage;

import android.view.View;

/* renamed from: aoo */
final class aoo extends aol {
    aoo(apn apn) {
        super(apn);
    }

    public final int c() {
        apn apn = this.a;
        return apn.u - apn.z();
    }

    public final int d() {
        return this.a.u;
    }

    public final void a(int i) {
        this.a.j(i);
    }

    public final int b() {
        return this.a.x();
    }

    public final int e(View view) {
        apr apr = (apr) view.getLayoutParams();
        return (apn.f(view) + apr.leftMargin) + apr.rightMargin;
    }

    public final int f(View view) {
        apr apr = (apr) view.getLayoutParams();
        return (apn.g(view) + apr.topMargin) + apr.bottomMargin;
    }

    public final int b(View view) {
        return apn.j(view) + ((apr) view.getLayoutParams()).rightMargin;
    }

    public final int a(View view) {
        return apn.h(view) - ((apr) view.getLayoutParams()).leftMargin;
    }

    public final int c(View view) {
        this.a.a(view, this.c);
        return this.c.right;
    }

    public final int d(View view) {
        this.a.a(view, this.c);
        return this.c.left;
    }

    public final int e() {
        apn apn = this.a;
        return (apn.u - apn.x()) - this.a.z();
    }

    public final int f() {
        return this.a.z();
    }

    public final int g() {
        return this.a.s;
    }

    public final int h() {
        return this.a.t;
    }
}
