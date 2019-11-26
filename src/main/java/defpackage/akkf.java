package defpackage;

import android.net.Uri;
import android.widget.ImageView;
import com.google.android.youtube.R;
import java.util.Locale;

/* renamed from: akkf */
public final class akkf implements akkq {
    private static final xna b = new xna();
    private static final wxg c = new akki();
    public final boolean a;
    private final akkl d;
    private final akky e = new akky();
    private final akko f;

    public akkf(akkl akkl, aort aort, akko akko) {
        this.d = (akkl) amqw.a((Object) akkl);
        this.f = akko;
        this.a = aort.h;
    }

    public final void b() {
    }

    public final akko a() {
        return this.f;
    }

    public final void a(akkr akkr) {
        this.e.a(akkr);
    }

    public final void b(akkr akkr) {
        this.e.b(akkr);
    }

    public final void a(ImageView imageView, aygk aygk) {
        a(imageView, aygk, null);
    }

    @Deprecated
    public final void a(ImageView imageView, aaft aaft, akko akko) {
        a(imageView, aaft != null ? aaft.d() : null, akko);
    }

    public final void a(ImageView imageView, aygk aygk, akko akko) {
        if (imageView != null) {
            if (akko == null) {
                akko = this.f;
            }
            akko akko2 = akko;
            akle b = akkf.b(imageView);
            if (b == null) {
                akle akle = new akle(this.d, akkf.a(null, imageView, akko2), akko2.d(), imageView, akko2.a());
                imageView.setTag(R.id.image_view_controller_tag, akle);
            } else {
                b.b.a(akko2.a());
                b.a(akkf.a(b, imageView, akko2));
                b.a(akko2.d());
            }
            if (aygk != null && aklb.a(aygk)) {
                xni xni;
                akky akky = this.e;
                if (akko2.e() == null && akko2.c() <= 0 && akky.a()) {
                    xni = null;
                } else {
                    xni akkh = new akkh(this, akko2, akky, aygk, b);
                }
                b.a(aygk, xni);
            } else if (akko2.c() > 0) {
                b.c(akko2.c());
            } else {
                b.b();
            }
        }
    }

    public final void a(ImageView imageView, Uri uri) {
        a(imageView, uri, null);
    }

    public final void a(ImageView imageView, Uri uri, akko akko) {
        a(imageView, aklb.a(uri), akko);
    }

    public final void b(Uri uri, wxg wxg) {
        this.d.a(uri, wxg);
    }

    public final void a(Uri uri, wxg wxg) {
        this.d.a(uri, wxg);
    }

    public final void c(Uri uri, wxg wxg) {
        this.d.b(uri, wxg);
    }

    public final void a(aygk aygk, int i, int i2) {
        if (i > 0 && i2 > 0) {
            Uri c = aklb.c(aygk, i, i2);
            if (c == null) {
                xtl.c("ImageManager: cannot preload image with null uri.");
                return;
            } else {
                this.d.a(c, c);
                return;
            }
        }
        xtl.c(String.format(Locale.ENGLISH, "ImageManager: cannot preload image. Invalid dimensions given: %d x %d", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}));
    }

    public final void a(ImageView imageView) {
        if (imageView != null) {
            akle b = akkf.b(imageView);
            if (b != null) {
                b.b();
            }
        }
    }

    public final akkl c() {
        return this.d;
    }

    private static akle b(ImageView imageView) {
        return (akle) imageView.getTag(R.id.image_view_controller_tag);
    }

    private static xnh a(akle akle, ImageView imageView, akko akko) {
        boolean b = akko.b();
        if (akle != null && akle.c.a() == b) {
            return akle.c;
        }
        xnh xnj;
        if (b) {
            xnj = new xnj(imageView.getContext());
        } else {
            xnj = b;
        }
        return xnj;
    }
}
