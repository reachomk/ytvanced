package defpackage;

import android.app.AlertDialog.Builder;
import android.content.Context;
import com.google.android.youtube.R;

/* renamed from: aiep */
public final class aiep implements ajan, xcp {
    public aiep(aizy aizy, Context context) {
        amqw.a((Object) aizy);
        amqw.a((Object) context);
        new Builder(context).setTitle(context.getString(R.string.playback_rate_title)).setNegativeButton(R.string.cancel, aieo.a);
    }

    public final long e() {
        return 65536;
    }

    public final bcuo[] a(ajam ajam) {
        return new bcuo[]{ajam.Q().a.a(ajcg.b(ajam.O(), 65536)).a(ajcg.a(ajam.O(), 65536)).a(new aier(this), aieq.a)};
    }

    public static void a(ahkn ahkn) {
        airi airi = ahkn.a;
        airi = airi.NEW;
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahkn.class};
        } else if (i == 0) {
            aiep.a((ahkn) obj);
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
