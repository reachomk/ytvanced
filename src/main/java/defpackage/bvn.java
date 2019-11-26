package defpackage;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: bvn */
public final class bvn extends Exception {
    private static final StackTraceElement[] a = new StackTraceElement[0];
    public static final long serialVersionUID = 1;
    private final List b;
    private bsm c;
    private Class d;
    private String e;
    private int f;

    public bvn(String str) {
        this(str, Collections.emptyList());
    }

    public final Throwable fillInStackTrace() {
        return this;
    }

    public bvn(String str, Throwable th) {
        this(str, Collections.singletonList(th));
    }

    public bvn(String str, List list) {
        this.e = str;
        setStackTrace(a);
        this.b = list;
    }

    public final List a() {
        List arrayList = new ArrayList();
        a((Throwable) this, arrayList);
        return arrayList;
    }

    private final void a(Throwable th, List list) {
        if (th instanceof bvn) {
            for (Throwable a : ((bvn) th).b) {
                a(a, list);
            }
            return;
        }
        list.add(th);
    }

    public final void printStackTrace() {
        ankx.a((Throwable) this, System.err);
    }

    public final void printStackTrace(PrintStream printStream) {
        a(printStream);
    }

    public final void printStackTrace(PrintWriter printWriter) {
        a(printWriter);
    }

    private final void a(Appendable appendable) {
        bvn.a((Throwable) this, appendable);
        List list = this.b;
        Appendable bvq = new bvq(appendable);
        try {
            int size = list.size();
            int i = 0;
            while (i < size) {
                bvq.append("Cause (");
                int i2 = i + 1;
                bvq.append(String.valueOf(i2));
                bvq.append(" of ");
                bvq.append(String.valueOf(size));
                bvq.append("): ");
                Throwable th = (Throwable) list.get(i);
                if (th instanceof bvn) {
                    ((bvn) th).a(bvq);
                } else {
                    bvn.a(th, bvq);
                }
                i = i2;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public final String getMessage() {
        String valueOf;
        StringBuilder stringBuilder;
        StringBuilder stringBuilder2 = new StringBuilder(71);
        stringBuilder2.append(this.e);
        Class cls = this.d;
        String str = ", ";
        String str2 = "";
        if (cls != null) {
            valueOf = String.valueOf(cls);
            stringBuilder = new StringBuilder(valueOf.length() + 2);
            stringBuilder.append(str);
            stringBuilder.append(valueOf);
            valueOf = stringBuilder.toString();
        } else {
            valueOf = str2;
        }
        stringBuilder2.append(valueOf);
        int i = this.f;
        if (i != 0) {
            valueOf = bsf.a(i);
            stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 2);
            stringBuilder.append(str);
            stringBuilder.append(valueOf);
            valueOf = stringBuilder.toString();
        } else {
            valueOf = str2;
        }
        stringBuilder2.append(valueOf);
        bsm bsm = this.c;
        if (bsm != null) {
            valueOf = String.valueOf(bsm);
            StringBuilder stringBuilder3 = new StringBuilder(valueOf.length() + 2);
            stringBuilder3.append(str);
            stringBuilder3.append(valueOf);
            str2 = stringBuilder3.toString();
        }
        stringBuilder2.append(str2);
        List<Throwable> a = a();
        if (a.isEmpty()) {
            return stringBuilder2.toString();
        }
        if (a.size() == 1) {
            stringBuilder2.append("\nThere was 1 cause:");
        } else {
            stringBuilder2.append("\nThere were ");
            stringBuilder2.append(a.size());
            stringBuilder2.append(" causes:");
        }
        for (Throwable th : a) {
            stringBuilder2.append(10);
            stringBuilder2.append(th.getClass().getName());
            stringBuilder2.append('(');
            stringBuilder2.append(th.getMessage());
            stringBuilder2.append(')');
        }
        stringBuilder2.append("\n call GlideException#logRootCauses(String) for more detail");
        return stringBuilder2.toString();
    }

    private static void a(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append(10);
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(bsm bsm, int i, Class cls) {
        this.c = bsm;
        this.f = i;
        this.d = cls;
    }
}
