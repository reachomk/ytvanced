package defpackage;

import android.content.Context;
import com.google.android.libraries.youtube.player.PlayerUiModule;
import java.util.List;

/* renamed from: ahfp */
public final class ahfp implements baqa {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;
    private final bcaa d;
    private final bcaa e;
    private final bcaa f;
    private final bcaa g;
    private final bcaa h;
    private final bcaa i;
    private final bcaa j;

    private ahfp(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5, bcaa bcaa6, bcaa bcaa7, bcaa bcaa8, bcaa bcaa9, bcaa bcaa10) {
        this.a = bcaa;
        this.b = bcaa2;
        this.c = bcaa3;
        this.d = bcaa4;
        this.e = bcaa5;
        this.f = bcaa6;
        this.g = bcaa7;
        this.h = bcaa8;
        this.i = bcaa9;
        this.j = bcaa10;
    }

    public static ahfp a(PlayerUiModule playerUiModule, bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5, bcaa bcaa6, bcaa bcaa7, bcaa bcaa8, bcaa bcaa9, bcaa bcaa10) {
        return new ahfp(bcaa, bcaa2, bcaa3, bcaa4, bcaa5, bcaa6, bcaa7, bcaa8, bcaa9, bcaa10);
    }

    public static aisx a(Context context, bcaa bcaa, ajkp ajkp, ajko ajko, ahhq ahhq, bcaa bcaa2, aiss aiss, xsc xsc, List list, zyw zyw) {
        return (aisx) baqd.a((Object) new aisx(context, bcaa, ajkp, ajko, ahhq.g(), bcaa2, aiss, xsc, list, zyw), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return ahfp.a((Context) this.a.get(), this.b, (ajkp) this.c.get(), (ajko) this.d.get(), (ahhq) this.e.get(), this.f, (aiss) this.g.get(), (xsc) this.h.get(), (List) this.i.get(), (zyw) this.j.get());
    }
}
