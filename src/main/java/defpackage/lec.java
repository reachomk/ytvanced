package defpackage;

import android.text.Editable;

/* renamed from: lec */
final /* synthetic */ class lec implements erc {
    private final leb a;

    lec(leb leb) {
        this.a = leb;
    }

    public final void a(long j) {
        leb leb = this.a;
        if (j <= 0) {
            eqz eqz = leb.h;
            eqz.a.setVisibility(0);
            eqz.b.setVisibility(0);
            eqz.d.afterTextChanged((Editable) eqz.c.getText());
            leb.b();
            return;
        }
        eqz eqz2 = leb.h;
        eqz2.a.setVisibility(8);
        eqz2.b.setVisibility(8);
        leb.k = j;
        leb.j.setEnabled(true);
    }
}
