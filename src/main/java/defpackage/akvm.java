package defpackage;

/* renamed from: akvm */
public class akvm extends akty {
    public akvm(akvz akvz, xci xci, akao akao, ajwd ajwd, akvj akvj, akyd akyd) {
        this(akvz, xci, akao, ajwd, akvj, null, akyd, ampo.a);
    }

    /* Access modifiers changed, original: protected|final */
    public final Class d() {
        return ajwd.class;
    }

    public akvm(akvz akvz, xci xci, akao akao, ajwd ajwd, akvj akvj, akxt akxt, akyd akyd, amqp amqp) {
        int i;
        akao akao2;
        ajwd ajwd2 = ajwd;
        ajwg[] ajwgArr = ajwd2.a;
        int i2 = ajwd2.e;
        if (i2 <= 0) {
            i2 = ajwd2.d;
            if (i2 == 0) {
                i = 3;
                akao2 = akao;
                super(akvz, xci, akao2, ajwgArr, i, akvj, amqp, ajqy.a(ajwd2.b), akao2.c, akxt, akyd);
            }
        }
        i = i2;
        akao2 = akao;
        super(akvz, xci, akao2, ajwgArr, i, akvj, amqp, ajqy.a(ajwd2.b), akao2.c, akxt, akyd);
    }

    /* Access modifiers changed, original: protected|final */
    public final void e() {
        a(new akvk(this.k));
    }
}
