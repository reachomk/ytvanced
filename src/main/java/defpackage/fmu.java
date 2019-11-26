package defpackage;

import android.content.Context;
import android.content.res.Configuration;

/* renamed from: fmu */
public final class fmu {
    public static void a(boolean z, Context context) {
        Configuration configuration = context.getResources().getConfiguration();
        configuration.uiMode = (!z ? 16 : 32) | (configuration.uiMode & -49);
        context.getResources().updateConfiguration(configuration, context.getResources().getDisplayMetrics());
    }

    public static void a(Context context) {
        fmu.a(false, context);
    }
}
