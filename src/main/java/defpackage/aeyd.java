package defpackage;

import android.os.Handler;

/* renamed from: aeyd */
final class aeyd implements afkj {
    private final aexj a;
    private final affj b;

    aeyd(aexj aexj, affj affj) {
        this.a = aexj;
        this.b = affj;
    }

    public final void b() {
    }

    public final void a() {
        this.b.f(afne.ANDROID_EXOPLAYER_V2);
        aexj aexj = this.a;
        Handler handler = aexj.h;
        aexj.getClass();
        handler.post(new aeyc(aexj));
    }

    public final void c() {
        this.b.g(afne.ANDROID_EXOPLAYER_V2);
        this.a.A();
        aexj aexj = this.a;
        Handler handler = aexj.h;
        aexj.getClass();
        handler.post(new aeyf(aexj));
    }

    public final void d() {
        aexj aexj = this.a;
        Handler handler = aexj.h;
        aexj.getClass();
        handler.post(new aeye(aexj));
    }

    public final void e() {
        this.b.h(afne.ANDROID_EXOPLAYER_V2);
    }
}
