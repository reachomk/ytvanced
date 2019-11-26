package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: etw */
public final class etw {
    public String a;
    public arml b;
    public arml c;
    public arml d;
    public arml e;
    public arml f;
    public List g;
    public akav h;
    public Boolean i;

    public final etw a(axpc axpc) {
        if (this.g == null) {
            this.g = new ArrayList();
        }
        List list = this.g;
        axpd axpd = (axpd) axpe.c.createBuilder();
        axpd.a(axpc);
        list.add((axpe) ((anxl) axpd.build()));
        return this;
    }

    public static arml a(String str) {
        if (TextUtils.isEmpty(str)) {
            return ajqy.a(new String[0]);
        }
        return ajqy.a(str);
    }
}
