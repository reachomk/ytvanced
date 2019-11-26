package defpackage;

/* renamed from: aauc */
public final class aauc extends aaml {
    public asfa a;
    public aseq b;
    public aseu c;
    public ases d;
    public Boolean e;

    public aauc(aamd aamd, afpt afpt) {
        super("share/send_share", aamd, afpt);
        g();
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        boolean z = true;
        if (this.d == null) {
            amqw.b(this.a != null, (Object) "Only ShareToContacts is allowed to have a missing SharedObjectParams!");
        }
        if (this.b == null && this.d == null && this.c == null) {
            z = false;
        }
        amqw.b(z);
    }

    public final /* synthetic */ anzd c() {
        asem asem;
        asep asep = (asep) asem.h.createBuilder();
        asfa asfa = this.a;
        if (asfa != null) {
            asep.copyOnWrite();
            asem asem2 = (asem) asep.instance;
            asem2.f = asfa;
            asem2.a |= 16;
        }
        aseq aseq = this.b;
        int i = 2;
        if (aseq != null) {
            asep.copyOnWrite();
            asem = (asem) asep.instance;
            asem.c = aseq;
            asem.a |= 2;
        }
        aseu aseu = this.c;
        if (aseu != null) {
            asep.copyOnWrite();
            asem = (asem) asep.instance;
            asem.d = aseu;
            asem.a |= 4;
        }
        ases ases = this.d;
        if (ases != null) {
            asep.copyOnWrite();
            asem = (asem) asep.instance;
            asem.e = ases;
            asem.a |= 8;
        }
        Boolean bool = this.e;
        if (bool != null) {
            if (bool.booleanValue()) {
                i = 3;
            }
            asep.copyOnWrite();
            asem asem3 = (asem) asep.instance;
            asem3.a |= 32;
            asem3.g = i - 1;
        }
        return asep;
    }
}
