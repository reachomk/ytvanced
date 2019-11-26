package defpackage;

import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/* renamed from: bazc */
final class bazc {
    public static final Logger a = Logger.getLogger(basa.class.getName());
    public final Object b = new Object();
    public final batp c;
    public final Collection d;
    public int e;

    bazc(batp batp, int i, long j, String str) {
        amqw.a((Object) str, (Object) "description");
        this.c = (batp) amqw.a((Object) batp, (Object) "logId");
        if (i > 0) {
            this.d = new bazb(this, i);
        } else {
            this.d = null;
        }
        bato bato = new bato();
        bato.a = String.valueOf(str).concat(" created");
        bato.b = batn.CT_INFO;
        bato.a(j);
        a(bato.a());
    }

    /* Access modifiers changed, original: final */
    public final void a(batl batl) {
        Level level;
        int ordinal = batl.b.ordinal();
        if (ordinal == 2) {
            level = Level.FINER;
        } else if (ordinal != 3) {
            level = Level.FINEST;
        } else {
            level = Level.FINE;
        }
        b(batl);
        bazc.a(this.c, level, batl.a);
    }

    /* Access modifiers changed, original: final */
    public final void b(batl batl) {
        synchronized (this.b) {
            Collection collection = this.d;
            if (collection != null) {
                collection.add(batl);
            }
        }
    }

    static void a(batp batp, Level level, String str) {
        if (a.isLoggable(level)) {
            String valueOf = String.valueOf(batp);
            StringBuilder stringBuilder = new StringBuilder((valueOf.length() + 3) + String.valueOf(str).length());
            stringBuilder.append("[");
            stringBuilder.append(valueOf);
            stringBuilder.append("] ");
            stringBuilder.append(str);
            LogRecord logRecord = new LogRecord(level, stringBuilder.toString());
            logRecord.setLoggerName(a.getName());
            logRecord.setSourceClassName(a.getName());
            logRecord.setSourceMethodName("log");
            a.log(logRecord);
        }
    }
}
