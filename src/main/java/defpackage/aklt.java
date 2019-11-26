package defpackage;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import java.util.Locale;

/* renamed from: aklt */
public final class aklt implements akkq {
    public final aort a;
    private final bqv b;
    private final cdh c;
    private final Context d;
    private final bcaa e;
    private final akky f = new akky();
    private final aklx g;
    private final cgd h;

    public aklt(Context context, bcaa bcaa, aort aort, bcaa bcaa2, bcaa bcaa3) {
        this.d = (Context) amqw.a((Object) context);
        this.e = (bcaa) amqw.a((Object) bcaa);
        this.c = cdh.a(context.getResources().getInteger(17694720));
        bqv bqv = new bqv();
        bqv.a(cgz.b);
        this.b = bqv;
        this.a = aort;
        this.g = new aklw(this);
        boolean z = false;
        if (aort.n && ((alxv) bcaa3.get()).a(aort.p, "streamz_glide_image_manager")) {
            z = true;
        }
        if (aort.h) {
            this.h = new aklv(aort, bcaa2, z);
        } else {
            this.h = null;
        }
    }

    public final void b() {
    }

    public final akko a() {
        return akko.g;
    }

    public final void a(akkr akkr) {
        this.f.a(akkr);
    }

    public final void b(akkr akkr) {
        this.f.b(akkr);
    }

    @Deprecated
    public final void a(ImageView imageView, aaft aaft, akko akko) {
        a(imageView, aaft != null ? aaft.d() : null, akko);
    }

    public final void a(ImageView imageView, aygk aygk) {
        b(imageView, aygk, null);
    }

    public final void a(ImageView imageView, aygk aygk, akko akko) {
        if (aklb.a(aygk)) {
            b(imageView, aygk, akko);
        } else {
            b(imageView, null, akko);
        }
    }

    public final void a(ImageView imageView, Uri uri) {
        a(imageView, uri, null);
    }

    public final void a(ImageView imageView, Uri uri, akko akko) {
        a(imageView, aklb.a(uri), akko);
    }

    public final void a(aygk aygk, int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            xtl.c(String.format(Locale.ENGLISH, "ImageManager: cannot preload image. Invalid dimensions given: %d x %d", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}));
        } else if (aygk != null) {
            brl a = this.g.a(this.d);
            if (a != null) {
                brj a2 = a.a((Object) aygk);
                a2.a(new cgq(a2.a, i, i2));
            }
        } else {
            xtl.c("ImageManager: cannot preload image with null model.");
        }
    }

    public final void a(ImageView imageView) {
        if (imageView != null) {
            brl a = this.g.a(imageView.getContext());
            if (a != null) {
                a.a((View) imageView);
            }
        }
    }

    public final void b(Uri uri, wxg wxg) {
        c().a(uri, wxg);
    }

    public final void a(Uri uri, wxg wxg) {
        c().a(uri, wxg);
    }

    public final void c(Uri uri, wxg wxg) {
        c().b(uri, wxg);
    }

    public final akkl c() {
        return (akkl) this.e.get();
    }

    private final void b(ImageView imageView, aygk aygk, akko akko) {
        if (imageView != null) {
            if (akko == null) {
                akko = akko.g;
            }
            if (aygk == null) {
                a(imageView);
                if (akko.c() > 0) {
                    imageView.setImageResource(akko.c());
                }
                return;
            }
            Object cgl = new cgl(imageView);
            Object obj = this.f;
            akks e = akko.e();
            amqw.a(cgl);
            amqw.a(obj);
            a(new akmd(cgl, akko, aygk, obj, e), imageView.getContext(), aygk, akko);
        }
    }

    public final void a(cgu cgu, Context context, aygk aygk, akko akko) {
        if (cgu != null) {
            if (akko == null) {
                akko = akko.g;
            }
            brl a = this.g.a(context);
            if (a != null) {
                brp brp;
                brj e = a.e();
                cfy cgg = new cgg();
                if (akko.c() > 0) {
                    cgg.a(akko.c());
                }
                e = (brj) e.b(cgg);
                if (akko.b()) {
                    brp = this.c;
                } else {
                    brp = this.b;
                }
                e.a(brp).a(this.h).a((Object) aygk).a(cgu);
            }
        }
    }
}
