package defpackage;

import android.net.Uri.Builder;

/* renamed from: aaht */
public final class aaht {
    public final arlx a;
    private final Builder b;
    private final String c;
    private final long d;

    public aaht() {
        this.a = (arlx) arlv.E.createBuilder();
        this.b = new Builder();
        this.c = null;
        this.d = 0;
    }

    public final aahr a() {
        this.a.a(this.b.build().toString());
        return new aahr((arlv) ((anxl) this.a.build()), this.c, this.d, false);
    }

    public /* synthetic */ aaht(aahr aahr) {
        this.a = (arlx) ((anxo) aahr.a.toBuilder());
        this.b = aahr.d.buildUpon();
        this.c = aahr.b;
        this.d = aahr.c;
    }
}
