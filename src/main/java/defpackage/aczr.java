package defpackage;

/* renamed from: aczr */
public final class aczr {
    private final acum a;

    public aczr(acum acum) {
        this.a = acum;
    }

    static {
        xtl.b("MDX.BackgroundPlaybackLogger");
    }

    /* Access modifiers changed, original: final */
    public final boolean a(int i, int i2, boolean z, String str) {
        Object[] objArr = new Object[4];
        i--;
        objArr[0] = Integer.valueOf(i);
        int i3 = i2 - 1;
        if (i2 != 0) {
            objArr[1] = Integer.valueOf(i3);
            objArr[2] = Boolean.valueOf(z);
            objArr[3] = str;
            String.format("playbackResult:%d sessionType:%d retry:%s playlistId:%s", objArr);
            aupq aupq = (aupq) aupn.f.createBuilder();
            aupq.copyOnWrite();
            aupn aupn = (aupn) aupq.instance;
            aupn.a = 1 | aupn.a;
            aupn.b = i;
            aupq.copyOnWrite();
            aupn aupn2 = (aupn) aupq.instance;
            if (i2 != 0) {
                aupn2.a |= 2;
                aupn2.c = i3;
                aupq.copyOnWrite();
                aupn2 = (aupn) aupq.instance;
                aupn2.a |= 8;
                aupn2.d = z;
                aupq.copyOnWrite();
                aupn2 = (aupn) aupq.instance;
                if (str != null) {
                    aupn2.a |= 16;
                    aupn2.e = str;
                    asmz asmz = (asmz) asmw.f.createBuilder();
                    asmz.copyOnWrite();
                    asmw asmw = (asmw) asmz.instance;
                    asmw.c = (anxl) aupq.build();
                    asmw.b = 92;
                    return this.a.a((asmw) ((anxl) asmz.build()));
                }
                throw new NullPointerException();
            }
            throw new NullPointerException();
        }
        throw null;
    }
}
