package defpackage;

import android.content.Context;

/* renamed from: sjl */
public final class sjl {
    public static String a(String str) {
        StringBuilder stringBuilder = new StringBuilder("com.google.oauthintegrations");
        if (str != null) {
            stringBuilder.append('#');
            stringBuilder.append(str);
        }
        return stringBuilder.toString();
    }

    public static void a(Context context, String str) {
        if (sga.b != null) {
            if (str == null) {
                str = "";
            }
            sga.b.a().a(sjl.a(sga.b.b()), context.getSharedPreferences("com.google.oauthintegrations.ExperimentFlags", 0), str);
            return;
        }
        throw new IllegalStateException("GDIDeps must be set before calling updateFlags.");
    }

    public static sis a() {
        if (sga.b != null) {
            return sga.b.a().a();
        }
        throw new IllegalStateException("GDIDeps must be set before calling getFlags.");
    }

    public static String a(Context context) {
        return sga.b.a().a(context.getSharedPreferences("com.google.oauthintegrations.ExperimentFlags", 0));
    }
}
