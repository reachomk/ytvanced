package defpackage;

import android.view.View;
import android.view.WindowId;

/* renamed from: bic */
final class bic implements bif {
    private final WindowId a;

    bic(View view) {
        this.a = view.getWindowId();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof bic) && ((bic) obj).a.equals(this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
