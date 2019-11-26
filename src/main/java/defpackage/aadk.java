package defpackage;

import java.io.IOException;

/* renamed from: aadk */
public abstract class aadk {
    public abstract String a();

    public abstract String b();

    public abstract aadq c();

    public abstract int d();

    public static aadn a(aadd aadd, arfo arfo) {
        aada aada = new aada();
        String str = arfo.b;
        if (str != null) {
            aada.a = str;
            int a = arga.a(arfo.c);
            boolean z = true;
            if (a == 0) {
                a = 1;
            }
            aada.a(a);
            if ((arfo.a & 8) != 0) {
                try {
                    anvu l;
                    str = arfo.b;
                    anvf anvf = arfo.d;
                    if (anvf == null) {
                        anvf = arfy.a;
                    }
                    anwf g = anvf.toByteString().g();
                    try {
                        if (aobj.a(g.a()) != 2) {
                            z = false;
                        }
                        amqw.b(z, (Object) "Any field within EntityMutationPayload must have WIRETYPE_LENGTH_DELIMITED tag");
                        l = g.l();
                        amqw.b(g.u(), (Object) "There can be only one field in EntityMutationPayload");
                    } catch (IOException unused) {
                        l = null;
                    }
                    if (l != null) {
                        aada.b = ((aaeq) aadd.b.get()).a(str, l.d()).a(aadd.a);
                    } else {
                        String str2 = "Failed to read the extension for";
                        String valueOf = String.valueOf(str);
                        throw new anyg(valueOf.length() == 0 ? new String(str2) : str2.concat(valueOf));
                    }
                } catch (anyg e) {
                    throw new RuntimeException(e);
                }
            }
            return aada;
        }
        throw new NullPointerException("Null entityKey");
    }
}
