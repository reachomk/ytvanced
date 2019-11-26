package defpackage;

/* renamed from: mul */
final /* synthetic */ class mul implements bcvk {
    private final mui a;

    mul(mui mui) {
        this.a = mui;
    }

    public final void a(Object obj) {
        mui mui = this.a;
        ngz ngz = (ngz) obj;
        if (ngz != null) {
            mui.g = ngz.e;
            mui.h = ngz.f;
            mui.d.setText(ngz.c);
            mui.i = ngz.d;
            mui.k = ngz.b;
            int i = ngz.g;
            if (i == 1) {
                xpr.a(mui.a, true);
                xpr.a(mui.b, true);
                xpr.a(mui.c, false);
                if (mui.f.hasMessages(1)) {
                    mui.f.removeMessages(1);
                }
                mui.f.sendEmptyMessageDelayed(1, mui.k);
            } else if (i != 2) {
                xpr.a(mui.a, false);
                xpr.a(mui.b, false);
                xpr.a(mui.c, false);
            } else {
                xpr.a(mui.a, false);
                xpr.a(mui.b, false);
                xpr.a(mui.c, true);
            }
        }
    }
}
