package defpackage;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: bani */
public final class bani {
    private static Pattern a = Pattern.compile("(....|\\.\\.)(\\[(.*)\\])?");

    public static String a(cis cis, String str) {
        civ c = cis.c();
        int i = 0;
        for (cis cis2 : c.b()) {
            if (cis2.f().equals(cis.f())) {
                if (cis2 == cis) {
                    break;
                }
                i++;
            }
        }
        String valueOf = String.valueOf(String.format("/%s[%d]", new Object[]{cis.f(), Integer.valueOf(i)}));
        str = String.valueOf(str);
        if (str.length() == 0) {
            str = new String(valueOf);
        } else {
            str = valueOf.concat(str);
        }
        return c instanceof cis ? bani.a((cis) c, str) : str;
    }

    public static cis a(bakm bakm, String str) {
        List a = bani.a(bakm, str, true);
        return !a.isEmpty() ? (cis) a.get(0) : null;
    }

    public static List a(civ civ, String str) {
        return bani.a(civ, str, false);
    }

    public static List a(Object obj, String str, boolean z) {
        CharSequence str2;
        String str3 = "/";
        if (str2.startsWith(str3)) {
            str2 = str2.substring(1);
            while (obj instanceof cis) {
                obj = ((cis) obj).c();
            }
        }
        if (str2.length() != 0) {
            String substring;
            int i = 0;
            if (str2.contains(str3)) {
                substring = str2.substring(str2.indexOf(47) + 1);
                str2 = str2.substring(0, str2.indexOf(47));
            } else {
                substring = "";
            }
            Matcher matcher = a.matcher(str2);
            if (matcher.matches()) {
                str2 = matcher.group(1);
                if ("..".equals(str2)) {
                    if (obj instanceof cis) {
                        return bani.a(((cis) obj).c(), substring, z);
                    }
                    return Collections.emptyList();
                } else if (!(obj instanceof civ)) {
                    return Collections.emptyList();
                } else {
                    int parseInt = matcher.group(2) != null ? Integer.parseInt(matcher.group(3)) : -1;
                    LinkedList linkedList = new LinkedList();
                    for (cis cis : ((civ) obj).b()) {
                        if (cis.f().matches(str2)) {
                            if (parseInt == -1 || parseInt == i) {
                                linkedList.addAll(bani.a(cis, substring, z));
                            }
                            i++;
                        }
                        if (z || parseInt >= 0) {
                            if (!linkedList.isEmpty()) {
                                break;
                            }
                        }
                    }
                    return linkedList;
                }
            }
            throw new RuntimeException(String.valueOf(str2).concat(" is invalid path."));
        } else if (obj instanceof cis) {
            return Collections.singletonList((cis) obj);
        } else {
            throw new RuntimeException("Result of path expression seems to be the root container. This is not allowed!");
        }
    }
}
