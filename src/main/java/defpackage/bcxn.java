package defpackage;

/* renamed from: bcxn */
final class bcxn implements bcuc {
    private final /* synthetic */ bcxk a;

    bcxn(bcxk bcxk) {
        this.a = bcxk;
    }

    public final void a(long j) {
        if (j < 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("n >= required but it was ");
            stringBuilder.append(j);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (j != 0) {
            this.a.a(bcvu.a(j, (long) this.a.a));
        }
    }
}
