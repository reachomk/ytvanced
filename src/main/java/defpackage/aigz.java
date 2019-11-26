package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;

/* renamed from: aigz */
public class aigz extends aito implements aigp {
    private Bitmap a;

    public aigz(Context context) {
        super(context);
    }

    public final LayoutParams b() {
        return new LayoutParams(-1, -1);
    }

    /* renamed from: c */
    public ImageView a(Context context) {
        ImageView imageView = new ImageView(context);
        imageView.setBackgroundColor(-16777216);
        imageView.setScaleType(ScaleType.CENTER_CROP);
        return imageView;
    }

    public final boolean c() {
        return this.a != null;
    }

    public final void at_() {
        a(null);
    }

    public final void a(Bitmap bitmap) {
        if (this.a != bitmap) {
            this.a = bitmap;
            m();
        }
    }

    public final /* synthetic */ void a(Context context, View view) {
        ImageView imageView = (ImageView) view;
        Bitmap bitmap = this.a;
        if (bitmap == null) {
            imageView.setImageDrawable(null);
        } else {
            imageView.setImageBitmap(bitmap);
        }
    }
}
