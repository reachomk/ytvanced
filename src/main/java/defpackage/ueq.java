package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: ueq */
public final class ueq {
    public static final Pattern a = Pattern.compile("(\\$\\d)");
    private static final Logger d = Logger.getLogger(ueq.class.getName());
    private static final Map e;
    private static final Map f;
    private static final String g;
    private static final Pattern h = Pattern.compile("[+＋]+");
    private static final Pattern i = Pattern.compile("(\\p{Nd})");
    private static final Pattern j = Pattern.compile("[+＋\\p{Nd}]");
    private static final Pattern k = Pattern.compile("[\\\\/] *x");
    private static final Pattern l = Pattern.compile("[[\\P{N}&&\\P{L}]&&[^#]]+$");
    private static final Pattern m = Pattern.compile("(?:.*?[A-Za-z]){3}.*");
    private static final String n;
    private static final String o = ueq.b(",;xｘ#＃~～");
    private static final Pattern p;
    private static final Pattern q;
    private static ueq r = null;
    public final Map b;
    public final uey c = new uey();
    private final uep s;
    private final uew t = new uez();
    private final Set u = new HashSet(35);
    private final Set v = new HashSet(320);
    private final Set w = new HashSet();

    private static String b(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(";ext=(\\p{Nd}{1,7})|[  \\t,]*(?:e?xt(?:ensi(?:ó?|ó))?n?|ｅ?ｘｔｎ?|доб|[");
        stringBuilder.append(str);
        stringBuilder.append("]|int|anexo|ｉｎｔ)[:\\.．]?[  \\t,-]*(\\p{Nd}{1,7})#?|[- ]+(\\p{Nd}{1,5})#");
        return stringBuilder.toString();
    }

    private ueq(uep uep, Map map) {
        String str;
        this.s = uep;
        this.b = map;
        Iterator it = map.entrySet().iterator();
        while (true) {
            str = "001";
            if (!it.hasNext()) {
                break;
            }
            Entry entry = (Entry) it.next();
            List list = (List) entry.getValue();
            if (list.size() == 1 && str.equals(list.get(0))) {
                this.w.add(entry.getKey());
            } else {
                this.v.addAll(list);
            }
        }
        if (this.v.remove(str)) {
            d.log(Level.WARNING, "invalid metadata (country calling code was mapped to the non-geo entity as well as specific region(s))");
        }
        this.u.addAll((Collection) map.get(Integer.valueOf(1)));
    }

    private static boolean a(CharSequence charSequence) {
        return charSequence.length() >= 2 ? q.matcher(charSequence).matches() : false;
    }

    private static StringBuilder a(StringBuilder stringBuilder) {
        if (m.matcher(stringBuilder).matches()) {
            int length = stringBuilder.length();
            Map map = f;
            StringBuilder stringBuilder2 = new StringBuilder(stringBuilder.length());
            for (int i = 0; i < stringBuilder.length(); i++) {
                Character ch = (Character) map.get(Character.valueOf(Character.toUpperCase(stringBuilder.charAt(i))));
                if (ch != null) {
                    stringBuilder2.append(ch);
                }
            }
            stringBuilder.replace(0, length, stringBuilder2.toString());
        } else {
            stringBuilder.replace(0, stringBuilder.length(), ueq.b((CharSequence) stringBuilder));
        }
        return stringBuilder;
    }

    private static String b(CharSequence charSequence) {
        StringBuilder stringBuilder = new StringBuilder(charSequence.length());
        for (int i = 0; i < charSequence.length(); i++) {
            int digit = Character.digit(charSequence.charAt(i), 10);
            if (digit != -1) {
                stringBuilder.append(digit);
            }
        }
        return stringBuilder.toString();
    }

    private static synchronized void a(ueq ueq) {
        synchronized (ueq.class) {
            r = ueq;
        }
    }

    public final Set a() {
        return Collections.unmodifiableSet(this.v);
    }

    private static boolean a(ueu ueu) {
        if (ueu.a() == 1 && ((Integer) ueu.b.get(0)).intValue() == -1) {
            return false;
        }
        return true;
    }

