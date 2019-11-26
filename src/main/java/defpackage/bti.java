package defpackage;

import java.net.HttpURLConnection;
import java.net.URL;

/* renamed from: bti */
final class bti implements bth {
    bti() {
    }

    public final HttpURLConnection a(URL url) {
        return (HttpURLConnection) url.openConnection();
    }
}
