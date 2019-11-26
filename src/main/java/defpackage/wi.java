package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.media.session.MediaController;
import android.media.session.MediaSession.Token;
import android.media.session.PlaybackState;
import android.os.Handler;
import android.os.RemoteException;
import android.util.Log;
import android.view.KeyEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: wi */
final class wi implements wj {
    public final Object a = new Object();
    public final List b = new ArrayList();
    public final HashMap c = new HashMap();
    public final xo d;
    private final MediaController e;

    public wi(Context context, xo xoVar) {
        this.d = xoVar;
        this.e = new MediaController(context, (Token) this.d.a);
        if (this.e == null) {
            throw new RemoteException();
        } else if (this.d.b == null) {
            this.e.sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, new wl(this));
        }
    }

    public final void a(wc wcVar, Handler handler) {
        this.e.registerCallback(wcVar.a, handler);
        synchronized (this.a) {
            if (this.d.b != null) {
                vx wkVar = new wk(wcVar);
                this.c.put(wcVar, wkVar);
                wcVar.b = wkVar;
                try {
                    this.d.b.a(wkVar);
                    wcVar.a(13, null, null);
                } catch (RemoteException e) {
                    Log.e("MediaControllerCompat", "Dead object in registerCallback.", e);
                }
            } else {
                wcVar.b = null;
                this.b.add(wcVar);
            }
        }
    }

    public final void a(wc wcVar) {
        this.e.unregisterCallback(wcVar.a);
        synchronized (this.a) {
            if (this.d.b != null) {
                try {
                    vx vxVar = (wk) this.c.remove(wcVar);
                    if (vxVar != null) {
                        wcVar.b = null;
                        this.d.b.b(vxVar);
                    }
                } catch (RemoteException e) {
                    Log.e("MediaControllerCompat", "Dead object in unregisterCallback.", e);
                }
            } else {
                this.b.remove(wcVar);
            }
        }
    }

    public final boolean a(KeyEvent keyEvent) {
        return this.e.dispatchMediaButtonEvent(keyEvent);
    }

    public final wp a() {
        return new wo(this.e.getTransportControls());
    }

    public final xs b() {
        vy vyVar = this.d.b;
        if (vyVar != null) {
            try {
                return vyVar.h();
            } catch (RemoteException e) {
                Log.e("MediaControllerCompat", "Dead object in getPlaybackState.", e);
            }
        }
        PlaybackState playbackState = this.e.getPlaybackState();
        return playbackState != null ? xs.a(playbackState) : null;
    }

    public final vj c() {
        Object metadata = this.e.getMetadata();
        return metadata != null ? vj.a(metadata) : null;
    }

    public final PendingIntent d() {
        return this.e.getSessionActivity();
    }
}
