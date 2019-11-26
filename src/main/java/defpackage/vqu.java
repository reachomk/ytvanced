package defpackage;

import android.net.Uri;
import java.util.Locale;

/* renamed from: vqu */
public final class vqu implements aftl {
    public Integer a;

    public final void b() {
        this.a = null;
    }

    public final String a(Uri uri, String str) {
        if (str == null) {
            return null;
        }
        Integer num = (Integer) vqq.a.get(str);
        if (num == null || num.intValue() != 67 || this.a == null) {
            return null;
        }
        return String.format(Locale.US, "%d", new Object[]{this.a});
    }

    public final String a() {
        return vqu.class.getSimpleName();
    }
}
