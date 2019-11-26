package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

/* renamed from: bavx */
public final class bavx {
    public static final List a;
    public static final bavx b = bawa.OK.a();
    public static final bavx c = bawa.CANCELLED.a();
    public static final bavx d = bawa.UNKNOWN.a();
    public static final bavx e = bawa.DEADLINE_EXCEEDED.a();
    public static final bavx f = bawa.UNAUTHENTICATED.a();
    public static final bavx g = bawa.RESOURCE_EXHAUSTED.a();
    public static final bavx h = bawa.FAILED_PRECONDITION.a();
    public static final bavx i = bawa.INTERNAL.a();
    public static final bavx j = bawa.UNAVAILABLE.a();
    public static final baur k = baur.a("grpc-status", false, new bavz());
    public static final baur l = baur.a("grpc-message", false, p);
    private static final baut p = new bawc();
    public final bawa m;
    public final String n;
    public final Throwable o;

    public static bavx a(Throwable th) {
        for (Throwable th2 = (Throwable) amqw.a((Object) th, (Object) "t"); th2 != null; th2 = th2.getCause()) {
            if (th2 instanceof bawb) {
                return ((bawb) th2).a;
            }
            if (th2 instanceof bawe) {
                return ((bawe) th2).a;
            }
        }
        return d.b(th);
    }

    static String a(bavx bavx) {
        if (bavx.n == null) {
            return bavx.m.toString();
        }
        String valueOf = String.valueOf(bavx.m);
        String str = bavx.n;
        StringBuilder stringBuilder = new StringBuilder((valueOf.length() + 2) + String.valueOf(str).length());
        stringBuilder.append(valueOf);
        stringBuilder.append(": ");
        stringBuilder.append(str);
        return stringBuilder.toString();
    }

    private bavx(bawa bawa) {
        this(bawa, null, null);
    }

    private bavx(bawa bawa, String str, Throwable th) {
        this.m = (bawa) amqw.a((Object) bawa, (Object) "code");
        this.n = str;
        this.o = th;
    }

    public final bavx b(Throwable th) {
        return !amqq.a(this.o, th) ? new bavx(this.m, this.n, th) : this;
    }

    public final bavx a(String str) {
        return !amqq.a(this.n, str) ? new bavx(this.m, str, this.o) : this;
    }

    public final bavx b(String str) {
        if (str == null) {
            return this;
        }
        String str2 = this.n;
        if (str2 == null) {
            return new bavx(this.m, str, this.o);
        }
        bawa bawa = this.m;
        StringBuilder stringBuilder = new StringBuilder((str2.length() + 1) + str.length());
        stringBuilder.append(str2);
        stringBuilder.append("\n");
        stringBuilder.append(str);
        return new bavx(bawa, stringBuilder.toString(), this.o);
    }

    public final boolean a() {
        return bawa.OK == this.m;
    }

    public final bawe b() {
        return new bawe(this);
    }

    public final bawe a(baum baum) {
        return new bawe(this, baum);
    }

    public final String toString() {
        amqo a = amql.a(this);
        a.a("code", this.m.name());
        a.a("description", this.n);
        Object obj = this.o;
        if (obj != null) {
            obj = amrs.c(obj);
        }
        a.a("cause", obj);
        return a.toString();
    }

    static {
        Boolean.parseBoolean(System.getProperty("io.grpc.Status.failOnEqualsForTest", "false"));
        TreeMap treeMap = new TreeMap();
        bawa[] values = bawa.values();
        int length = values.length;
        int i = 0;
        while (i < length) {
            bawa bawa = values[i];
            bavx bavx = (bavx) treeMap.put(Integer.valueOf(bawa.r), new bavx(bawa));
            if (bavx == null) {
                i++;
            } else {
                String name = bavx.m.name();
                String name2 = bawa.name();
                StringBuilder stringBuilder = new StringBuilder((String.valueOf(name).length() + 34) + String.valueOf(name2).length());
                stringBuilder.append("Code value duplication between ");
                stringBuilder.append(name);
                stringBuilder.append(" & ");
                stringBuilder.append(name2);
                throw new IllegalStateException(stringBuilder.toString());
            }
        }
        a = Collections.unmodifiableList(new ArrayList(treeMap.values()));
        bawa.INVALID_ARGUMENT.a();
        bawa.NOT_FOUND.a();
        bawa.ALREADY_EXISTS.a();
        bawa.PERMISSION_DENIED.a();
        bawa.ABORTED.a();
        bawa.OUT_OF_RANGE.a();
        bawa.UNIMPLEMENTED.a();
        bawa.DATA_LOSS.a();
    }
}
