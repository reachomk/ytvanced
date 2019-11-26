package defpackage;

import android.graphics.Rect;

/* renamed from: lvd */
final /* synthetic */ class lvd implements xpx {
    private final luz a;
    private final int b;

    lvd(luz luz, int i) {
        this.a = luz;
        this.b = i;
    }

    public final Object get() {
        luz luz = this.a;
        return new Rect(luz.c.getLeft(), luz.c.getTop(), luz.c.getWidth(), luz.c.getHeight() - this.b);
    }
}
