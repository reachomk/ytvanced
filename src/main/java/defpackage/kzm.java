package defpackage;

import com.google.android.libraries.youtube.common.ui.LoadingFrameLayout;

/* renamed from: kzm */
final class kzm implements afsw {
    private final akpk a;
    private final LoadingFrameLayout b;
    private final /* synthetic */ kzb c;

    public kzm(kzb kzb, akpk akpk, LoadingFrameLayout loadingFrameLayout) {
        this.c = kzb;
        this.a = akpk;
        this.b = loadingFrameLayout;
    }

    public final void a(bqn bqn) {
        xtl.a("Error adding video to playlist", (Throwable) bqn);
        this.b.a(this.c.f.a((Throwable) bqn), true);
    }
}
