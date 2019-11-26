package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: yuw */
public final /* synthetic */ class yuw implements bbnv {
    private final yuh a;

    public yuw(yuh yuh) {
        this.a = yuh;
    }

    public final Object a(Object obj) {
        String a;
        apsn a2;
        yuh yuh = this.a;
        ykp ykp = (ykp) obj;
        ArrayList arrayList = new ArrayList();
        String text = ykp.getText();
        if (!TextUtils.isEmpty(text)) {
            a = yuh.c.a();
            String authorKey = ykp.getAuthorKey();
            long a3 = yuh.d.a();
            aadw aadw = yuh.a;
            a2 = apsk.a(a);
            apsj apsj = (apsj) apsg.i.createBuilder();
            apsj.copyOnWrite();
            apsg apsg = (apsg) apsj.instance;
            if (authorKey != null) {
                apsg.a |= 1;
                apsg.b = authorKey;
                anvu toByteString = ajqy.a(text).toByteString();
                apsj.copyOnWrite();
                apsg apsg2 = (apsg) apsj.instance;
                if (toByteString != null) {
                    apsg2.a |= 2;
                    apsg2.c = toByteString;
                    aprz aprz = a2.a;
                    aprz.copyOnWrite();
                    aprw aprw = (aprw) aprz.instance;
                    aprw.c = (anxl) apsj.build();
                    aprw.b = 5;
                    a2.a(Long.valueOf(a3));
                    arrayList.add(new yld(a, (apsk) a2.a(aadw), true));
                } else {
                    throw new NullPointerException();
                }
            }
            throw new NullPointerException();
        }
        ykn attachment = ykp.getAttachment();
        if (attachment != null) {
            String a4 = yuh.c.a();
            a = ykp.getAuthorKey();
            long a5 = yuh.d.a();
            aadw aadw2 = yuh.a;
            a2 = apsk.a(a4);
            apsl apsl = (apsl) apsi.m.createBuilder();
            apsl.copyOnWrite();
            apsi apsi = (apsi) apsl.instance;
            if (a != null) {
                apsi.a = 1 | apsi.a;
                apsi.b = a;
                anvu toByteString2 = attachment.c() != null ? attachment.c().toByteString() : null;
                apsl.copyOnWrite();
                apsi apsi2 = (apsi) apsl.instance;
                if (toByteString2 != null) {
                    apsi2.a |= 16;
                    apsi2.g = toByteString2;
                    aygk a6 = attachment.a();
                    apsl.copyOnWrite();
                    apsi2 = (apsi) apsl.instance;
                    if (a6 != null) {
                        apsi2.d = a6;
                        apsi2.a |= 4;
                        a2.a((apsi) ((anxl) apsl.build()));
                        a2.a(Long.valueOf(a5));
                        arrayList.add(new ylh(a4, (apsk) a2.a(aadw2), attachment.b(), true, false));
                    } else {
                        throw new NullPointerException();
                    }
                }
                throw new NullPointerException();
            }
            throw new NullPointerException();
        }
        return yuh.a.b(ykp.getChatMessageSetKey()).a(ykk.class).b(new yup(yuh, arrayList, ykp)).a(new yus(yuh)).a(bbmt.a()).b(new yur(yuh, ykp, arrayList));
    }
}
