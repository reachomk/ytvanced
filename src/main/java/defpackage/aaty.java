package defpackage;

import java.util.Arrays;
import java.util.List;

/* renamed from: aaty */
public final class aaty extends aaml {
    public String a;
    public String[] b;
    public String[] c;

    public aaty(aamd aamd, afpt afpt) {
        super("conversation/invite", aamd, afpt);
        g();
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        amqw.a(this.a);
        amqw.a(this.b);
    }

    public final /* synthetic */ anzd c() {
        asel asel = (asel) asei.f.createBuilder();
        String str = this.a;
        asel.copyOnWrite();
        asei asei = (asei) asel.instance;
        if (str != null) {
            asei.a |= 2;
            asei.c = str;
            List asList = Arrays.asList(this.b);
            asel.copyOnWrite();
            asei = (asei) asel.instance;
            if (!asei.d.a()) {
                asei.d = anxl.mutableCopy(asei.d);
            }
            anvf.addAll(asList, asei.d);
            asList = Arrays.asList(this.c);
            asel.copyOnWrite();
            asei = (asei) asel.instance;
            if (!asei.e.a()) {
                asei.e = anxl.mutableCopy(asei.e);
            }
            anvf.addAll(asList, asei.e);
            return asel;
        }
        throw new NullPointerException();
    }
}
