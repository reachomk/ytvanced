package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.util.List;
import java.util.Map.Entry;

/* renamed from: ajes */
final /* synthetic */ class ajes implements Runnable {
    private final ajet a;
    private final ajeu b;
    private final xvo c;
    private final afpt d;

    ajes(ajet ajet, ajeu ajeu, xvo xvo, afpt afpt) {
        this.a = ajet;
        this.b = ajeu;
        this.c = xvo;
        this.d = afpt;
    }

    public final void run() {
        ajet ajet = this.a;
        ajeu ajeu = this.b;
        xvo xvo = this.c;
        afpt afpt = this.d;
        for (ajev a : ajet.c) {
            a.a(ajeu);
        }
        for (Entry entry : ajeu.a.entrySet()) {
            List list = (List) entry.getValue();
            String str = (String) entry.getKey();
            if (!list.isEmpty()) {
                String str2 = ",";
                if (TextUtils.equals("cat", str)) {
                    String join = TextUtils.join(str2, list);
                    if (xvo.b(str) != null) {
                        xvo.a(str, String.format("%s%s%s", new Object[]{xvo.b(str), str2, join}));
                    } else {
                        xvo.a(str, join, ",:;", false, true);
                    }
                } else {
                    xvo.a(str, TextUtils.join(str2, list), ",:;");
                }
                list.clear();
            }
        }
        Uri a2 = xvo.a();
        ajfb.a(a2);
        afqy a3 = afqv.a("qoe");
        a3.a(a2);
        a3.e = true;
        a3.a(new aakn(ajet.d));
        a3.h = afpt;
        ajet.a.a(ajet.b, a3, aftp.a);
    }
}
