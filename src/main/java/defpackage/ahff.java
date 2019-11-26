package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.libraries.youtube.player.background.service.BackgroundPlayerService;

/* renamed from: ahff */
public final class ahff implements baqa {
    private final bcaa a;

    private ahff(bcaa bcaa) {
        this.a = bcaa;
    }

    public static ahff a(bcaa bcaa) {
        return new ahff(bcaa);
    }

    public static Intent a(Context context) {
        return (Intent) baqd.a(new Intent(context, BackgroundPlayerService.class), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return ahff.a((Context) this.a.get());
    }
}
