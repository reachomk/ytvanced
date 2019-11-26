package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.LinearLayout;

/* renamed from: ahph */
public final class ahph extends LinearLayout {
    private final ahqm a;

    public ahph(Context context, ahqm ahqm) {
        super(context);
        this.a = (ahqm) amqw.a((Object) ahqm);
    }

    /* Access modifiers changed, original: protected|final */
    public final void dispatchDraw(Canvas canvas) {
        canvas = this.a.e();
        if (canvas != null) {
            super.dispatchDraw(canvas);
            this.a.g();
        }
    }

    public final void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        invalidate();
    }
}
