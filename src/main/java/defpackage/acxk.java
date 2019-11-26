package defpackage;

/* renamed from: acxk */
public final class acxk {
    public static void a(arml arml, acvx acvx) {
        if (arml != null && arml.b.size() > 0) {
            int size = arml.b.size();
            for (int i = 0; i < size; i++) {
                armp armp = (armp) arml.b.get(i);
                if ((armp.a & 512) != 0) {
                    auko auko = armp.l;
                    if (auko == null) {
                        auko = auko.f;
                    }
                    acvx.a(auko.b.d(), null);
                }
            }
        }
    }
}
