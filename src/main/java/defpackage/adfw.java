package defpackage;

import java.util.Locale;

/* renamed from: adfw */
final class adfw implements Runnable {
    private final bax a;
    private final /* synthetic */ adfv b;

    adfw(adfv adfv, bax bax) {
        this.b = adfv;
        this.a = bax;
    }

    public final void run() {
        String.format(Locale.US, "Publishing entire routes on screen changed: %s", new Object[]{this.b.g});
        this.b.a(this.a);
    }
}
