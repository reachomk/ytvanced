package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: ajiu */
public final class ajiu {
    public final String a;
    public final awdc b;
    public awcw c;
    private final String d;

    public static ajiu a(aakj aakj, String str) {
        awdc awdc;
        amqw.a((Object) aakj);
        String b = aakj.b();
        apiz apiz = aakj.a.f;
        if (apiz != null) {
            awdc = apiz.c;
            if (awdc == null) {
                awdc = awdc.f;
            }
        } else {
            awdc = null;
        }
        if (b == null || awdc == null) {
            return null;
        }
        return new ajiu(b, awdc, str);
    }

    private ajiu(String str, awdc awdc, String str2) {
        this.a = (String) amqw.a((Object) str);
        this.b = (awdc) amqw.a((Object) awdc);
        this.d = str2;
        awdc awdc2 = this.b;
        int i = awdc2.d;
        awcw awcw = null;
        if (i >= 0 && i < awdc2.c.size()) {
            awdc2 = this.b;
            awcw = (awcw) awdc2.c.get(awdc2.d);
        }
        this.c = awcw;
    }

    public final List a() {
        ArrayList arrayList = new ArrayList();
        if (!(this.b.b.size() == 0 || this.b.c.size() == 0)) {
            awcw awcw = this.c;
            if (awcw != null) {
                for (Integer intValue : awcw.c) {
                    int intValue2 = intValue.intValue();
                    if (intValue2 >= 0 && intValue2 < this.b.b.size()) {
                        arrayList.add(a((awda) this.b.b.get(intValue2)));
                    }
                }
                arrayList.add(0, ajis.a(this.d));
            }
        }
        return arrayList;
    }

    public final ajix b() {
        awcw awcw = this.c;
        if (awcw == null) {
            return ajix.UNKNOWN;
        }
        Map map = ajix.c;
        Object a = awcy.a(awcw.h);
        if (a == null) {
            a = awcy.UNKNOWN;
        }
        ajix ajix = (ajix) map.get(a);
        if (ajix == null) {
            ajix = ajix.UNKNOWN;
        }
        return ajix;
    }

    public final ajis a(String str) {
        if (str != null) {
            awcw awcw = this.c;
            if (awcw != null) {
                for (Integer intValue : awcw.c) {
                    int intValue2 = intValue.intValue();
                    if (intValue2 >= 0 && intValue2 < this.b.b.size() && ((awda) this.b.b.get(intValue2)).e.equals(str)) {
                        return a((awda) this.b.b.get(intValue2));
                    }
                }
            }
        }
        return null;
    }

    public final ajis c() {
        awcw awcw = this.c;
        if (awcw != null && awcw.e) {
            int i = awcw.d;
            if (i >= 0 && i < this.b.b.size()) {
                awdc awdc = this.b;
                return a((awda) awdc.b.get(this.c.d));
            }
        }
        return null;
    }

    private final ajis a(awda awda) {
        arml arml;
        String str = awda.e;
        String str2 = this.a;
        String str3 = awda.d;
        String str4 = awda.b;
        if ((awda.a & 16) != 0) {
            arml = awda.c;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        return new ajis(str, str2, str3, str4, ajqy.a(arml), false);
    }
}
