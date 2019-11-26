package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import com.google.android.youtube.R;
import defpackage.abf;
import defpackage.adp;
import defpackage.akv;
import defpackage.ald;
import defpackage.arv;

public class AppCompatImageButton extends ImageButton implements abf, adp {
    private final akv a;
    private final ald b;

    public AppCompatImageButton(Context context) {
        this(context, null);
    }

    public AppCompatImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.imageButtonStyle);
    }

    public AppCompatImageButton(Context context, AttributeSet attributeSet, int i) {
        super(arv.a(context), attributeSet, i);
        this.a = new akv(this);
        this.a.a(attributeSet, i);
        this.b = new ald(this);
        this.b.a(attributeSet, i);
    }

    public final void setImageResource(int i) {
        this.b.a(i);
    }

    public final void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        ald ald = this.b;
        if (ald != null) {
            ald.d();
        }
    }

    public final void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        ald ald = this.b;
        if (ald != null) {
            ald.d();
        }
    }

    public final void setImageURI(Uri uri) {
        super.setImageURI(uri);
        ald ald = this.b;
        if (ald != null) {
            ald.d();
        }
    }

    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        akv akv = this.a;
        if (akv != null) {
            akv.a(i);
        }
    }

    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        akv akv = this.a;
        if (akv != null) {
            akv.a();
        }
    }

    public final void setSupportBackgroundTintList(ColorStateList colorStateList) {
        akv akv = this.a;
        if (akv != null) {
            akv.a(colorStateList);
        }
    }

    public final ColorStateList getSupportBackgroundTintList() {
        akv akv = this.a;
        return akv != null ? akv.b() : null;
    }

    public final void setSupportBackgroundTintMode(Mode mode) {
        akv akv = this.a;
        if (akv != null) {
            akv.a(mode);
        }
    }

    public final Mode getSupportBackgroundTintMode() {
        akv akv = this.a;
        return akv != null ? akv.c() : null;
    }

    public final void a(ColorStateList colorStateList) {
        ald ald = this.b;
        if (ald != null) {
            ald.a(colorStateList);
        }
    }

    public final ColorStateList a() {
        ald ald = this.b;
        return ald != null ? ald.b() : null;
    }

    public final void a(Mode mode) {
        ald ald = this.b;
        if (ald != null) {
            ald.a(mode);
        }
    }

    public final Mode b() {
        ald ald = this.b;
        return ald != null ? ald.c() : null;
    }

    /* Access modifiers changed, original: protected|final */
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        akv akv = this.a;
        if (akv != null) {
            akv.d();
        }
        ald ald = this.b;
        if (ald != null) {
            ald.d();
        }
    }

    public final boolean hasOverlappingRendering() {
        return this.b.a() && super.hasOverlappingRendering();
    }
}
