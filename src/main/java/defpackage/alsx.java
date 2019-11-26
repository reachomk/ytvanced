package defpackage;

import android.text.TextUtils;

/* renamed from: alsx */
public final class alsx extends abfc {
    public final bcaa g;
    public final alss h;
    public final xci i;

    public alsx(aamn aamn, aamd aamd, abfi abfi, afpu afpu, xhf xhf, xsc xsc, String str, aajx aajx, abfd abfd, aala aala, zyw zyw, bcaa bcaa, alss alss, xci xci) {
        super(aamn, aamd, abfi, afpu, xhf, xsc, str, aajx, abfd, aala, zyw, xci);
        this.g = bcaa;
        this.h = alss;
        this.i = xci;
    }

    public final void a(abfj abfj, afsw afsw, String str, aaje aaje, boolean z) {
        if (this.h.d()) {
            super.a(abfj, new alsw(this, afsw), str, aaje, z);
            return;
        }
        super.a(abfj, afsw, str, aaje, z);
    }

    /* Access modifiers changed, original: protected|final */
    public final void b(abfj abfj, afsw afsw, String str, aaje aaje, boolean z) {
        if (this.h.d()) {
            super.b(abfj, new alsz(this, abfj, !TextUtils.isEmpty(abfj.a) ? this.h.a(abfj.a, str) : null, str, afsw), str, aaje, z);
        } else {
            super.b(abfj, afsw, str, aaje, z);
        }
    }
}
