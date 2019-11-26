package defpackage;

import android.util.Log;
import java.util.Locale;

/* renamed from: qox */
public final class qox {
    private final String a;
    private final String b;

    public qox(String str, String... strArr) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('[');
        String str2 = strArr[0];
        if (stringBuilder.length() > 1) {
            stringBuilder.append(",");
        }
        stringBuilder.append(str2);
        stringBuilder.append("] ");
        this.b = stringBuilder.toString();
        this.a = str;
        qam qam = new qam(str);
        int i = 2;
        while (i <= 7 && !Log.isLoggable(this.a, i)) {
            i++;
        }
    }

    public final void a(String str, Object... objArr) {
        Log.w(this.a, b(str, objArr));
    }

    public final String b(String str, Object... objArr) {
        return this.b.concat(String.format(Locale.US, str, objArr));
    }
}
