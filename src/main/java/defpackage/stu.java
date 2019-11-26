package defpackage;

import java.util.Collection;
import java.util.Map;

/* renamed from: stu */
public final class stu implements syg {
    public final sxd a;
    private final Collection b;
    private final bapu c;
    private final sxg d;

    public stu(Map map, bapu bapu, sxd sxd, sxg sxg) {
        this.b = map.values();
        this.c = bapu;
        this.a = sxd;
        this.d = sxg;
    }

    public final syf a(bdhv bdhv, bdho bdho) {
        try {
            aoca a;
            for (sya sya : ((sui) this.c.get()).a) {
                if (bdhv.hasExtension(sya.a())) {
                    break;
                }
            }
            sya sya2 = null;
            if (sya2 != null) {
                a = sya2.a((aocf) szb.a(bdhv, sya2.a()));
                if (a == null) {
                    throw new sxf("Error resolving template config");
                }
            } else {
                a = bdhv;
            }
            bdhv bdhv2 = (bdhv) a;
            for (sxx sxx : this.b) {
                if (bdhv2.hasExtension(sxx.a())) {
                    return new stt(this, sxx, bdhv2, bdho, bdhv);
                }
            }
            throw new sxf("Unsupported TemplateConfig type");
        } catch (sxf e) {
            String a2 = szb.a(bdho);
            String a3 = stu.a(bdhv);
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(a2).length() + 27) + String.valueOf(a3).length());
            stringBuilder.append(a2);
            stringBuilder.append(" Error resolving template: ");
            stringBuilder.append(a3);
            a2 = stringBuilder.toString();
            this.a.b(6, a2, e);
            this.d.a(stu.b(bdhv));
            throw new sxf(a2, e);
        }
    }

    private static String b(bdhv bdhv) {
        String str = "";
        if (bdhv != null) {
            if (bdhv.hasExtension(bdhy.a)) {
                return amqu.b(((bdhy) bdhv.getExtension(bdhy.a)).b);
            }
            if (bdhv.hasExtension(bdgz.a)) {
                return stu.b(((bdgz) bdhv.getExtension(bdgz.a)).b);
            }
        }
        return str;
    }

    public static String a(bdhv bdhv) {
        if (bdhv.hasExtension(bdhd.a)) {
            return "EkoTemplateConfig";
        }
        String str = ")";
        String str2;
        StringBuilder stringBuilder;
        if (bdhv.hasExtension(bdhy.a)) {
            str2 = ((bdhy) bdhv.getExtension(bdhy.a)).b;
            stringBuilder = new StringBuilder(String.valueOf(str2).length() + 19);
            stringBuilder.append("UriTemplateConfig(");
            stringBuilder.append(str2);
            stringBuilder.append(str);
            return stringBuilder.toString();
        } else if (!bdhv.hasExtension(bdgz.a)) {
            return "Unknown TemplateConfig extension";
        } else {
            bdhv = ((bdgz) bdhv.getExtension(bdgz.a)).b;
            if (bdhv == null) {
                return "DecoratedTemplateConfig(missing templateConfig)";
            }
            str2 = stu.a(bdhv);
            stringBuilder = new StringBuilder(String.valueOf(str2).length() + 25);
            stringBuilder.append("DecoratedTemplateConfig(");
            stringBuilder.append(str2);
            stringBuilder.append(str);
            return stringBuilder.toString();
        }
    }
}
