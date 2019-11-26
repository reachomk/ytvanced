package defpackage;

import android.content.Context;
import com.google.android.libraries.youtube.player.PlayerUiModule;

/* renamed from: ahfq */
public final class ahfq implements baqa {
    private final bcaa a;

    private ahfq(bcaa bcaa) {
        this.a = bcaa;
    }

    public static ahfq a(PlayerUiModule playerUiModule, bcaa bcaa) {
        return new ahfq(bcaa);
    }

    public static qk a(Context context) {
        return (qk) baqd.a(qk.a(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return ahfq.a((Context) this.a.get());
    }
}
