package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;

/* renamed from: xuv */
public final class xuv {
    public static Context a(Context context, AttributeSet attributeSet, int i) {
        if (attributeSet != null) {
            TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, wwy.F);
            i = obtainAttributes.getResourceId(wwy.G, i);
            obtainAttributes.recycle();
        }
        return i > 0 ? new ContextThemeWrapper(context, i) : context;
    }
}
