package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.media.AudioAttributes.Builder;
import android.media.MediaMetadata;
import android.media.VolumeProvider;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.media.session.PlaybackState.CustomAction;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;

/* renamed from: xd */
class xd implements ww {
    public final MediaSession a;
    public final xo b;
    public boolean c = false;
    public final RemoteCallbackList d = new RemoteCallbackList();
    public xs e;
    public vj f;
    public int g;
    private final Object h = new Object();
    private vk i;

    xd(Context context, String str) {
        this.a = new MediaSession(context, str);
        this.b = new xo(this.a.getSessionToken(), new xc(this));
        a();
    }

    public final Object g() {
        return null;
    }

    public final void a(wv wvVar, Handler handler) {
        this.a.setCallback(wvVar != null ? wvVar.a : null, handler);
        if (wvVar != null) {
            wvVar.a(this, handler);
        }
    }

    public final void a() {
        this.a.setFlags(3);
    }

    public final void a(int i) {
        Builder builder = new Builder();
        builder.setLegacyStreamType(i);
        this.a.setPlaybackToLocal(builder.build());
    }

    public final void a(vq vqVar) {
        this.a.setPlaybackToRemote((VolumeProvider) vqVar.a());
    }

    public final void a(boolean z) {
        this.a.setActive(z);
    }

    public final boolean b() {
        return this.a.isActive();
    }

    public final void c() {
        this.c = true;
        this.a.release();
    }

    public final xo d() {
        return this.b;
    }

    public final void a(xs xsVar) {
        PlaybackState playbackState;
        this.e = xsVar;
        int beginBroadcast = this.d.beginBroadcast();
        while (true) {
            beginBroadcast--;
            if (beginBroadcast < 0) {
                break;
            }
            try {
                ((vx) this.d.getBroadcastItem(beginBroadcast)).a(xsVar);
            } catch (RemoteException unused) {
            }
        }
        this.d.finishBroadcast();
        MediaSession mediaSession = this.a;
        if (xsVar == null) {
            playbackState = null;
        } else {
            if (xsVar.l == null && VERSION.SDK_INT >= 21) {
                PlaybackState.Builder builder = new PlaybackState.Builder();
                builder.setState(xsVar.a, xsVar.b, xsVar.d, xsVar.h);
                builder.setBufferedPosition(xsVar.c);
                builder.setActions(xsVar.e);
                builder.setErrorMessage(xsVar.g);
                for (xx xxVar : xsVar.i) {
                    CustomAction customAction;
                    if (xxVar.e != null || VERSION.SDK_INT < 21) {
                        customAction = xxVar.e;
                    } else {
                        CustomAction.Builder builder2 = new CustomAction.Builder(xxVar.a, xxVar.b, xxVar.c);
                        builder2.setExtras(xxVar.d);
                        customAction = builder2.build();
                    }
                    builder.addCustomAction(customAction);
                }
                builder.setActiveQueueItemId(xsVar.j);
                if (VERSION.SDK_INT >= 22) {
                    builder.setExtras(xsVar.k);
                }
                xsVar.l = builder.build();
            }
            playbackState = xsVar.l;
        }
        mediaSession.setPlaybackState(playbackState);
    }

    public final xs e() {
        return this.e;
    }

    public final void a(vj vjVar) {
        MediaMetadata mediaMetadata;
        this.f = vjVar;
        MediaSession mediaSession = this.a;
        if (vjVar == null) {
            mediaMetadata = null;
        } else {
            if (vjVar.c == null && VERSION.SDK_INT >= 21) {
                Parcel obtain = Parcel.obtain();
                vjVar.writeToParcel(obtain, 0);
                obtain.setDataPosition(0);
                vjVar.c = (MediaMetadata) MediaMetadata.CREATOR.createFromParcel(obtain);
                obtain.recycle();
            }
            mediaMetadata = vjVar.c;
        }
        mediaSession.setMetadata(mediaMetadata);
    }

    public final void a(PendingIntent pendingIntent) {
        this.a.setSessionActivity(pendingIntent);
    }

    public final void b(PendingIntent pendingIntent) {
        this.a.setMediaButtonReceiver(pendingIntent);
    }

    public final void f() {
        if (VERSION.SDK_INT < 22) {
            this.g = 2;
        } else {
            this.a.setRatingType(2);
        }
    }

    public void a(vk vkVar) {
        synchronized (this.h) {
            this.i = vkVar;
        }
    }

    public final String h() {
        if (VERSION.SDK_INT >= 24) {
            try {
                return (String) this.a.getClass().getMethod("getCallingPackage", new Class[0]).invoke(this.a, new Object[0]);
            } catch (Exception e) {
                Log.e("MediaSessionCompat", "Cannot execute MediaSession.getCallingPackage()", e);
            }
        }
        return null;
    }

    public vk i() {
        vk vkVar;
        synchronized (this.h) {
            vkVar = this.i;
        }
        return vkVar;
    }
}
