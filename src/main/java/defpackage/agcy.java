package defpackage;

import java.util.Locale;

/* renamed from: agcy */
final /* synthetic */ class agcy implements Runnable {
    private final agci a;
    private final String b;
    private final byte[] c;
    private final String d;
    private final boolean e;
    private final boolean f;

    agcy(agci agci, String str, byte[] bArr, String str2, boolean z, boolean z2) {
        this.a = agci;
        this.b = str;
        this.c = bArr;
        this.d = str2;
        this.e = z;
        this.f = z2;
    }

    public final void run() {
        agci agci = this.a;
        String str = this.b;
        byte[] bArr = this.c;
        String str2 = this.d;
        boolean z = this.e;
        boolean z2 = this.f;
        agqy a = agci.a(str);
        if (a == null) {
            xtl.c("Snapshot missing for video queued for verification");
        } else if (a.l == agqf.REQUIRES_CONTENT_VERIFICATION) {
            agdo agdo = (agdo) agci.n.get();
            xak.b();
            agpw agpw = new agpw();
            agxj.a(agpw, bArr);
            agxj.a(agpw, str);
            agxj.a(agpw, 5);
            agxj.d(agpw, agdo.b.a());
            agxj.a(agpw, agqf.REQUIRES_CONTENT_VERIFICATION);
            agxj.f(agpw, z2);
            if (str2 != null) {
                agxj.e(agpw, str2);
            }
            agxj.e(agpw, z);
            ((agxq) agdo.d.b(agdo.a)).a(agdo.c, String.format(Locale.US, "%s:%s:cv", new Object[]{agdo.c, str}), 250, agpw);
        } else {
            String valueOf = String.valueOf(a.l);
            StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 51);
            stringBuilder.append("Content verification requested for video in state: ");
            stringBuilder.append(valueOf);
            xtl.d(stringBuilder.toString());
        }
    }
}
