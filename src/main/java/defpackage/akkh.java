package defpackage;

import android.net.Uri;
import android.widget.ImageView;

/* renamed from: akkh */
final class akkh implements xnl {
    private final /* synthetic */ akko a;
    private final /* synthetic */ akky b;
    private final /* synthetic */ aygk c;
    private final /* synthetic */ akle d;
    private final /* synthetic */ akkf e;

    akkh(akkf akkf, akko akko, akky akky, aygk aygk, akle akle) {
        this.e = akkf;
        this.a = akko;
        this.b = akky;
        this.c = aygk;
        this.d = akle;
    }

    public final void a() {
    }

    public final void c(ImageView imageView) {
        akks e = this.a.e();
        if (e != null) {
            e.c(imageView);
        }
        this.b.a(imageView, this.a, this.c);
    }

    public final void a(ImageView imageView) {
        akks e = this.a.e();
        if (e != null) {
            e.a(imageView);
        }
        this.b.b(imageView, this.a, this.c);
    }

    public final void b(ImageView imageView) {
        akks e = this.a.e();
        if (this.a.c() > 0) {
            this.d.c(this.a.c());
        }
        if (e != null) {
            e.b(imageView);
        }
        this.b.c(imageView, this.a, this.c);
    }

    public final void a(Uri uri, Exception exception) {
        if (this.e.a) {
            akku.a(new akkt(exception, uri));
        }
    }

    public final void d(ImageView imageView) {
        akks e = this.a.e();
        if (e != null) {
            e.a(imageView);
        }
        this.b.d(imageView, this.a, this.c);
    }
}
