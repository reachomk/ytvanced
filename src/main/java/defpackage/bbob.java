package defpackage;

import java.util.LinkedList;
import java.util.List;

/* renamed from: bbob */
public final class bbob implements bbnc, bboa {
    private List a;
    private volatile boolean b;

    /* JADX WARNING: Missing block: B:10:0x0014, code skipped:
            if (r1 == null) goto L_0x0053;
     */
    /* JADX WARNING: Missing block: B:11:0x0016, code skipped:
            r1 = r1.iterator();
     */
    /* JADX WARNING: Missing block: B:13:0x001e, code skipped:
            if (r1.hasNext() == false) goto L_0x0039;
     */
    /* JADX WARNING: Missing block: B:16:?, code skipped:
            ((defpackage.bbnc) r1.next()).bK_();
     */
    /* JADX WARNING: Missing block: B:18:0x002a, code skipped:
            r3 = move-exception;
     */
    /* JADX WARNING: Missing block: B:19:0x002b, code skipped:
            defpackage.bbnm.a(r3);
     */
    /* JADX WARNING: Missing block: B:20:0x002e, code skipped:
            if (r2 == null) goto L_0x0030;
     */
    /* JADX WARNING: Missing block: B:21:0x0030, code skipped:
            r2 = new java.util.ArrayList();
     */
    /* JADX WARNING: Missing block: B:22:0x0035, code skipped:
            r2.add(r3);
     */
    /* JADX WARNING: Missing block: B:23:0x0039, code skipped:
            if (r2 == null) goto L_0x0053;
     */
    /* JADX WARNING: Missing block: B:25:0x003f, code skipped:
            if (r2.size() != 1) goto L_0x004d;
     */
    /* JADX WARNING: Missing block: B:27:0x004c, code skipped:
            throw defpackage.bbyw.a((java.lang.Throwable) r2.get(0));
     */
    /* JADX WARNING: Missing block: B:29:0x0052, code skipped:
            throw new defpackage.bbnf((java.lang.Iterable) r2);
     */
    /* JADX WARNING: Missing block: B:30:0x0053, code skipped:
            return;
     */
    public final void bK_() {
        /*
        r4 = this;
        r0 = r4.b;
        if (r0 != 0) goto L_0x0057;
    L_0x0004:
        monitor-enter(r4);
        r0 = r4.b;	 Catch:{ all -> 0x0054 }
        if (r0 == 0) goto L_0x000b;
    L_0x0009:
        monitor-exit(r4);	 Catch:{ all -> 0x0054 }
        return;
    L_0x000b:
        r0 = 1;
        r4.b = r0;	 Catch:{ all -> 0x0054 }
        r1 = r4.a;	 Catch:{ all -> 0x0054 }
        r2 = 0;
        r4.a = r2;	 Catch:{ all -> 0x0054 }
        monitor-exit(r4);	 Catch:{ all -> 0x0054 }
        if (r1 == 0) goto L_0x0053;
    L_0x0016:
        r1 = r1.iterator();
    L_0x001a:
        r3 = r1.hasNext();
        if (r3 == 0) goto L_0x0039;
    L_0x0020:
        r3 = r1.next();
        r3 = (defpackage.bbnc) r3;
        r3.bK_();	 Catch:{ all -> 0x002a }
        goto L_0x001a;
    L_0x002a:
        r3 = move-exception;
        defpackage.bbnm.a(r3);
        if (r2 != 0) goto L_0x0035;
    L_0x0030:
        r2 = new java.util.ArrayList;
        r2.<init>();
    L_0x0035:
        r2.add(r3);
        goto L_0x001a;
    L_0x0039:
        if (r2 == 0) goto L_0x0053;
    L_0x003b:
        r1 = r2.size();
        if (r1 != r0) goto L_0x004d;
    L_0x0041:
        r0 = 0;
        r0 = r2.get(r0);
        r0 = (java.lang.Throwable) r0;
        r0 = defpackage.bbyw.a(r0);
        throw r0;
    L_0x004d:
        r0 = new bbnf;
        r0.<init>(r2);
        throw r0;
    L_0x0053:
        return;
    L_0x0054:
        r0 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x0054 }
        throw r0;
    L_0x0057:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bbob.bK_():void");
    }

    public final boolean c() {
        return this.b;
    }

    public final boolean a(bbnc bbnc) {
        bbow.a((Object) bbnc, "d is null");
        if (!this.b) {
            synchronized (this) {
                if (!this.b) {
                    List list = this.a;
                    if (list == null) {
                        list = new LinkedList();
                        this.a = list;
                    }
                    list.add(bbnc);
                    return true;
                }
            }
        }
        bbnc.bK_();
        return false;
    }

    public final boolean b(bbnc bbnc) {
        if (!c(bbnc)) {
            return false;
        }
        bbnc.bK_();
        return true;
    }

    /* JADX WARNING: Missing block: B:17:0x0020, code skipped:
            return false;
     */
    public final boolean c(defpackage.bbnc r3) {
        /*
        r2 = this;
        r0 = "Disposable item is null";
        defpackage.bbow.a(r3, r0);
        r0 = r2.b;
        r1 = 0;
        if (r0 != 0) goto L_0x0024;
    L_0x000a:
        monitor-enter(r2);
        r0 = r2.b;	 Catch:{ all -> 0x0021 }
        if (r0 == 0) goto L_0x0011;
    L_0x000f:
        monitor-exit(r2);	 Catch:{ all -> 0x0021 }
        return r1;
    L_0x0011:
        r0 = r2.a;	 Catch:{ all -> 0x0021 }
        if (r0 == 0) goto L_0x001f;
    L_0x0015:
        r3 = r0.remove(r3);	 Catch:{ all -> 0x0021 }
        if (r3 != 0) goto L_0x001c;
    L_0x001b:
        goto L_0x001f;
    L_0x001c:
        monitor-exit(r2);	 Catch:{ all -> 0x0021 }
        r3 = 1;
        return r3;
    L_0x001f:
        monitor-exit(r2);	 Catch:{ all -> 0x0021 }
        return r1;
    L_0x0021:
        r3 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x0021 }
        throw r3;
    L_0x0024:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bbob.c(bbnc):boolean");
    }
}
