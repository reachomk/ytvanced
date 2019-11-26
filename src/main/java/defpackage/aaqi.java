package defpackage;

/* renamed from: aaqi */
public final class aaqi extends aaml {
    public anvu a;
    public String b;
    public String c;
    public int d;
    public int e;
    public int p;
    public String q;
    public azrm r;

    public aaqi(aamd aamd, afpt afpt) {
        super("channel/create_channel", aamd, afpt);
        g();
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        amqw.a(this.a);
    }

    public final /* synthetic */ anzd c() {
        ascz ascz = (ascz) ascw.k.createBuilder();
        anvu anvu = this.a;
        ascz.copyOnWrite();
        ascw ascw = (ascw) ascz.instance;
        if (anvu != null) {
            ascw.a |= 2;
            ascw.c = anvu;
            String b = aali.b(this.b);
            ascz.copyOnWrite();
            ascw = (ascw) ascz.instance;
            if (b != null) {
                ascw.a |= 4;
                ascw.d = b;
                b = aali.b(this.c);
                ascz.copyOnWrite();
                ascw = (ascw) ascz.instance;
                if (b != null) {
                    ascw.a |= 8;
                    ascw.e = b;
                    b = aali.b(this.q);
                    ascz.copyOnWrite();
                    ascw = (ascw) ascz.instance;
                    if (b != null) {
                        ascw.a |= 128;
                        ascw.i = b;
                        int i = this.d;
                        ascz.copyOnWrite();
                        ascw = (ascw) ascz.instance;
                        ascw.a |= 16;
                        ascw.f = i;
                        i = this.e;
                        ascz.copyOnWrite();
                        ascw = (ascw) ascz.instance;
                        ascw.a |= 32;
                        ascw.g = i;
                        i = this.p;
                        ascz.copyOnWrite();
                        ascw = (ascw) ascz.instance;
                        ascw.a |= 64;
                        ascw.h = i;
                        azrm azrm = this.r;
                        if (azrm != null) {
                            ascz.copyOnWrite();
                            ascw = (ascw) ascz.instance;
                            ascw.j = azrm;
                            ascw.a |= 256;
                        }
                        return ascz;
                    }
                    throw new NullPointerException();
                }
                throw new NullPointerException();
            }
            throw new NullPointerException();
        }
        throw new NullPointerException();
    }
}
