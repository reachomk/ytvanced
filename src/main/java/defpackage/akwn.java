package defpackage;

/* renamed from: akwn */
public final class akwn extends akpk {
    public final void a(akwl akwl) {
        if (akwl == null) {
            if (!isEmpty()) {
                clear();
            }
        } else if (isEmpty()) {
            add(akwl);
        } else {
            if (((akwl) get(0)) != akwl) {
                a(0, (Object) akwl);
            }
        }
    }

    public final /* synthetic */ void b(akng akng) {
        super.a(akng);
    }
}
