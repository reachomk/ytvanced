package defpackage;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: uii */
public class uii {
    public final uij a;
    public final Object b;
    public final String c;
    public final uig[] d;
    public boolean e = true;
    public Map f;
    public int g;

    uii(String str, uij uij, uig... uigArr) {
        this.c = (String) amqw.a((Object) str);
        this.d = uigArr;
        this.f = new HashMap(10);
        this.g = 0;
        this.a = (uij) amqw.a((Object) uij);
        this.b = new Object();
    }

    public final void a() {
        this.e = false;
    }

    public final boolean a(uig... uigArr) {
        if (Arrays.equals(this.d, uigArr)) {
            return true;
        }
        String str = this.c;
        String arrays = Arrays.toString(this.d);
        String arrays2 = Arrays.toString(uigArr);
        int length = String.valueOf(str).length();
        StringBuilder stringBuilder = new StringBuilder(((length + 32) + String.valueOf(arrays).length()) + String.valueOf(arrays2).length());
        stringBuilder.append("Streamz ");
        stringBuilder.append(str);
        stringBuilder.append(" with field diffs: ");
        stringBuilder.append(arrays);
        stringBuilder.append(" and ");
        stringBuilder.append(arrays2);
        throw new uio(stringBuilder.toString());
    }
}
