package defpackage;

import android.view.View;

/* renamed from: arn */
public abstract class arn extends aph {
    private boolean a = true;

    public abstract boolean a(aqj aqj);

    public abstract boolean a(aqj aqj, int i, int i2, int i3, int i4);

    public abstract boolean a(aqj aqj, aqj aqj2, int i, int i2, int i3, int i4);

    public abstract boolean b(aqj aqj);

    public final void g() {
        this.a = false;
    }

    public final boolean h(aqj aqj) {
        return !this.a || aqj.j();
    }

    public final boolean a(aqj aqj, api api, api api2) {
        int i;
        int i2;
        int i3 = api.a;
        int i4 = api.b;
        View view = aqj.a;
        if (api2 != null) {
            i = api2.a;
        } else {
            i = view.getLeft();
        }
        int i5 = i;
        if (api2 != null) {
            i2 = api2.b;
        } else {
            i2 = view.getTop();
        }
        int i6 = i2;
        if (aqj.m() || (i3 == i5 && i4 == i6)) {
            return a(aqj);
        }
        view.layout(i5, i6, view.getWidth() + i5, view.getHeight() + i6);
        return a(aqj, i3, i4, i5, i6);
    }

    public final boolean b(aqj aqj, api api, api api2) {
        if (api != null) {
            int i = api.a;
            int i2 = api2.a;
            if (!(i == i2 && api.b == api2.b)) {
                return a(aqj, i, api.b, i2, api2.b);
            }
        }
        return b(aqj);
    }

    public final boolean c(aqj aqj, api api, api api2) {
        int i = api.a;
        int i2 = api2.a;
        if (i == i2 && api.b == api2.b) {
            f(aqj);
            return false;
        }
        return a(aqj, i, api.b, i2, api2.b);
    }

    public final boolean a(aqj aqj, aqj aqj2, api api, api api2) {
        int i;
        int i2;
        int i3 = api.a;
        int i4 = api.b;
        if (aqj2.b()) {
            int i5 = api.a;
            i = api.b;
            i2 = i5;
        } else {
            i2 = api2.a;
            i = api2.b;
        }
        return a(aqj, aqj2, i3, i4, i2, i);
    }
}
