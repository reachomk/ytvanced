package defpackage;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: akmd */
final class akmd implements cgu {
    private final akks a;
    private final cgo b;
    private final akkr c;
    private final aygk d;
    private final akko e;
    private boolean f = false;

    public akmd(cgo cgo, akko akko, aygk aygk, akkr akkr, akks akks) {
        this.b = (cgo) amqw.a((Object) cgo);
        this.e = akko;
        this.d = aygk;
        this.c = akkr;
        this.a = akks;
    }

    public final void c() {
    }

    public final void a() {
        this.b.a();
    }

    public final void b() {
        this.b.b();
    }

    public final void b(Drawable drawable) {
        a((ImageView) this.b.c);
        this.b.b(drawable);
    }

    private final void a(ImageView imageView) {
        this.f = true;
        this.c.a(imageView, this.e, this.d);
        akks akks = this.a;
        if (akks != null) {
            akks.c(imageView);
        }
    }

    public final void c(Drawable drawable) {
        ImageView imageView = (ImageView) this.b.c;
        if (!this.f) {
            a(imageView);
        }
        this.c.c(imageView, this.e, this.d);
        akks akks = this.a;
        if (akks != null) {
            akks.b(imageView);
        }
        this.b.c(drawable);
    }

    public final void a(Object obj, chb chb) {
        ImageView imageView = (ImageView) this.b.c;
        if (!this.f) {
            a(imageView);
        }
        this.c.b(imageView, this.e, this.d);
        akks akks = this.a;
        if (akks != null) {
            akks.a(imageView);
        }
        this.b.a(obj, chb);
    }

    public final void a(Drawable drawable) {
        this.c.d((ImageView) this.b.c, this.e, this.d);
        akks akks = this.a;
        if (akks != null) {
            akks.a();
        }
        this.b.a(drawable);
    }

    public final void a(cgr cgr) {
        this.b.a(cgr);
    }

    public final void b(cgr cgr) {
        this.b.b(cgr);
    }

    public final void a(cfz cfz) {
        this.b.b((Object) cfz);
    }

    public final cfz d() {
        return this.b.d();
    }
}
