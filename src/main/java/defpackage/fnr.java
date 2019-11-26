package defpackage;

@Deprecated
/* renamed from: fnr */
public final class fnr implements amfh {
    public boolean a = true;
    public boolean b;
    public boolean c;
    public boolean d;
    public final zyw e;
    private boolean f;
    private amfk g;
    private final alys h;
    private final fnt i = new fnt(this);
    private final fnq j = new fnq(this);
    private final bdfu k;

    public fnr(alys alys, xci xci, ajam ajam, zyw zyw) {
        this.h = alys;
        this.e = zyw;
        this.k = new bdfu();
        xci.a(this.j);
        if (foh.x(zyw)) {
            this.k.a();
            this.k.a(this.i.a(ajam));
            return;
        }
        xci.a(this.i);
    }

    public final synchronized boolean a(amfk amfk) {
        amqw.a((Object) amfk);
        if (this.a || this.b || this.d || this.f || this.c) {
            return false;
        }
        if (this.g == null) {
            this.g = amfk;
            this.f = true;
            return true;
        }
        throw new AssertionError("Found registered old codec listener.");
    }

    public final synchronized void a() {
        this.f = false;
        this.g = null;
    }

    public final void a(boolean z, String str, boolean z2) {
        if (this.f) {
            if (z2) {
                alys alys = this.h;
                str = String.valueOf(str);
                String str2 = "Upload transcoder blocked ";
                if (str.length() == 0) {
                    str = new String(str2);
                } else {
                    str = str2.concat(str);
                }
                alys.a(str);
            }
            this.g.a(z);
        }
    }
}
