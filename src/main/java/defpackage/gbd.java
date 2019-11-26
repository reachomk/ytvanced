package defpackage;

import android.view.ContextThemeWrapper;

/* renamed from: gbd */
final /* synthetic */ class gbd implements bcaa {
    private final ContextThemeWrapper a;
    private final akkq b;

    gbd(ContextThemeWrapper contextThemeWrapper, akkq akkq) {
        this.a = contextThemeWrapper;
        this.b = akkq;
    }

    public final Object get() {
        return new grt(this.a, this.b);
    }
}
