package defpackage;

import java.io.IOException;

/* renamed from: ebd */
final class ebd implements Runnable {
    private final /* synthetic */ ebe a;

    ebd(ebe ebe) {
        this.a = ebe;
    }

    public final void run() {
        try {
            synchronized (this.a) {
                ebe ebe = this.a;
                nki nki = ebe.b;
                ebg ebg = ebe.a;
                byte[] toByteArray = nki.toByteArray();
                anbk.c(ebg.a);
                anbk.a(toByteArray, ebg.a);
            }
        } catch (IOException e) {
            String valueOf = String.valueOf(this.a.a.a.getAbsolutePath());
            String str = "Failed to write offline response to ";
            if (valueOf.length() == 0) {
                valueOf = new String(str);
            } else {
                valueOf = str.concat(valueOf);
            }
            xtl.b(valueOf, e);
        }
    }
}
