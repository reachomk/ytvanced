package defpackage;

import android.graphics.Rect;
import java.util.Objects;

/* renamed from: tqi */
final class tqi {
    public final double a;
    public final double b;
    public final Rect c;
    public final Rect d;
    public final Rect e;
    public final Rect f;

    tqi(double d, double d2, Rect rect, Rect rect2, Rect rect3, Rect rect4) {
        this.a = d;
        this.b = d2;
        this.c = rect;
        this.d = rect2;
        this.e = rect3;
        this.f = rect4;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof tqi) {
            tqi tqi = (tqi) obj;
            if (this.a == tqi.a && this.b == tqi.b && Objects.equals(this.c, tqi.c) && Objects.equals(this.d, tqi.d) && Objects.equals(this.e, tqi.e) && Objects.equals(this.f, tqi.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Double.valueOf(this.a), Double.valueOf(this.b), this.c, this.d, this.e, this.f});
    }
}
