package defpackage;

import android.content.Context;
import android.util.TypedValue;
import com.google.android.youtube.R;

/* renamed from: fs */
public final class fs {
    public final boolean a;
    public final int b;
    public final int c;
    public final float d;

    public fs(Context context) {
        TypedValue a = hi.a(context, (int) R.attr.elevationOverlaysEnabled);
        boolean z = false;
        if (!(a == null || a.type != 18 || a.data == 0)) {
            z = true;
        }
        this.a = z;
        this.b = fp.a(context, R.attr.elevationOverlaysColor);
        this.c = fp.a(context, R.attr.colorSurface);
        this.d = context.getResources().getDisplayMetrics().density;
    }
}
