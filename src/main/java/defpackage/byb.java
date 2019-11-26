package defpackage;

import android.content.res.AssetManager;

/* renamed from: byb */
public final class byb implements bxz, bzs {
    private final AssetManager a;

    public byb(AssetManager assetManager) {
        this.a = assetManager;
    }

    public final void a() {
    }

    public final bzq a(bzy bzy) {
        return new bya(this.a, this);
    }

    public final bsv a(AssetManager assetManager, String str) {
        return new btl(assetManager, str);
    }
}
