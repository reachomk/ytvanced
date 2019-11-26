package defpackage;

/* renamed from: ijz */
final class ijz extends xto {
    private final /* synthetic */ agtl a;
    private final /* synthetic */ agtr b;

    ijz(String str, agtl agtl, agtr agtr) {
        this.a = agtl;
        this.b = agtr;
        super(str);
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ Object a() {
        return new agtp(this.a, this.b);
    }
}
