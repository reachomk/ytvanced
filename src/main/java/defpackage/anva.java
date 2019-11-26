package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: anva */
public class anva {
    private static final amqz a;
    private static final amqz b = amqz.a('/');
    private static final amqz c = amqz.a('-');
    private static final amqh d = amqh.a("/");
    private static final amqh e = amqh.a("-");
    private static final amqh f = amqh.a("=");
    private static final amul g;

    protected anva() {
    }

    public static Object a(anve anve, anvb anvb, boolean z) {
        Object obj = "options is null";
        boolean z2 = true;
        amqw.a(true, obj);
        Object obj2 = "url is null";
        amqw.a(true, obj2);
        Object obj3 = "url path is null";
        if (anvb.a() != null) {
            List a = anva.a(anvb);
            String str = "image";
            if (a.size() > 0 && str.equals(a.get(0))) {
                a.remove(0);
            }
            if (a.size() == 2) {
                a.remove(0);
            }
            int size = a.size();
            String str2 = "";
            String a2;
            String str3;
            if (size >= 4 && (!(size == 4 && ((String) a.get(3)).isEmpty()) && size <= 6)) {
                amqw.a(true, obj);
                amqw.a(true, obj2);
                amqw.a(anvb.a() != null, obj3);
                Iterable a3 = anva.a(anvb);
                if (a3.size() <= 0 || !((String) a3.get(0)).equals(str)) {
                    z2 = false;
                } else {
                    a3.remove(0);
                }
                a2 = anve.a(str2);
                if (a3.size() == 4) {
                    a3.add(str2);
                } else if (a3.size() == 5) {
                    a3.add(4, str2);
                }
                a2 = anva.a((String) a3.get(4), a2, z);
                a3.set(4, a2);
                if (a2.equals(str2) && a3.size() > 5) {
                    a3.remove(4);
                }
                if (z2) {
                    a3.add(0, str);
                }
                a2 = String.valueOf(d.a(a3));
                str3 = "/";
                return anvb.a(a2.length() == 0 ? new String(str3) : str3.concat(a2)).b();
            }
            size = a.size();
            if (size <= 0 || size > 1 || ((String) a.get(0)).isEmpty()) {
                throw new anuz(anvb.toString());
            }
            amqw.a(true, obj);
            amqw.a(true, obj2);
            amqw.a(anvb.a() != null, obj3);
            ArrayList a4 = amvj.a(a.a(anvb.a()));
            a2 = anve.a(str2);
            ArrayList a5 = amvj.a(a.a(anvb.a()));
            if (a5.size() == 2) {
                str2 = (String) a5.get(1);
            }
            a2 = anva.a(str2, a2, z);
            str3 = (String) a4.get(0);
            if (!a2.isEmpty()) {
                str3 = f.a(str3, a2, new Object[0]);
            }
            return anvb.a(str3).b();
        }
        throw new anuz(obj3);
    }

