package defpackage;

/* renamed from: rag */
public final class rag extends ret implements rgj {
    private rag() {
        super(rad.zzsav);
    }

    public final rag a(String str) {
        b();
        ((rad) this.a).zzsat = str;
        return this;
    }

    public final rag a(qze qze) {
        b();
        rad rad = (rad) this.a;
        if (qze != null) {
            if (!rad.zzsau.a()) {
                rfi rfi = rad.zzsau;
                int size = rfi.size();
                rad.zzsau = rfi.a(size != 0 ? size + size : 10);
            }
            rad.zzsau.add(qze);
            return this;
        }
        throw new NullPointerException();
    }

    /* synthetic */ rag(byte b) {
        super(rad.zzsav);
    }
}
