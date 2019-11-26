package defpackage;

import android.content.res.AssetManager;
import java.io.InputStream;

/* renamed from: btl */
public final class btl extends bst {
    public btl(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    public final Class d() {
        return InputStream.class;
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void a(Object obj) {
        ((InputStream) obj).close();
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ Object a(AssetManager assetManager, String str) {
        return assetManager.open(str);
    }
}
