package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build.VERSION;

/* renamed from: su */
public final class su {
    public static ss a(Resources resources, Bitmap bitmap) {
        if (VERSION.SDK_INT >= 21) {
            return new sv(resources, bitmap);
        }
        return new sx(resources, bitmap);
    }
}
