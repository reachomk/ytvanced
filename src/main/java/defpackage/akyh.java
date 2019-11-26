package defpackage;

/* renamed from: akyh */
public class akyh implements akwb {
    public final akvj a;
    public final acvx b;
    private final aana c;
    private final xci d;
    private final akvz e;
    private final xoi f;

    public akyh(aana aana, xci xci, akvz akvz, xoi xoi, acvx acvx) {
        this(aana, xci, akvz, xoi, acvx, null);
    }

    public akyh(aana aana, xci xci, akvz akvz, xoi xoi, acvx acvx, akvj akvj) {
        this.c = (aana) amqw.a((Object) aana);
        this.d = (xci) amqw.a((Object) xci);
        this.e = (akvz) amqw.a((Object) akvz);
        this.b = (acvx) amqw.a((Object) acvx);
        this.f = (xoi) amqw.a((Object) xoi);
        this.a = akvj;
    }

    public akvy a(Object obj, akyd akyd, akxv akxv) {
        if (obj instanceof aafj) {
            akwe akwe = new akwe(this.c, this.e, this.d, this.f, this.b, akyd);
            if (akyd == null) {
                akwe.a((aafj) obj);
            }
            return akwe;
        } else if (obj instanceof ajwr) {
            return new akwj(this.c, this.e, this.d, this.f, this.b, (ajwr) obj);
        } else {
            akao akao;
            if (obj instanceof aafs) {
                akao = ((aafs) obj).a;
                return new akye(this.e, this.d, akao, akxy.b(akao), null, akyd);
            } else if (obj instanceof aafg) {
                akao = ((aafg) obj).a;
                return new akvm(this.e, this.d, akao, akxy.a(akao), this.a, akyd);
            } else if (!(obj instanceof ajyf)) {
                return null;
            } else {
                akwu akwu = new akwu(this.c, this.e, this.d, this.f, this.b);
                akwu.a((ajyf) obj);
                return akwu;
            }
        }
    }
}
