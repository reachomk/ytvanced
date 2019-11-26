package defpackage;

import android.app.Activity;
import android.content.Context;
import android.media.session.MediaController;
import android.media.session.MediaSession.Token;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: wd */
public final class wd {
    public final wj a;
    private final xo b;
    private final ConcurrentHashMap c = new ConcurrentHashMap();

    public static void a(Activity activity, wd wdVar) {
        if (activity instanceof qu) {
            qu quVar = (qu) activity;
            wg wgVar = new wg();
            quVar.d.put(wgVar.getClass(), wgVar);
        }
        if (VERSION.SDK_INT >= 21) {
            MediaController mediaController;
            if (wdVar == null) {
                mediaController = null;
            } else {
                mediaController = new MediaController(activity, (Token) wdVar.b.a);
            }
            activity.setMediaController(mediaController);
        }
    }

    public wd(Context context, wq wqVar) {
        wj wiVar;
        this.b = wqVar.d();
        try {
            if (VERSION.SDK_INT >= 21) {
                wiVar = new wi(context, this.b);
            } else {
                wiVar = new wn(this.b);
            }
        } catch (RemoteException e) {
            Log.w("MediaControllerCompat", "Failed to create MediaControllerImpl.", e);
            wiVar = null;
        }
        this.a = wiVar;
    }

    public wd(Context context, xo xoVar) {
        this.b = xoVar;
        if (VERSION.SDK_INT >= 21) {
            this.a = new wi(context, xoVar);
        } else {
            this.a = new wn(xoVar);
        }
    }

    public final wp a() {
        return this.a.a();
    }

    public final vj b() {
        return this.a.c();
    }

    public final void a(wc wcVar) {
        if (wcVar == null) {
            throw new IllegalArgumentException("callback must not be null");
        } else if (this.c.putIfAbsent(wcVar, Boolean.valueOf(true)) != null) {
            Log.w("MediaControllerCompat", "the callback has already been registered");
        } else {
            Handler handler = new Handler();
            wcVar.a(handler);
            this.a.a(wcVar, handler);
        }
    }

    public final void b(wc wcVar) {
        if (wcVar == null) {
            throw new IllegalArgumentException("callback must not be null");
        } else if (this.c.remove(wcVar) == null) {
            Log.w("MediaControllerCompat", "the callback has never been registered");
        } else {
            try {
                this.a.a(wcVar);
            } finally {
                wcVar.a(null);
            }
        }
    }
}
