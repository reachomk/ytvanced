package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: addj */
public final class addj {
    private final List a;
    private final addk b;
    private final String c;

    public addj(autl autl, String str) {
        this.c = str;
        ArrayList arrayList = new ArrayList();
        List list;
        if (autl != null && autl.b) {
            list = autl.c;
            if (list.isEmpty()) {
                list = arrayList;
            }
            this.a = Collections.unmodifiableList(list);
        } else {
            if (adir.a(this.c)) {
                aush aush = (aush) ausi.e.createBuilder();
                aush.copyOnWrite();
                ausi ausi = (ausi) aush.instance;
                ausi.a |= 1;
                ausi.b = 1;
                aush.b(addj.a(3, "^lge$", "(^476700$|^\\d\\d(lm|ls|pa|pm).*|^global$|^mediabh.*|^mediabp530.*|^tm.*)"));
                aush.b(addj.a(3, "^samsung$", "^(bd|ht)$"));
                aush.b(addj.a(3, "^vizio$", "^e.*_a0$"));
                aush.b(addj.a(3, "^sharp$", "^(le650u|le657e|le65xx|le747e|le757e|le757u|le857e)$"));
                aush.b(addj.a(3, "^funai$", "^philips$"));
                aush.b(addj.a(3, "^(tivo|tivo_comhem)$", "^series4$"));
                if ("up".equals(this.c)) {
                    aush.a(addj.a(3, "^(?i)microsoft.*", "^(?i)xbox\\sone.*"));
                    String str2 = ".*";
                    aush.a(addj.a(3, "^(?i)roku.*", str2));
                    aush.a(addj.a(3, "^(?i)apple.*", str2));
                    aush.a(addj.a(3, "^(?i)lg.*", "(?i)(^\\d\\d\\w[km]\\w{2,7}$|^oled\\d\\d\\w[89]\\w{0,3}$)"));
                }
                list = amul.a((ausi) ((anxl) aush.build()));
            } else {
                list = Collections.emptyList();
            }
            this.a = list;
        }
        this.b = new addk();
    }

    private final boolean a(addh addh, List list) {
        for (Object obj : list) {
            addk addk = this.b;
            amqw.a((Object) addh);
            amqw.a(obj);
            int a = ausg.a(obj.b);
            if (!(a == 0 || a == 1)) {
                a = addh.d();
                int a2 = ausg.a(obj.b);
                if (a2 == 0) {
                    a2 = 1;
                }
                if (a != a2) {
                    continue;
                }
            }
            if (addk.a(addh.a(), obj.c) && addk.a(addh.b(), obj.d) && addk.a(addh.c(), obj.e)) {
                return true;
            }
        }
        return false;
    }

    /* Access modifiers changed, original: final */
    public final boolean a(int i, addh addh) {
        for (ausi ausi : this.a) {
            int a = ausk.a(ausi.b);
            if (a == 0) {
                a = 1;
                continue;
            }
            if (a == i) {
                break;
            }
        }
        ausi ausi2 = null;
        if (ausi2 != null) {
            if (ausi2.c.size() > 0 && !a(addh, ausi2.c)) {
                return false;
            }
            if (ausi2.d.size() <= 0 || !a(addh, ausi2.d)) {
                return true;
            }
            return false;
        }
        return true;
    }

    private static ause a(int i, String str, String str2) {
        ausd ausd = (ausd) ause.f.createBuilder();
        ausd.copyOnWrite();
        ause ause = (ause) ausd.instance;
        ause.a |= 1;
        ause.b = 2;
        ausd.copyOnWrite();
        ause = (ause) ausd.instance;
        ause.a = 2 | ause.a;
        ause.c = str;
        ausd.copyOnWrite();
        ause ause2 = (ause) ausd.instance;
        ause2.a |= 4;
        ause2.d = str2;
        return (ause) ((anxl) ausd.build());
    }
}
