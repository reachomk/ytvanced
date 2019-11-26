package defpackage;

import android.view.View;

/* renamed from: srb */
final /* synthetic */ class srb implements swy {
    private final sra a;
    private final baoq b;
    private final azsr c;
    private final swn d;

    srb(sra sra, baoq baoq, azsr azsr, swn swn) {
        this.a = sra;
        this.b = baoq;
        this.c = azsr;
        this.d = swn;
    }

    public final void a(View view) {
        sra sra = this.a;
        baoq baoq = this.b;
        azsr azsr = this.c;
        swn swn = this.d;
        if (!sra.a.containsKey(baoq)) {
            sra.a.put(baoq, Boolean.valueOf(true));
            sra.b.a(azsr, sra.a(view, null, swn)).a(sra.c).c();
        }
    }

    public final void a(View view, View view2) {
        swx.a(this, view);
    }
}
