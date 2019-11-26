package defpackage;

import java.util.List;

/* renamed from: smq */
final /* synthetic */ class smq implements bbnv {
    private final smh a;
    private final List b;
    private final syc c;
    private final syi d;
    private final byte[] e;
    private final bapc f;

    smq(smh smh, List list, syc syc, syi syi, byte[] bArr, bapc bapc) {
        this.a = smh;
        this.b = list;
        this.c = syc;
        this.d = syi;
        this.e = bArr;
        this.f = bapc;
    }

    public final Object a(Object obj) {
        smh smh = this.a;
        List<String> list = this.b;
        syc syc = this.c;
        syi syi = this.d;
        byte[] bArr = this.e;
        bapc bapc = this.f;
        if (smh.e) {
            for (String str : list) {
                byte[] a = smh.c.a(str);
                if (a != null) {
                    smh.d.jni_setTemplateConfig(str, a);
                } else {
                    StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 33);
                    stringBuilder.append("Failed to load \"");
                    stringBuilder.append(str);
                    stringBuilder.append("\" from Dev Server");
                    throw new sxf(stringBuilder.toString());
                }
            }
        }
        syc.c();
        syh a2 = syi.a(bArr, bapc);
        syc.d();
        return a2;
    }
}
