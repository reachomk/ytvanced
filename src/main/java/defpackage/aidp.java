package defpackage;

/* renamed from: aidp */
public final class aidp implements ajan {
    public final /* synthetic */ aidq a;

    public aidp(aidq aidq) {
        this.a = aidq;
    }

    public final long e() {
        return 1;
    }

    public final bcuo[] a(ajam ajam) {
        bcuo[] bcuoArr = new bcuo[2];
        bctz C = ajam.C();
        bcvq bcvq = aids.a;
        if (C.getClass() == bdci.class) {
            C = bdci.h();
        } else {
            C = bctz.a(C.b(bcvq));
        }
        bcuoArr[0] = C.a(new aidr(this));
        bcuoArr[1] = ajam.A().a(new aidu(this));
        return bcuoArr;
    }
}
