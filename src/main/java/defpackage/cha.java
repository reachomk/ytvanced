package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;

/* renamed from: cha */
public final class cha implements chb {
    private final int a;
    private final boolean b = false;

    public cha(int i, boolean z) {
        this.a = i;
    }

    public final /* synthetic */ boolean a(Object obj, che che) {
        Drawable drawable = (Drawable) obj;
        Drawable e = che.e();
        if (e == null) {
            e = new ColorDrawable(0);
        }
        TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{e, drawable});
        transitionDrawable.setCrossFadeEnabled(this.b);
        transitionDrawable.startTransition(this.a);
        che.d(transitionDrawable);
        return true;
    }
}
