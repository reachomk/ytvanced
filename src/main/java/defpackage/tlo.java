package defpackage;

import java.util.Iterator;

/* renamed from: tlo */
public final class tlo extends tlp implements tlv {
    public tlo(run run) {
        super(run);
    }

    public final Iterator iterator() {
        return new tlt(this);
    }

    public final /* synthetic */ Object a(int i) {
        return new tlu((ruo) ((run) this.a).a(i));
    }
}
