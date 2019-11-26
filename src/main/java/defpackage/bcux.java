package defpackage;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: bcux */
public final class bcux extends RuntimeException {
    public static final long serialVersionUID = 3026362227162912146L;
    public final List a;
    private final String b;
    private Throwable c;

    public bcux(Collection collection) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            for (Throwable th : collection) {
                if (th instanceof bcux) {
                    linkedHashSet.addAll(((bcux) th).a);
                } else if (th != null) {
                    linkedHashSet.add(th);
                } else {
                    linkedHashSet.add(new NullPointerException());
                }
            }
        } else {
            linkedHashSet.add(new NullPointerException());
        }
        arrayList.addAll(linkedHashSet);
        this.a = Collections.unmodifiableList(arrayList);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.a.size());
        stringBuilder.append(" exceptions occurred. ");
        this.b = stringBuilder.toString();
    }

    public bcux(Throwable... thArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 2; i++) {
            Object obj = thArr[i];
            if (obj instanceof bcux) {
                linkedHashSet.addAll(((bcux) obj).a);
            } else if (obj != null) {
                linkedHashSet.add(obj);
            } else {
                linkedHashSet.add(new NullPointerException());
            }
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

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0074  */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x006e */
    /* JADX WARNING: Can't wrap try/catch for region: R(9:10|(1:12)(1:(1:(2:14|(1:17)(1:52)))(0))|18|(3:20|(2:22|54)(2:23|53)|24)|25|26|27|28|(2:30|47)(1:(2:32|(2:33|(1:36)(1:50)))(1:48))) */
    public final synchronized java.lang.Throwable getCause() {
        /*
        r10 = this;
        monitor-enter(r10);
        r0 = r10.c;	 Catch:{ all -> 0x008b }
        if (r0 != 0) goto L_0x0087;
    L_0x0005:
        r0 = new bcuw;	 Catch:{ all -> 0x008b }
        r0.<init>();	 Catch:{ all -> 0x008b }
        r1 = new java.util.HashSet;	 Catch:{ all -> 0x008b }
        r1.<init>();	 Catch:{ all -> 0x008b }
        r2 = r10.a;	 Catch:{ all -> 0x008b }
        r2 = r2.iterator();	 Catch:{ all -> 0x008b }
        r3 = r0;
    L_0x0016:
        r4 = r2.hasNext();	 Catch:{ all -> 0x008b }
        if (r4 == 0) goto L_0x0085;
    L_0x001c:
        r4 = r2.next();	 Catch:{ all -> 0x008b }
        r4 = (java.lang.Throwable) r4;	 Catch:{ all -> 0x008b }
        r5 = r1.contains(r4);	 Catch:{ all -> 0x008b }
        if (r5 == 0) goto L_0x0029;
    L_0x0028:
        goto L_0x0016;
    L_0x0029:
        r1.add(r4);	 Catch:{ all -> 0x008b }
        r5 = new java.util.ArrayList;	 Catch:{ all -> 0x008b }
        r5.<init>();	 Catch:{ all -> 0x008b }
        r6 = r4.getCause();	 Catch:{ all -> 0x008b }
        if (r6 != 0) goto L_0x0038;
    L_0x0037:
        goto L_0x004a;
    L_0x0038:
        if (r6 == r4) goto L_0x004a;
    L_0x003a:
        r5.add(r6);	 Catch:{ all -> 0x008b }
        r7 = r6.getCause();	 Catch:{ all -> 0x008b }
        if (r7 == 0) goto L_0x004a;
    L_0x0043:
        if (r7 == r6) goto L_0x004a;
    L_0x0045:
        r6 = r6.getCause();	 Catch:{ all -> 0x008b }
        goto L_0x003a;
    L_0x004a:
        r6 = r5.size();	 Catch:{ all -> 0x008b }
        r7 = 0;
    L_0x004f:
        if (r7 >= r6) goto L_0x006b;
    L_0x0051:
        r8 = r5.get(r7);	 Catch:{ all -> 0x008b }
        r8 = (java.lang.Throwable) r8;	 Catch:{ all -> 0x008b }
        r9 = r1.contains(r8);	 Catch:{ all -> 0x008b }
        if (r9 == 0) goto L_0x0065;
    L_0x005d:
        r4 = new java.lang.RuntimeException;	 Catch:{ all -> 0x008b }
        r8 = "Duplicate found in causal chain so cropping to prevent loop ...";
        r4.<init>(r8);	 Catch:{ all -> 0x008b }
        goto L_0x0068;
    L_0x0065:
        r1.add(r8);	 Catch:{ all -> 0x008b }
    L_0x0068:
        r7 = r7 + 1;
        goto L_0x004f;
    L_0x006b:
        r3.initCause(r4);	 Catch:{ all -> 0x006e }
    L_0x006e:
        r4 = r3.getCause();	 Catch:{ all -> 0x008b }
        if (r4 != 0) goto L_0x0075;
    L_0x0074:
        goto L_0x0016;
    L_0x0075:
        if (r4 == r3) goto L_0x0016;
    L_0x0077:
        r3 = r4;
    L_0x0078:
        r4 = r3.getCause();	 Catch:{ all -> 0x008b }
        if (r4 == 0) goto L_0x0016;
    L_0x007e:
        if (r4 == r3) goto L_0x0016;
    L_0x0080:
        r3 = r3.getCause();	 Catch:{ all -> 0x008b }
        goto L_0x0078;
    L_0x0085:
        r10.c = r0;	 Catch:{ all -> 0x008b }
    L_0x0087:
        r0 = r10.c;	 Catch:{ all -> 0x008b }
        monitor-exit(r10);
        return r0;
    L_0x008b:
        r0 = move-exception;
        monitor-exit(r10);
        goto L_0x008f;
    L_0x008e:
        throw r0;
    L_0x008f:
        goto L_0x008e;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bcux.getCause():java.lang.Throwable");
    }

    public final void printStackTrace() {
        ankx.a((Throwable) this, System.err);
    }

    public final void printStackTrace(PrintStream printStream) {
        a(new bcuy(printStream));
    }

    public final void printStackTrace(PrintWriter printWriter) {
        a(new bcvb(printWriter));
    }

    private final void a(bcuz bcuz) {
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
        synchronized (bcuz.a()) {
            bcuz.a(stringBuilder.toString());
        }
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
