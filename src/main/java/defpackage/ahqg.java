package defpackage;

/* renamed from: ahqg */
final class ahqg implements Runnable {
    private final /* synthetic */ float a;
    private final /* synthetic */ float b;
    private final /* synthetic */ ahqh c;

    ahqg(ahqh ahqh, float f, float f2) {
        this.c = ahqh;
        this.a = f;
        this.b = f2;
    }

    public final void run() {
        ahqh ahqh = this.c;
        float f = this.a;
        float f2 = this.b;
        ajen ajen = ahqh.a;
        int round = Math.round(f);
        int round2 = Math.round(f2);
        StringBuilder stringBuilder = new StringBuilder(23);
        stringBuilder.append(round);
        stringBuilder.append(":");
        stringBuilder.append(round2);
        ajen.a(stringBuilder.toString());
    }
}
