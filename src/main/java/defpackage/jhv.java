package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.text.Spanned;

/* renamed from: jhv */
public class jhv extends akty {
    private static final jhx a = new jhx();
    private final jhy b;

    public jhv(Context context, akvz akvz, xci xci, akao akao, ajvy ajvy, jhy jhy, akyd akyd) {
        ajvy ajvy2 = ajvy;
        ajvx[] ajvxArr = ajvy2.a;
        int length = ajvxArr.length;
        ampo ampo = ampo.a;
        Spanned a = ajqy.a(ajvy2.b);
        apxu apxu = akao.c;
        arsm arsm = ajvy2.d;
        int i = 1;
        if (arsm != null) {
            int a2 = arso.a(arsm.b);
            if (a2 != 0) {
                i = a2;
            }
        }
        Context context2 = context;
        super(akvz, xci, akao, ajvxArr, length, jhy, ampo, a, apxu, null, akyd, new jhw(context, i));
        this.b = jhy;
    }

    /* Access modifiers changed, original: protected|final */
    public final Class d() {
        return ajvy.class;
    }

    public final void a(Configuration configuration) {
        this.b.a();
    }

    /* Access modifiers changed, original: protected|final */
    public final void e() {
        a(a);
    }
}
