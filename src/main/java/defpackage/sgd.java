package defpackage;

import android.text.TextUtils;

/* renamed from: sgd */
public final class sgd {
    public final String a;
    public String b;
    public String c;
    public String d;

    public sgd(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Id must not be empty");
        }
        this.a = str;
    }
}
