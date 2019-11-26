package defpackage;

import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* renamed from: alx */
final class alx extends ry {
    private final /* synthetic */ int a;
    private final /* synthetic */ int b;
    private final /* synthetic */ WeakReference c;
    private final /* synthetic */ aly d;

    alx(aly aly, int i, int i2, WeakReference weakReference) {
        this.d = aly;
        this.a = i;
        this.b = i2;
        this.c = weakReference;
    }

    public final void a() {
    }

    public final void a(Typeface typeface) {
        if (VERSION.SDK_INT >= 28) {
            int i = this.a;
            if (i != -1) {
                typeface = Typeface.create(typeface, i, (this.b & 2) != 0);
            }
        }
        aly aly = this.d;
        WeakReference weakReference = this.c;
        if (aly.d) {
            aly.c = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                textView.setTypeface(typeface, aly.b);
            }
        }
    }
}
