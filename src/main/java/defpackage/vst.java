package defpackage;

/* renamed from: vst */
public final class vst implements vss {
    public final String a;
    public final vsm b;
    public final vsv c;
    public final String d;
    public final ajmq e;
    public final aakj f;
    public final vqy g;

    public vst(String str, vsm vsm, String str2, ajmq ajmq, aakj aakj, vqy vqy) {
        this(str, vsm, null, str2, ajmq, aakj, vqy);
    }

    public vst(String str, vsv vsv, String str2, ajmq ajmq, aakj aakj, vqy vqy) {
        this(str, vqy.e(), vsv, str2, ajmq, aakj, vqy);
    }

    private vst(String str, vsm vsm, vsv vsv, String str2, ajmq ajmq, aakj aakj, vqy vqy) {
        this.a = (String) amqw.a((Object) str);
        this.b = vsm;
        this.c = vsv;
        this.d = str2;
        this.e = ajmq;
        this.f = aakj;
        this.g = vqy;
    }

    public final String a() {
        return this.a;
    }
}
