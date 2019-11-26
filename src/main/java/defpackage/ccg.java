package defpackage;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import java.util.concurrent.locks.Lock;

/* renamed from: ccg */
final class ccg {
    private static final bwd a = new ccf();

    static bvw a(bwd bwd, Drawable drawable, int i, int i2) {
        drawable = drawable.getCurrent();
        int i3 = 0;
        Bitmap bitmap = null;
        if (drawable instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) drawable).getBitmap();
        } else if (!(drawable instanceof Animatable)) {
            String str = "Unable to draw ";
            String str2 = "DrawableToBitmap";
            String valueOf;
            StringBuilder stringBuilder;
            if (i != aocf.UNSET_ENUM_VALUE || drawable.getIntrinsicWidth() > 0) {
                if (i2 != aocf.UNSET_ENUM_VALUE || drawable.getIntrinsicHeight() > 0) {
                    if (drawable.getIntrinsicWidth() > 0) {
                        i = drawable.getIntrinsicWidth();
                    }
                    if (drawable.getIntrinsicHeight() > 0) {
                        i2 = drawable.getIntrinsicHeight();
                    }
                    Lock lock = ccr.a;
                    lock.lock();
                    Bitmap a = bwd.a(i, i2, Config.ARGB_8888);
                    try {
                        Canvas canvas = new Canvas(a);
                        drawable.setBounds(0, 0, i, i2);
                        drawable.draw(canvas);
                        canvas.setBitmap(null);
                        bitmap = a;
                    } finally {
                        lock.unlock();
                    }
                } else if (Log.isLoggable(str2, 5)) {
                    valueOf = String.valueOf(drawable);
                    stringBuilder = new StringBuilder(valueOf.length() + 96);
                    stringBuilder.append(str);
                    stringBuilder.append(valueOf);
                    stringBuilder.append(" to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height");
                    Log.w(str2, stringBuilder.toString());
                }
            } else if (Log.isLoggable(str2, 5)) {
                valueOf = String.valueOf(drawable);
                stringBuilder = new StringBuilder(valueOf.length() + 95);
                stringBuilder.append(str);
                stringBuilder.append(valueOf);
                stringBuilder.append(" to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width");
                Log.w(str2, stringBuilder.toString());
            }
            i3 = 1;
        }
        if (i3 == 0) {
            bwd = a;
        }
        return cbj.a(bitmap, bwd);
    }
}
