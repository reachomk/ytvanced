package defpackage;

import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

/* renamed from: adau */
final /* synthetic */ class adau implements Callable {
    private final adas a;
    private final Future b;

    adau(adas adas, Future future) {
        this.a = adas;
        this.b = future;
    }

    public final Object call() {
        adas adas = this.a;
        Future future = this.b;
        if (!future.isDone()) {
            String str = adas.a;
            Locale locale = Locale.US;
            Object[] objArr = new Object[2];
            String valueOf = String.valueOf(adas.h.a);
            String adja = adas.h.b.toString();
            StringBuilder stringBuilder = new StringBuilder((valueOf.length() + 2) + String.valueOf(adja).length());
            stringBuilder.append(valueOf);
            stringBuilder.append(": ");
            stringBuilder.append(adja);
            objArr[0] = stringBuilder.toString();
            objArr[1] = Integer.valueOf(adas.o);
            xtl.c(str, String.format(locale, "Message %s took longer than %dms to send. Interrupting.", objArr));
            future.cancel(true);
        }
        return null;
    }
}
