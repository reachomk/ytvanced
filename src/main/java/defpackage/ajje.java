package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: ajje */
public final class ajje {
    public final List a;
    public final List b;
    public final List c;

    /* JADX WARNING: Missing block: B:8:0x0024, code skipped:
            if (r9 != false) goto L_0x0026;
     */
    /* JADX WARNING: Missing block: B:9:0x0026, code skipped:
            r1 = r0 - 1;
     */
    /* JADX WARNING: Missing block: B:10:0x0029, code skipped:
            r1 = r0 + 1;
     */
    /* JADX WARNING: Missing block: B:11:0x002b, code skipped:
            r5 = r1;
            r1 = r0;
            r0 = r5;
     */
    /* JADX WARNING: Missing block: B:12:0x0034, code skipped:
            if (r0 >= r6.a.size()) goto L_0x005b;
     */
    /* JADX WARNING: Missing block: B:13:0x0036, code skipped:
            if (r0 < 0) goto L_0x005b;
     */
    /* JADX WARNING: Missing block: B:15:0x0046, code skipped:
            if (((java.lang.Long) r6.a.get(r0)).longValue() > r7) goto L_0x005b;
     */
    /* JADX WARNING: Missing block: B:17:0x0056, code skipped:
            if (((java.lang.Long) r6.b.get(r0)).longValue() <= r7) goto L_0x005b;
     */
    /* JADX WARNING: Missing block: B:18:0x0058, code skipped:
            if (r9 != false) goto L_0x0026;
     */
    /* JADX WARNING: Missing block: B:19:0x005b, code skipped:
            return r1;
     */
    public final int a(long r7, boolean r9) {
        /*
        r6 = this;
        r0 = r6.a;
        r1 = java.lang.Long.valueOf(r7);
        r0 = java.util.Collections.binarySearch(r0, r1);
        if (r0 >= 0) goto L_0x0024;
    L_0x000c:
        r0 = -r0;
        r0 = r0 + -2;
        if (r0 < 0) goto L_0x0022;
    L_0x0011:
        r1 = r6.b;
        r1 = r1.get(r0);
        r1 = (java.lang.Long) r1;
        r1 = r1.longValue();
        r3 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1));
        if (r3 >= 0) goto L_0x0022;
    L_0x0021:
        goto L_0x0024;
    L_0x0022:
        r7 = -1;
        return r7;
    L_0x0024:
        if (r9 == 0) goto L_0x0029;
    L_0x0026:
        r1 = r0 + -1;
        goto L_0x002b;
    L_0x0029:
        r1 = r0 + 1;
    L_0x002b:
        r5 = r1;
        r1 = r0;
        r0 = r5;
        r2 = r6.a;
        r2 = r2.size();
        if (r0 >= r2) goto L_0x005b;
    L_0x0036:
        if (r0 < 0) goto L_0x005b;
    L_0x0038:
        r2 = r6.a;
        r2 = r2.get(r0);
        r2 = (java.lang.Long) r2;
        r2 = r2.longValue();
        r4 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1));
        if (r4 > 0) goto L_0x005b;
    L_0x0048:
        r2 = r6.b;
        r2 = r2.get(r0);
        r2 = (java.lang.Long) r2;
        r2 = r2.longValue();
        r4 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1));
        if (r4 <= 0) goto L_0x005b;
    L_0x0058:
        if (r9 != 0) goto L_0x0026;
    L_0x005a:
        goto L_0x0029;
    L_0x005b:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajje.a(long, boolean):int");
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < this.a.size(); i++) {
            stringBuilder.append("[");
            stringBuilder.append(this.a.get(i));
            stringBuilder.append(" - ");
            stringBuilder.append(this.b.get(i));
            stringBuilder.append(": ");
            stringBuilder.append((CharSequence) this.c.get(i));
            stringBuilder.append("]");
        }
        return stringBuilder.toString();
    }

    /* synthetic */ ajje(List list, List list2, List list3) {
        amqw.a((Object) list);
        amqw.a((Object) list2);
        amqw.a((Object) list3);
        boolean z = true;
        amqw.b(list.size() == list2.size(), (Object) "startTimes and endTimes differ in size");
        if (list.size() != list3.size()) {
            z = false;
        }
        amqw.b(z, (Object) "startTimes and lines differ in size");
        this.a = Collections.unmodifiableList(list);
        this.b = Collections.unmodifiableList(list2);
        this.c = Collections.unmodifiableList(list3);
    }
}
