package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: zpb */
public final class zpb extends ViewOutlineProvider {
    private final /* synthetic */ float a;

    public zpb(float f) {
        this.a = f;
    }

    public final void getOutline(View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.a);
    }
}
