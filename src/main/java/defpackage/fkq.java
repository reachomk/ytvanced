package defpackage;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import com.google.android.youtube.R;
import java.util.concurrent.TimeUnit;

/* renamed from: fkq */
public final class fkq {
    private final Context a;
    private final fkg b;
    private final NotificationManager c;
    private final fks d;

    public fkq(Context context, fkg fkg, fks fks) {
        this.a = context;
        this.b = fkg;
        this.c = (NotificationManager) context.getSystemService("notification");
        this.d = fks;
    }

    /* Access modifiers changed, original: final */
    public final void a(ajmq ajmq) {
        if (fku.a(ajmq) && this.b.a() == 3) {
            Resources resources = this.a.getResources();
            Context context = this.a;
            aakj b = ajmq.b();
            aiqs a = aiqq.a();
            a.a = airn.a(b.b(), "", -1, (float) TimeUnit.MILLISECONDS.toSeconds(ajmq.d()));
            airl airl = new airl(a.b());
            airl.b();
            PendingIntent activity = PendingIntent.getActivity(context, 0, ebl.a(context).putExtra("watch", airl).putExtra("playback_start_flag", 3), 134217728);
            CharSequence string = resources.getString(R.string.disabled_pip_video_notification);
            qg qgVar = new qg(this.a);
            qgVar.a(ajmq.b().c());
            qj qhVar = new qh();
            qhVar.a(string);
            qgVar.a(qhVar);
            qgVar.a((int) R.drawable.quantum_ic_video_youtube_white_24);
            qgVar.t = resources.getColor(R.color.color_brand_primary);
            qgVar.a(false);
            qgVar.b(true);
            qgVar.r = "status";
            qgVar.c();
            qgVar.i = 0;
            qgVar.f = activity;
            xlr.a(qgVar);
            this.c.notify(1008, qgVar.e());
            fks fks = this.d;
            fkt fkt = new fkt(this);
            fks.a();
            fks.b.postDelayed(fkt, fks.a);
        }
    }

    public final void a() {
        this.c.cancel(1008);
        this.d.a();
    }
}
