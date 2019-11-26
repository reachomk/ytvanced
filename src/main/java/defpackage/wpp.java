package defpackage;

/* renamed from: wpp */
public final class wpp {
    public int a;
    private anvu b;

    public final wpp a(byte[] bArr) {
        this.b = anvu.a(bArr);
        return this;
    }

    private final azlq e() {
        azlp azlp = (azlp) azlq.d.createBuilder();
        anvu anvu = this.b;
        azlp.copyOnWrite();
        azlq azlq = (azlq) azlp.instance;
        if (anvu != null) {
            azlq.a |= 1;
            azlq.b = anvu;
            int i = this.a;
            if (i == 0) {
                i = 1;
            }
            azlp.copyOnWrite();
            azlq = (azlq) azlp.instance;
            azlq.a |= 2;
            azlq.c = i - 1;
            return (azlq) ((anxl) azlp.build());
        }
        throw new NullPointerException();
    }

    public final asmw a() {
        asmz asmz = (asmz) asmw.f.createBuilder();
        azlq e = e();
        asmz.copyOnWrite();
        asmw asmw = (asmw) asmz.instance;
        if (e != null) {
            asmw.c = e;
            asmw.b = 176;
            return (asmw) ((anxl) asmz.build());
        }
        throw new NullPointerException();
    }

    public final asmw b() {
        asmz asmz = (asmz) asmw.f.createBuilder();
        azlq e = e();
        asmz.copyOnWrite();
        asmw asmw = (asmw) asmz.instance;
        if (e != null) {
            asmw.c = e;
            asmw.b = 177;
            return (asmw) ((anxl) asmz.build());
        }
        throw new NullPointerException();
    }

    public final asmw c() {
        asmz asmz = (asmz) asmw.f.createBuilder();
        azlq e = e();
        asmz.copyOnWrite();
        asmw asmw = (asmw) asmz.instance;
        if (e != null) {
            asmw.c = e;
            asmw.b = 178;
            return (asmw) ((anxl) asmz.build());
        }
        throw new NullPointerException();
    }

    public final asmw d() {
        asmz asmz = (asmz) asmw.f.createBuilder();
        azlq e = e();
        asmz.copyOnWrite();
        asmw asmw = (asmw) asmz.instance;
        if (e != null) {
            asmw.c = e;
            asmw.b = 179;
            return (asmw) ((anxl) asmz.build());
        }
        throw new NullPointerException();
    }
}
