package defpackage;

import java.util.Locale;

/* renamed from: abmu */
public class abmu implements aboa {
    public final String b() {
        String language = Locale.getDefault().getLanguage();
        return (language == null || language.length() != 2) ? "en" : language;
    }

    public String a() {
        String country = Locale.getDefault().getCountry();
        if (country == null || country.length() != 2) {
            country = "us";
        }
        return country.toLowerCase(Locale.ENGLISH);
    }
}
