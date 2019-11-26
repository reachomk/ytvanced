package defpackage;

import android.util.SparseArray;

/* renamed from: dcm */
final class dcm extends SparseArray {
    private final Object a;

    dcm(Object obj, int i) {
        super(i);
        this.a = obj;
    }

    private final void a(int i, SparseArray sparseArray) {
        synchronized (this.a) {
            super.put(i, sparseArray);
        }
    }

    public final /* synthetic */ void put(int i, Object obj) {
        a(i, (SparseArray) obj);
    }

    /* JADX WARNING: Missing block: B:15:?, code skipped:
            return r1;
     */
    public final /* synthetic */ java.lang.Object get(int r4) {
        /*
        r3 = this;
        r0 = r3.a;
        monitor-enter(r0);
        r1 = super.get(r4);	 Catch:{ all -> 0x001d }
        r1 = (android.util.SparseArray) r1;	 Catch:{ all -> 0x001d }
        if (r1 == 0) goto L_0x001b;
    L_0x000b:
        r2 = r1 instanceof defpackage.dcl;	 Catch:{ all -> 0x001d }
        if (r2 == 0) goto L_0x0010;
    L_0x000f:
        goto L_0x001b;
    L_0x0010:
        r2 = new dcl;	 Catch:{ all -> 0x001d }
        r2.<init>(r1);	 Catch:{ all -> 0x001d }
        r3.a(r4, r2);	 Catch:{ all -> 0x001d }
        monitor-exit(r0);	 Catch:{ all -> 0x001d }
        r1 = r2;
        goto L_0x001c;
    L_0x001b:
        monitor-exit(r0);	 Catch:{ all -> 0x001d }
    L_0x001c:
        return r1;
    L_0x001d:
        r4 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x001d }
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dcm.get(int):java.lang.Object");
    }
}
