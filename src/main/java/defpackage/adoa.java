package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: adoa */
public final class adoa extends adnc {
    public adoa(xci xci, ajam ajam, bcaa bcaa, adqf adqf) {
        super(xci, (adnd) ajam.k(), bcaa, adqf);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(adpw adpw) {
        this.a.d(new adoc(adpw));
    }

    /* Access modifiers changed, original: protected|final */
    public final void b(adpw adpw) {
        this.a.d(new adob(adpw));
    }

    /* Access modifiers changed, original: protected|final */
    public final void a() {
        TimeUnit.MILLISECONDS.toSeconds(c().n());
        this.a.d(new adnz(false));
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        this.a.d(new adnz(true));
    }
}
