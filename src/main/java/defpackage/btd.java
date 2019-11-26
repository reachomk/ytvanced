package defpackage;

import android.content.res.AssetManager;
import android.os.ParcelFileDescriptor;

/* renamed from: btd */
public final class btd extends bst {
    public btd(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    public final Class d() {
        return ParcelFileDescriptor.class;
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void a(Object obj) {
        ((ParcelFileDescriptor) obj).close();
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ Object a(AssetManager assetManager, String str) {
        return assetManager.openFd(str).getParcelFileDescriptor();
    }
}
