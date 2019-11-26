package defpackage;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.Map;

/* renamed from: mnb */
public final class mnb implements aams, aftu {
    private final SharedPreferences a;
    private final String b;

    public mnb(SharedPreferences sharedPreferences, mni mni) {
        xvd.a(mni.a);
        this.a = (SharedPreferences) amqw.a((Object) sharedPreferences);
        this.b = String.format("%s_%s", new Object[]{"visitor_id", mni.a});
    }

    public final boolean b() {
        return true;
    }

    public final void a(Map map, afsl afsl) {
        String string = this.a.getString(this.b, null);
        if (string != null) {
            map.put("X-Goog-Visitor-Id", string);
        }
    }

    public final void a(asic asic) {
        if (!TextUtils.isEmpty(asic.b)) {
            if (!asic.b.equals(this.a.getString(this.b, null))) {
                this.a.edit().putString(this.b, asic.b).apply();
            }
        }
    }

    public final aulc a() {
        return aulc.VISITOR_ID;
    }
}
