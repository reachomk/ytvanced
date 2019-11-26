package defpackage;

import java.security.Key;

/* renamed from: aivj */
public final class aivj extends afio {
    private final amro a;
    private final Key b;
    private final afia c;
    private final zzl d;

    public aivj(amro amro, Key key, afia afia, zzl zzl) {
        this.a = (amro) amqw.a((Object) amro);
        this.b = key;
        this.c = afia;
        this.d = (zzl) amqw.a((Object) zzl);
    }

    public final ovi a(ovi ovi) {
        oww oww = (oww) this.a.get();
        if (oww == null) {
            return ovi;
        }
        auuo auuo = this.d.b().k;
        if (auuo == null) {
            auuo = auuo.k;
        }
        arhf arhf = auuo.b;
        if (arhf == null) {
            arhf = arhf.d;
        }
        oxv oxv = new oxv(this.b.getEncoded(), new owx(oww, 5242880, arhf.b), new byte[4096]);
        return new oxc(oww, ovi, new oxy(this.b.getEncoded(), new ovw()), oxv, 6, this.c);
    }
}
