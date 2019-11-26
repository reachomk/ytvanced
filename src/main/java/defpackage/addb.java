package defpackage;

import java.io.IOException;

/* renamed from: addb */
final class addb implements aebm {
    addb() {
    }

    public final void a(xho xho) {
        int b = xho.b();
        if (b != 200) {
            String str = adcz.a;
            StringBuilder stringBuilder = new StringBuilder(61);
            stringBuilder.append("Error stopping YouTubeTV. Response status code is ");
            stringBuilder.append(b);
            xtl.a(str, stringBuilder.toString());
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            ankx.a(e);
        }
    }

    public final void a(IOException iOException) {
        String str = adcz.a;
        String valueOf = String.valueOf(iOException);
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 25);
        stringBuilder.append("Error stopping YouTubeTV.");
        stringBuilder.append(valueOf);
        xtl.a(str, stringBuilder.toString());
    }
}
