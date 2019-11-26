package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.cardview.widget.CardView;

/* renamed from: aui */
public final class aui implements aun {
    private Drawable a;
    private final /* synthetic */ CardView b;

    public aui(CardView cardView) {
        this.b = cardView;
    }

    public final void a(Drawable drawable) {
        this.a = drawable;
        this.b.setBackgroundDrawable(drawable);
    }

    public final boolean a() {
        return this.b.b;
    }

    public final boolean b() {
        return this.b.c;
    }

    public final void a(int i, int i2, int i3, int i4) {
        this.b.g.set(i, i2, i3, i4);
        CardView cardView = this.b;
        super.setPadding(i + cardView.f.left, i2 + this.b.f.top, i3 + this.b.f.right, i4 + this.b.f.bottom);
    }

    public final void a(int i, int i2) {
        CardView cardView = this.b;
        if (i > cardView.d) {
            super.setMinimumWidth(i);
        }
        CardView cardView2 = this.b;
        if (i2 > cardView2.e) {
            super.setMinimumHeight(i2);
        }
    }

    public final Drawable c() {
        return this.a;
    }

    public final View d() {
        return this.b;
    }
}
