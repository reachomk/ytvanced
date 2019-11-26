package defpackage;

import java.text.MessageFormat;
import java.util.logging.Level;

/* renamed from: bbcy */
final class bbcy extends basa {
    public batp a;

    bbcy() {
    }

    public final void a(int i, String str) {
        bayz.a(this.a, i, str);
    }

    public final void a(int i, String str, Object... objArr) {
        batp batp = this.a;
        Level a = bayz.a(i);
        if (bazc.a.isLoggable(a)) {
            bazc.a(batp, a, MessageFormat.format(str, objArr));
        }
    }
}
