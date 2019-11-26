package defpackage;

/* renamed from: afpj */
public final class afpj implements xai {
    private final afpf a;
    private final String b;

    public afpj(afpf afpf, String str) {
        this.a = (afpf) amqw.a((Object) afpf);
        this.b = (String) amqw.a((Object) str);
    }

    public final void a() {
    }

    public final void a(Throwable th) {
        if (th != null) {
            afpc.a(1, this.a, this.b, th);
        }
    }
}
