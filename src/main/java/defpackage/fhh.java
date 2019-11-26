package defpackage;

import java.util.ArrayList;

/* renamed from: fhh */
public final class fhh {
    public final ffu a;
    public final int b;
    public final ArrayList c = new ArrayList();
    public final bbzr d = bbzr.e();
    public final bbzr e = bbzr.e();
    public int f = 0;
    public int g = 0;
    public fhh h;

    fhh(fob fob, fgz fgz, int i) {
        this.a = new ffu(fgz, fob);
        this.b = i;
    }

    /* Access modifiers changed, original: final */
    public final void a(fgs fgs) {
        this.c.remove(fgs);
    }

    /* Access modifiers changed, original: final */
    public final boolean a() {
        return this.c.isEmpty() ^ 1;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[ Inline playback request");
        String valueOf = String.valueOf(this.a.b);
        StringBuilder stringBuilder2 = new StringBuilder(valueOf.length() + 17);
        stringBuilder2.append(": autoplayable = ");
        stringBuilder2.append(valueOf);
        stringBuilder.append(stringBuilder2.toString());
        int i = this.f;
        StringBuilder stringBuilder3 = new StringBuilder(29);
        stringBuilder3.append(", current state = ");
        stringBuilder3.append(i);
        stringBuilder.append(stringBuilder3.toString());
        i = this.g;
        stringBuilder3 = new StringBuilder(22);
        stringBuilder3.append(", status = ");
        stringBuilder3.append(i);
        stringBuilder.append(stringBuilder3.toString());
        stringBuilder.append(", next request = ");
        stringBuilder.append(this.h);
        return stringBuilder.toString();
    }
}
