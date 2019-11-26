package defpackage;

import java.net.HttpURLConnection;
import java.net.URL;

/* renamed from: amjo */
final class amjo implements azyq {
    private final bciz a;

    amjo(bciz bciz) {
        this.a = bciz;
    }

    public final HttpURLConnection a(String str) {
        return (HttpURLConnection) this.a.a(new URL(str));
    }
}
