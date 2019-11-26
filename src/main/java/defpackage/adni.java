package defpackage;

import android.net.Uri;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: adni */
public final class adni {
    public static long a(aakj aakj, String str, TimeUnit timeUnit) {
        aajs aajs = aakj.c;
        Uri j = aajs != null ? aajs.j() : null;
        if (j != null) {
            Matcher matcher = Pattern.compile(str).matcher(j.toString());
            if (matcher.find()) {
                return timeUnit.toSeconds(Long.parseLong(matcher.group(1)));
            }
        }
        return 0;
    }
}
