package defpackage;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;

/* renamed from: hi */
public final class hi {
    public static TypedValue a(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        return !context.getTheme().resolveAttribute(i, typedValue, true) ? null : typedValue;
    }

    public static int a(Context context, int i, String str) {
        TypedValue a = hi.a(context, i);
        if (a != null) {
            return a.data;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", new Object[]{str, context.getResources().getResourceName(i)}));
    }

    public static int a(View view, int i) {
        return hi.a(view.getContext(), i, view.getClass().getCanonicalName());
    }
}
