package defpackage;

import android.net.Uri;

/* renamed from: akly */
final /* synthetic */ class akly implements cgr {
    private final bvn a;
    private final boolean b;
    private final aygk c;

    akly(bvn bvn, boolean z, aygk aygk) {
        this.a = bvn;
        this.b = z;
        this.c = aygk;
    }

    public final void a(int i, int i2) {
        Uri d;
        bvn bvn = this.a;
        boolean z = this.b;
        aygk aygk = this.c;
        if (i == aocf.UNSET_ENUM_VALUE || i2 == aocf.UNSET_ENUM_VALUE) {
            d = aklb.d(aygk);
            if (d != null) {
                d = d.buildUpon().appendQueryParameter("TargetSizeOriginal", "True").build();
            }
        } else {
            d = aklb.c(aygk, i, i2);
        }
        if (d != null) {
            d = d.buildUpon().appendQueryParameter("isFirstResource", String.valueOf(z)).build();
        }
        Throwable akkt = new akkt(bvn, d, "Glide");
        if (bvn != null) {
            bvn.a();
            for (Throwable a : bvn.a()) {
                ankx.a(akkt, a);
            }
        }
        akku.a(akkt);
    }
}