    public static synchronized ueq b() {
        ueq ueq;
        synchronized (ueq.class) {
            if (r == null) {
                uek uek = uen.a;
                if (uek != null) {
                    ueq.a(new ueq(new ueo(uek), uel.a()));
                } else {
                    throw new IllegalArgumentException("metadataLoader could not be null.");
                }
            }
            ueq = r;
        }
        return ueq;
    }

    private final boolean c(String str) {
        return str != null && this.v.contains(str);
    }

    public final ues a(int i, String str) {
        ues d;
        if (!"001".equals(str)) {
            d = d(str);
        } else if (this.b.containsKey(Integer.valueOf(i))) {
            return this.s.a(i);
        } else {
            d = null;
        }
        return d;
    }

    public static String a(uex uex) {
        StringBuilder stringBuilder = new StringBuilder();
        if (uex.f) {
            int i = uex.h;
            if (i > 0) {
                char[] cArr = new char[i];
                Arrays.fill(cArr, '0');
                stringBuilder.append(new String(cArr));
            }
        }
        stringBuilder.append(uex.b);
        return stringBuilder.toString();
    }

    private final ues d(String str) {
        return c(str) ? this.s.a(str) : null;
    }

    private final boolean a(String str, ueu ueu) {
        int length = str.length();
        List list = ueu.b;
        if (list.size() <= 0 || list.contains(Integer.valueOf(length))) {
            return this.t.a(str, ueu);
        }
        return false;
    }

    public final boolean b(uex uex) {
        String c = c(uex);
        int i = uex.a;
        ues a = a(i, c);
        if (a == null || ((!"001".equals(c) && i != e(c)) || a(ueq.a(uex), a) == 12)) {
            return false;
        }
        return true;
    }

