package defpackage;

import java.util.List;

/* renamed from: abjb */
public final class abjb extends aanf {
    public final aang a;
    public final aang b;
    private final abjg g;

    protected abjb() {
        this.a = null;
        this.b = null;
        this.g = null;
    }

    public abjb(aamf aamf, aamd aamd, afpu afpu, xhf xhf, abjg abjg) {
        super(aamd, afpu, xhf);
        amqw.a((Object) aamf);
        this.a = a(atiy.j, aamf, abja.a, abjd.a);
        this.b = a(atjc.h, aamf, abjc.a, abjf.a);
        this.g = (abjg) amqw.a((Object) abjg);
    }

    public final void a(List list) {
        for (aule aule : list) {
            this.g.a(aule.b);
        }
    }
}
