package defpackage;

import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;

/* renamed from: cdf */
public final class cdf {
    private static volatile boolean a = true;

    public static Drawable a(Context context, Context context2, int i, Theme theme) {
        try {
            if (a) {
                return agb.b(theme != null ? new ahw(context2, theme) : context2, i);
            }
        } catch (NoClassDefFoundError unused) {
            a = false;
        } catch (IllegalStateException e) {
            if (!context.getPackageName().equals(context2.getPackageName())) {
                return ra.a(context2, i);
            }
            throw e;
        } catch (NotFoundException unused2) {
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        return rz.a(context2.getResources(), i, theme);
    }
}
