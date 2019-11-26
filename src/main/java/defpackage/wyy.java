package defpackage;

import java.lang.ref.ReferenceQueue;
import java.util.HashMap;
import java.util.Map;

/* renamed from: wyy */
public final class wyy extends wyr {
    private final Map c;
    private final ReferenceQueue d = new ReferenceQueue();

    public wyy(int i) {
        super(i);
        this.c = new HashMap(((int) Math.ceil((double) (((float) i) / 0.75f))) + 1, 0.75f);
    }

    /* JADX WARNING: Missing block: B:11:0x0020, code skipped:
            return r0;
     */
    public final synchronized java.lang.Object a(java.lang.Object r3) {
        /*
        r2 = this;
        monitor-enter(r2);
        r0 = super.a(r3);	 Catch:{ all -> 0x0023 }
        if (r0 != 0) goto L_0x0021;
    L_0x0007:
        r1 = r2.c;	 Catch:{ all -> 0x0023 }
        r1 = r1.get(r3);	 Catch:{ all -> 0x0023 }
        r1 = (defpackage.wzb) r1;	 Catch:{ all -> 0x0023 }
        if (r1 == 0) goto L_0x001f;
    L_0x0011:
        r0 = r1.get();	 Catch:{ all -> 0x0023 }
        if (r0 == 0) goto L_0x001a;
    L_0x0017:
        super.a(r3, r0);	 Catch:{ all -> 0x0023 }
    L_0x001a:
        r1 = r2.c;	 Catch:{ all -> 0x0023 }
        r1.remove(r3);	 Catch:{ all -> 0x0023 }
    L_0x001f:
        monitor-exit(r2);
        return r0;
    L_0x0021:
        monitor-exit(r2);
        return r0;
    L_0x0023:
        r3 = move-exception;
        monitor-exit(r2);
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wyy.a(java.lang.Object):java.lang.Object");
    }

    public final synchronized void a(Object obj, Object obj2) {
        super.a(obj, obj2);
        int size = this.c.size();
        while (true) {
            wzb wzb = (wzb) this.d.poll();
            if (wzb == null) {
                break;
            }
            this.c.remove(wzb.a);
        }
        if (size - this.c.size() > 0) {
            this.c.size();
        }
    }

    public final synchronized Object b(Object obj) {
        Object b;
        b = super.b(obj);
        if (b != null) {
            this.c.put(obj, new wzb(obj, b, this.d));
        }
        return b;
    }

    public final synchronized String toString() {
        String valueOf;
        String valueOf2;
        valueOf = String.valueOf(super.toString());
        valueOf2 = String.valueOf(this.c.toString());
        return valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
    }
}
