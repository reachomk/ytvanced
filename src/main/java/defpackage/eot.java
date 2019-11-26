package defpackage;

/* renamed from: eot */
final class eot implements fhn {
    private final eos a;
    private final bapu b;
    private final azsr c;
    private final azsr d;

    eot(cmg cmg, bapu bapu, azsr azsr, azsr azsr2, eoz eoz) {
        this.b = bapu;
        this.c = azsr;
        this.d = azsr2;
        this.a = new eos(eoz, cmg);
    }

    /* Access modifiers changed, original: final */
    public final void a(cmg cmg) {
        this.a.a = cmg;
    }

    public final bblt a(int i) {
        eon eon = new eon();
        eon.b = null;
        eon.a = false;
        eon.b = this.a;
        if (i == 1 && this.d != null) {
            return ((swf) this.b.get()).a(this.d.toByteArray(), eon.a());
        }
        if (i == 2 && this.d != null) {
            swf swf = (swf) this.b.get();
            byte[] toByteArray = this.d.toByteArray();
            eon.a = true;
            return swf.a(toByteArray, eon.a());
        } else if (i != 0 || this.c == null) {
            return bblt.a();
        } else {
            return ((swf) this.b.get()).a(this.c.toByteArray(), eon.a());
        }
    }

    public final boolean a(fhn fhn) {
        if ((fhn instanceof eot) && this.d == ((eot) fhn).d) {
            return true;
        }
        return false;
    }
}
