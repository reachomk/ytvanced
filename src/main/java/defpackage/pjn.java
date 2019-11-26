package defpackage;

import java.util.Collection;

/* renamed from: pjn */
public final class pjn {
    public static String a(String str) {
        if (str != null) {
            return pjn.a("com.google.android.gms.cast.CATEGORY_CAST", str, null, false);
        }
        throw new IllegalArgumentException("applicationId cannot be null");
    }

    public static String a(String str, String str2, Collection collection, boolean z) {
        StringBuilder stringBuilder = new StringBuilder(str);
        str = str2.toUpperCase();
        if (str.matches("[A-F0-9]+")) {
            str2 = "/";
            stringBuilder.append(str2);
            stringBuilder.append(str);
            if (collection != null) {
                if (collection.isEmpty()) {
                    throw new IllegalArgumentException("Must specify at least one namespace");
                }
                stringBuilder.append(str2);
                Object obj = 1;
                for (String str3 : collection) {
                    String str32;
                    ppj.a(str32);
                    if (obj == null) {
                        stringBuilder.append(",");
                    }
                    if (!ppj.a.matcher(str32).matches()) {
                        StringBuilder stringBuilder2 = new StringBuilder(str32.length());
                        for (int i = 0; i < str32.length(); i++) {
                            char charAt = str32.charAt(i);
                            if ((charAt < 'A' || charAt > 'Z') && ((charAt < 'a' || charAt > 'z') && !((charAt >= '0' && charAt <= '9') || charAt == '_' || charAt == '-' || charAt == '.' || charAt == ':'))) {
                                stringBuilder2.append(String.format("%%%04x", new Object[]{Integer.valueOf(charAt)}));
                            } else {
                                stringBuilder2.append(charAt);
                            }
                        }
                        str32 = stringBuilder2.toString();
                    }
                    stringBuilder.append(str32);
                    obj = null;
                }
            }
            if (z) {
                if (collection == null) {
                    stringBuilder.append(str2);
                }
                stringBuilder.append("//ALLOW_IPV6");
            }
            return stringBuilder.toString();
        }
        String str4 = "Invalid application ID: ";
        throw new IllegalArgumentException(str2.length() == 0 ? new String(str4) : str4.concat(str2));
    }
}
