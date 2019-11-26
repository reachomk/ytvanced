package defpackage;

import android.view.View;

/* renamed from: app */
final class app implements ass {
    private final /* synthetic */ apn a;

    app(apn apn) {
        this.a = apn;
    }

    public final View a(int i) {
        return this.a.i(i);
    }

    public final int a() {
        return this.a.y();
    }

    public final int b() {
        apn apn = this.a;
        return apn.v - apn.A();
    }

    public final int a(View view) {
        return apn.i(view) - ((apr) view.getLayoutParams()).topMargin;
    }

    public final int b(View view) {
        return apn.k(view) + ((apr) view.getLayoutParams()).bottomMargin;
    }
}
