package defpackage;

import com.google.android.libraries.youtube.player.PlayerUiModule;

/* renamed from: ahfs */
public final class ahfs implements baqa {
    private final bcaa a;

    private ahfs(bcaa bcaa) {
        this.a = bcaa;
    }

    public static ahfs a(PlayerUiModule playerUiModule, bcaa bcaa) {
        return new ahfs(bcaa);
    }

    public static ajkp a(ajam ajam) {
        Object ajkp = new ajkp();
        ajam.m().a = ajkp;
        return (ajkp) baqd.a(ajkp, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return ahfs.a((ajam) this.a.get());
    }
}
