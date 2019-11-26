package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.media.AudioManager;
import android.os.PowerManager;
import java.util.Set;

/* renamed from: hzr */
public final class hzr implements OnSharedPreferenceChangeListener {
    public final acum a;
    public final xhv b;
    public final AudioManager c;
    public final PowerManager d;
    public final aiqf e;
    public final bctz f;
    public boolean g;
    public boolean h;
    private final dwz i;

    public hzr(Context context, acum acum, xhv xhv, aiqf aiqf, dwz dwz, ajam ajam, Set set) {
        this.a = acum;
        this.b = xhv;
        this.e = aiqf;
        this.i = dwz;
        this.c = (AudioManager) context.getSystemService("audio");
        this.d = (PowerManager) context.getSystemService("power");
        this.g = dwz.b();
        this.h = dwz.a();
        amuo j = amul.j();
        for (iae a : set) {
            j.c(a.a());
        }
        bctz a2 = bctz.a(bctz.a(j.a()));
        ajbp Q = ajam.Q();
        this.f = a2.a(new bczq(bctz.a(Q.a.a(hzs.a).b(new hzv(this)), Q.d.b(hzu.a), hzx.a), hzt.a));
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (ebn.BACKGROUND_AUDIO_POLICY.equals(str)) {
            this.g = this.i.b();
            this.h = this.i.a();
        }
    }
}
