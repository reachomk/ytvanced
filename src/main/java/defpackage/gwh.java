package defpackage;

/* renamed from: gwh */
final class gwh extends akpk {
    public final /* synthetic */ gwd a;

    public gwh(gwd gwd) {
        this.a = gwd;
    }

    public final void a(String str) {
        a(new jyb(str, new gwg(this)));
    }

    public final void a(Object obj) {
        if (isEmpty()) {
            add(obj);
        } else {
            a(0, obj);
        }
    }

    public final /* synthetic */ void b(akng akng) {
        super.a(akng);
    }
}
