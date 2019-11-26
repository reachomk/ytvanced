package defpackage;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: uds */
public final class uds implements udw {
    public static final String[] f = new String[]{"key", "value"};
    private static final Map g = new zj();
    public final ContentResolver a;
    public final Uri b;
    public final Object c = new Object();
    public volatile Map d;
    public final List e = new ArrayList();
    private final ContentObserver h = new udu(this);

    private uds(ContentResolver contentResolver, Uri uri) {
        this.a = contentResolver;
        this.b = uri;
        contentResolver.registerContentObserver(uri, false, this.h);
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0018 */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:2|3|(5:5|6|7|8|9)|11|12) */
    public static defpackage.uds a(android.content.ContentResolver r3, android.net.Uri r4) {
        /*
        r0 = defpackage.uds.class;
        monitor-enter(r0);
        r1 = g;	 Catch:{ all -> 0x001a }
        r1 = r1.get(r4);	 Catch:{ all -> 0x001a }
        r1 = (defpackage.uds) r1;	 Catch:{ all -> 0x001a }
        if (r1 != 0) goto L_0x0018;
    L_0x000d:
        r2 = new uds;	 Catch:{ SecurityException -> 0x0018 }
        r2.<init>(r3, r4);	 Catch:{ SecurityException -> 0x0018 }
        r3 = g;	 Catch:{ SecurityException -> 0x0017 }
        r3.put(r4, r2);	 Catch:{ SecurityException -> 0x0017 }
    L_0x0017:
        r1 = r2;
    L_0x0018:
        monitor-exit(r0);	 Catch:{ all -> 0x001a }
        return r1;
    L_0x001a:
        r3 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x001a }
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uds.a(android.content.ContentResolver, android.net.Uri):uds");
    }

    static synchronized void a() {
        synchronized (uds.class) {
            for (uds uds : g.values()) {
                uds.a.unregisterContentObserver(uds.h);
            }
            g.clear();
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0018 */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:7|8|9|10|11) */
    public final /* synthetic */ java.lang.Object a(java.lang.String r4) {
        /*
        r3 = this;
        r0 = r3.d;
        if (r0 != 0) goto L_0x0027;
    L_0x0004:
        r1 = r3.c;
        monitor-enter(r1);
        r0 = r3.d;	 Catch:{ all -> 0x0024 }
        if (r0 == 0) goto L_0x000c;
    L_0x000b:
        goto L_0x0022;
    L_0x000c:
        r0 = new udv;	 Catch:{ SQLiteException | IllegalStateException | SecurityException -> 0x0018, SQLiteException | IllegalStateException | SecurityException -> 0x0018, SQLiteException | IllegalStateException | SecurityException -> 0x0018 }
        r0.<init>(r3);	 Catch:{ SQLiteException | IllegalStateException | SecurityException -> 0x0018, SQLiteException | IllegalStateException | SecurityException -> 0x0018, SQLiteException | IllegalStateException | SecurityException -> 0x0018 }
        r0 = defpackage.udz.a(r0);	 Catch:{ SQLiteException | IllegalStateException | SecurityException -> 0x0018, SQLiteException | IllegalStateException | SecurityException -> 0x0018, SQLiteException | IllegalStateException | SecurityException -> 0x0018 }
        r0 = (java.util.Map) r0;	 Catch:{ SQLiteException | IllegalStateException | SecurityException -> 0x0018, SQLiteException | IllegalStateException | SecurityException -> 0x0018, SQLiteException | IllegalStateException | SecurityException -> 0x0018 }
        goto L_0x0020;
    L_0x0018:
        r0 = "ConfigurationContentLoader";
        r2 = "PhenotypeFlag unable to load ContentProvider, using default values";
        android.util.Log.e(r0, r2);	 Catch:{ all -> 0x0024 }
        r0 = 0;
    L_0x0020:
        r3.d = r0;	 Catch:{ all -> 0x0024 }
    L_0x0022:
        monitor-exit(r1);	 Catch:{ all -> 0x0024 }
        goto L_0x0027;
    L_0x0024:
        r4 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0024 }
        throw r4;
    L_0x0027:
        if (r0 != 0) goto L_0x002d;
    L_0x0029:
        r0 = java.util.Collections.emptyMap();
    L_0x002d:
        r4 = r0.get(r4);
        r4 = (java.lang.String) r4;
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uds.a(java.lang.String):java.lang.Object");
    }
}
