package defpackage;

import android.widget.HorizontalScrollView;

/* renamed from: zor */
public final /* synthetic */ class zor implements zmp {
    private final zos a;
    private final HorizontalScrollView b;

    public zor(zos zos, HorizontalScrollView horizontalScrollView) {
        this.a = zos;
        this.b = horizontalScrollView;
    }

    public final void a(Object obj) {
        this.b.post(new zox(this.a));
    }
}
