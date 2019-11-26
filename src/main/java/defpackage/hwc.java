package defpackage;

import android.graphics.Rect;

/* renamed from: hwc */
final /* synthetic */ class hwc implements bcvk {
    private final hvx a;

    hwc(hvx hvx) {
        this.a = hvx;
    }

    public final void a(Object obj) {
        hvx hvx = this.a;
        Rect rect = (Rect) obj;
        if (!hvx.a.equals(rect)) {
            hvx.a.set(rect);
            hvx.b(8);
        }
    }
}
