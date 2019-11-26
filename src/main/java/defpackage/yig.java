package defpackage;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;

/* renamed from: yig */
public abstract class yig implements yij {
    public final Handler a;
    public final yjd c;
    public yim d;
    public final yir e;
    public final Context e_;
    private final yil f;
    private bbnc g;
    private int h;

    public yig(Context context, Handler handler, yir yir, yjd yjd) {
        this(context, handler, yir, yjd, null);
    }

    /* Access modifiers changed, original: protected */
    public boolean a(Class cls) {
        return false;
    }

    public abstract yih b();

    /* Access modifiers changed, original: protected */
    public boolean e() {
        return false;
    }

    public yig(Context context, Handler handler, yir yir, yjd yjd, yil yil) {
        this.a = (Handler) amqw.a((Object) handler);
        this.e_ = (Context) amqw.a((Object) context);
        this.e = (yir) amqw.a((Object) yir);
        this.c = (yjd) amqw.a((Object) yjd);
        this.f = yil;
        this.h = 1;
    }

    public void bk_() {
        yim yim = this.d;
        if (yim != null) {
            yim.bk_();
        }
        this.h = 2;
        d();
    }

    public void bl_() {
        bbnc bbnc = this.g;
        if (!(bbnc == null || bbnc.c())) {
            this.g.bK_();
        }
        this.g = null;
        yim yim = this.d;
        if (yim != null) {
            yim.bl_();
        }
        this.h = 3;
    }

    public final boolean bj_() {
        c();
        return this.d.b == 2;
    }

    public final void a(String str, yik yik) {
        if (!TextUtils.isEmpty(str)) {
            c();
            if (!this.d.a.containsKey(str)) {
                this.d.a(str, yik.a(str));
            }
        }
    }

    public final void c() {
        if (this.d == null) {
            if (this.f != null) {
                this.d = yil.a(this.h);
                int i = this.h;
                if (i == 2) {
                    this.d.bk_();
                } else if (i == 3) {
                    this.d.bl_();
                    return;
                }
            }
            throw new IllegalStateException("You may not bind child presenters without a presenter lifecycle manager factory!");
        }
    }

    public final void d() {
        yih b = b();
        if (b != null) {
            this.g = this.e.a(b.a, new yif(this, b), e(), this.c);
        }
    }
}
