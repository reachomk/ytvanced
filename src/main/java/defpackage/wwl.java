package defpackage;

import android.content.ContentResolver;
import android.content.Context;

/* renamed from: wwl */
public final class wwl implements baqa {
    private final bcaa a;

    private wwl(bcaa bcaa) {
        this.a = bcaa;
    }

    public static wwl a(bcaa bcaa) {
        return new wwl(bcaa);
    }

    public static ContentResolver a(Context context) {
        return (ContentResolver) baqd.a(context.getContentResolver(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return wwl.a((Context) this.a.get());
    }
}
