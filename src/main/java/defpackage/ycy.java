package defpackage;

import android.os.Parcelable;
import android.text.Spanned;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ycy */
public final class ycy {
    public final String a;
    public final List b;
    public Parcelable c;
    public boolean d;

    public ycy(atft atft) {
        arml arml;
        if ((atft.a & 2) != 0) {
            arml = atft.c;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        Spanned a = ajqy.a(arml);
        Object arrayList = new ArrayList();
        for (awzt awzt : atft.d) {
            if (!(awzt == null || (awzt.a & 1) == 0)) {
                Object obj = awzt.b;
                if (obj == null) {
                    obj = awzr.g;
                }
                arrayList.add(obj);
            }
        }
        this.a = (String) amqw.a(a.toString());
        this.b = (List) amqw.a(arrayList);
    }
}
