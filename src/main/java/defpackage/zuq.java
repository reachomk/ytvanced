package defpackage;

/* renamed from: zuq */
public final class zuq {
    public awlw a;
    public final /* synthetic */ zun b;

    public zuq(zun zun, awlw awlw) {
        this.b = zun;
        this.a = (awlw) amqw.a((Object) awlw);
    }

    public final boolean a() {
        return this.a.d;
    }

    public final void b() {
        awlz awlz = (awlz) ((anxo) this.a.toBuilder());
        awlz.a(true);
        awlz.a(((awlw) awlz.instance).c + 1);
        this.a = (awlw) ((anxl) awlz.build());
        zun zun = this.b;
        zun.d++;
        if (zun.b.size() > 1) {
            this.b.c = true;
        }
    }

    public final void c() {
        awlz awlz = (awlz) ((anxo) this.a.toBuilder());
        awlz.a(false);
        awlz.a(Math.max(this.a.c - 1, 0));
        this.a = (awlw) ((anxl) awlz.build());
        zun zun = this.b;
        zun.d = Math.max(zun.d - 1, 0);
        this.b.c = false;
    }

    public final float d() {
        long j = this.b.d;
        return j > 0 ? ((float) this.a.c) / ((float) j) : 0.0f;
    }
}
