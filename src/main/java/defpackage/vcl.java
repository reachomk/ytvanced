package defpackage;

import android.content.Context;

/* renamed from: vcl */
public final class vcl implements baqa {
    private final bcaa a;

    private vcl(bcaa bcaa) {
        this.a = bcaa;
    }

    public static vcl a(bcaa bcaa) {
        return new vcl(bcaa);
    }

    public static String a(Context context) {
        Object a = rzp.a(context.getContentResolver(), rzr.a, "youtube_client_id");
        if (a == null) {
            a = "android-google";
        }
        return (String) baqd.a(a, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return vcl.a((Context) this.a.get());
    }
}
