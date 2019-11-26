package defpackage;

import java.text.MessageFormat;
import java.util.Collection;
import java.util.logging.Level;

/* renamed from: bayz */
final class bayz extends basa {
    private final bazc a;
    private final bbhs b;

    bayz(bazc bazc, bbhs bbhs) {
        this.a = (bazc) amqw.a((Object) bazc, (Object) "tracer");
        this.b = (bbhs) amqw.a((Object) bbhs, (Object) "time");
    }

    public final void a(int i, String str) {
        bayz.a(this.a.c, i, str);
        if (b(i) && i != 1) {
            batn batn;
            bazc bazc = this.a;
            bato bato = new bato();
            bato.a = str;
            i--;
            if (i == 2) {
                batn = batn.CT_WARNING;
            } else if (i != 3) {
                batn = batn.CT_INFO;
            } else {
                batn = batn.CT_ERROR;
            }
            bato.b = batn;
            bato.a(this.b.a());
            bazc.b(bato.a());
        }
    }

    public final void a(int i, String str, Object... objArr) {
        Level a = bayz.a(i);
        if (b(i) || bazc.a.isLoggable(a)) {
            str = MessageFormat.format(str, objArr);
        } else {
            str = null;
        }
        a(i, str);
    }

    static void a(batp batp, int i, String str) {
        Level a = bayz.a(i);
        if (bazc.a.isLoggable(a)) {
            bazc.a(batp, a, str);
        }
    }

    private final boolean b(int i) {
        if (i != 1) {
            Collection collection;
            bazc bazc = this.a;
            synchronized (bazc.b) {
                collection = bazc.d;
            }
            if (collection != null) {
                return true;
            }
        }
        return false;
    }

    public static Level a(int i) {
        i--;
        if (i == 2) {
            return Level.FINER;
        }
        if (i != 3) {
            return Level.FINEST;
        }
        return Level.FINE;
    }
}
