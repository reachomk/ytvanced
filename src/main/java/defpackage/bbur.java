package defpackage;

import java.util.Iterator;

/* renamed from: bbur */
final class bbur extends bbph {
    public final bbmo a;
    public final Iterator b;
    public volatile boolean c;
    public boolean d;
    private boolean e;
    private boolean f;

    bbur(bbmo bbmo, Iterator it) {
        this.a = bbmo;
        this.b = it;
    }

    public final int a(int i) {
        if ((i & 1) == 0) {
            return 0;
        }
        this.d = true;
        return 1;
    }

    public final Object bI_() {
        if (this.e) {
            return null;
        }
        if (!this.f) {
            this.f = true;
        } else if (!this.b.hasNext()) {
            this.e = true;
            return null;
        }
        return bbow.a(this.b.next(), "The iterator returned a null value");
    }

    public final boolean b() {
        return this.e;
    }

    public final void e() {
        this.e = true;
    }

    public final void bK_() {
        this.c = true;
    }

    public final boolean c() {
        return this.c;
    }
}
