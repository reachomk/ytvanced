package defpackage;

import android.os.Build.VERSION;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: aamr */
public final class aamr {
    private static final Pattern a = Pattern.compile("([a-zA-Z0-9]{2,3})_([a-zA-Z0-9]{2,3})?_[a-zA-Z0-9_]*#([a-zA-Z0-9]{4})");

    public static String a(Locale locale) {
        if (VERSION.SDK_INT >= 21) {
            return locale.toLanguageTag();
        }
        String stringBuilder;
        Matcher matcher = a.matcher(locale.toString());
        String str = "-";
        if (matcher.matches()) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(matcher.group(1));
            stringBuilder2.append(str);
            stringBuilder2.append(matcher.group(3));
            if (!(matcher.group(2) == null || matcher.group(2).isEmpty())) {
                stringBuilder2.append(str);
                stringBuilder2.append(matcher.group(2));
            }
            stringBuilder = stringBuilder2.toString();
        } else if (locale.getCountry().isEmpty()) {
            stringBuilder = locale.getLanguage();
        } else {
            String language = locale.getLanguage();
            stringBuilder = locale.getCountry();
            StringBuilder stringBuilder3 = new StringBuilder((String.valueOf(language).length() + 1) + String.valueOf(stringBuilder).length());
            stringBuilder3.append(language);
            stringBuilder3.append(str);
            stringBuilder3.append(stringBuilder);
            stringBuilder = stringBuilder3.toString();
        }
        return stringBuilder;
    }
}
