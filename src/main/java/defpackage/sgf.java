package defpackage;

import android.os.Build.VERSION;
import java.util.Locale;

/* renamed from: sgf */
public final class sgf {
    public static answ a(boolean z) {
        answ answ = (answ) ansx.l.createBuilder();
        antj antj = (antj) antg.c.createBuilder();
        antj.a(sga.a.toString());
        antj.copyOnWrite();
        ((antg) antj.instance).b = z;
        answ.copyOnWrite();
        ((ansx) answ.instance).a = (antg) ((anxl) antj.build());
        if (VERSION.SDK_INT < 21) {
            answ.b(Locale.getDefault().getLanguage());
        } else {
            answ.b(Locale.getDefault().toLanguageTag());
        }
        return answ;
    }

    public static boolean a(String str) {
        sjl sjl = sga.a().c;
        return sjl.a().b().contains(str);
    }
}
