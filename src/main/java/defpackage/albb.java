package defpackage;

import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.util.TypedValue;
import com.google.android.youtube.R;

/* renamed from: albb */
public final class albb {
    public static int a(Context context) {
        amqw.a((Object) context, (Object) "context cannot be null");
        try {
            amqw.a((Object) context);
            xwe.a((int) R.attr.ytThemeType);
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.ytThemeType, typedValue, true)) {
                throw xwe.b(R.attr.ytThemeType);
            } else if (typedValue.type < 16 || typedValue.type > 31) {
                throw new UnsupportedOperationException(String.format("Type of attribute is not an integer (attr = %d, value = %s)", new Object[]{Integer.valueOf(R.attr.ytThemeType), typedValue.coerceToString().toString()}));
            } else {
                int i = typedValue.data;
                if (i == 0) {
                    return 1;
                }
                if (i == 1) {
                    return 2;
                }
                throw new albd(i);
            }
        } catch (NotFoundException e) {
            throw new alba(e);
        }
    }
}
