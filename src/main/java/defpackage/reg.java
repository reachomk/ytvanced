package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: reg */
public final class reg {
    public static volatile reg a = null;
    public static final reg b = new reg((byte) 0);
    private static volatile boolean d = false;
    public final Map c;

    public static reg a() {
        return red.a();
    }

    reg() {
        this.c = new HashMap();
    }

    private reg(byte b) {
        this.c = Collections.emptyMap();
    }

    static {
        try {
            Class.forName("com.google.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
        }
    }
}
