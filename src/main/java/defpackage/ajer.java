package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: ajer */
public class ajer {
    public final List a = new ArrayList();
    private final String b;

    ajer(String str) {
        this.b = str;
    }

    public final void a(String str) {
        for (ajee ajee : this.a) {
            ajet ajet = ajee.i;
            String str2 = this.b;
            String f = ajee.f();
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(f).length() + 1) + String.valueOf(str).length());
            stringBuilder.append(f);
            stringBuilder.append(":");
            stringBuilder.append(str);
            ajet.a(str2, stringBuilder.toString());
        }
    }
}
