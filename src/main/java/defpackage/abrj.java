package defpackage;

import android.text.TextUtils;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* renamed from: abrj */
public final class abrj {
    public String a = null;
    public Pattern b = null;

    public final void a(String str) {
        if (TextUtils.isEmpty(str)) {
            this.a = null;
            this.b = null;
        } else if (!str.equals(this.a)) {
            this.a = str;
            try {
                String str2 = "(@|#){1}";
                str = String.valueOf(str.replaceAll("([^a-zA-Z0-9 ])", "\\\\$1").replace(" ", "([\\uFEFF\\s])*"));
                if (str.length() == 0) {
                    str = new String(str2);
                } else {
                    str = str2.concat(str);
                }
                this.b = Pattern.compile(str);
            } catch (PatternSyntaxException e) {
                xtl.a("LiveChatAccountNameProvider failed pattern", e);
            }
        }
    }
}
