package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: bdfu */
public final class bdfu implements bcuo {
    public Set a;
    public volatile boolean b;

    public final boolean c() {
        return this.b;
    }

    public final void a(bcuo bcuo) {
        if (!bcuo.c()) {
            if (!this.b) {
                synchronized (this) {
                    if (!this.b) {
                        if (this.a == null) {
                            this.a = new HashSet(4);
                        }
                        this.a.add(bcuo);
                        return;
                    }
                }
            }
            bcuo.b();
        }
    }

    public final void a(bcuo... bcuoArr) {
        int length;
        int i = 0;
        if (!this.b) {
            synchronized (this) {
                if (!this.b) {
                    if (this.a == null) {
                        this.a = new HashSet(bcuoArr.length);
                    }
                    length = bcuoArr.length;
                    while (i < length) {
                        bcuo bcuo = bcuoArr[i];
                        if (!bcuo.c()) {
                            this.a.add(bcuo);
                        }
                        i++;
                    }
                    return;
                }
            }
        }
        length = bcuoArr.length;
        while (i < length) {
            bcuoArr[i].b();
            i++;
        }
    }

    /* JADX WARNING: Missing block: B:11:0x0013, code skipped:
            if (r0 == false) goto L_0x001e;
     */
    /* JADX WARNING: Missing block: B:12:0x0015, code skipped:
            r2.b();
     */
    public final void b(defpackage.bcuo r2) {
        /*
        r1 = this;
        r0 = r1.b;
        if (r0 != 0) goto L_0x001e;
    L_0x0004:
        monitor-enter(r1);
        r0 = r1.b;	 Catch:{ all -> 0x001b }
        if (r0 != 0) goto L_0x0019;
    L_0x0009:
        r0 = r1.a;	 Catch:{ all -> 0x001b }
        if (r0 != 0) goto L_0x000e;
    L_0x000d:
        goto L_0x0019;
    L_0x000e:
        r0 = r0.remove(r2);	 Catch:{ all -> 0x001b }
        monitor-exit(r1);	 Catch:{ all -> 0x001b }
        if (r0 == 0) goto L_0x001e;
    L_0x0015:
        r2.b();
        goto L_0x001e;
    L_0x0019:
        monitor-exit(r1);	 Catch:{ all -> 0x001b }
        return;
    L_0x001b:
        r2 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x001b }
        throw r2;
    L_0x001e:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bdfu.b(bcuo):void");
    }

    /* JADX WARNING: Missing block: B:11:0x0012, code skipped:
            defpackage.bdfu.a(r0);
     */
    public final void a() {
        /*
        r2 = this;
        r0 = r2.b;
        if (r0 != 0) goto L_0x001b;
    L_0x0004:
        monitor-enter(r2);
        r0 = r2.b;	 Catch:{ all -> 0x0018 }
        if (r0 != 0) goto L_0x0016;
    L_0x0009:
        r0 = r2.a;	 Catch:{ all -> 0x0018 }
        if (r0 != 0) goto L_0x000e;
    L_0x000d:
        goto L_0x0016;
    L_0x000e:
        r1 = 0;
        r2.a = r1;	 Catch:{ all -> 0x0018 }
        monitor-exit(r2);	 Catch:{ all -> 0x0018 }
        defpackage.bdfu.a(r0);
        goto L_0x001b;
    L_0x0016:
        monitor-exit(r2);	 Catch:{ all -> 0x0018 }
        return;
    L_0x0018:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x0018 }
        throw r0;
    L_0x001b:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bdfu.a():void");
    }

    /* JADX WARNING: Missing block: B:10:0x0014, code skipped:
            defpackage.bdfu.a(r0);
     */
    public final void b() {
        /*
        r2 = this;
        r0 = r2.b;
        if (r0 != 0) goto L_0x001b;
    L_0x0004:
        monitor-enter(r2);
        r0 = r2.b;	 Catch:{ all -> 0x0018 }
        if (r0 == 0) goto L_0x000b;
    L_0x0009:
        monitor-exit(r2);	 Catch:{ all -> 0x0018 }
        return;
    L_0x000b:
        r0 = 1;
        r2.b = r0;	 Catch:{ all -> 0x0018 }
        r0 = r2.a;	 Catch:{ all -> 0x0018 }
        r1 = 0;
        r2.a = r1;	 Catch:{ all -> 0x0018 }
        monitor-exit(r2);	 Catch:{ all -> 0x0018 }
        defpackage.bdfu.a(r0);
        goto L_0x001b;
    L_0x0018:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x0018 }
        throw r0;
    L_0x001b:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bdfu.b():void");
    }

    private static void a(Collection collection) {
        if (collection != null) {
            List list = null;
            for (bcuo b : collection) {
                try {
                    b.b();
                } catch (Throwable th) {
                    if (list == null) {
                        list = new ArrayList();
                    }
                    list.add(th);
                }
            }
            bcva.a(list);
        }
    }
}
