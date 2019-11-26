package defpackage;

import android.os.Build.VERSION;
import android.view.WindowInsets;

/* renamed from: abx */
public final class abx {
    private final Object a;

    private abx(Object obj) {
        this.a = obj;
    }

    public final int a() {
        return VERSION.SDK_INT >= 20 ? ((WindowInsets) this.a).getSystemWindowInsetLeft() : 0;
    }

    public final int b() {
        return VERSION.SDK_INT >= 20 ? ((WindowInsets) this.a).getSystemWindowInsetTop() : 0;
    }

    public final int c() {
        return VERSION.SDK_INT >= 20 ? ((WindowInsets) this.a).getSystemWindowInsetRight() : 0;
    }

    public final int d() {
        return VERSION.SDK_INT >= 20 ? ((WindowInsets) this.a).getSystemWindowInsetBottom() : 0;
    }

    public final boolean e() {
        return VERSION.SDK_INT >= 21 ? ((WindowInsets) this.a).isConsumed() : false;
    }

    public final abx f() {
        return VERSION.SDK_INT >= 20 ? new abx(((WindowInsets) this.a).consumeSystemWindowInsets()) : null;
    }

    public final abx a(int i, int i2, int i3, int i4) {
        return VERSION.SDK_INT >= 20 ? new abx(((WindowInsets) this.a).replaceSystemWindowInsets(i, i2, i3, i4)) : null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        boolean z = false;
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        abx abx = (abx) obj;
        Object obj2 = this.a;
        obj = abx.a;
        if (obj2 != null) {
            z = obj2.equals(obj);
        } else if (obj != null) {
            return z;
        } else {
            return true;
        }
        return z;
    }

    public final int hashCode() {
        Object obj = this.a;
        return obj != null ? obj.hashCode() : 0;
    }

    static abx a(Object obj) {
        return obj != null ? new abx(obj) : null;
    }

    static Object a(abx abx) {
        return abx != null ? abx.a : null;
    }
}
