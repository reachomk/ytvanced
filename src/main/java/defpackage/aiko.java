package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: aiko */
public final class aiko extends aijt {
    private final int a;
    private final aikn b;
    private aikc c;

    public aiko(int i) {
        this.a = i;
        this.b = new aikn(i);
    }

    /* JADX WARNING: Missing block: B:16:0x0039, code skipped:
            return;
     */
    public final synchronized void a(defpackage.aikc r5) {
        /*
        r4 = this;
        monitor-enter(r4);
        r0 = r4.c;	 Catch:{ all -> 0x003c }
        if (r0 == r5) goto L_0x003a;
    L_0x0005:
        r1 = 0;
        if (r0 == 0) goto L_0x001a;
    L_0x0008:
        r2 = r4.b;	 Catch:{ all -> 0x003c }
        r0.b(r2);	 Catch:{ all -> 0x003c }
        r0 = r4.size();	 Catch:{ all -> 0x003c }
        if (r0 <= 0) goto L_0x001a;
    L_0x0013:
        r2 = r4.b;	 Catch:{ all -> 0x003c }
        r3 = r4.a;	 Catch:{ all -> 0x003c }
        r2.b(r3, r1, r0);	 Catch:{ all -> 0x003c }
    L_0x001a:
        r4.c = r5;	 Catch:{ all -> 0x003c }
        r5 = r4.c;	 Catch:{ all -> 0x003c }
        if (r5 == 0) goto L_0x0038;
    L_0x0020:
        r5 = r4.size();	 Catch:{ all -> 0x003c }
        if (r5 <= 0) goto L_0x0031;
    L_0x0026:
        r5 = r4.b;	 Catch:{ all -> 0x003c }
        r0 = r4.a;	 Catch:{ all -> 0x003c }
        r2 = r4.size();	 Catch:{ all -> 0x003c }
        r5.a(r0, r1, r2);	 Catch:{ all -> 0x003c }
    L_0x0031:
        r5 = r4.c;	 Catch:{ all -> 0x003c }
        r0 = r4.b;	 Catch:{ all -> 0x003c }
        r5.a(r0);	 Catch:{ all -> 0x003c }
    L_0x0038:
        monitor-exit(r4);
        return;
    L_0x003a:
        monitor-exit(r4);
        return;
    L_0x003c:
        r5 = move-exception;
        monitor-exit(r4);
        throw r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aiko.a(aikc):void");
    }

    public final synchronized int size() {
        aikc aikc = this.c;
        if (aikc == null) {
            return 0;
        }
        return aikc.a(this.a);
    }

    public final synchronized List subList(int i, int i2) {
        i = size();
        if (this.c != null) {
            if (i2 > 0) {
                int i3 = 0;
                if (xty.a(0, 0, i) && xty.b(i2, 0, i)) {
                    ArrayList arrayList = new ArrayList(i2);
                    while (i3 < i2) {
                        arrayList.add(this.c.a(this.a, i3));
                        i3++;
                    }
                    return Collections.unmodifiableList(arrayList);
                }
            }
        }
        return Collections.emptyList();
    }

    public final synchronized int indexOf(Object obj) {
        if (this.c == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (amqq.a(obj, this.c.a(this.a, i))) {
                return i;
            }
        }
        return -1;
    }

    private final synchronized aikr a(int i) {
        aikc aikc = this.c;
        if (aikc == null) {
            return null;
        }
        return aikc.a(this.a, i);
    }

    public final synchronized void a(int i, int i2) {
        aikc aikc = this.c;
        if (aikc != null) {
            aikc.a(this.a, i, i2);
        }
    }

    public final synchronized void clear() {
        aikc aikc = this.c;
        if (aikc != null) {
            aikc.a(this.a, 0, size());
        }
    }

    public final void a(xbz xbz) {
        this.b.a.add(xbz);
    }

    public final void b(xbz xbz) {
        this.b.a.remove(xbz);
    }

    public final /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    public final /* synthetic */ Object get(int i) {
        return a(i);
    }
}
