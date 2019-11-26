package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import java.lang.ref.WeakReference;

/* renamed from: asr */
public final class asr extends Resources {
    public static boolean a = false;
    private final WeakReference b;

    public static boolean a() {
        return a && VERSION.SDK_INT <= 20;
    }

    public asr(Context context, Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.b = new WeakReference(context);
    }

    public final Drawable getDrawable(int i) {
        Context context = (Context) this.b.get();
        if (context != null) {
            return aqk.a().a(context, this, i);
        }
        return super.getDrawable(i);
    }

    /* Access modifiers changed, original: final */
    public final Drawable a(int i) {
        return super.getDrawable(i);
    }
}
