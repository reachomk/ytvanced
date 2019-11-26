package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.widget.ImageView;

/* renamed from: ald */
public final class ald {
    private final ImageView a;
    private ary b;
    private ary c;

    public ald(ImageView imageView) {
        this.a = imageView;
    }

    public final void a(AttributeSet attributeSet, int i) {
        arz a = arz.a(this.a.getContext(), attributeSet, afy.M, i, 0);
        try {
            Drawable drawable = this.a.getDrawable();
            if (drawable == null) {
                int f = a.f(1, -1);
                if (f != -1) {
                    drawable = agb.b(this.a.getContext(), f);
                    if (drawable != null) {
                        this.a.setImageDrawable(drawable);
                    }
                }
            }
            if (drawable != null) {
                amu.b(drawable);
            }
            if (a.h(2)) {
                ade.a(this.a, a.f(2));
            }
            if (a.h(3)) {
                ImageView imageView = this.a;
                Mode a2 = amu.a(a.a(3, -1), null);
                if (VERSION.SDK_INT >= 21) {
                    imageView.setImageTintMode(a2);
                    if (VERSION.SDK_INT == 21) {
                        drawable = imageView.getDrawable();
                        if (!(drawable == null || imageView.getImageTintList() == null)) {
                            if (drawable.isStateful()) {
                                drawable.setState(imageView.getDrawableState());
                            }
                            imageView.setImageDrawable(drawable);
                        }
                    }
                } else if (imageView instanceof adp) {
                    ((adp) imageView).a(a2);
                }
            }
            a.a();
        } catch (Throwable th) {
            a.a();
        }
    }

    public final void a(int i) {
        if (i != 0) {
            Drawable b = agb.b(this.a.getContext(), i);
            if (b != null) {
                amu.b(b);
            }
            this.a.setImageDrawable(b);
        } else {
            this.a.setImageDrawable(null);
        }
        d();
    }

    public final boolean a() {
        return VERSION.SDK_INT < 21 || !(this.a.getBackground() instanceof RippleDrawable);
    }

    public final void a(ColorStateList colorStateList) {
        if (this.b == null) {
            this.b = new ary();
        }
        ary ary = this.b;
        ary.a = colorStateList;
        ary.d = true;
        d();
    }

    public final ColorStateList b() {
        ary ary = this.b;
        return ary != null ? ary.a : null;
    }

    public final void a(Mode mode) {
        if (this.b == null) {
            this.b = new ary();
        }
        ary ary = this.b;
        ary.b = mode;
        ary.c = true;
        d();
    }

    public final Mode c() {
        ary ary = this.b;
        return ary != null ? ary.b : null;
    }

    public final void d() {
        Drawable drawable = this.a.getDrawable();
        if (drawable != null) {
            amu.b(drawable);
        }
        if (drawable != null) {
            ary ary;
            int i = VERSION.SDK_INT;
            if (i <= 21 && i == 21) {
                ColorStateList imageTintList;
                if (this.c == null) {
                    this.c = new ary();
                }
                ary = this.c;
                ary.a();
                ImageView imageView = this.a;
                Mode mode = null;
                if (VERSION.SDK_INT >= 21) {
                    imageTintList = imageView.getImageTintList();
                } else if (imageView instanceof adp) {
                    imageTintList = ((adp) imageView).a();
                } else {
                    imageTintList = null;
                }
                if (imageTintList != null) {
                    ary.d = true;
                    ary.a = imageTintList;
                }
                imageView = this.a;
                if (VERSION.SDK_INT >= 21) {
                    mode = imageView.getImageTintMode();
                } else if (imageView instanceof adp) {
                    mode = ((adp) imageView).b();
                }
                if (mode != null) {
                    ary.c = true;
                    ary.b = mode;
                }
                if (ary.d || ary.c) {
                    aky.a(drawable, ary, this.a.getDrawableState());
                    return;
                }
            }
            ary = this.b;
            if (ary != null) {
                aky.a(drawable, ary, this.a.getDrawableState());
            }
        }
    }
}
