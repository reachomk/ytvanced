package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: aivd */
public final class aivd extends aiuu implements xcp {
    private final afpu d;
    private final bcaa e;
    private final SharedPreferences f;

    public aivd(Context context, aiqf aiqf, afpu afpu, bcaa bcaa, SharedPreferences sharedPreferences) {
        super(context, aiqf);
        this.d = (afpu) amqw.a((Object) afpu);
        this.e = (bcaa) amqw.a((Object) bcaa);
        this.f = (SharedPreferences) amqw.a((Object) sharedPreferences);
        a();
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(atdv atdv) {
        int a = awah.a(atdv.b);
        if (a != 0 && a == 6 && this.d.a()) {
            this.f.edit().putBoolean(b("playability_adult_confirmations"), true).apply();
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(atdv atdv, wxg wxg) {
        if (this.c == null) {
            aiuz.a(wxg, aiuu.b(atdv));
        } else {
            ((afqe) this.e.get()).a(this.c.a(), null, new aivc(this, atdv, wxg));
        }
    }

    private final String b(String str) {
        String a = this.d.c().a();
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 1) + String.valueOf(a).length());
        stringBuilder.append(str);
        stringBuilder.append(":");
        stringBuilder.append(a);
        return stringBuilder.toString();
    }

    public final void a() {
        boolean z;
        if (this.d.a()) {
            z = this.f.getBoolean(b("playability_adult_confirmations"), false);
        } else {
            z = false;
        }
        this.a = z;
        this.b = false;
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{afqf.class, afqh.class};
        } else if (i == 0) {
            a();
            return null;
        } else if (i == 1) {
            a();
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
