package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* renamed from: arx */
final class arx extends aqt {
    private final WeakReference a;

    public arx(Context context, Resources resources) {
        super(resources);
        this.a = new WeakReference(context);
    }

    public final Drawable getDrawable(int i) {
        Drawable drawable = super.getDrawable(i);
        Context context = (Context) this.a.get();
        if (!(drawable == null || context == null)) {
            aqk.a().a(context, i, drawable);
        }
        return drawable;
    }
}
