package defpackage;

import java.util.HashSet;
import java.util.Set;

/* renamed from: wen */
public final class wen extends wex {
    public final Set a = new HashSet();

    public wen(wek wek, akvy akvy, ajst ajst) {
        super(wek, akvy, ajst);
    }

    public final void b(ajsn ajsn) {
        super.b(ajsn);
        a(new weq(ajsn));
    }

    public final void c() {
        super.c();
        a(wep.a);
    }

    public final void c(ajsn ajsn) {
        super.c(ajsn);
        a(new wes(ajsn));
    }

    public final void b(ajsn ajsn, ajsn ajsn2) {
        super.b(ajsn, ajsn2);
        a(new wer(ajsn, ajsn2));
    }

    public final void d() {
        ajss ajss = this.b.b;
        if (ajss != null) {
            ajsq ajsq = ajss.a;
            if (ajsq != null) {
                ajsu[] ajsuArr = ajsq.b;
                if (ajsuArr != null) {
                    for (ajsu ajsu : ajsuArr) {
                        super.b(ajsu.a);
                    }
                }
            }
        }
    }

    private final void a(weu weu) {
        for (wei a : this.a) {
            weu.a(a);
        }
    }
}
