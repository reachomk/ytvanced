package defpackage;

import java.util.Arrays;
import java.util.List;

/* renamed from: aatx */
public final class aatx extends aaml {
    public String[] a;

    public aatx(aamd aamd, afpt afpt) {
        super("connections/get_phonebook", aamd, afpt);
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        String[] strArr = this.a;
        boolean z = false;
        if (strArr != null && strArr.length > 0) {
            z = true;
        }
        amqw.a(z);
    }

    public final /* synthetic */ anzd c() {
        atbj atbj = (atbj) atbk.d.createBuilder();
        List asList = Arrays.asList(this.a);
        atbj.copyOnWrite();
        atbk atbk = (atbk) atbj.instance;
        if (!atbk.c.a()) {
            atbk.c = anxl.mutableCopy(atbk.c);
        }
        anvf.addAll(asList, atbk.c);
        return atbj;
    }
}
