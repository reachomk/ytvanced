package defpackage;

/* renamed from: hzv */
final /* synthetic */ class hzv implements bcvq {
    private final hzr a;

    hzv(hzr hzr) {
        this.a = hzr;
    }

    public final Object a(Object obj) {
        hzr hzr = this.a;
        ahkn ahkn = (ahkn) obj;
        int i = 4;
        if (hzr.c.isWiredHeadsetOn()) {
            i = 3;
        } else if (!(hzr.c.isBluetoothA2dpOn() || hzr.c.isBluetoothScoOn())) {
            i = 2;
        }
        boolean z = false;
        if (ahkn.a.equals(airi.NEW) || ahkn.a.equals(airi.ENDED)) {
            return new hzn(i, "", false, false);
        }
        aakj aakj = ahkn.b;
        boolean z2 = aakj != null && aakj.k();
        if (aakj != null && aiqr.d(aakj.l())) {
            z = true;
        }
        return new hzn(i, ahkn.e, z2, z);
    }
}
