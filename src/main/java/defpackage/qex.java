package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: qex */
public final class qex {
    private static SharedPreferences a;

    public static SharedPreferences a(Context context) {
        SharedPreferences sharedPreferences;
        synchronized (SharedPreferences.class) {
            if (a == null) {
                a = (SharedPreferences) qqt.a(new qew(context));
            }
            sharedPreferences = a;
        }
        return sharedPreferences;
    }
}
