package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: aikk */
public final class aikk extends aijt {
    private final aikj a = new aikj(this);
    private final int[] b = new int[(aikc.n.length + 1)];
    private aikc c;

    /* JADX WARNING: Missing block: B:16:0x0034, code skipped:
            return;
     */
    public final synchronized void a(defpackage.aikc r4) {
        /*
        r3 = this;
        monitor-enter(r3);
        r0 = r3.c;	 Catch:{ all -> 0x0037 }
        if (r0 == r4) goto L_0x0035;
    L_0x0005:
        r1 = 0;
        if (r0 == 0) goto L_0x0018;
    L_0x0008:
        r2 = r3.a;	 Catch:{ all -> 0x0037 }
        r0.b(r2);	 Catch:{ all -> 0x0037 }
        r0 = r3.size();	 Catch:{ all -> 0x0037 }
        if (r0 <= 0) goto L_0x0018;
    L_0x0013:
        r2 = r3.a;	 Catch:{ all -> 0x0037 }
        r2.b(r1, r0);	 Catch:{ all -> 0x0037 }
    L_0x0018:
        r3.c = r4;	 Catch:{ all -> 0x0037 }
        r3.a();	 Catch:{ all -> 0x0037 }
        r4 = r3.c;	 Catch:{ all -> 0x0037 }
        if (r4 == 0) goto L_0x0033;
    L_0x0021:
        r4 = r3.size();	 Catch:{ all -> 0x0037 }
        if (r4 <= 0) goto L_0x002c;
    L_0x0027:
        r0 = r3.a;	 Catch:{ all -> 0x0037 }
        r0.a(r1, r4);	 Catch:{ all -> 0x0037 }
    L_0x002c:
        r4 = r3.c;	 Catch:{ all -> 0x0037 }
        r0 = r3.a;	 Catch:{ all -> 0x0037 }
        r4.a(r0);	 Catch:{ all -> 0x0037 }
    L_0x0033:
        monitor-exit(r3);
        return;
    L_0x0035:
        monitor-exit(r3);
        return;
    L_0x0037:
        r4 = move-exception;
        monitor-exit(r3);
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aikk.a(aikc):void");
    }

    public final synchronized int size() {
        return this.b[aikc.n.length];
    }

    public final synchronized List subList(int i, int i2) {
        i = size();
        if (this.c != null) {
            if (i2 > 0) {
                int i3 = 0;
                if (xty.a(0, 0, i) && xty.b(i2, 0, i)) {
                    ArrayList arrayList = new ArrayList(i2);
                    while (i3 < i2) {
                        arrayList.add(get(i3));
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
            if (amqq.a(obj, get(i))) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public final synchronized aikr get(int i) {
        if (this.c == null) {
            return null;
        }
        int i2 = aikc.n[0];
        int length = aikc.n.length;
        while (true) {
            length--;
            if (length <= 0) {
                break;
            } else if (i >= this.b[length]) {
                i2 = aikc.n[length];
            }
        }
        i -= this.b[i2];
        if (i >= this.c.a(i2)) {
            return null;
        }
        return this.c.a(i2, i);
    }

    public final void a(int i, int i2) {
        throw new UnsupportedOperationException();
    }

    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public final void a(xbz xbz) {
        this.a.a.add(xbz);
    }

    public final void b(xbz xbz) {
        this.a.a.remove(xbz);
    }

    public final synchronized void a() {
        int i = 0;
        for (int i2 : aikc.n) {
            aikc aikc = this.c;
            i += aikc != null ? aikc.a(i2) : 0;
            this.b[i2 + 1] = i;
        }
    }

    public final synchronized int b(int i, int i2) {
        return this.b[i] + i2;
    }

    public final /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }
}
