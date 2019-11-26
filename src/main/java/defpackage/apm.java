package defpackage;

import android.view.View;

/* renamed from: apm */
final class apm implements ass {
    private final /* synthetic */ apn a;

    apm(apn apn) {
        this.a = apn;
    }

    public final View a(int i) {
        return this.a.i(i);
    }

    public final int a() {
        return this.a.x();
    }

    public final int b() {
        apn apn = this.a;
        return apn.u - apn.z();
    }

    public final int a(View view) {
        return apn.h(view) - ((apr) view.getLayoutParams()).leftMargin;
    }

    public final int b(View view) {
        return apn.j(view) + ((apr) view.getLayoutParams()).rightMargin;
    }
}
