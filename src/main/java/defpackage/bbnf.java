package defpackage;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: bbnf */
public final class bbnf extends RuntimeException {
    public static final long serialVersionUID = 3026362227162912146L;
    private final List a;
    private final String b;
    private Throwable c;

    public bbnf(Throwable... thArr) {
        this(Arrays.asList(thArr));
    }

    public bbnf(Iterable iterable) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        if (iterable != null) {
            for (Throwable th : iterable) {
                if (th instanceof bbnf) {
                    linkedHashSet.addAll(((bbnf) th).a);
                } else if (th != null) {
                    linkedHashSet.add(th);
                } else {
                    linkedHashSet.add(new NullPointerException("Throwable was null!"));
                }
            }
        } else {
            linkedHashSet.add(new NullPointerException("errors was null"));
        }
        if (linkedHashSet.isEmpty()) {
            throw new IllegalArgumentException("errors is empty");
        }
        arrayList.addAll(linkedHashSet);
        this.a = Collections.unmodifiableList(arrayList);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.a.size());
        stringBuilder.append(" exceptions occurred. ");
        this.b = stringBuilder.toString();
    }

    public final String getMessage() {
        return this.b;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x006b */
    /* JADX WARNING: Can't wrap try/catch for region: R(9:10|(1:12)(1:(1:(2:14|(1:17)(1:51)))(0))|18|(3:20|(2:22|53)(2:23|52)|24)|25|26|27|28|(1:(2:32|(1:35)(1:49)))(0)) */
    public final synchronized java.lang.Throwable getCause() {
        /*
        r10 = this;
        monitor-enter(r10);
        r0 = r10.c;	 Catch:{ all -> 0x0085 }
        if (r0 != 0) goto L_0x0081;
    L_0x0005:
        r0 = new bbni;	 Catch:{ all -> 0x0085 }
        r0.<init>();	 Catch:{ all -> 0x0085 }
        r1 = new java.util.HashSet;	 Catch:{ all -> 0x0085 }
        r1.<init>();	 Catch:{ all -> 0x0085 }
        r2 = r10.a;	 Catch:{ all -> 0x0085 }
        r2 = r2.iterator();	 Catch:{ all -> 0x0085 }
        r3 = r0;
    L_0x0016:
        r4 = r2.hasNext();	 Catch:{ all -> 0x0085 }
        if (r4 == 0) goto L_0x007f;
    L_0x001c:
        r4 = r2.next();	 Catch:{ all -> 0x0085 }
        r4 = (java.lang.Throwable) r4;	 Catch:{ all -> 0x0085 }
        r5 = r1.contains(r4);	 Catch:{ all -> 0x0085 }
        if (r5 == 0) goto L_0x0029;
    L_0x0028:
        goto L_0x0016;
    L_0x0029:
        r1.add(r4);	 Catch:{ all -> 0x0085 }
        r5 = new java.util.ArrayList;	 Catch:{ all -> 0x0085 }
        r5.<init>();	 Catch:{ all -> 0x0085 }
        r6 = r4.getCause();	 Catch:{ all -> 0x0085 }
        if (r6 != 0) goto L_0x0038;
    L_0x0037:
        goto L_0x0047;
    L_0x0038:
        if (r6 == r4) goto L_0x0047;
    L_0x003a:
        r5.add(r6);	 Catch:{ all -> 0x0085 }
        r7 = r6.getCause();	 Catch:{ all -> 0x0085 }
        if (r7 == 0) goto L_0x0047;
    L_0x0043:
        if (r7 == r6) goto L_0x0047;
    L_0x0045:
        r6 = r7;
        goto L_0x003a;
    L_0x0047:
        r6 = r5.size();	 Catch:{ all -> 0x0085 }
        r7 = 0;
    L_0x004c:
        if (r7 >= r6) goto L_0x0068;
    L_0x004e:
        r8 = r5.get(r7);	 Catch:{ all -> 0x0085 }
        r8 = (java.lang.Throwable) r8;	 Catch:{ all -> 0x0085 }
        r9 = r1.contains(r8);	 Catch:{ all -> 0x0085 }
        if (r9 == 0) goto L_0x0062;
    L_0x005a:
        r4 = new java.lang.RuntimeException;	 Catch:{ all -> 0x0085 }
        r8 = "Duplicate found in causal chain so cropping to prevent loop ...";
        r4.<init>(r8);	 Catch:{ all -> 0x0085 }
        goto L_0x0065;
    L_0x0062:
        r1.add(r8);	 Catch:{ all -> 0x0085 }
    L_0x0065:
        r7 = r7 + 1;
        goto L_0x004c;
    L_0x0068:
        r3.initCause(r4);	 Catch:{ all -> 0x006b }
    L_0x006b:
        r4 = r3.getCause();	 Catch:{ all -> 0x0085 }
        if (r4 == 0) goto L_0x0016;
    L_0x0071:
        r5 = r10.c;	 Catch:{ all -> 0x0085 }
        if (r5 == r4) goto L_0x0016;
    L_0x0075:
        r3 = r4;
        r4 = r3.getCause();	 Catch:{ all -> 0x0085 }
        if (r4 == 0) goto L_0x0016;
    L_0x007c:
        if (r4 == r3) goto L_0x0016;
    L_0x007e:
        goto L_0x0075;
    L_0x007f:
        r10.c = r0;	 Catch:{ all -> 0x0085 }
    L_0x0081:
        r0 = r10.c;	 Catch:{ all -> 0x0085 }
        monitor-exit(r10);
        return r0;
    L_0x0085:
        r0 = move-exception;
        monitor-exit(r10);
        goto L_0x0089;
    L_0x0088:
        throw r0;
    L_0x0089:
        goto L_0x0088;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bbnf.getCause():java.lang.Throwable");
    }

    public final void printStackTrace() {
        ankx.a((Throwable) this, System.err);
    }

    public final void printStackTrace(PrintStream printStream) {
        a(new bbnk(printStream));
    }

    public final void printStackTrace(PrintWriter printWriter) {
        a(new bbnj(printWriter));
    }

    private final void a(bbnh bbnh) {
        StringBuilder stringBuilder = new StringBuilder(128);
        stringBuilder.append(this);
        stringBuilder.append(10);
        for (Object obj : getStackTrace()) {
            stringBuilder.append("\tat ");
            stringBuilder.append(obj);
            stringBuilder.append(10);
        }
        int i = 1;
        for (Throwable th : this.a) {
            stringBuilder.append("  ComposedException ");
            stringBuilder.append(i);
            stringBuilder.append(" :\n");
            a(stringBuilder, th, "\t");
            i++;
        }
        bbnh.a(stringBuilder.toString());
    }

    private final void a(StringBuilder stringBuilder, Throwable th, String str) {
        stringBuilder.append(str);
        stringBuilder.append(th);
        stringBuilder.append(10);
        for (Object obj : th.getStackTrace()) {
            stringBuilder.append("\t\tat ");
            stringBuilder.append(obj);
            stringBuilder.append(10);
        }
        if (th.getCause() != null) {
            stringBuilder.append("\tCaused by: ");
            a(stringBuilder, th.getCause(), "");
        }
    }
}
