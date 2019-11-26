package defpackage;

import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: vmn */
public final class vmn implements wal {
    public static final long a = TimeUnit.MINUTES.toMillis(10);
    public final vmr b;

    public vmn(vmr vmr) {
        this.b = vmr;
    }

    public final Map a() {
        zj zjVar = new zj(1);
        zjVar.put(c(), b());
        return zjVar;
    }

    public final String a(String str) {
        return this.b.a(str);
    }

    public final String b() {
        return this.b.c();
    }

    public final String c() {
        return this.b.d();
    }

    public final String d() {
        String f = this.b.f();
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(f).length() + 22);
        stringBuilder.append("sdkv=");
        stringBuilder.append(f);
        stringBuilder.append("&output=xml_vast2");
        return new StringBuilder(stringBuilder.toString()).toString();
    }
}
