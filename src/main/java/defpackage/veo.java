package defpackage;

import android.text.TextUtils;

/* renamed from: veo */
public final class veo implements veq {
    private final ven a;
    private final vem b;

    public veo(ven ven, vem vem) {
        this.a = ven;
        this.b = vem;
    }

    public final aafy a(vqy vqy, String str, String str2, boolean z, xvk xvk) {
        String str3;
        ven ven = this.a;
        vsd vsd = (vsd) vqy;
        byte[] bArr = vsd.i;
        if (vsd.c.a() == null) {
            str3 = "";
        } else {
            str3 = vsd.c.a();
        }
        return ven.a(str, bArr, str3, str2, -1, vqy.a(), ((vsd) vqy).d, z, xvk);
    }

    public final aafy a(String str, byte[] bArr, String str2, String str3, long j, int i, boolean z, xvk xvk) {
        return this.a.a(str, bArr, str2, str3, j, -2, i, z, xvk);
    }

    public final aafv a(aaga aaga, aakj aakj) {
        vem vem = this.b;
        xak.b();
        String d = aaga.d();
        byte[] j = aaga.j();
        String h = aaga.h();
        String i = aaga.i();
        abkg a = vem.b.a();
        a.n();
        a.c(d);
        if (j == null || j.length <= 0) {
            xtl.c("Ad Watch Next Request Missing Tracking Params. See b/22612847");
        } else {
            a.a(j);
        }
        String str = "";
        if (TextUtils.isEmpty(h)) {
            h = str;
        }
        a.d(h);
        if (!TextUtils.isEmpty(i)) {
            str = i;
        }
        a.e(str);
        try {
            aafv a2 = vem.b.a(a);
            afpc.a(2, afpf.ad, "AdWatchNextFetcher has no InteractionLogger. This should never happen.");
            vem.a.execute(new vep(vem, a2, aakj, aaga));
            return a2;
        } catch (aanq e) {
            String valueOf = String.valueOf(e);
            StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 35);
            stringBuilder.append("Error fetching AdWatchNextRequest: ");
            stringBuilder.append(valueOf);
            xtl.c(stringBuilder.toString());
            return null;
        }
    }
}
