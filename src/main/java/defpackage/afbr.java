package defpackage;

import android.content.Context;
import com.google.android.libraries.youtube.media.player.drm.WidevineHelper;
import com.google.android.libraries.youtube.media.player.drm.WidevineHelper.Listener;

/* renamed from: afbr */
final /* synthetic */ class afbr implements afdg {
    private final Context a;
    private final bcaa b;
    private final afjj c;
    private final aetb d;

    afbr(Context context, bcaa bcaa, afjj afjj, aetb aetb) {
        this.a = context;
        this.b = bcaa;
        this.c = afjj;
        this.d = aetb;
    }

    public final WidevineHelper a(Listener listener, int i, aajj aajj) {
        Context context = this.a;
        return new WidevineHelper(listener, i, aajj, xsl.a(context), this.b, this.c, this.d);
    }
}
