package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.youtube.R;

/* renamed from: gze */
public final class gze implements aalp {
    public final bcaa a;
    public final bcaa b;
    private final Context c;
    private final SharedPreferences d;
    private final bapu e;

    public gze(Context context, SharedPreferences sharedPreferences, bcaa bcaa, bcaa bcaa2, bapu bapu) {
        this.c = (Context) amqw.a((Object) context);
        this.d = (SharedPreferences) amqw.a((Object) sharedPreferences);
        this.b = (bcaa) amqw.a((Object) bcaa);
        this.a = (bcaa) amqw.a((Object) bcaa2);
        this.e = (bapu) amqw.a((Object) bapu);
    }

    public final void a(ashn ashn) {
        ashl ashl;
        String str = "";
        String string = this.d.getString(ebn.COUNTRY, str);
        str = this.d.getString("internal_geo", str);
        if (!TextUtils.isEmpty(string)) {
            ashn.a(string);
        }
        if (!TextUtils.isEmpty(str)) {
            ashn.copyOnWrite();
            ashl = (ashl) ashn.instance;
            if (str != null) {
                ashl.a |= 128;
                ashl.i = str;
            } else {
                throw new NullPointerException();
            }
        }
        string = (String) this.b.get();
        if (!TextUtils.isEmpty(string)) {
            ashn.b(string);
        }
        if (this.c.getResources().getString(R.string.application_name).startsWith("‎‏‎‎")) {
            ashn.copyOnWrite();
            ashl = (ashl) ashn.instance;
            ashl.a |= 4;
            ashl.f = true;
        }
        ashm ashm = (ashm) this.a.get();
        ashn.copyOnWrite();
        ashl ashl2 = (ashl) ashn.instance;
        if (ashm != null) {
            ashl2.b |= 536870912;
            ashl2.K = ashm.f;
            auke c = ((actf) this.e.get()).c();
            if (c != null) {
                ashn.copyOnWrite();
                ashl ashl3 = (ashl) ashn.instance;
                ashl3.j = c;
                ashl3.a |= 1024;
                return;
            }
            return;
        }
        throw new NullPointerException();
    }
}
