package defpackage;

import java.net.InetSocketAddress;

/* renamed from: bawm */
public final class bawm extends baxe {
    private final int A = 4194304;
    private final bciz z;

    public static bawm a(String str, int i, bciz bciz) {
        amqw.a((Object) bciz, (Object) "cronetEngine");
        return new bawm(str, i, bciz);
    }

    private bawm(String str, int i, bciz bciz) {
        super(InetSocketAddress.createUnresolved(str, i), bbby.a(str, i));
        this.z = (bciz) amqw.a((Object) bciz, (Object) "cronetEngine");
    }

    /* Access modifiers changed, original: protected|final */
    public final bazp a() {
        return new bawl(new bawn(this.z), aniv.a, this.A, new bbht(this.w.a));
    }
}
