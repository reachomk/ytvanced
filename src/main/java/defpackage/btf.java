package defpackage;

import android.text.TextUtils;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: btf */
public final class btf implements bsv {
    private static final bth a = new bti();
    private final bzc b;
    private final int c;
    private final bth d;
    private HttpURLConnection e;
    private InputStream f;
    private volatile boolean g;

    public btf(bzc bzc, int i) {
        bth bth = a;
        this.b = bzc;
        this.c = i;
        this.d = bth;
    }

    public final int c() {
        return 2;
    }

    public final Class d() {
        return InputStream.class;
    }

    public final void a(bre bre, bsy bsy) {
        chs.a();
        try {
            bzc bzc = this.b;
            if (bzc.b == null) {
                bzc.b = new URL(bzc.a());
            }
            bsy.a(a(bzc.b, 0, null, this.b.b()));
        } catch (IOException e) {
            bsy.a(e);
        }
    }

    private final InputStream a(URL url, int i, URL url2, Map map) {
        if (i < 5) {
            if (url2 != null) {
                try {
                    if (url.toURI().equals(url2.toURI())) {
                        throw new bsj("In re-direct loop");
                    }
                } catch (URISyntaxException unused) {
                }
            }
            this.e = this.d.a(url);
            for (Entry entry : map.entrySet()) {
                this.e.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            this.e.setConnectTimeout(this.c);
            this.e.setReadTimeout(this.c);
            this.e.setUseCaches(false);
            this.e.setDoInput(true);
            this.e.setInstanceFollowRedirects(false);
            this.e.connect();
            this.f = this.e.getInputStream();
            if (this.g) {
                return null;
            }
            int responseCode = this.e.getResponseCode();
            int i2 = responseCode / 100;
            if (i2 == 2) {
                HttpURLConnection httpURLConnection = this.e;
                if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
                    this.f = new chl(httpURLConnection.getInputStream(), (long) httpURLConnection.getContentLength());
                } else {
                    this.f = httpURLConnection.getInputStream();
                }
                return this.f;
            } else if (i2 == 3) {
                String headerField = this.e.getHeaderField("Location");
                if (TextUtils.isEmpty(headerField)) {
                    throw new bsj("Received empty or null redirect url");
                }
                URL url3 = new URL(url, headerField);
                a();
                return a(url3, i + 1, url, map);
            } else if (responseCode != -1) {
                throw new bsj(this.e.getResponseMessage(), (byte) 0);
            } else {
                throw new bsj(-1);
            }
        }
        throw new bsj("Too many (> 5) redirects!");
    }

    public final void a() {
        InputStream inputStream = this.f;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.e;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.e = null;
    }

    public final void b() {
        this.g = true;
    }
}
