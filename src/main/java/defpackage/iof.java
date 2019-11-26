package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.widget.ImageView;

/* renamed from: iof */
final class iof extends akka {
    private final /* synthetic */ iog a;

    iof(iog iog) {
        this.a = iog;
    }

    public final void a(ImageView imageView) {
        if (imageView.getDrawable() instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) imageView.getDrawable()).getBitmap();
            Context context = this.a.d.a;
            if (xpr.a == null) {
                xpr.a = new xpj();
            }
            imageView.setImageBitmap(xpr.a.a(context, bitmap));
        }
    }
}
