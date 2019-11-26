package defpackage;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: acwh */
public final class acwh {
    private final Map a = new HashMap();
    private final Map b = new HashMap();

    acwh() {
        HashMap hashMap = new HashMap();
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void a(acww acww, acwp acwp) {
        Deque deque = (Deque) this.a.get(acww);
        if (deque == null) {
            deque = new ArrayDeque();
            this.a.put(acww, deque);
        }
        if (deque.contains(acwp)) {
            deque.remove(acwp);
        }
        deque.addFirst(acwp);
        Deque deque2 = (Deque) this.a.get(acww);
        if (deque2 != null && deque2.size() > 3) {
            while (deque2.size() > 3) {
                a((acwp) deque2.removeLast());
            }
        }
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void a(acwp acwp, acwr acwr) {
        String str = acwp.a;
        if (TextUtils.isEmpty(str)) {
            xtl.c("Empty CSN found when addVisibilityControllerToScreen");
            return;
        }
        if (!this.b.containsKey(str)) {
            this.b.put(str, new ArrayList());
        }
        ((List) this.b.get(str)).add(new WeakReference(acwr));
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized acwp a(acww acww) {
        Deque deque = (Deque) this.a.get(acww);
        if (deque == null) {
            return null;
        }
        return (acwp) deque.peekFirst();
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    /* JADX WARNING: Missing block: B:21:0x0061, code skipped:
            return;
     */
    public final synchronized void a(defpackage.acwp r4) {
        /*
        r3 = this;
        monitor-enter(r3);
        if (r4 == 0) goto L_0x0062;
    L_0x0003:
        r0 = r3.a;	 Catch:{ all -> 0x0069 }
        r0 = r0.values();	 Catch:{ all -> 0x0069 }
        r0 = r0.iterator();	 Catch:{ all -> 0x0069 }
    L_0x000d:
        r1 = r0.hasNext();	 Catch:{ all -> 0x0069 }
        if (r1 == 0) goto L_0x0023;
    L_0x0013:
        r1 = r0.next();	 Catch:{ all -> 0x0069 }
        r1 = (java.util.Deque) r1;	 Catch:{ all -> 0x0069 }
        r2 = r1.contains(r4);	 Catch:{ all -> 0x0069 }
        if (r2 == 0) goto L_0x000d;
    L_0x001f:
        r1.remove(r4);	 Catch:{ all -> 0x0069 }
        goto L_0x000d;
    L_0x0023:
        r4 = r4.a;	 Catch:{ all -> 0x0069 }
        r0 = android.text.TextUtils.isEmpty(r4);	 Catch:{ all -> 0x0069 }
        if (r0 != 0) goto L_0x0060;
    L_0x002b:
        r0 = r3.b;	 Catch:{ all -> 0x0069 }
        r0 = r0.containsKey(r4);	 Catch:{ all -> 0x0069 }
        if (r0 == 0) goto L_0x0060;
    L_0x0033:
        r0 = r3.b;	 Catch:{ all -> 0x0069 }
        r0 = r0.get(r4);	 Catch:{ all -> 0x0069 }
        r0 = (java.util.List) r0;	 Catch:{ all -> 0x0069 }
        r0 = r0.iterator();	 Catch:{ all -> 0x0069 }
    L_0x003f:
        r1 = r0.hasNext();	 Catch:{ all -> 0x0069 }
        if (r1 == 0) goto L_0x005b;
    L_0x0045:
        r1 = r0.next();	 Catch:{ all -> 0x0069 }
        r1 = (java.lang.ref.WeakReference) r1;	 Catch:{ all -> 0x0069 }
        r2 = r1.get();	 Catch:{ all -> 0x0069 }
        if (r2 == 0) goto L_0x003f;
    L_0x0051:
        r1 = r1.get();	 Catch:{ all -> 0x0069 }
        r1 = (defpackage.acwr) r1;	 Catch:{ all -> 0x0069 }
        r1.b();	 Catch:{ all -> 0x0069 }
        goto L_0x003f;
    L_0x005b:
        r0 = r3.b;	 Catch:{ all -> 0x0069 }
        r0.remove(r4);	 Catch:{ all -> 0x0069 }
    L_0x0060:
        monitor-exit(r3);
        return;
    L_0x0062:
        r4 = "Null interactionLoggingScreen found when removeInteractionLoggingScreen.";
        defpackage.xtl.c(r4);	 Catch:{ all -> 0x0069 }
        monitor-exit(r3);
        return;
    L_0x0069:
        r4 = move-exception;
        monitor-exit(r3);
        goto L_0x006d;
    L_0x006c:
        throw r4;
    L_0x006d:
        goto L_0x006c;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acwh.a(acwp):void");
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        String str = ", ";
        String str2 = "";
        String str3 = str2;
        for (acww acww : this.a.keySet()) {
            stringBuilder.append(str3);
            stringBuilder.append(acww);
            stringBuilder.append(" = {");
            String str4 = str2;
            for (acwp acwp : (Deque) this.a.get(acww)) {
                stringBuilder.append(str4);
                stringBuilder.append(acwp.a);
                str4 = str;
            }
            stringBuilder.append("}");
            str3 = str;
        }
        return stringBuilder.toString();
    }
}
