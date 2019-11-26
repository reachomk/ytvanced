package defpackage;

import android.text.TextUtils;
import android.util.LruCache;

/* renamed from: afkt */
public final class afkt implements bqa {
    private final LruCache a;

    public afkt(int i) {
        this.a = new afks(i);
    }

    public final synchronized void a() {
    }

    public final synchronized void b() {
        this.a.evictAll();
    }

    /* JADX WARNING: Missing block: B:16:0x0047, code skipped:
            return r4;
     */
    public final synchronized defpackage.bpz a(java.lang.String r4) {
        /*
        r3 = this;
        monitor-enter(r3);
        r0 = r3.a;	 Catch:{ all -> 0x004b }
        r4 = r0.get(r4);	 Catch:{ all -> 0x004b }
        r4 = (defpackage.bpz) r4;	 Catch:{ all -> 0x004b }
        if (r4 == 0) goto L_0x0048;
    L_0x000b:
        r0 = r4.a();	 Catch:{ all -> 0x004b }
        if (r0 != 0) goto L_0x0035;
    L_0x0011:
        r0 = r4.b();	 Catch:{ all -> 0x004b }
        if (r0 == 0) goto L_0x0018;
    L_0x0017:
        goto L_0x0035;
    L_0x0018:
        r0 = r4.g;	 Catch:{ all -> 0x004b }
        r1 = "X-YouTube-cache-hit";
        r0 = r0.containsKey(r1);	 Catch:{ all -> 0x004b }
        if (r0 != 0) goto L_0x0046;
    L_0x0022:
        r0 = new java.util.HashMap;	 Catch:{ all -> 0x004b }
        r1 = r4.g;	 Catch:{ all -> 0x004b }
        r0.<init>(r1);	 Catch:{ all -> 0x004b }
        r4.g = r0;	 Catch:{ all -> 0x004b }
        r0 = r4.g;	 Catch:{ all -> 0x004b }
        r1 = "X-YouTube-cache-hit";
        r2 = "true";
        r0.put(r1, r2);	 Catch:{ all -> 0x004b }
        goto L_0x0046;
    L_0x0035:
        r0 = r4.g;	 Catch:{ all -> 0x004b }
        r1 = "X-YouTube-cache-hit";
        r0 = r0.containsKey(r1);	 Catch:{ all -> 0x004b }
        if (r0 == 0) goto L_0x0046;
    L_0x003f:
        r0 = r4.g;	 Catch:{ all -> 0x004b }
        r1 = "X-YouTube-cache-hit";
        r0.remove(r1);	 Catch:{ all -> 0x004b }
    L_0x0046:
        monitor-exit(r3);
        return r4;
    L_0x0048:
        r4 = 0;
        monitor-exit(r3);
        return r4;
    L_0x004b:
        r4 = move-exception;
        monitor-exit(r3);
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afkt.a(java.lang.String):bpz");
    }

    public final synchronized void b(String str) {
        this.a.remove(str);
    }

    public final synchronized void a(String str, bpz bpz) {
        this.a.put(str, bpz);
    }

    public final synchronized void c(String str) {
        this.a.remove(str);
    }

    public static boolean a(bpz bpz) {
        return bpz != null ? TextUtils.equals((CharSequence) bpz.g.get("X-YouTube-cache-hit"), "true") : false;
    }
}
