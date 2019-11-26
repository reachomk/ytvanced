package defpackage;

import java.nio.charset.StandardCharsets;

/* renamed from: afvi */
public final class afvi implements afvk {
    private final afvh a;

    public afvi(afvh afvh) {
        this.a = afvh;
    }

    public final boolean a() {
        return true;
    }

    public final void a(aqvv aqvv) {
        afvh afvh = this.a;
        afvh.b.edit().putLong("DeviceContextCache.KEY_TIMESTAMP", afvh.a.a()).putString("DeviceContextCache.KEY_PROTO", new String(aqvv.toByteArray(), StandardCharsets.UTF_8)).apply();
    }
}
