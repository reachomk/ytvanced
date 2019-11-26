package defpackage;

import java.io.IOException;

/* renamed from: aadf */
public final class aadf implements aalw {
    private static final anxa a;
    private static final int b = ((arfm.c.a() << 3) | 2);
    private final aadg c;
    private final aaep d;

    public aadf(aadg aadg, aaep aaep) {
        this.c = aadg;
        this.d = aaep;
    }

    public final void a(arnm arnm, asic asic) {
        arfm arfm;
        anwf g = arnm.toByteString().g();
        while (true) {
            arfm = null;
            try {
                if (!g.u()) {
                    int a = g.a();
                    if (a == b) {
                        arfm = (arfm) g.a(arfm.b.getParserForType(), a);
                        break;
                    }
                    g.b(a);
                } else {
                    break;
                }
            } catch (IOException e) {
                xtl.a("[ENTITY] Error parsing batch update.", e);
            }
        }
        String str = "UTP";
        String str2 = "[ENTITY] ";
        if (arfm == null) {
            String str3 = "No batch update data found on transport packet.";
            if (str3.length() == 0) {
                String str4 = new String(str2);
            } else {
                str2.concat(str3);
            }
            this.d.a(str, str3);
            return;
        }
        String format = String.format("Processing %s mutations: %s ", new Object[]{Integer.valueOf(arfm.a.size()), new amst(arfm.a, aade.a)});
        String valueOf = String.valueOf(format);
        if (valueOf.length() == 0) {
            valueOf = new String(str2);
        } else {
            str2.concat(valueOf);
        }
        this.d.a(str, format);
        this.c.a(arfm, asic.e);
    }

    public final void a(arnm arnm) {
        a(arnm, asic.k);
    }

    static {
        anxa a = anxa.a();
        a.a(arfm.c);
        a = a;
    }
}
