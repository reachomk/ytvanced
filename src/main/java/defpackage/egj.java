package defpackage;

import com.google.android.youtube.R;

/* renamed from: egj */
public class egj implements exv {
    private final String a;
    private final exu b;
    private final nn c;
    private nd d;
    private nd e;
    private int f = 1;
    public boolean g;

    protected egj(nn nnVar, exu exu, String str) {
        this.c = (nn) amqw.a((Object) nnVar);
        this.b = (exu) amqw.a((Object) exu);
        this.a = xvd.a(str);
    }

    public final void b() {
        this.g = true;
    }

    public final void a() {
        this.g = false;
        int i = this.f;
        if (i == 2) {
            a(this.e);
        } else if (i == 4) {
            c();
        } else if (i == 8) {
            d();
        } else if (i == 16) {
            f();
        }
        this.f = 1;
    }

    public final void a(nd ndVar) {
        h();
        if (this.g) {
            this.f = 2;
            this.e = ndVar;
            return;
        }
        if (this.d == null && ndVar != null) {
            this.e = null;
            this.d = ndVar;
            this.c.f().a().a((int) R.anim.bottom_translate_in, 0).a(this.d, this.a).a();
        }
    }

    public final void c() {
        h();
        if (this.g) {
            this.f = 4;
            return;
        }
        this.d = e();
        nd ndVar = this.d;
        if (!(ndVar == null || ndVar.v())) {
            this.c.f().a().a((int) R.anim.bottom_translate_in, 0).c(this.d).a();
        }
    }

    public final void d() {
        if (this.g) {
            this.f = 8;
            return;
        }
        this.d = e();
        nd ndVar = this.d;
        if (ndVar != null && ndVar.v()) {
            this.c.f().a().a(0, (int) R.anim.bottom_translate_out).b(this.d).a();
        }
    }

    public final nd e() {
        nd ndVar = this.d;
        return ndVar == null ? (nd) this.c.f().a(this.a) : ndVar;
    }

    public final void f() {
        if (this.g) {
            this.f = 16;
            return;
        }
        this.d = e();
        if (this.d != null) {
            this.c.f().a().a((int) R.anim.bottom_translate_in, (int) R.anim.bottom_translate_out).a(this.d).a();
            this.d = null;
        }
        this.b.b((exv) this);
    }

    /* Access modifiers changed, original: protected|final */
    public final void g() {
        this.d = null;
        if (e() != null) {
            f();
        }
    }

    private final void h() {
        this.b.a((exv) this);
        this.g = this.b.a ^ 1;
    }
}
