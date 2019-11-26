package defpackage;

import android.net.Uri.Builder;

/* renamed from: bcgs */
public final class bcgs {
    public static void a(Builder builder, String str, Object obj) {
        if (obj != null && obj.toString() != null) {
            builder.appendQueryParameter(str, obj.toString());
        }
    }
}
