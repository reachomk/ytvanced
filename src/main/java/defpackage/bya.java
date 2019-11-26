package defpackage;

import android.content.res.AssetManager;
import android.net.Uri;

/* renamed from: bya */
public final class bya implements bzq {
    private final AssetManager a;
    private final bxz b;

    public bya(AssetManager assetManager, bxz bxz) {
        this.a = assetManager;
        this.b = bxz;
    }

    public final /* synthetic */ boolean a(Object obj) {
        Uri uri = (Uri) obj;
        if (!"file".equals(uri.getScheme()) || uri.getPathSegments().isEmpty()) {
            return false;
        }
        if ("android_asset".equals(uri.getPathSegments().get(0))) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ bzp a(Object obj, int i, int i2, bsq bsq) {
        Uri uri = (Uri) obj;
        return new bzp(new chi(uri), this.b.a(this.a, uri.toString().substring(22)));
    }
}
