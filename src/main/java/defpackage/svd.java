package defpackage;

import android.os.Looper;
import android.util.Log;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: svd */
public final class svd implements sxz {
    public final Map a = Collections.synchronizedMap(new HashMap());
    public final Map b = Collections.synchronizedMap(new HashMap());
    public final Map c = Collections.synchronizedMap(new HashMap());
    public final swm d;
    public final String e;
    public final String f;
    public final int g;
    private final ScheduledExecutorService h;
    private boolean i;

    public svd(swm swm, String str, String str2) {
        Collections.synchronizedMap(new HashMap());
        this.e = str;
        this.f = str2;
        this.g = 5000;
        this.d = swm;
        this.h = Executors.newSingleThreadScheduledExecutor();
    }

    private final synchronized void a() {
        if (!this.i) {
            this.i = true;
            this.h.scheduleAtFixedRate(new svg(this), 1, 1, TimeUnit.SECONDS);
        }
    }

    public final byte[] a(String str) {
        a();
        try {
            byte[] bArr = (byte[]) this.a.get(str);
            if (bArr == null) {
                String str2 = "/template/";
                String valueOf = String.valueOf(str);
                if (valueOf.length() == 0) {
                    valueOf = new String(str2);
                } else {
                    valueOf = str2.concat(valueOf);
                }
                if (Looper.getMainLooper().isCurrentThread()) {
                    bArr = (byte[]) this.h.submit(new svf(this, valueOf)).get();
                } else {
                    bArr = b(valueOf);
                }
                this.a.put(str, bArr);
            }
            return bArr;
        } catch (InterruptedException | ExecutionException e) {
            throw new IOException("Error talking to DevServer", e);
        } catch (IOException e2) {
            Log.w("DevServerTemplateLoader", "Error talking to ElementsDevServer", e2);
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0024  */
    public final byte[] b(java.lang.String r5) {
        /*
        r4 = this;
        r0 = new java.net.URL;
        r1 = r4.e;
        r2 = r4.f;
        r3 = r4.g;
        r0.<init>(r1, r2, r3, r5);
        r5 = r0.openConnection();	 Catch:{ all -> 0x001f }
        r5 = r5.getInputStream();	 Catch:{ all -> 0x001f }
        r0 = defpackage.anaz.a(r5);	 Catch:{ all -> 0x001d }
        if (r5 == 0) goto L_0x001c;
    L_0x0019:
        r5.close();
    L_0x001c:
        return r0;
    L_0x001d:
        r0 = move-exception;
        goto L_0x0022;
    L_0x001f:
        r5 = move-exception;
        r0 = r5;
        r5 = 0;
    L_0x0022:
        if (r5 == 0) goto L_0x0027;
    L_0x0024:
        r5.close();
    L_0x0027:
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.svd.b(java.lang.String):byte[]");
    }
}
