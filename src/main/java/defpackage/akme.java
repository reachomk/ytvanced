package defpackage;

import android.content.Context;
import android.os.Handler;

/* renamed from: akme */
public final class akme {
    public static String a(float f, String str) {
        Object stringBuilder;
        if (f != 0.0f) {
            StringBuilder stringBuilder2 = new StringBuilder(19);
            stringBuilder2.append(f);
            stringBuilder2.append("MB. ");
            stringBuilder = stringBuilder2.toString();
        } else {
            stringBuilder = "";
        }
        StringBuilder stringBuilder3 = new StringBuilder((String.valueOf(stringBuilder).length() + 14) + String.valueOf(str).length());
        stringBuilder3.append(stringBuilder);
        stringBuilder3.append("Default size: ");
        stringBuilder3.append(str);
        return stringBuilder3.toString();
    }

    public static void a(Handler handler, Context context, String str) {
        handler.post(new akmg(context, str));
    }
}
