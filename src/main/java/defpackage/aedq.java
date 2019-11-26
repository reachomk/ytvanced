package defpackage;

import java.util.concurrent.Executor;

/* renamed from: aedq */
final /* synthetic */ class aedq implements amro {
    private final String a;
    private final aedf b;
    private final Executor c;
    private final aeqo d;
    private final avtc e;
    private final int f;
    private final long g;

    aedq(String str, aedf aedf, Executor executor, aeqo aeqo, avtc avtc, int i, long j) {
        this.a = str;
        this.b = aedf;
        this.c = executor;
        this.d = aeqo;
        this.e = avtc;
        this.f = i;
        this.g = j;
    }

    public final Object get() {
        String str = this.a;
        aedf aedf = this.b;
        Executor executor = this.c;
        aeqo aeqo = this.d;
        avtc avtc = this.e;
        return new oeo(aedo.a(str, aedf, executor, aeqo, avtc), this.f, this.g);
    }
}
