package defpackage;

/* renamed from: aeuq */
final /* synthetic */ class aeuq implements Runnable {
    private final aety a;

    aeuq(aety aety) {
        this.a = aety;
    }

    public final void run() {
        aety aety = this.a;
        long a = aety.b.a();
        long j = aety.c;
        StringBuilder stringBuilder = new StringBuilder(35);
        stringBuilder.append("start_delta_ms.");
        stringBuilder.append(a - j);
        aety.a("empup", new aetw(stringBuilder.toString()));
    }
}
