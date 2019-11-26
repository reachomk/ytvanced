package defpackage;

/* renamed from: aetf */
final class aetf extends aaml {
    private final asmd a = ((asmd) asma.k.createBuilder());

    public aetf(aamd aamd, afpu afpu, byte[] bArr, String str, String str2, String str3, String str4, Integer num) {
        super("player/get_drm_license", aamd, afpu.c());
        g();
        asmd asmd = this.a;
        asmd.copyOnWrite();
        asma asma = (asma) asmd.instance;
        if (str != null) {
            asma.a |= 2;
            asma.c = str;
            asmd.copyOnWrite();
            asma = (asma) asmd.instance;
            asma.a |= 4;
            boolean z = true;
            asma.d = 1;
            anvu a = anvu.a((byte[]) amqw.a((Object) bArr));
            asmd.copyOnWrite();
            asma asma2 = (asma) asmd.instance;
            if (a != null) {
                asma2.a |= 8;
                asma2.e = a;
                String str5 = (String) amqw.a((Object) str3);
                asmd.copyOnWrite();
                asma2 = (asma) asmd.instance;
                if (str5 != null) {
                    asma2.a |= 16;
                    asma2.f = str5;
                    str5 = (String) amqw.a((Object) str2);
                    asmd.copyOnWrite();
                    asma2 = (asma) asmd.instance;
                    if (str5 != null) {
                        asma2.a |= 32;
                        asma2.g = str5;
                        asmd.copyOnWrite();
                        asma = (asma) asmd.instance;
                        if (str4 != null) {
                            asma.a |= 64;
                            asma.h = str4;
                            if (num == null) {
                                z = false;
                            }
                            asmd.copyOnWrite();
                            asma = (asma) asmd.instance;
                            asma.a |= 128;
                            asma.i = z;
                            int intValue = num != null ? num.intValue() : -1;
                            asmd.copyOnWrite();
                            asma asma3 = (asma) asmd.instance;
                            asma3.a |= 256;
                            asma3.j = intValue;
                            return;
                        }
                        throw new NullPointerException();
                    }
                    throw new NullPointerException();
                }
                throw new NullPointerException();
            }
            throw new NullPointerException();
        }
        throw new NullPointerException();
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        amqw.b((((asma) this.a.instance).a & 8) != 0);
    }

    public final /* bridge */ /* synthetic */ anzd c() {
        return this.a;
    }
}
