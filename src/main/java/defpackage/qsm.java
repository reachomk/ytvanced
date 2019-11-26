package defpackage;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* renamed from: qsm */
public final class qsm {
    public static final qsm a = new qsm();
    private Pattern[] b = new Pattern[0];
    private String[] c = new String[0];

    private qsm() {
    }

    public final synchronized void a(String[] strArr, String[] strArr2) {
        int length = strArr.length;
        pzr.b(length == strArr2.length);
        this.b = new Pattern[length];
        this.c = strArr2;
        for (int i = 0; i < strArr.length; i++) {
            this.b[i] = Pattern.compile(strArr[i]);
        }
    }

    public final synchronized String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int i = 0;
        while (true) {
            Pattern[] patternArr = this.b;
            CharSequence str2;
            if (i >= patternArr.length) {
                return str2;
            }
            str2 = patternArr[i].matcher(str2).replaceAll(this.c[i]);
            i++;
        }
    }
}
