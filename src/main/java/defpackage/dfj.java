package defpackage;

import android.text.TextUtils;
import java.util.List;

/* renamed from: dfj */
public final class dfj extends RuntimeException {
    public dfj(String str, List list) {
        String join = TextUtils.join("\n  - ", list);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 2) + String.valueOf(join).length());
        stringBuilder.append(str);
        stringBuilder.append(": ");
        stringBuilder.append(join);
        super(stringBuilder.toString());
    }
}
