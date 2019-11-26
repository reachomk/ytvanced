package defpackage;

import android.content.Context;
import android.net.Uri;

/* renamed from: zsd */
public final class zsd implements amfa {
    private final Context a;
    private final zzf b;
    private final amdi c;

    public zsd(Context context, zzf zzf, amdi amdi) {
        this.a = (Context) amqw.a((Object) context);
        this.b = (zzf) amqw.a((Object) zzf);
        this.c = (amdi) amqw.a((Object) amdi);
    }

    public final String a() {
        return "goog-edited-video";
    }

    public final /* synthetic */ amev a(Uri uri, amex amex) {
        return new zsa(uri, this.a, this.b, amex);
    }
}
