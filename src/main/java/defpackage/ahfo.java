package defpackage;

import com.google.android.libraries.youtube.player.PlayerUiModule;

/* renamed from: ahfo */
public final class ahfo implements baqa {
    private final bcaa a;

    private ahfo(bcaa bcaa) {
        this.a = bcaa;
    }

    public static ahfo a(PlayerUiModule playerUiModule, bcaa bcaa) {
        return new ahfo(bcaa);
    }

    public static wq a(ajlg ajlg) {
        return (wq) baqd.a(ajlg.e(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return ahfo.a((ajlg) this.a.get());
    }
}
