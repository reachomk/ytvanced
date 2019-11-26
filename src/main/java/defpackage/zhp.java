package defpackage;

import android.graphics.drawable.Animatable2.AnimationCallback;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: zhp */
final class zhp extends AnimationCallback {
    private final /* synthetic */ int a;
    private final /* synthetic */ zhq b;

    zhp(zhq zhq, int i) {
        this.b = zhq;
        this.a = i;
    }

    public final void onAnimationEnd(Drawable drawable) {
        ImageView imageView = this.b.b;
        imageView.setImageDrawable(imageView.getResources().getDrawable(this.a));
    }
}
