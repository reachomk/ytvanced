package defpackage;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;

/* renamed from: cdi */
public abstract class cdi implements bvp, bvw {
    public final Drawable a;

    public cdi(Drawable drawable) {
        this.a = (Drawable) chw.a((Object) drawable);
    }

    public void e() {
        Drawable drawable = this.a;
        if (drawable instanceof BitmapDrawable) {
            ((BitmapDrawable) drawable).getBitmap().prepareToDraw();
        } else if (drawable instanceof cdr) {
            ((cdr) drawable).a().prepareToDraw();
        }
    }

    public final /* synthetic */ Object b() {
        ConstantState constantState = this.a.getConstantState();
        if (constantState == null) {
            return this.a;
        }
        return constantState.newDrawable();
    }
}
