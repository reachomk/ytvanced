package defpackage;

import android.content.Context;
import com.google.android.youtube.R;
import java.util.Map;

/* renamed from: kbw */
final /* synthetic */ class kbw implements Runnable {
    private final aaas a;
    private final apxu b;
    private final Map c;
    private final albi d;
    private final Context e;
    private final kby f;

    kbw(aaas aaas, apxu apxu, Map map, albi albi, Context context, kby kby) {
        this.a = aaas;
        this.b = apxu;
        this.c = map;
        this.d = albi;
        this.e = context;
        this.f = kby;
    }

    public final void run() {
        aaas aaas = this.a;
        apxu apxu = this.b;
        Map map = this.c;
        albi albi = this.d;
        Context context = this.e;
        kby kby = this.f;
        aaas.a(apxu, map);
        albi.b(albi.b().b(context.getString(R.string.dismissed_video_snackbar_message)).c(false).d());
        if (kby != null) {
            kby.b();
        }
    }
}
