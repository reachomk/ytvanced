package defpackage;

import java.net.HttpURLConnection;
import java.net.URL;

/* renamed from: azyt */
final class azyt implements azyq {
    azyt() {
    }

    public final HttpURLConnection a(String str) {
        return (HttpURLConnection) new URL(str).openConnection();
    }
}
