package defpackage;

import android.text.TextUtils;

/* renamed from: aath */
public final class aath extends aamz {
    public aath(aamd aamd, afpt afpt, String str, String str2, String str3) {
        asme asme;
        asmh asmh = (asmh) asme.f.createBuilder();
        if (TextUtils.isEmpty(str2)) {
            str = aali.b(str);
            asmh.copyOnWrite();
            asme = (asme) asmh.instance;
            if (str != null) {
                asme.a |= 2;
                asme.c = str;
            } else {
                throw new NullPointerException();
            }
        }
        str = aali.b(str2);
        asmh.copyOnWrite();
        asme = (asme) asmh.instance;
        if (str != null) {
            asme.a |= 4;
            asme.d = str;
        } else {
            throw new NullPointerException();
        }
        str = aali.b(str3);
        asmh.copyOnWrite();
        asme = (asme) asmh.instance;
        if (str != null) {
            asme.a |= 8;
            asme.e = str;
            super(aamd, afpt, "conversation/edit_name", asmh);
            g();
            return;
        }
        throw new NullPointerException();
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
    }
}
