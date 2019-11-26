package defpackage;

/* renamed from: bczl */
final class bczl implements bcuc {
    private final /* synthetic */ bczj a;

    bczl(bczj bczj) {
        this.a = bczj;
    }

    public final void a(long j) {
        if (j > 0) {
            bcuc bcuc;
            bczj bczj = this.a;
            synchronized (bczj) {
                bcuc = bczj.f;
                bczj.e = bcvu.b(bczj.e, j);
            }
            if (bcuc != null) {
                bcuc.a(j);
            }
            bczj.e();
        } else if (j < 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("n >= 0 expected but it was ");
            stringBuilder.append(j);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }
}
