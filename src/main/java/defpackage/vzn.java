package defpackage;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: vzn */
public final class vzn extends vzq {
    public aaft a = null;
    private final akle b;
    private aohw c;

    public vzn(ImageView imageView, akle akle, Drawable drawable, float f) {
        super(imageView, drawable, f);
        this.b = (akle) amqw.a((Object) akle);
    }

    public final void a() {
        this.a = null;
        a(null);
        b();
    }

    public final void b() {
        super.b();
        aohw aohw = this.c;
        aygk aygk = null;
        if (!(aohw == null || (aohw.a & 1) == 0)) {
            aygk = aohw.b;
            if (aygk == null) {
                aygk = aygk.f;
            }
        }
        if (aygk == null) {
            aaft aaft = this.a;
            if (aaft == null) {
                this.b.b();
                return;
            } else {
                this.b.a(aaft);
                return;
            }
        }
        this.b.a(aygk);
    }

    public final void a(aohw aohw) {
        this.c = aohw;
        aohb aohb = null;
        if (!(aohw == null || (aohw.a & 2) == 0)) {
            aohy aohy = aohw.c;
            if (aohy == null) {
                aohy = aohy.c;
            }
            aohb = aohy.b;
            if (aohb == null) {
                aohb = aohb.e;
            }
        }
        this.e = aohb;
    }
}
