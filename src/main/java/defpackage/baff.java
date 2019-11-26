package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;

/* renamed from: baff */
public final class baff {
    public static Activity a(Context context) {
        if (context != null) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            if (context instanceof ContextWrapper) {
                Context baseContext = ((ContextWrapper) context).getBaseContext();
                if (baseContext != context) {
                    return baff.a(baseContext);
                }
            }
        }
        return null;
    }

    public static ComponentName b(Context context) {
        if (context instanceof bahh) {
            return ((bahh) context).a();
        }
        Activity a = baff.a(context);
        return a != null ? a.getComponentName() : null;
    }
}
