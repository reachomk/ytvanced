package defpackage;

import android.content.Context;
import android.util.TypedValue;
import com.google.android.youtube.R;

/* renamed from: adfm */
public final class adfm extends baf {
    public bcaa ab;

    public final azl b(Context context) {
        ((adfp) xse.a(context)).a(this);
        TypedValue typedValue = new TypedValue();
        boolean resolveAttribute = context.getTheme().resolveAttribute(R.attr.isLightTheme, typedValue, true);
        int i = R.style.f494Theme.AppCompat.Dialog;
        if (resolveAttribute && typedValue.data != 0) {
            i = R.style.f497Theme.AppCompat.Light.Dialog;
        }
        return new adfo(context, i, this.ab);
    }
}
