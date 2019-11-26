package defpackage;

/* renamed from: wey */
public final class wey implements wef {
    private final aknh a;
    private final aktv b;
    private final akxl c;

    public wey(akvy akvy) {
        akxl akxl = null;
        this.a = akvy != null ? akvy.a() : null;
        this.b = akvy instanceof aktv ? (aktv) akvy : null;
        if (akvy instanceof akxl) {
            akxl = (akxl) akvy;
        }
        this.c = akxl;
    }

    public final void a(ajst ajst, boolean z) {
        aknh aknh = this.a;
        if (!(aknh == null || this.b == null)) {
            int d = aknh.d();
            apcz apcz = null;
            int i = 0;
            for (int i2 = 0; i2 < d; i2++) {
                Object c = this.a.c(i2);
                if (c instanceof ajsw) {
                    i = -1;
                } else if (c instanceof apcz) {
                    apcz = (apcz) c;
                } else {
                    ajst ajst2 = c instanceof ajst ? (ajst) c : null;
                    if (ajst2 != null) {
                        int i3 = ajst.i;
                        if (i3 != 0) {
                            int i4 = ajst2.i;
                            if (i4 != 0 && i3 - 1 >= i4 - 1) {
                                this.b.a(ajst, i2 + i);
                                akxl akxl = this.c;
                                if (akxl != null && z && ajst.i == ajst2.i) {
                                    akxl.c(ajst2);
                                }
                                a(apcz);
                                return;
                            }
                        }
                        continue;
                    } else {
                        continue;
                    }
                }
            }
            this.b.a(ajst);
            a(apcz);
        }
    }

    private final void a(apcz apcz) {
        if (apcz != null) {
            akxl akxl = this.c;
            if (akxl != null) {
                akxl.c(apcz);
            }
        }
    }
}
