package defpackage;

import android.content.res.AssetManager;
import android.graphics.drawable.Drawable.Callback;
import android.view.View;
import java.util.HashMap;
import java.util.Map;

/* renamed from: bmc */
public final class bmc {
    public final bmm a = new bmm();
    public final Map b = new HashMap();
    public final Map c = new HashMap();
    public final AssetManager d;
    public final String e = ".ttf";

    public bmc(Callback callback) {
        if (callback instanceof View) {
            this.d = ((View) callback).getContext().getAssets();
            return;
        }
        bpb.a("LottieDrawable must be inside of a view for images to work.");
        this.d = null;
    }
}