    private static List a(String str, boolean z) {
        amqw.a(str != null, (Object) "options is null");
        ArrayList a = amvj.a();
        Iterator it = c.a((CharSequence) str).iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (!str2.isEmpty()) {
                Object obj = "";
                if (str2.startsWith("O") || str2.startsWith("J")) {
                    while (str2.length() < 12) {
                        str2 = e.a(str2, !it.hasNext() ? obj : it.next(), new Object[0]);
                    }
                }
                if (str2.equals("pi") || str2.equals("ya") || str2.equals("ro")) {
                    amqh amqh = e;
                    if (it.hasNext()) {
                        obj = it.next();
                    }
                    str2 = amqh.a(str2, obj, new Object[0]);
                }
                if (!z || Character.isUpperCase(str2.charAt(0))) {
                    a.add(str2);
                }
            }
        }
        return a;
    }

    private static String a(String str, String str2, boolean z) {
        amqw.a(str != null, (Object) "oldOptions is null");
        amqw.a(str2 != null, (Object) "newOptions is null");
        if (!str.isEmpty()) {
            List<String> a = anva.a(str, z ^ 1);
            if (!a.isEmpty()) {
                a.addAll(anva.a(str2, false));
                amqw.a(true, (Object) "options is null");
                amso e = amso.e();
                ArrayList a2 = amvj.a();
                for (String str3 : a) {
                    amxn amxn = (amxn) g.listIterator();
                    Object obj = null;
                    while (amxn.hasNext()) {
                        anvc anvc = (anvc) amxn.next();
                        if (str3.toLowerCase().startsWith(anvc.a)) {
                            if (!anvc.b) {
                                obj = anvc;
                            } else if (str3.length() == anvc.a.length()) {
                                obj = anvc;
                                break;
                            }
                        }
                    }
                    if (obj != null) {
                        e.a(obj, str3);
                    } else {
                        a2.add(str3);
                    }
                }
                Iterable a3 = amvj.a();
                amxn amxn2 = (amxn) g.listIterator();
                while (amxn2.hasNext()) {
                    String str4 = "";
                    for (String str5 : e.c((anvc) amxn2.next())) {
                        if (Character.isUpperCase(str5.charAt(0))) {
                            a3.add(str5);
                        } else {
                            str4 = str5;
                        }
                    }
                    if (!str4.isEmpty()) {
                        a3.add(str4);
                    }
                }
                a3.addAll(a2);
                return e.a(a3);
            }
        }
        return str2;
    }

    private static List a(anvb anvb) {
        amqw.a((Object) anvb);
        List a = amvj.a(b.a(anvb.a()));
        return (a.size() <= 0 || !((String) a.get(0)).isEmpty()) ? a : a.subList(1, a.size());
    }

    static {
        amqz a = amqz.a('=').a();
        amqw.a(true, "must be greater than zero: %s", 2);
        a = new amqz(a.c, a.b, a.a, 2);
        amqz.a(':');
        String str = "s";
        anvc anvc = new anvc(str, false);
        anvc anvc2 = new anvc("w", false);
        String str2 = "c";
        anvc anvc3 = new anvc(str2, true);
        anvc anvc4 = new anvc("d", true);
        String str3 = "h";
        anvc anvc5 = new anvc(str3, false);
        anvc anvc6 = new anvc(str, true);
        anvc anvc7 = new anvc(str3, true);
        String str4 = "p";
        anvc anvc8 = new anvc(str4, true);
        anvc anvc9 = new anvc("pp", true);
        anvc anvc10 = new anvc("pf", true);
        anvc anvc11 = new anvc("n", true);
        String str5 = "r";
        r8 = new anvc[62];
        anvc anvc12 = new anvc(str5, false);
        anvc anvc13 = anvc11;
        r8[0] = new anvc(str5, true);
        str5 = "o";
        r8[1] = new anvc(str5, true);
        r8[2] = new anvc(str5, false);
        r8[3] = new anvc("j", false);
        r8[4] = new anvc("x", false);
        r8[5] = new anvc("y", false);
        r8[6] = new anvc("z", false);
        r8[7] = new anvc("g", true);
        r8[8] = new anvc("e", false);
        r8[9] = new anvc("f", false);
        str5 = "k";
        r8[10] = new anvc(str5, true);
        anvc anvc14 = anvc10;
        r8[11] = new anvc("u", true);
        r8[12] = new anvc("ut", true);
        r8[13] = new anvc("i", true);
        String str6 = "a";
        r8[14] = new anvc(str6, true);
        anvc anvc15 = anvc9;
        r8[15] = new anvc("b", true);
        r8[16] = new anvc("b", false);
        r8[17] = new anvc(str2, false);
        r8[18] = new anvc("t", false);
        r8[19] = new anvc("nt0", false);
        r8[20] = new anvc("v", true);
        r8[21] = new anvc("q", false);
        r8[22] = new anvc("fh", true);
        r8[23] = new anvc("fv", true);
        r8[24] = new anvc("fg", true);
        r8[25] = new anvc("ci", true);
        r8[26] = new anvc("rw", true);
        r8[27] = new anvc("rwu", true);
        r8[28] = new anvc("rwa", true);
        r8[29] = new anvc("nw", true);
        r8[30] = new anvc("rh", true);
        r8[31] = new anvc("no", true);
        r8[32] = new anvc("ns", true);
        r8[33] = new anvc(str5, false);
        r8[34] = new anvc(str4, false);
        r8[35] = new anvc("l", false);
        r8[36] = new anvc("v", false);
        r8[37] = new anvc("nu", true);
        r8[38] = new anvc("ft", true);
        r8[39] = new anvc("cc", true);
        r8[40] = new anvc("nd", true);
        r8[41] = new anvc("ip", true);
        r8[42] = new anvc("nc", true);
        r8[43] = new anvc(str6, false);
        r8[44] = new anvc("rj", true);
        r8[45] = new anvc("rp", true);
        r8[46] = new anvc("rg", true);
        r8[47] = new anvc("pd", true);
        r8[48] = new anvc("pa", true);
        r8[49] = new anvc("m", false);
        r8[50] = new anvc("vb", false);
        r8[51] = new anvc("vl", false);
        r8[52] = new anvc("lf", true);
        r8[53] = new anvc("mv", true);
        r8[54] = new anvc("id", true);
        r8[55] = new anvc("al", true);
        r8[56] = new anvc("ic", false);
        r8[57] = new anvc("pg", true);
        r8[58] = new anvc("mo", true);
        r8[59] = new anvc("iv", false);
        r8[60] = new anvc("il", false);
        r8[61] = new anvc("ba", false);
        g = amul.a(anvc, anvc2, anvc3, anvc4, anvc5, anvc6, anvc7, anvc8, anvc15, anvc14, anvc13, anvc12, r8);
    }
}
