package defpackage;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/* renamed from: bdco */
public final class bdco implements bcuo {
    public List a;
    public volatile boolean b;

    public bdco(bcuo... bcuoArr) {
        this.a = new LinkedList(Arrays.asList(bcuoArr));
    }

    public bdco(bcuo bcuo) {
        this.a = new LinkedList();
        this.a.add(bcuo);
    }

    public final boolean c() {
        return this.b;
    }

    public final void a(bcuo bcuo) {
        if (!bcuo.c()) {
            if (!this.b) {
                synchronized (this) {
                    if (!this.b) {
                        List list = this.a;
                        if (list == null) {
                            list = new LinkedList();
                            this.a = list;
                        }
                        list.add(bcuo);
                        return;
                    }
                }
            }
            bcuo.b();
        }
    }

    /* JADX WARNING: Missing block: B:10:0x0014, code skipped:
            if (r0 == null) goto L_0x003d;
     */
    /* JADX WARNING: Missing block: B:11:0x0016, code skipped:
            r0 = r0.iterator();
     */
    /* JADX WARNING: Missing block: B:13:0x001e, code skipped:
            if (r0.hasNext() == false) goto L_0x0036;
     */
    /* JADX WARNING: Missing block: B:16:?, code skipped:
            ((defpackage.bcuo) r0.next()).b();
     */
    /* JADX WARNING: Missing block: B:18:0x002a, code skipped:
            r2 = move-exception;
     */
    /* JADX WARNING: Missing block: B:19:0x002b, code skipped:
            if (r1 == null) goto L_0x002d;
     */
    /* JADX WARNING: Missing block: B:20:0x002d, code skipped:
            r1 = new java.util.ArrayList();
     */
    /* JADX WARNING: Missing block: B:21:0x0032, code skipped:
            r1.add(r2);
     */
    /* JADX WARNING: Missing block: B:22:0x0036, code skipped:
            defpackage.bcva.a(r1);
     */
    public final void b() {
        /*
        r3 = this;
        r0 = r3.b;
        if (r0 != 0) goto L_0x003d;
    L_0x0004:
        monitor-enter(r3);
        r0 = r3.b;	 Catch:{ all -> 0x003a }
        if (r0 == 0) goto L_0x000b;
    L_0x0009:
        monitor-exit(r3);	 Catch:{ all -> 0x003a }
        return;
    L_0x000b:
        r0 = 1;
        r3.b = r0;	 Catch:{ all -> 0x003a }
        r0 = r3.a;	 Catch:{ all -> 0x003a }
        r1 = 0;
        r3.a = r1;	 Catch:{ all -> 0x003a }
        monitor-exit(r3);	 Catch:{ all -> 0x003a }
        if (r0 == 0) goto L_0x003d;
    L_0x0016:
        r0 = r0.iterator();
    L_0x001a:
        r2 = r0.hasNext();
        if (r2 == 0) goto L_0x0036;
    L_0x0020:
        r2 = r0.next();
        r2 = (defpackage.bcuo) r2;
        r2.b();	 Catch:{ all -> 0x002a }
        goto L_0x001a;
    L_0x002a:
        r2 = move-exception;
        if (r1 != 0) goto L_0x0032;
    L_0x002d:
        r1 = new java.util.ArrayList;
        r1.<init>();
    L_0x0032:
        r1.add(r2);
        goto L_0x001a;
    L_0x0036:
        defpackage.bcva.a(r1);
        goto L_0x003d;
    L_0x003a:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x003a }
        throw r0;
    L_0x003d:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bdco.b():void");
    }
}
