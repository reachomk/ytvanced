package defpackage;

import java.util.Set;

/* renamed from: adcc */
public final class adcc extends acxv {
    private String f = "unknown";

    public final dik a() {
        a("method_start", this.f);
        return super.a();
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(xbb xbb, Set set, Set set2) {
        if (xbb instanceof adcd) {
            this.f = "play";
        } else if (xbb instanceof adce) {
            this.f = "pause";
        } else if (xbb instanceof adcg) {
            this.f = "seekTo";
        }
        super.a(xbb, set, set2);
    }

    /* synthetic */ adcc(int i, boolean z) {
        super("mdx_cast", i, z);
    }
}
