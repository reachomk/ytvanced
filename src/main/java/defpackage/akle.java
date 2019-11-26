package defpackage;

import android.net.Uri;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;

/* renamed from: akle */
public final class akle {
    private static final akkp e = akld.a;
    public final ImageView a;
    public final aklg b;
    public xnh c;
    public xne d;
    private final xnk f;
    private akkp g;
    private aygk h;
    private Uri i;

    public akle(xnk xnk, ImageView imageView) {
        this(xnk, imageView, false);
    }

    public akle(xnk xnk, ImageView imageView, boolean z) {
        this(xnk, new xnj(imageView.getContext()), imageView, z);
    }

    public akle(xnk xnk, xnh xnh, ImageView imageView, boolean z) {
        this(xnk, xnh, e, imageView, z);
    }

    public akle(xnk xnk, xnh xnh, akkp akkp, ImageView imageView, boolean z) {
        this.f = (xnk) amqw.a((Object) xnk);
        this.a = (ImageView) amqw.a((Object) imageView);
        this.b = new aklg(this, z);
        a(xnh);
        a(akkp);
    }

    public final void a(xnh xnh) {
        this.c = (xnh) amqw.a((Object) xnh);
    }

    public final void a(akkp akkp) {
        if (akkp == null) {
            akkp = e;
        }
        this.g = akkp;
    }

    public final void a(ScaleType scaleType) {
        this.a.setScaleType(scaleType);
    }

    public final void a(int i) {
        this.a.setVisibility(i);
    }

    public final void b(int i) {
        this.a.setBackgroundResource(i);
    }

    public final void a() {
        this.a.setBackground(null);
    }

    public final void a(aygk aygk) {
        a(aygk, null);
    }

    @Deprecated
    public final void a(aaft aaft) {
        a(aaft != null ? aaft.d() : null, null);
    }

    public final void a(aygk aygk, xni xni) {
        if (aygk != this.h) {
            this.d = this.g.a();
            this.h = aygk;
            this.i = null;
            this.a.setImageDrawable(null);
            this.b.a();
        }
        if (aklb.a(aygk)) {
            if (!this.b.a && this.a.isLayoutRequested()) {
                this.b.a(xni);
                return;
            }
            a(xni, this.d);
        }
    }

    public final void c(int i) {
        c();
        this.a.setImageResource(i);
    }

    public final void a(Uri uri, xni xni) {
        c();
        a(uri, xni, xnb.a);
    }

    public final void b() {
        c();
        this.a.setImageDrawable(null);
    }

    private final void c() {
        xnb.a(this.a);
        this.b.a();
        this.d = null;
        this.h = null;
        this.i = null;
    }

    public final void a(xni xni, xne xne) {
        if (this.h != null) {
            int width = this.a.getWidth();
            int height = this.a.getHeight();
            if (!(width == 0 || height == 0) || this.h.b.size() == 1) {
                Uri c = aklb.c(this.h, width, height);
                if (c == null || !c.equals(this.i)) {
                    this.i = c;
                    if (c != null) {
                        a(c, xni, xne);
                    } else {
                        this.a.setImageDrawable(null);
                    }
                }
                this.b.a();
            } else {
                this.b.a(xni);
            }
        }
    }

    private final void a(Uri uri, xni xni, xne xne) {
        xnb.a(this.f, xne, this.c, uri, this.a, xni);
    }
}
