package defpackage;

/* renamed from: adtt */
final class adtt implements aduc {
    private final /* synthetic */ adtp a;

    adtt(adtp adtp) {
        this.a = adtp;
    }

    public final void a(adqp adqp) {
        this.a.h();
        int a = adqp.a();
        if (a == 0) {
            return;
        }
        if (a == 1) {
            for (adqh adqh : this.a.b) {
                adqp.b();
                adqh.a();
            }
        } else if (a == 2) {
            for (adqh c : this.a.b) {
                c.c();
            }
        } else if (a == 3) {
            for (adqh c2 : this.a.b) {
                c2.b();
            }
        } else if (a == 4) {
            for (adqh adqh2 : this.a.b) {
                adqp.b();
                adqh2.d();
            }
        } else {
            int a2 = adqp.a();
            StringBuilder stringBuilder = new StringBuilder(28);
            stringBuilder.append("unexpected state:");
            stringBuilder.append(a2);
            throw new AssertionError(stringBuilder.toString());
        }
    }
}
