package defpackage;

import java.util.Collection;

/* renamed from: yur */
final /* synthetic */ class yur implements bbnp {
    private final yuh a;
    private final ykp b;
    private final Collection c;

    yur(yuh yuh, ykp ykp, Collection collection) {
        this.a = yuh;
        this.b = ykp;
        this.c = collection;
    }

    public final void a() {
        yuh yuh = this.a;
        ykp ykp = this.b;
        yuh.a(ykp.getConversationId(), this.c);
    }
}
