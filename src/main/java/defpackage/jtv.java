package defpackage;

/* renamed from: jtv */
final class jtv extends akpk {
    private int a;

    jtv(int i) {
        b(i);
    }

    /* Access modifiers changed, original: final */
    public final void b(int i) {
        if (this.a != i) {
            this.a = i;
            if (i <= 0) {
                if (!isEmpty()) {
                    clear();
                }
            } else if (isEmpty()) {
                add(epq.b(i));
            } else {
                a(0, epq.b(i));
            }
        }
    }

    public final /* synthetic */ void a(akng akng) {
        super.b(akng);
    }
}
