package defpackage;

import android.net.Uri.Builder;
import android.text.TextUtils;

/* renamed from: aexo */
final class aexo extends aext {
    private final aajf e;
    private final /* synthetic */ aexj f;

    aexo(aexj aexj, aajf aajf) {
        this.f = aexj;
        super(aexj);
        this.e = aajf;
    }

    /* Access modifiers changed, original: protected|final */
    public final void bw_() {
        synchronized (this.f) {
            aexj aexj = this.f;
            if (!(aexj.s == null && aexj.t == null)) {
                aepe.a("Non-null init segment loaders.");
                f();
            }
            Builder buildUpon = this.e.a.buildUpon();
            if (!TextUtils.isEmpty(this.e.b)) {
                buildUpon.appendQueryParameter("cpn", this.e.b);
            }
            aajj aajj = this.e.c;
            aexj aexj2 = this.f;
            aexj2.t = aexj2.f.a.a(aexj2.d, buildUpon, "134", aajj);
            this.f.t.a();
            this.f.m.d();
            aexj2 = this.f;
            aexj2.s = aexj2.f.a.a(aexj2.d, buildUpon, "140", aajj);
            this.f.s.a();
            this.f.m.e();
        }
    }
}
