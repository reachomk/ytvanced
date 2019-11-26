package defpackage;

/* renamed from: hkq */
public final class hkq {
    public static void a(akor akor, Object obj) {
        if (akor != null && obj != null) {
            hko a = hkq.a(akor);
            String b = akor.b("downloads_page_section_key");
            if (a != null && b != null) {
                hkp a2 = a.a();
                amqw.a(obj);
                acwc a3 = hkp.a(b, obj);
                if (a3 != null) {
                    azfa c = a2.c(b, obj);
                    if (c == null) {
                        b = String.valueOf(obj);
                        StringBuilder stringBuilder = new StringBuilder(b.length() + 32);
                        stringBuilder.append("Trying to show ungrafted proto: ");
                        stringBuilder.append(b);
                        xtl.c(stringBuilder.toString());
                        return;
                    }
                    a2.a.b(c, null);
                    c = a2.a(a3, obj);
                    if (c != null) {
                        a2.a.b(c, null);
                    }
                }
            }
        }
    }

    public static void b(akor akor, Object obj) {
        if (obj != null) {
            hko a = hkq.a(akor);
            String b = akor.b("downloads_page_section_key");
            if (a != null && b != null) {
                hkp a2 = a.a();
                amqw.a(obj);
                if (hkp.a(b, obj) != null) {
                    azfa c = a2.c(b, obj);
                    if (c == null) {
                        b = String.valueOf(obj);
                        StringBuilder stringBuilder = new StringBuilder(b.length() + 32);
                        stringBuilder.append("Trying to show ungrafted proto: ");
                        stringBuilder.append(b);
                        xtl.c(stringBuilder.toString());
                        return;
                    }
                    a2.a.c(c, null);
                }
            }
        }
    }

    private static hko a(akor akor) {
        String str = "sectionListController";
        return akor.a(str) instanceof hko ? (hko) akor.a(str) : null;
    }
}
