package defpackage;

/* renamed from: yif */
final class yif extends bbze {
    private final /* synthetic */ yih a;
    private final /* synthetic */ yig b;

    yif(yig yig, yih yih) {
        this.b = yig;
        this.a = yih;
    }

    public final void a() {
    }

    private final void a(aadz aadz) {
        aadq c;
        try {
            c = aadz.c();
            aadz.e();
            if (c != null) {
                xsd xsd = this.a.b;
                if (xsd != null) {
                    xsd.a(c);
                }
            }
        } catch (ClassCastException e) {
            if (!this.b.a(c.getClass())) {
                throw e;
            }
        } catch (Error | Exception e2) {
            this.b.a.post(new yii(e2));
            return;
        }
        xsd xsd2 = this.a.c;
        if (xsd2 != null) {
            xsd2.a(aadz);
        }
    }

    public final void a(Throwable th) {
        xsd xsd = this.a.d;
        if (xsd != null) {
            xsd.a(th);
        }
    }

    public final /* synthetic */ void b_(Object obj) {
        a((aadz) obj);
    }
}
