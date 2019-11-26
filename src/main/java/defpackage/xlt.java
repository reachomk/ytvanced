package defpackage;

import android.content.Context;

/* renamed from: xlt */
public final class xlt implements xlv {
    private final Context b;

    public xlt(Context context) {
        this.b = (Context) amqw.a((Object) context);
    }

    public final boolean a(avwc... avwcArr) {
        int length = avwcArr.length;
        int i = 0;
        while (i < length) {
            avwc avwc = avwcArr[i];
            amur amur = a;
            Object a = avwe.a(avwc.b);
            if (a == null) {
                a = avwe.INVALID;
            }
            String str = (String) amur.get(a);
            if (str == null) {
                throw new IllegalArgumentException("Unsupported Permission Type");
            } else if (ra.a(this.b, str) != 0) {
                return false;
            } else {
                i++;
            }
        }
        return true;
    }
}
