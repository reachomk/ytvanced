package defpackage;

import android.view.View;

/* renamed from: gbp */
final class gbp implements gfy {
    private final View a;
    private final /* synthetic */ gbi b;

    gbp(gbi gbi, View view) {
        this.b = gbi;
        this.a = view;
    }

    public final View a() {
        return this.a;
    }

    public final float b() {
        return this.a.getRotation();
    }

    public final float c() {
        return !this.b.u ? 0.0f : 60.0f;
    }
}
