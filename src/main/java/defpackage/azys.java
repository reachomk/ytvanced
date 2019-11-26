package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: azys */
final class azys implements azzh {
    public final HttpURLConnection a;
    public final azyl b;
    public byte[] c;
    public long d;
    public azzk e;
    public int f = -1;
    public int g = 0;
    private int h;

    public azys(HttpURLConnection httpURLConnection, String str, azyn azyn, azyl azyl, int i, int i2) {
        this.a = httpURLConnection;
        try {
            httpURLConnection.setRequestMethod(str);
            httpURLConnection.setReadTimeout(i);
            httpURLConnection.setConnectTimeout(i2);
            httpURLConnection.setDoInput(true);
            this.b = azyl;
            if (azyl != null) {
                httpURLConnection.setDoOutput(true);
                if (azyl.a() >= 0) {
                    long a = azyl.a() - azyl.d();
                    if (a < 2147483647L) {
                        httpURLConnection.setFixedLengthStreamingMode((int) a);
                    } else {
                        httpURLConnection.setFixedLengthStreamingMode(a);
                    }
                } else {
                    httpURLConnection.setChunkedStreamingMode(0);
                }
            }
            for (String str2 : azyn.a()) {
                for (String addRequestProperty : azyn.a(str2)) {
                    httpURLConnection.addRequestProperty(str2, addRequestProperty);
                }
            }
            this.h = 1;
            this.c = new byte[65536];
        } catch (ProtocolException e) {
            throw new IllegalArgumentException("Invalid http method.", e);
        }
    }

    public final String e() {
        return null;
    }

    public final boolean h() {
        return false;
    }

    public final anjv i() {
        return azzg.a();
    }

    public final anjv a() {
        anjy a = anjy.a(new azyv(this));
        ankn ankn = new ankn();
        ankn.a("Scotty-Uploader-HttpUrlConnectionHttpClient-%d");
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(ankn.a(ankn));
        newSingleThreadExecutor.submit(a);
        newSingleThreadExecutor.shutdown();
        return a;
    }

    public final azyp b() {
        d();
        try {
            InputStream inputStream;
            azyn azyn;
            int responseCode = this.a.getResponseCode();
            try {
                inputStream = this.a.getInputStream();
            } catch (IOException unused) {
                inputStream = this.a.getErrorStream();
            }
            Map headerFields = this.a.getHeaderFields();
            if (headerFields != null) {
                azyn = new azyn();
                for (String str : headerFields.keySet()) {
                    if (str != null) {
                        for (String b : (List) headerFields.get(str)) {
                            azyn.b(str, b);
                        }
                    }
                }
            } else {
                azyn = null;
            }
            return new azyp(responseCode, azyn, inputStream);
        } catch (IOException e) {
            throw new azzj(azzi.CONNECTION_ERROR, "Error while reading response code.", e);
        }
    }

    public final boolean c() {
        try {
            return this.b.g();
        } catch (IOException e) {
            throw new azzj(azzi.REQUEST_BODY_READ_ERROR, e);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0001 A:{LOOP_START, SYNTHETIC, LOOP:0: B:1:0x0001->B:18:0x0001} */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1:0x0001 */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing block: B:6:0x0007, code skipped:
            if (r0 == 3) goto L_0x000b;
     */
    /* JADX WARNING: Missing block: B:11:0x0014, code skipped:
            throw new defpackage.azzj(defpackage.azzi.CANCELED, "");
     */
    public final synchronized void d() {
        /*
        r3 = this;
        monitor-enter(r3);
    L_0x0001:
        r0 = r3.h;	 Catch:{ all -> 0x0019 }
        r1 = 2;
        if (r0 == r1) goto L_0x0015;
    L_0x0006:
        r1 = 3;
        if (r0 == r1) goto L_0x000b;
    L_0x0009:
        monitor-exit(r3);
        return;
    L_0x000b:
        r0 = new azzj;	 Catch:{ all -> 0x0019 }
        r1 = defpackage.azzi.CANCELED;	 Catch:{ all -> 0x0019 }
        r2 = "";
        r0.<init>(r1, r2);	 Catch:{ all -> 0x0019 }
        throw r0;	 Catch:{ all -> 0x0019 }
    L_0x0015:
        r3.wait();	 Catch:{ InterruptedException -> 0x0001 }
        goto L_0x0001;
    L_0x0019:
        r0 = move-exception;
        monitor-exit(r3);
        goto L_0x001d;
    L_0x001c:
        throw r0;
    L_0x001d:
        goto L_0x001c;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azys.d():void");
    }

    public final void f() {
        synchronized (this) {
            this.h = 3;
            notifyAll();
        }
    }

    public final azyl g() {
        return this.b;
    }

    public final synchronized void a(azzk azzk, int i, int i2) {
        this.e = azzk;
        if (i > 0) {
            this.f = i;
        }
        if (i2 >= 0) {
            this.g = i2;
        }
    }
}
