package defpackage;

/* renamed from: aiii */
public final class aiii {
    public final aiij a;
    public final aiik b;
    public final aiif c;
    public boolean d = false;
    public boolean e;

    public aiii(aiif aiif) {
        this.c = aiif;
        this.a = new aiij(this);
        this.b = new aiik(this);
    }

    public final void a(ajxu ajxu) {
        atdn atdn = ajxu.w;
        if (atdn != null && !this.d) {
            arml arml;
            avuv avuv = atdn.a == 130741768 ? (avuv) atdn.b : avuv.d;
            this.c.a(avuv.c);
            aiif aiif = this.c;
            if ((avuv.a & 1) != 0) {
                arml = avuv.b;
                if (arml == null) {
                    arml = arml.f;
                }
            } else {
                arml = null;
            }
            aiif.a(ajqy.a(arml));
            this.d = true;
            this.c.bC_();
        }
    }
}
