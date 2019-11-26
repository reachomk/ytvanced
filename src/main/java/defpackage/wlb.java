package defpackage;

import android.graphics.Bitmap;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.BitmapDrawable;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;

/* renamed from: wlb */
public final class wlb implements xnh {
    private final int a;
    private final int b;

    public wlb(int i, int i2) {
        boolean z = true;
        amqw.a(i > 0);
        if (i2 <= 0) {
            z = false;
        }
        amqw.a(z);
        this.a = i;
        this.b = i2;
    }

    public final boolean a() {
        return false;
    }

    public final Animation b() {
        return null;
    }

    public final void a(ImageView imageView, Bitmap bitmap) {
        if (!(bitmap == null || bitmap.getWidth() == 0 || bitmap.getHeight() == 0)) {
            int width = (this.b * bitmap.getWidth()) / bitmap.getHeight();
            if (width < this.a) {
                BitmapDrawable bitmapDrawable = new BitmapDrawable(imageView.getResources(), Bitmap.createScaledBitmap(bitmap, width, this.b, true));
                bitmapDrawable.setTileModeX(TileMode.REPEAT);
                imageView.setBackground(bitmapDrawable);
                wlb.a(imageView, this.b);
                return;
            }
            imageView.setScaleType(ScaleType.CENTER_CROP);
            imageView.setImageBitmap(bitmap);
            wlb.a(imageView, (this.a * bitmap.getHeight()) / bitmap.getWidth());
        }
    }

    private static void a(ImageView imageView, int i) {
        imageView.getLayoutParams().width = -1;
        imageView.getLayoutParams().height = i;
        imageView.requestLayout();
    }
}
