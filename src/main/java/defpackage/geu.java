package defpackage;

import android.content.Context;
import android.text.Spanned;
import java.util.ArrayList;
import java.util.List;

/* renamed from: geu */
public final class geu extends apa {
    public final aaas c;
    public ArrayList d;
    public String e;
    public gej f;
    public gey g;
    public List h;
    private final Context i;
    private final akkl j;
    private final akvp k;

    public geu(Context context, akkl akkl, akvp akvp, aaas aaas) {
        this.i = context;
        this.j = akkl;
        this.k = akvp;
        this.c = aaas;
    }

    public final int a() {
        return this.d.size();
    }

    public static String a(awxs awxs) {
        arml arml = awxs.c;
        if (arml == null) {
            arml = arml.f;
        }
        Spanned a = ajqy.a(arml);
        if (awxs.e.isEmpty()) {
            return a.toString();
        }
        String valueOf = String.valueOf(a);
        String str = awxs.e;
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + String.valueOf(str).length());
        stringBuilder.append(valueOf);
        stringBuilder.append(str);
        return stringBuilder.toString();
    }
}
