package defpackage;

import android.net.Uri;

/* renamed from: ehz */
public final class ehz extends ehx {
    private final xci f;
    private final bcaa g;

    public ehz(bcaa bcaa, xsc xsc, xci xci) {
        super(bcaa, xsc);
        this.g = (bcaa) amqw.a((Object) bcaa);
        this.f = (xci) amqw.a((Object) xci);
    }

    public final abhp a(Uri uri, String str) {
        abho abho = (abho) this.g.get();
        return new abhp(abho.c, abho.d.c(), uri, str);
    }

    public final void a(Uri uri, String str, afsw afsw) {
        a(a(uri, str), afsw);
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void a() {
        this.f.d(new efi());
    }
}
