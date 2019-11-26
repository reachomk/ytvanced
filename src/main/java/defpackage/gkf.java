package defpackage;

import android.graphics.Typeface;
import java.util.EnumMap;

/* renamed from: gkf */
public final class gkf extends EnumMap {
    gkf() {
        super(babk.class);
    }

    public final void a(babk babk, Typeface typeface) {
        gki gki = (gki) get(babk);
        if (gki != null) {
            synchronized (gki) {
                gki.d = typeface;
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final Typeface a(babk babk) {
        gki gki = (gki) get(babk);
        if (gki == null) {
            return null;
        }
        Typeface typeface;
        synchronized (gki) {
            typeface = gki.d;
        }
        return typeface;
    }
}
