package defpackage;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.util.Base64;

/* renamed from: abhq */
public final class abhq extends aano {
    private final SharedPreferences a;

    public abhq(aamf aamf, xhf xhf, SharedPreferences sharedPreferences) {
        super(aamf, xhf, aszc.f, abht.a, abhs.a);
        this.a = sharedPreferences;
    }

    public final /* synthetic */ Object a(anze anze) {
        aszc aszc = (aszc) anze;
        SharedPreferences sharedPreferences = this.a;
        if ((aszc.a & 8) != 0) {
            Editor edit = sharedPreferences.edit();
            anvf anvf = aszc.e;
            if (anvf == null) {
                anvf = aoxs.b;
            }
            edit.putString("attribution_data", Base64.encodeToString(anvf.toByteArray(), 0)).apply();
        }
        return aszc;
    }
}
