package defpackage;

/* renamed from: abiz */
final class abiz extends aaml {
    private final String a;

    abiz(abiu abiu, String str, byte[] bArr) {
        super("get_user_mention_suggestions", abiu.c, abiu.d.c());
        a(bArr);
        this.a = str;
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
    }

    public final /* synthetic */ anzd c() {
        atmd atmd = (atmd) atme.d.createBuilder();
        String str = this.a;
        atmd.copyOnWrite();
        atme atme = (atme) atmd.instance;
        if (str != null) {
            atme.a |= 2;
            atme.c = str;
            return atmd;
        }
        throw new NullPointerException();
    }
}
