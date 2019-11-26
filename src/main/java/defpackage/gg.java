package defpackage;

import android.view.ViewTreeObserver.OnPreDrawListener;

/* renamed from: gg */
public final class gg implements OnPreDrawListener {
    private final /* synthetic */ gc a;

    public gg(gc gcVar) {
        this.a = gcVar;
    }

    public final boolean onPreDraw() {
        gc gcVar = this.a;
        float rotation = gcVar.D.getRotation();
        if (gcVar.r != rotation) {
            gcVar.r = rotation;
            gcVar.j();
        }
        return true;
    }
}
