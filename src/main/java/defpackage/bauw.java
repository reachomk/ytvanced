package defpackage;

import java.io.InputStream;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: bauw */
public final class bauw {
    public final baux a;
    public final String b;
    public final String c;
    public final bauy d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    private final bauy h;
    private final Object i;

    public final InputStream a(Object obj) {
        return this.h.a(obj);
    }

    public static String a(String str, String str2) {
        str = (String) amqw.a((Object) str, (Object) "fullServiceName");
        str2 = (String) amqw.a((Object) str2, (Object) "methodName");
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 1) + String.valueOf(str2).length());
        stringBuilder.append(str);
        stringBuilder.append("/");
        stringBuilder.append(str2);
        return stringBuilder.toString();
    }

    public static bauv a() {
        bauv bauv = new bauv();
        bauv.a = null;
        bauv.b = null;
        return bauv;
    }

    public final String toString() {
        amqo a = amql.a(this);
        a.a("fullMethodName", this.b);
        a.a("type", this.a);
        a.a("idempotent", false);
        a.a("safe", false);
        a.a("sampledToLocalTracing", this.g);
        a.a("requestMarshaller", this.h);
        a.a("responseMarshaller", this.d);
        a.a("schemaDescriptor", null);
        a.a = true;
        return a.toString();
    }

    /* synthetic */ bauw(baux baux, String str, bauy bauy, bauy bauy2, boolean z) {
        AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(1);
        this.a = (baux) amqw.a((Object) baux, (Object) "type");
        Object obj = "fullMethodName";
        this.b = (String) amqw.a((Object) str, obj);
        int lastIndexOf = ((String) amqw.a((Object) str, obj)).lastIndexOf(47);
        this.c = lastIndexOf != -1 ? str.substring(0, lastIndexOf) : null;
        this.h = (bauy) amqw.a((Object) bauy, (Object) "requestMarshaller");
        this.d = (bauy) amqw.a((Object) bauy2, (Object) "responseMarshaller");
        this.i = null;
        this.e = false;
        this.f = false;
        this.g = z;
        amqw.a(true, (Object) "Only unary methods can be specified safe");
    }
}
