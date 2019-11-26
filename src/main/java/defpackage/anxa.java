package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: anxa */
public class anxa {
    public static final anxa a = new anxa((byte) 0);
    private static volatile boolean b = false;
    private static volatile anxa c;
    private static volatile anxa d;
    private final Map e;

    public static anxa a() {
        if (anwx.a != null) {
            try {
                return anwx.a("newInstance");
            } catch (Exception unused) {
            }
        }
        return new anxa();
    }

    public static anxa b() {
        anxa anxa = c;
        if (anxa == null) {
            synchronized (anxa.class) {
                anxa = c;
                if (anxa == null) {
                    anxa = anwx.a();
                    c = anxa;
                }
            }
        }
        return anxa;
    }

    public static anxa c() {
        Class cls = anxa.class;
        anxa anxa = d;
        if (anxa == null) {
            synchronized (cls) {
                anxa = d;
                if (anxa == null) {
                    anxa anxa2 = null;
                    if (anwx.a != null) {
                        try {
                            anxa2 = anwx.a("loadGeneratedRegistry");
                        } catch (Exception unused) {
                        }
                    }
                    if (anxa2 == null) {
                        anxa2 = anxj.a(cls);
                    }
                    if (anxa2 == null) {
                        anxa2 = anwx.a();
                    }
                    d = anxa2;
                    anxa = anxa2;
                }
            }
        }
        return anxa;
    }

    public anxr a(anze anze, int i) {
        return (anxr) this.e.get(new anwz(anze, i));
    }

    public final void a(anxr anxr) {
        this.e.put(new anwz(anxr.a, anxr.a()), anxr);
    }

    anxa() {
        this.e = new HashMap();
    }

    anxa(byte b) {
        this.e = Collections.emptyMap();
    }

    static {
        try {
            Class.forName("com.google.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
        }
    }
}
