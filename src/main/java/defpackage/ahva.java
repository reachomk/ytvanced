package defpackage;

import android.content.Context;
import android.graphics.Canvas;

/* renamed from: ahva */
final class ahva extends aifz {
    private final ahqm a;

    public ahva(Context context, ahqm ahqm) {
        super(context);
        this.a = ahqm;
    }

    public final void dispatchDraw(Canvas canvas) {
        canvas = this.a.e();
        if (canvas != null) {
            super.dispatchDraw(canvas);
            this.a.g();
        }
    }
}
