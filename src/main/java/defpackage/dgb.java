package defpackage;

import android.content.Context;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: dgb */
public final class dgb {
    public final Object a = new Object();
    public final List b;
    public final Context c;
    public boolean d = true;
    public boolean e = false;
    public final dgf f;

    public dgb(Context context) {
        this.c = context;
        this.f = new dgf(context);
        this.b = new LinkedList();
        new Thread(new dgc(this)).start();
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        long a = (dgh.a(context) + 300000) - dgh.a();
        dgd dgd = new dgd(this);
        long j = 0;
        if (a > 0) {
            j = a;
        }
        scheduledThreadPoolExecutor.scheduleAtFixedRate(dgd, j, 300000, TimeUnit.MILLISECONDS);
    }

    /* Access modifiers changed, original: protected|final */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x009b  */
    public final int a(defpackage.dfy r10) {
        /*
        r9 = this;
        r0 = r10.g;
        r0 = java.lang.String.valueOf(r0);
        r1 = r0.length();
        r2 = "Pinging: ";
        if (r1 != 0) goto L_0x0014;
    L_0x000e:
        r0 = new java.lang.String;
        r0.<init>(r2);
        goto L_0x0017;
    L_0x0014:
        r2.concat(r0);
    L_0x0017:
        r0 = r10.g;
        r1 = 0;
        r2 = 0;
        r3 = r1;
        r1 = r0;
        r0 = 0;
    L_0x001e:
        r4 = 5;
        r5 = "GoogleConversionReporter";
        r6 = 1;
        if (r0 >= r4) goto L_0x009f;
    L_0x0024:
        r4 = new java.net.URL;	 Catch:{ IOException -> 0x008d }
        r4.<init>(r1);	 Catch:{ IOException -> 0x008d }
        r1 = r4.openConnection();	 Catch:{ IOException -> 0x008d }
        r1 = (java.net.HttpURLConnection) r1;	 Catch:{ IOException -> 0x008d }
        r1.setInstanceFollowRedirects(r2);	 Catch:{ IOException -> 0x0088, all -> 0x0085 }
        r3 = 60000; // 0xea60 float:8.4078E-41 double:2.9644E-319;
        r1.setConnectTimeout(r3);	 Catch:{ IOException -> 0x0088, all -> 0x0085 }
        r1.setReadTimeout(r3);	 Catch:{ IOException -> 0x0088, all -> 0x0085 }
        r1.setUseCaches(r2);	 Catch:{ IOException -> 0x0088, all -> 0x0085 }
        r3 = r1.getResponseCode();	 Catch:{ IOException -> 0x0088, all -> 0x0085 }
        r4 = 300; // 0x12c float:4.2E-43 double:1.48E-321;
        if (r3 >= r4) goto L_0x0047;
    L_0x0046:
        goto L_0x0064;
    L_0x0047:
        r7 = 400; // 0x190 float:5.6E-43 double:1.976E-321;
        if (r3 >= r7) goto L_0x0064;
    L_0x004b:
        r3 = "Location";
        r3 = r1.getHeaderField(r3);	 Catch:{ IOException -> 0x0088, all -> 0x0085 }
        r4 = android.text.TextUtils.isEmpty(r3);	 Catch:{ IOException -> 0x0088, all -> 0x0085 }
        if (r4 == 0) goto L_0x005b;
    L_0x0057:
        r1.disconnect();
        return r2;
    L_0x005b:
        r1.disconnect();
        r0 = r0 + 1;
        r8 = r3;
        r3 = r1;
        r1 = r8;
        goto L_0x001e;
    L_0x0064:
        r0 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        r7 = 2;
        if (r3 >= r0) goto L_0x006a;
    L_0x0069:
        goto L_0x006e;
    L_0x006a:
        if (r3 < r4) goto L_0x006d;
    L_0x006c:
        goto L_0x006e;
    L_0x006d:
        r6 = 2;
    L_0x006e:
        if (r6 != r7) goto L_0x0081;
    L_0x0070:
        r0 = r10.b;	 Catch:{ IOException -> 0x0088, all -> 0x0085 }
        if (r0 != 0) goto L_0x0081;
    L_0x0074:
        r0 = r10.a;	 Catch:{ IOException -> 0x0088, all -> 0x0085 }
        if (r0 == 0) goto L_0x0081;
    L_0x0078:
        r0 = r9.c;	 Catch:{ IOException -> 0x0088, all -> 0x0085 }
        r3 = r10.e;	 Catch:{ IOException -> 0x0088, all -> 0x0085 }
        r10 = r10.f;	 Catch:{ IOException -> 0x0088, all -> 0x0085 }
        defpackage.dgh.a(r0, r3, r10);	 Catch:{ IOException -> 0x0088, all -> 0x0085 }
    L_0x0081:
        r1.disconnect();
        return r6;
    L_0x0085:
        r10 = move-exception;
        r3 = r1;
        goto L_0x0099;
    L_0x0088:
        r10 = move-exception;
        r3 = r1;
        goto L_0x008e;
    L_0x008b:
        r10 = move-exception;
        goto L_0x0099;
    L_0x008d:
        r10 = move-exception;
    L_0x008e:
        r0 = "Error sending ping";
        android.util.Log.e(r5, r0, r10);	 Catch:{ all -> 0x008b }
        if (r3 == 0) goto L_0x0098;
    L_0x0095:
        r3.disconnect();
    L_0x0098:
        return r2;
    L_0x0099:
        if (r3 == 0) goto L_0x009e;
    L_0x009b:
        r3.disconnect();
    L_0x009e:
        throw r10;
    L_0x009f:
        r10 = "Ping failed; too many redirects.";
        android.util.Log.e(r5, r10);
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dgb.a(dfy):int");
    }
}
