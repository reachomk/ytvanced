package defpackage;

/* renamed from: abou */
final /* synthetic */ class abou implements akoq {
    private final abov a;

    abou(abov abov) {
        this.a = abov;
    }

    public final void a(akor akor, aknh aknh, int i) {
        abov abov = this.a;
        if (i >= 0 && i < abov.a.size()) {
            Object a = abov.a((String) abov.a.get(i));
            if (a != null) {
                akor.a("live_chat_item_action", a);
            }
        }
    }
}
