package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.TextView;

/* renamed from: ahrc */
final class ahrc extends TextView {
    private final ahqm a;

    public ahrc(Context context, ahqm ahqm) {
        super(context);
        this.a = ahqm;
    }

    public final void onDraw(Canvas canvas) {
        canvas = this.a.e();
        if (canvas != null) {
            super.onDraw(canvas);
            this.a.g();
        }
    }
}
