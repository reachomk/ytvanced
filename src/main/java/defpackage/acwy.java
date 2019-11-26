package defpackage;

import java.io.IOException;

/* renamed from: acwy */
public final class acwy {
    public static auko a(aoca aoca) {
        if (aoca != null) {
            byte[] e;
            amqw.a((Object) aoca);
            amqw.a(true, (Object) "fieldNumber must be > 0");
            aobv a = aobv.a(aocf.toByteArray(aoca));
            while (!a.l()) {
                try {
                    int a2 = a.a();
                    int b = aobj.b(a2);
                    int a3 = aobj.a(a2);
                    if (b == 999) {
                        if (a3 == 2) {
                            e = a.e();
                            break;
                        }
                    }
                    a.b(a2);
                } catch (IOException unused) {
                    String valueOf = String.valueOf(aoca.getClass());
                    StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 43);
                    stringBuilder.append("Error while getting field 999 from ");
                    stringBuilder.append(valueOf);
                    xtl.d(stringBuilder.toString());
                }
            }
            e = null;
            if (e != null) {
                try {
                    return (auko) anxl.parseFrom(auko.f, e, anxa.c());
                } catch (anyg unused2) {
                }
            }
        }
        return null;
    }

    public static auko a(anze anze) {
        if (anze != null) {
            anvu l;
            amqw.a((Object) anze);
            amqw.a(true, (Object) "fieldNumber must be > 0");
            anwf a = anwf.a(anze.toByteArray());
            while (!a.u()) {
                try {
                    int a2 = a.a();
                    int b = aobj.b(a2);
                    int a3 = aobj.a(a2);
                    if (b == 999) {
                        if (a3 == 2) {
                            l = a.l();
                            break;
                        }
                    }
                    a.b(a2);
                } catch (IOException unused) {
                    String valueOf = String.valueOf(anze.getClass());
                    StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 43);
                    stringBuilder.append("Error while getting field 999 from ");
                    stringBuilder.append(valueOf);
                    xtl.d(stringBuilder.toString());
                }
            }
            l = null;
            if (l != null) {
                try {
                    return (auko) anxl.parseFrom(auko.f, l, anxa.c());
                } catch (anyg unused2) {
                }
            }
        }
        return null;
    }
}