    public final String c(uex uex) {
        int i = uex.a;
        List<String> list = (List) this.b.get(Integer.valueOf(i));
        if (list == null) {
            Logger logger = d;
            Level level = Level.INFO;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Missing/invalid country_code (");
            stringBuilder.append(i);
            stringBuilder.append(")");
            logger.log(level, stringBuilder.toString());
            return null;
        } else if (list.size() == 1) {
            return (String) list.get(0);
        } else {
            String a = ueq.a(uex);
            for (String str : list) {
                ues d = d(str);
                if (d.u) {
                    if (this.c.a(d.v).matcher(a).lookingAt()) {
                        break;
                    }
                } else if (a(a, d) != 12) {
                    break;
                }
            }
            String str2 = null;
            return str2;
        }
    }

    public final String a(int i) {
        List list = (List) this.b.get(Integer.valueOf(i));
        return list != null ? (String) list.get(0) : "ZZ";
    }

    public final int a(String str) {
        if (c(str)) {
            return e(str);
        }
        Logger logger = d;
        Level level = Level.WARNING;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Invalid or missing region code (");
        if (str == null) {
            str = "null";
        }
        stringBuilder.append(str);
        stringBuilder.append(") provided.");
        logger.log(level, stringBuilder.toString());
        return 0;
    }

    private final int e(String str) {
        ues d = d(str);
        if (d != null) {
            return d.l;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Invalid region code: ");
        stringBuilder.append(str);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    private final int a(CharSequence charSequence, ues ues, StringBuilder stringBuilder, uex uex) {
        int i = 0;
        if (charSequence.length() != 0) {
            int end;
            CharSequence stringBuilder2 = new StringBuilder(charSequence);
            String str = ues == null ? "NonMatch" : ues.m;
            if (stringBuilder2.length() != 0) {
                Matcher matcher = h.matcher(stringBuilder2);
                if (matcher.lookingAt()) {
                    stringBuilder2.delete(0, matcher.end());
                    ueq.a((StringBuilder) stringBuilder2);
                } else {
                    Pattern a = this.c.a(str);
                    ueq.a((StringBuilder) stringBuilder2);
                    Matcher matcher2 = a.matcher(stringBuilder2);
                    if (matcher2.lookingAt()) {
                        end = matcher2.end();
                        matcher = i.matcher(stringBuilder2.substring(end));
                        if (!(matcher.find() && ueq.b(matcher.group(1)).equals("0"))) {
                            stringBuilder2.delete(0, end);
                        }
                    }
                }
                if (stringBuilder2.length() > 2) {
                    if (stringBuilder2.length() != 0 && stringBuilder2.charAt(0) != '0') {
                        end = stringBuilder2.length();
                        int i2 = 1;
                        while (i2 <= 3 && i2 <= end) {
                            int parseInt = Integer.parseInt(stringBuilder2.substring(0, i2));
                            if (this.b.containsKey(Integer.valueOf(parseInt))) {
                                stringBuilder.append(stringBuilder2.substring(i2));
                                i = parseInt;
                                break;
                            }
                            i2++;
                        }
                    }
                    if (i != 0) {
                        uex.a = i;
                        return i;
                    }
                    throw new uer(1, "Country calling code supplied was not recognised.");
                }
                throw new uer(3, "Phone number had an IDD, but after this was not long enough to be a viable phone number.");
            }
            if (ues != null) {
                end = ues.l;
                String valueOf = String.valueOf(end);
                String stringBuilder3 = stringBuilder2.toString();
                if (stringBuilder3.startsWith(valueOf)) {
                    StringBuilder stringBuilder4 = new StringBuilder(stringBuilder3.substring(valueOf.length()));
                    ueu ueu = ues.a;
                    a(stringBuilder4, ues, null);
                    if ((!this.t.a(stringBuilder2, ueu) && this.t.a(stringBuilder4, ueu)) || a(stringBuilder2, ues) == 6) {
                        stringBuilder.append(stringBuilder4);
                        uex.a = end;
                        return end;
                    }
                }
            }
            uex.a = 0;
        }
        return 0;
    }

    private final boolean a(StringBuilder stringBuilder, ues ues, StringBuilder stringBuilder2) {
        int length = stringBuilder.length();
        String str = ues.p;
        if (!(length == 0 || str.length() == 0)) {
            Matcher matcher = this.c.a(str).matcher(stringBuilder);
            if (matcher.lookingAt()) {
                ueu ueu = ues.a;
                boolean a = this.t.a(stringBuilder, ueu);
                int groupCount = matcher.groupCount();
                String str2 = ues.q;
                if (str2 != null && str2.length() != 0 && matcher.group(groupCount) != null) {
                    StringBuilder stringBuilder3 = new StringBuilder(stringBuilder);
                    stringBuilder3.replace(0, length, matcher.replaceFirst(str2));
                    if (a && !this.t.a(stringBuilder3.toString(), ueu)) {
                        return false;
                    }
                    if (stringBuilder2 != null && groupCount > 1) {
                        stringBuilder2.append(matcher.group(1));
                    }
                    stringBuilder.replace(0, stringBuilder.length(), stringBuilder3.toString());
                    return true;
                } else if (a && !this.t.a(stringBuilder.substring(matcher.end()), ueu)) {
                    return false;
                } else {
                    if (!(stringBuilder2 == null || groupCount <= 0 || matcher.group(groupCount) == null)) {
                        stringBuilder2.append(matcher.group(1));
                    }
                    stringBuilder.delete(0, matcher.end());
                    return true;
                }
            }
        }
        return false;
    }

    public final uex a(CharSequence charSequence, String str) {
        uex uex = new uex();
        if (charSequence == null) {
            throw new uer(2, "The phone number supplied was null.");
        } else if (charSequence.length() <= 250) {
            int i;
            int indexOf;
            StringBuilder stringBuilder = new StringBuilder();
            String charSequence2 = charSequence.toString();
            int indexOf2 = charSequence2.indexOf(";phone-context=");
            String str2 = "";
            if (indexOf2 >= 0) {
                i = indexOf2 + 15;
                if (i < charSequence2.length() - 1 && charSequence2.charAt(i) == '+') {
                    indexOf = charSequence2.indexOf(59, i);
                    if (indexOf > 0) {
                        stringBuilder.append(charSequence2.substring(i, indexOf));
                    } else {
                        stringBuilder.append(charSequence2.substring(i));
                    }
                }
                i = charSequence2.indexOf("tel:");
                stringBuilder.append(charSequence2.substring(i >= 0 ? i + 4 : 0, indexOf2));
            } else {
                Matcher matcher = j.matcher(charSequence2);
                if (matcher.find()) {
                    charSequence = charSequence2.subSequence(matcher.start(), charSequence2.length());
                    matcher = l.matcher(charSequence);
                    if (matcher.find()) {
                        charSequence = charSequence.subSequence(0, matcher.start());
                    }
                    matcher = k.matcher(charSequence);
                    if (matcher.find()) {
                        charSequence = charSequence.subSequence(0, matcher.start());
                    }
                } else {
                    charSequence = str2;
                }
                stringBuilder.append(charSequence);
            }
            int indexOf3 = stringBuilder.indexOf(";isub=");
            if (indexOf3 > 0) {
                stringBuilder.delete(indexOf3, stringBuilder.length());
            }
            if (!ueq.a((CharSequence) stringBuilder)) {
                throw new uer(2, "The string supplied did not seem to be a phone number.");
            } else if (c(str) || (stringBuilder.length() != 0 && h.matcher(stringBuilder).lookingAt())) {
                String a;
                Matcher matcher2 = p.matcher(stringBuilder);
                if (matcher2.find() && ueq.a(stringBuilder.substring(0, matcher2.start()))) {
                    i = matcher2.groupCount();
                    for (indexOf = 1; indexOf <= i; indexOf++) {
                        if (matcher2.group(indexOf) != null) {
                            str2 = matcher2.group(indexOf);
                            stringBuilder.delete(matcher2.start(), stringBuilder.length());
                            break;
                        }
                    }
                }
                if (str2.length() > 0) {
                    uex.c = true;
                    uex.d = str2;
                }
                ues d = d(str);
                StringBuilder stringBuilder2 = new StringBuilder();
                try {
                    i = a(stringBuilder, d, stringBuilder2, uex);
                } catch (uer e) {
                    Matcher matcher3 = h.matcher(stringBuilder);
                    if (e.a == 1 && matcher3.lookingAt()) {
                        i = a(stringBuilder.substring(matcher3.end()), d, stringBuilder2, uex);
                        if (i == 0) {
                            throw new uer(1, "Could not interpret numbers after plus-sign.");
                        }
                    }
                    throw new uer(e.a, e.getMessage());
                }
                if (i != 0) {
                    a = a(i);
                    if (!a.equals(str)) {
                        d = a(i, a);
                    }
                } else {
                    stringBuilder2.append(ueq.a(stringBuilder));
                    if (str != null) {
                        uex.a = d.l;
                    }
                }
                a = "The string supplied is too short to be a phone number.";
                if (stringBuilder2.length() >= 2) {
                    if (d != null) {
                        StringBuilder stringBuilder3 = new StringBuilder();
                        CharSequence stringBuilder4 = new StringBuilder(stringBuilder2);
                        a((StringBuilder) stringBuilder4, d, stringBuilder3);
                        indexOf3 = a(stringBuilder4, d);
                        if (!(indexOf3 == 4 || indexOf3 == 2 || indexOf3 == 5)) {
                            stringBuilder2 = stringBuilder4;
                        }
                    }
                    indexOf3 = stringBuilder2.length();
                    if (indexOf3 < 2) {
                        throw new uer(4, a);
                    } else if (indexOf3 <= 17) {
                        if (stringBuilder2.length() > 1 && stringBuilder2.charAt(0) == '0') {
                            uex.e = true;
                            uex.f = true;
                            indexOf3 = 1;
                            while (indexOf3 < stringBuilder2.length() - 1 && stringBuilder2.charAt(indexOf3) == '0') {
                                indexOf3++;
                            }
                            if (indexOf3 != 1) {
                                uex.g = true;
                                uex.h = indexOf3;
                            }
                        }
                        uex.b = Long.parseLong(stringBuilder2.toString());
                        return uex;
                    } else {
                        throw new uer(5, "The string supplied is too long to be a phone number.");
                    }
                }
                throw new uer(4, a);
            } else {
                throw new uer(1, "Missing or invalid default region.");
            }
        } else {
            throw new uer(5, "The string supplied was too long to parse.");
        }
    }

    static {
        HashMap hashMap = new HashMap();
        Integer valueOf = Integer.valueOf(52);
        hashMap.put(valueOf, "1");
        Integer valueOf2 = Integer.valueOf(54);
        hashMap.put(valueOf2, "9");
        Collections.unmodifiableMap(hashMap);
        HashSet hashSet = new HashSet();
        hashSet.add(Integer.valueOf(86));
        Collections.unmodifiableSet(hashSet);
        HashSet hashSet2 = new HashSet();
        hashSet2.add(valueOf);
        hashSet2.add(valueOf2);
        hashSet2.add(Integer.valueOf(55));
        hashSet2.add(Integer.valueOf(62));
        hashSet2.addAll(hashSet);
        Collections.unmodifiableSet(hashSet2);
        hashMap = new HashMap();
        Character valueOf3 = Character.valueOf('0');
        hashMap.put(valueOf3, valueOf3);
        valueOf3 = Character.valueOf('1');
        hashMap.put(valueOf3, valueOf3);
        valueOf3 = Character.valueOf('2');
        hashMap.put(valueOf3, valueOf3);
        Character valueOf4 = Character.valueOf('3');
        hashMap.put(valueOf4, valueOf4);
        Character valueOf5 = Character.valueOf('4');
        hashMap.put(valueOf5, valueOf5);
        Character valueOf6 = Character.valueOf('5');
        hashMap.put(valueOf6, valueOf6);
        Character valueOf7 = Character.valueOf('6');
        hashMap.put(valueOf7, valueOf7);
        Character valueOf8 = Character.valueOf('7');
        hashMap.put(valueOf8, valueOf8);
        Character valueOf9 = Character.valueOf('8');
        hashMap.put(valueOf9, valueOf9);
        Character valueOf10 = Character.valueOf('9');
        hashMap.put(valueOf10, valueOf10);
        HashMap hashMap2 = new HashMap(40);
        hashMap2.put(Character.valueOf('A'), valueOf3);
        hashMap2.put(Character.valueOf('B'), valueOf3);
        hashMap2.put(Character.valueOf('C'), valueOf3);
        hashMap2.put(Character.valueOf('D'), valueOf4);
        hashMap2.put(Character.valueOf('E'), valueOf4);
        hashMap2.put(Character.valueOf('F'), valueOf4);
        hashMap2.put(Character.valueOf('G'), valueOf5);
        hashMap2.put(Character.valueOf('H'), valueOf5);
        hashMap2.put(Character.valueOf('I'), valueOf5);
        hashMap2.put(Character.valueOf('J'), valueOf6);
        hashMap2.put(Character.valueOf('K'), valueOf6);
        hashMap2.put(Character.valueOf('L'), valueOf6);
        hashMap2.put(Character.valueOf('M'), valueOf7);
        hashMap2.put(Character.valueOf('N'), valueOf7);
        hashMap2.put(Character.valueOf('O'), valueOf7);
        hashMap2.put(Character.valueOf('P'), valueOf8);
        hashMap2.put(Character.valueOf('Q'), valueOf8);
        hashMap2.put(Character.valueOf('R'), valueOf8);
        hashMap2.put(Character.valueOf('S'), valueOf8);
        hashMap2.put(Character.valueOf('T'), valueOf9);
        hashMap2.put(Character.valueOf('U'), valueOf9);
        hashMap2.put(Character.valueOf('V'), valueOf9);
        hashMap2.put(Character.valueOf('W'), valueOf10);
        hashMap2.put(Character.valueOf('X'), valueOf10);
        hashMap2.put(Character.valueOf('Y'), valueOf10);
        hashMap2.put(Character.valueOf('Z'), valueOf10);
        e = Collections.unmodifiableMap(hashMap2);
        HashMap hashMap3 = new HashMap(100);
        hashMap3.putAll(e);
        hashMap3.putAll(hashMap);
        f = Collections.unmodifiableMap(hashMap3);
        hashMap3 = new HashMap();
        hashMap3.putAll(hashMap);
        valueOf8 = Character.valueOf('+');
        hashMap3.put(valueOf8, valueOf8);
        valueOf8 = Character.valueOf('*');
        hashMap3.put(valueOf8, valueOf8);
        valueOf8 = Character.valueOf('#');
        hashMap3.put(valueOf8, valueOf8);
        Collections.unmodifiableMap(hashMap3);
        hashMap3 = new HashMap();
        for (Character valueOf72 : e.keySet()) {
            char charValue = valueOf72.charValue();
            valueOf3 = Character.valueOf(Character.toLowerCase(charValue));
            valueOf72 = Character.valueOf(charValue);
            hashMap3.put(valueOf3, valueOf72);
            hashMap3.put(valueOf72, valueOf72);
        }
        hashMap3.putAll(hashMap);
        Character valueOf11 = Character.valueOf('-');
        hashMap3.put(valueOf11, valueOf11);
        hashMap3.put(Character.valueOf(65293), valueOf11);
        hashMap3.put(Character.valueOf(8208), valueOf11);
        hashMap3.put(Character.valueOf(8209), valueOf11);
        hashMap3.put(Character.valueOf(8210), valueOf11);
        hashMap3.put(Character.valueOf(8211), valueOf11);
        hashMap3.put(Character.valueOf(8212), valueOf11);
        hashMap3.put(Character.valueOf(8213), valueOf11);
        hashMap3.put(Character.valueOf(8722), valueOf11);
        valueOf11 = Character.valueOf('/');
        hashMap3.put(valueOf11, valueOf11);
        hashMap3.put(Character.valueOf(65295), valueOf11);
        valueOf11 = Character.valueOf(' ');
        hashMap3.put(valueOf11, valueOf11);
        hashMap3.put(Character.valueOf(12288), valueOf11);
        hashMap3.put(Character.valueOf(8288), valueOf11);
        valueOf11 = Character.valueOf('.');
        hashMap3.put(valueOf11, valueOf11);
        hashMap3.put(Character.valueOf(65294), valueOf11);
        Collections.unmodifiableMap(hashMap3);
        Pattern.compile("[\\d]+(?:[~⁓∼～][\\d]+)?");
        StringBuilder stringBuilder = new StringBuilder();
        String str = "";
        String str2 = "[, \\[\\]]";
        stringBuilder.append(Arrays.toString(e.keySet().toArray()).replaceAll(str2, str));
        stringBuilder.append(Arrays.toString(e.keySet().toArray()).toLowerCase().replaceAll(str2, str));
        g = stringBuilder.toString();
        Pattern.compile("[-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～]+");
        stringBuilder = new StringBuilder();
        stringBuilder.append("\\p{Nd}{2}|[+＋]*+(?:[-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～*]*\\p{Nd}){3,}[-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～*");
        stringBuilder.append(g);
        stringBuilder.append("\\p{Nd}]*");
        n = stringBuilder.toString();
        ueq.b("xｘ#＃~～");
        stringBuilder = new StringBuilder();
        String str3 = "(?:";
        stringBuilder.append(str3);
        stringBuilder.append(o);
        stringBuilder.append(")$");
        p = Pattern.compile(stringBuilder.toString(), 66);
        stringBuilder = new StringBuilder();
        stringBuilder.append(n);
        stringBuilder.append(str3);
        stringBuilder.append(o);
        stringBuilder.append(")?");
        q = Pattern.compile(stringBuilder.toString(), 66);
        Pattern.compile("(\\D+)");
        Pattern.compile("\\(?\\$1\\)?");
    }

    public static void a(int i, int i2, StringBuilder stringBuilder) {
        i2--;
        if (i2 == 0) {
            stringBuilder.insert(0, i).insert(0, '+');
        } else if (i2 == 1) {
            stringBuilder.insert(0, " ").insert(0, i).insert(0, '+');
        }
    }

    private static ueu a(ues ues, int i) {
        switch (i - 1) {
            case 0:
            case 2:
                return ues.b;
            case 1:
                return ues.c;
            case 3:
                return ues.d;
            case 4:
                return ues.e;
            case 5:
                return ues.f;
            case 6:
                return ues.h;
            case 7:
                return ues.g;
            case 8:
                return ues.i;
            case 9:
                return ues.j;
            case 10:
                return ues.k;
            default:
                return ues.a;
        }
    }

    private final int a(String str, ues ues) {
        if (!a(str, ues.a)) {
            return 12;
        }
        if (a(str, ues.e)) {
            return 5;
        }
        if (a(str, ues.d)) {
            return 4;
        }
        if (a(str, ues.f)) {
            return 6;
        }
        if (a(str, ues.h)) {
            return 7;
        }
        if (a(str, ues.g)) {
            return 8;
        }
        if (a(str, ues.i)) {
            return 9;
        }
        if (a(str, ues.j)) {
            return 10;
        }
        if (a(str, ues.k)) {
            return 11;
        }
        if (a(str, ues.b)) {
            if (ues.r || a(str, ues.c)) {
                return 3;
            }
            return 1;
        } else if (ues.r || !a(str, ues.c)) {
            return 12;
        } else {
            return 2;
        }
    }

    private final int a(CharSequence charSequence, ues ues) {
        return a(charSequence, ues, 12);
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00b9 A:{RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0076  */
    private final int a(java.lang.CharSequence r7, defpackage.ues r8, int r9) {
        /*
        r6 = this;
        r0 = defpackage.ueq.a(r8, r9);
        r1 = r0.b;
        r1 = r1.isEmpty();
        if (r1 == 0) goto L_0x0011;
    L_0x000c:
        r1 = r8.a;
        r1 = r1.b;
        goto L_0x0013;
    L_0x0011:
        r1 = r0.b;
    L_0x0013:
        r0 = r0.c;
        r2 = 3;
        r3 = 2;
        r4 = 1;
        if (r9 != r2) goto L_0x0066;
    L_0x001a:
        r9 = defpackage.ueq.a(r8, r4);
        r9 = defpackage.ueq.a(r9);
        if (r9 != 0) goto L_0x0029;
    L_0x0024:
        r7 = r6.a(r7, r8, r3);
        return r7;
    L_0x0029:
        r9 = defpackage.ueq.a(r8, r3);
        r2 = defpackage.ueq.a(r9);
        if (r2 != 0) goto L_0x0034;
    L_0x0033:
        goto L_0x0066;
    L_0x0034:
        r2 = new java.util.ArrayList;
        r2.<init>(r1);
        r1 = r9.b;
        r1 = r1.size();
        if (r1 != 0) goto L_0x0046;
    L_0x0041:
        r8 = r8.a;
        r8 = r8.b;
        goto L_0x0048;
    L_0x0046:
        r8 = r9.b;
    L_0x0048:
        r2.addAll(r8);
        java.util.Collections.sort(r2);
        r8 = r0.isEmpty();
        if (r8 != 0) goto L_0x0063;
    L_0x0054:
        r8 = new java.util.ArrayList;
        r8.<init>(r0);
        r9 = r9.c;
        r8.addAll(r9);
        java.util.Collections.sort(r8);
        r0 = r8;
        goto L_0x0067;
    L_0x0063:
        r0 = r9.c;
        goto L_0x0067;
    L_0x0066:
        r2 = r1;
    L_0x0067:
        r8 = 0;
        r9 = r2.get(r8);
        r9 = (java.lang.Integer) r9;
        r9 = r9.intValue();
        r1 = 5;
        r5 = -1;
        if (r9 == r5) goto L_0x00b9;
    L_0x0076:
        r7 = r7.length();
        r9 = java.lang.Integer.valueOf(r7);
        r0 = r0.contains(r9);
        if (r0 != 0) goto L_0x00b8;
    L_0x0084:
        r8 = r2.get(r8);
        r8 = (java.lang.Integer) r8;
        r8 = r8.intValue();
        if (r8 == r7) goto L_0x00b7;
    L_0x0090:
        if (r8 > r7) goto L_0x00b5;
    L_0x0092:
        r8 = r2.size();
        r8 = r8 + r5;
        r8 = r2.get(r8);
        r8 = (java.lang.Integer) r8;
        r8 = r8.intValue();
        if (r8 < r7) goto L_0x00b3;
    L_0x00a3:
        r7 = r2.size();
        r7 = r2.subList(r4, r7);
        r7 = r7.contains(r9);
        if (r7 == 0) goto L_0x00b2;
    L_0x00b1:
        return r4;
    L_0x00b2:
        return r1;
    L_0x00b3:
        r7 = 6;
        return r7;
    L_0x00b5:
        r7 = 4;
        return r7;
    L_0x00b7:
        return r4;
    L_0x00b8:
        return r3;
    L_0x00b9:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ueq.a(java.lang.CharSequence, ues, int):int");
    }
}
