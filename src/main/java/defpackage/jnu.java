package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.youtube.R;

/* renamed from: jnu */
public final class jnu implements ajan, xcp {
    public final xci a;
    public final SharedPreferences b;
    public final ajam c;
    public final zyw d;
    public final bdfu e = new bdfu();
    private final Context f;
    private final albh g;
    private final bcaa h;

    public jnu(Context context, xci xci, SharedPreferences sharedPreferences, albh albh, bcaa bcaa, ajam ajam, zyw zyw) {
        this.f = (Context) amqw.a((Object) context);
        this.a = (xci) amqw.a((Object) xci);
        this.g = (albh) amqw.a((Object) albh);
        this.b = (SharedPreferences) amqw.a((Object) sharedPreferences);
        this.h = (bcaa) amqw.a((Object) bcaa);
        this.c = ajam;
        this.d = zyw;
    }

    public final long e() {
        return 1;
    }

    public final void a(ahkn ahkn) {
        if (ahkn.a == airi.PLAYBACK_LOADED) {
            aizy aizy = (aizy) this.h.get();
            if (aizy.D() != null && (aizy.D().r().a & 8) != 0 && !this.b.getBoolean(ebn.SPATIAL_AUDIO_MEALBAR_SHOWN, false)) {
                albh albh = this.g;
                albh.b(albh.b().d((int) R.drawable.ic_spatial_audio).d(this.f.getString(R.string.spatial_audio_mealbar_title)).c(this.f.getString(R.string.spatial_audio_mealbar_message)).a(this.f.getString(R.string.app_got_it), null).a(new jny(this)).e());
            }
        }
    }

    public final bcuo[] a(ajam ajam) {
        return new bcuo[]{ajam.Q().a.f().a(emg.a(this.d, 8, 1)).a(new jnw(this), jnv.a)};
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahkn.class};
        } else if (i == 0) {
            a((ahkn) obj);
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
