package defpackage;

import android.content.Context;
import com.google.android.youtube.R;

/* renamed from: aimi */
public final class aimi extends ails implements aimf, aimp {
    private final int a;
    private final int b;

    public aimi(Context context, aims aims, akkq akkq, aaas aaas, acvx acvx, akpe akpe, boolean z) {
        super(context, aims, acvx, akpe, akkq, aaas, R.layout.related_end_screen_overlay);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.related_end_screen_peek_height);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.related_end_screen_background_height);
        this.a = dimensionPixelSize2;
        this.b = dimensionPixelSize2 - dimensionPixelSize;
        if (!z) {
            g();
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final akpb a(akkq akkq, aaas aaas) {
        aknw aknw = new aknw();
        aknw.a(arej.class, new aimb(getContext(), akkq, aaas));
        aknw.a(areh.class, new aima(getContext(), akkq, aaas));
        return aknw;
    }

    /* Access modifiers changed, original: protected|final */
    public final int b() {
        return this.b + this.h;
    }

    /* Access modifiers changed, original: protected|final */
    public final int d() {
        return this.a + this.h;
    }
}
