package defpackage;

/* renamed from: ull */
public final class ull {
    public static ulk a(ulo ulo) {
        amqw.a((Object) ulo);
        if (ulo.b.equals("mvhd")) {
            return new uln(ulo);
        }
        if (ulo.b.equals("tkhd")) {
            return new ulp(ulo);
        }
        if (ulo.b.equals("stco")) {
            return new ulq(ulo);
        }
        if (ulo.b.equals("co64")) {
            return new ulj(ulo);
        }
        if (ulo.b.equals("moov") || ulo.b.equals("trak") || ulo.b.equals("edts") || ulo.b.equals("mdia") || ulo.b.equals("minf") || ulo.b.equals("dinf") || ulo.b.equals("stbl")) {
            return new ulr(ulo);
        }
        return new ulk(ulo);
    }
}
