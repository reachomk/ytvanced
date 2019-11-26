package defpackage;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: zq */
public class zq {
    private final LinkedHashMap a;
    private int b;
    private final int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;

    public zq(int i) {
        if (i > 0) {
            this.c = i;
            this.a = new LinkedHashMap(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    /* Access modifiers changed, original: protected */
    public void c(Object obj) {
    }

    /* Access modifiers changed, original: protected */
    public Object d(Object obj) {
        return null;
    }

    /* Access modifiers changed, original: protected */
    public int e(Object obj) {
        return 1;
    }

    /* JADX WARNING: Missing block: B:10:0x001a, code skipped:
            r0 = d(r4);
     */
    /* JADX WARNING: Missing block: B:11:0x001e, code skipped:
            if (r0 == null) goto L_0x004e;
     */
    /* JADX WARNING: Missing block: B:12:0x0020, code skipped:
            monitor-enter(r3);
     */
    /* JADX WARNING: Missing block: B:14:?, code skipped:
            r3.e++;
            r1 = r3.a.put(r4, r0);
     */
    /* JADX WARNING: Missing block: B:15:0x002d, code skipped:
            if (r1 == null) goto L_0x0035;
     */
    /* JADX WARNING: Missing block: B:16:0x002f, code skipped:
            r3.a.put(r4, r1);
     */
    /* JADX WARNING: Missing block: B:17:0x0035, code skipped:
            r3.b += b(r4, r0);
     */
    /* JADX WARNING: Missing block: B:18:0x003e, code skipped:
            monitor-exit(r3);
     */
    /* JADX WARNING: Missing block: B:19:0x003f, code skipped:
            if (r1 == null) goto L_0x0045;
     */
    /* JADX WARNING: Missing block: B:20:0x0041, code skipped:
            c(r0);
     */
    /* JADX WARNING: Missing block: B:21:0x0044, code skipped:
            return r1;
     */
    /* JADX WARNING: Missing block: B:22:0x0045, code skipped:
            a(r3.c);
     */
    /* JADX WARNING: Missing block: B:23:0x004a, code skipped:
            return r0;
     */
    /* JADX WARNING: Missing block: B:29:0x004f, code skipped:
            return null;
     */
    public final java.lang.Object a(java.lang.Object r4) {
        /*
        r3 = this;
        if (r4 == 0) goto L_0x0053;
    L_0x0002:
        monitor-enter(r3);
        r0 = r3.a;	 Catch:{ all -> 0x0050 }
        r0 = r0.get(r4);	 Catch:{ all -> 0x0050 }
        if (r0 == 0) goto L_0x0013;
    L_0x000b:
        r4 = r3.g;	 Catch:{ all -> 0x0050 }
        r4 = r4 + 1;
        r3.g = r4;	 Catch:{ all -> 0x0050 }
        monitor-exit(r3);	 Catch:{ all -> 0x0050 }
        return r0;
    L_0x0013:
        r0 = r3.h;	 Catch:{ all -> 0x0050 }
        r0 = r0 + 1;
        r3.h = r0;	 Catch:{ all -> 0x0050 }
        monitor-exit(r3);	 Catch:{ all -> 0x0050 }
        r0 = r3.d(r4);
        if (r0 == 0) goto L_0x004e;
    L_0x0020:
        monitor-enter(r3);
        r1 = r3.e;	 Catch:{ all -> 0x004b }
        r1 = r1 + 1;
        r3.e = r1;	 Catch:{ all -> 0x004b }
        r1 = r3.a;	 Catch:{ all -> 0x004b }
        r1 = r1.put(r4, r0);	 Catch:{ all -> 0x004b }
        if (r1 == 0) goto L_0x0035;
    L_0x002f:
        r2 = r3.a;	 Catch:{ all -> 0x004b }
        r2.put(r4, r1);	 Catch:{ all -> 0x004b }
        goto L_0x003e;
    L_0x0035:
        r2 = r3.b;	 Catch:{ all -> 0x004b }
        r4 = r3.b(r4, r0);	 Catch:{ all -> 0x004b }
        r2 = r2 + r4;
        r3.b = r2;	 Catch:{ all -> 0x004b }
    L_0x003e:
        monitor-exit(r3);	 Catch:{ all -> 0x004b }
        if (r1 == 0) goto L_0x0045;
    L_0x0041:
        r3.c(r0);
        return r1;
    L_0x0045:
        r4 = r3.c;
        r3.a(r4);
        return r0;
    L_0x004b:
        r4 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x004b }
        throw r4;
    L_0x004e:
        r4 = 0;
        return r4;
    L_0x0050:
        r4 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x0050 }
        throw r4;
    L_0x0053:
        r4 = new java.lang.NullPointerException;
        r0 = "key == null";
        r4.<init>(r0);
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zq.a(java.lang.Object):java.lang.Object");
    }

    public final Object a(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.d++;
            this.b += b(obj, obj2);
            obj2 = this.a.put(obj, obj2);
            if (obj2 != null) {
                this.b -= b(obj, obj2);
            }
        }
        if (obj2 != null) {
            c(obj2);
        }
        a(this.c);
        return obj2;
    }

    /* JADX WARNING: Missing block: B:20:0x006f, code skipped:
            throw new java.lang.IllegalStateException(r0.toString());
     */
    private final void a(int r4) {
        /*
        r3 = this;
    L_0x0000:
        monitor-enter(r3);
        r0 = r3.b;	 Catch:{ all -> 0x0070 }
        if (r0 < 0) goto L_0x0051;
    L_0x0005:
        r0 = r3.a;	 Catch:{ all -> 0x0070 }
        r0 = r0.isEmpty();	 Catch:{ all -> 0x0070 }
        if (r0 == 0) goto L_0x0011;
    L_0x000d:
        r0 = r3.b;	 Catch:{ all -> 0x0070 }
        if (r0 != 0) goto L_0x0051;
    L_0x0011:
        r0 = r3.b;	 Catch:{ all -> 0x0070 }
        if (r0 <= r4) goto L_0x004f;
    L_0x0015:
        r0 = r3.a;	 Catch:{ all -> 0x0070 }
        r0 = r0.isEmpty();	 Catch:{ all -> 0x0070 }
        if (r0 == 0) goto L_0x001e;
    L_0x001d:
        goto L_0x004f;
    L_0x001e:
        r0 = r3.a;	 Catch:{ all -> 0x0070 }
        r0 = r0.entrySet();	 Catch:{ all -> 0x0070 }
        r0 = r0.iterator();	 Catch:{ all -> 0x0070 }
        r0 = r0.next();	 Catch:{ all -> 0x0070 }
        r0 = (java.util.Map.Entry) r0;	 Catch:{ all -> 0x0070 }
        r1 = r0.getKey();	 Catch:{ all -> 0x0070 }
        r0 = r0.getValue();	 Catch:{ all -> 0x0070 }
        r2 = r3.a;	 Catch:{ all -> 0x0070 }
        r2.remove(r1);	 Catch:{ all -> 0x0070 }
        r2 = r3.b;	 Catch:{ all -> 0x0070 }
        r1 = r3.b(r1, r0);	 Catch:{ all -> 0x0070 }
        r2 = r2 - r1;
        r3.b = r2;	 Catch:{ all -> 0x0070 }
        r1 = r3.f;	 Catch:{ all -> 0x0070 }
        r1 = r1 + 1;
        r3.f = r1;	 Catch:{ all -> 0x0070 }
        monitor-exit(r3);	 Catch:{ all -> 0x0070 }
        r3.c(r0);
        goto L_0x0000;
    L_0x004f:
        monitor-exit(r3);	 Catch:{ all -> 0x0070 }
        return;
    L_0x0051:
        r4 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x0070 }
        r0 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0070 }
        r0.<init>();	 Catch:{ all -> 0x0070 }
        r1 = r3.getClass();	 Catch:{ all -> 0x0070 }
        r1 = r1.getName();	 Catch:{ all -> 0x0070 }
        r0.append(r1);	 Catch:{ all -> 0x0070 }
        r1 = ".sizeOf() is reporting inconsistent results!";
        r0.append(r1);	 Catch:{ all -> 0x0070 }
        r0 = r0.toString();	 Catch:{ all -> 0x0070 }
        r4.<init>(r0);	 Catch:{ all -> 0x0070 }
        throw r4;	 Catch:{ all -> 0x0070 }
    L_0x0070:
        r4 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x0070 }
        goto L_0x0074;
    L_0x0073:
        throw r4;
    L_0x0074:
        goto L_0x0073;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zq.a(int):void");
    }

    public final Object b(Object obj) {
        if (obj != null) {
            Object remove;
            synchronized (this) {
                remove = this.a.remove(obj);
                if (remove != null) {
                    this.b -= b(obj, remove);
                }
            }
            if (remove != null) {
                c(remove);
            }
            return remove;
        }
        throw new NullPointerException("key == null");
    }

    private final int b(Object obj, Object obj2) {
        int e = e(obj2);
        if (e >= 0) {
            return e;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Negative size: ");
        stringBuilder.append(obj);
        stringBuilder.append("=");
        stringBuilder.append(obj2);
        throw new IllegalStateException(stringBuilder.toString());
    }

    public final synchronized Map a() {
        return new LinkedHashMap(this.a);
    }

    public final synchronized String toString() {
        int i;
        i = this.g;
        int i2 = this.h + i;
        i = i2 != 0 ? (i * 100) / i2 : 0;
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", new Object[]{Integer.valueOf(this.c), Integer.valueOf(this.g), Integer.valueOf(this.h), Integer.valueOf(i)});
    }
}
