package defpackage;

import android.text.TextUtils;

/* renamed from: abhi */
public final class abhi extends aaml {
    public String a = "";

    public abhi(aamd aamd, afpt afpt) {
        super("flag/get_form", aamd, afpt);
        g();
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        if (amqu.a(this.a)) {
            String str = this.a;
            String str2 = "null";
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 62) + str2.length());
            stringBuilder.append("Exactly one of params (");
            stringBuilder.append(str);
            stringBuilder.append(") or clientSideParams (");
            stringBuilder.append(str2);
            stringBuilder.append(") has to be set.");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    public final /* synthetic */ anzd c() {
        atfy atfy = (atfy) atfv.d.createBuilder();
        if (!TextUtils.isEmpty(this.a)) {
            String str = this.a;
            atfy.copyOnWrite();
            atfv atfv = (atfv) atfy.instance;
            if (str != null) {
                atfv.a |= 2;
                atfv.c = str;
            } else {
                throw new NullPointerException();
            }
        }
        return atfy;
    }
}
