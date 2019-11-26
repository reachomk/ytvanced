package defpackage;

import android.content.Intent;
import android.media.Rating;
import android.media.session.MediaSession.Callback;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import java.lang.ref.WeakReference;

/* renamed from: wx */
final class wx extends Callback {
    private final /* synthetic */ wv a;

    wx(wv wvVar) {
        this.a = wvVar;
    }

    public final void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
        wq.a(bundle);
        a();
        try {
            String str2;
            if (str.equals("android.support.v4.media.session.command.GET_EXTRA_BINDER")) {
                xd xdVar = (xd) this.a.b.get();
                if (xdVar != null) {
                    bundle = new Bundle();
                    xo xoVar = xdVar.b;
                    vy vyVar = xoVar.b;
                    bundle.putBinder("android.support.v4.media.session.EXTRA_BINDER", vyVar != null ? vyVar.asBinder() : null);
                    str2 = "android.support.v4.media.session.SESSION_TOKEN2";
                    bil bil = xoVar.c;
                    if (bil != null) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putParcelable("a", new bie(bil));
                        bundle.putParcelable(str2, bundle2);
                    }
                    resultReceiver.send(0, bundle);
                }
            } else {
                str2 = "android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION";
                if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM")) {
                    bundle.getParcelable(str2);
                } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT")) {
                    bundle.getParcelable(str2);
                    bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX");
                } else if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM")) {
                    bundle.getParcelable(str2);
                } else if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT")) {
                    this.a.b.get();
                }
            }
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the extra data.");
        }
        b();
    }

    public final boolean onMediaButtonEvent(Intent intent) {
        a();
        boolean a = this.a.a(intent);
        b();
        return a || super.onMediaButtonEvent(intent);
    }

    public final void onPlay() {
        a();
        this.a.f();
        b();
    }

    public final void onPlayFromMediaId(String str, Bundle bundle) {
        wq.a(bundle);
        a();
        this.a.g();
        b();
    }

    public final void onPlayFromSearch(String str, Bundle bundle) {
        wq.a(bundle);
        a();
        this.a.h();
        b();
    }

    public final void onPlayFromUri(Uri uri, Bundle bundle) {
        wq.a(bundle);
        a();
        this.a.a(uri);
        b();
    }

    public final void onSkipToQueueItem(long j) {
        a();
        b();
    }

    public final void onPause() {
        a();
        this.a.i();
        b();
    }

    public final void onSkipToNext() {
        a();
        this.a.j();
        b();
    }

    public final void onSkipToPrevious() {
        a();
        this.a.k();
        b();
    }

    public final void onFastForward() {
        a();
        this.a.l();
        b();
    }

    public final void onRewind() {
        a();
        this.a.m();
        b();
    }

    public final void onStop() {
        a();
        this.a.n();
        b();
    }

    public final void onSeekTo(long j) {
        a();
        this.a.a(j);
        b();
    }

    public final void onSetRating(Rating rating) {
        a();
        this.a.a(vo.a(rating));
        b();
    }

    public final void onCustomAction(String str, Bundle bundle) {
        wq.a(bundle);
        a();
        wq.a(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
        String str2 = "android.support.v4.media.session.action.ARGUMENT_URI";
        if (str.equals("android.support.v4.media.session.action.PLAY_FROM_URI")) {
            this.a.a((Uri) bundle.getParcelable(str2));
        } else if (str.equals("android.support.v4.media.session.action.PREPARE")) {
            this.a.b();
        } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID")) {
            bundle.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID");
            this.a.c();
        } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH")) {
            bundle.getString("android.support.v4.media.session.action.ARGUMENT_QUERY");
            this.a.d();
        } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_URI")) {
            bundle.getParcelable(str2);
            this.a.e();
        } else if (str.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED")) {
            bundle.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED");
        } else if (str.equals("android.support.v4.media.session.action.SET_REPEAT_MODE")) {
            bundle.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE");
        } else if (str.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE")) {
            bundle.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE");
        } else if (str.equals("android.support.v4.media.session.action.SET_RATING")) {
            bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_RATING");
        } else if (str.equals("android.support.v4.media.session.action.SET_PLAYBACK_SPEED")) {
            bundle.getFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", 1.0f);
        }
        b();
    }

    private final void a() {
        if (VERSION.SDK_INT < 28) {
            WeakReference weakReference = this.a.b;
            ww wwVar = weakReference != null ? (ww) weakReference.get() : null;
            if (wwVar != null) {
                String h = wwVar.h();
                if (TextUtils.isEmpty(h)) {
                    h = "android.media.session.MediaController";
                }
                wwVar.a(new vk(h, -1, -1));
            }
        }
    }

    private final void b() {
        WeakReference weakReference = this.a.b;
        ww wwVar = weakReference != null ? (ww) weakReference.get() : null;
        if (wwVar != null) {
            wwVar.a(null);
        }
    }

    public final void onPrepare() {
        a();
        this.a.b();
        b();
    }

    public final void onPrepareFromMediaId(String str, Bundle bundle) {
        wq.a(bundle);
        a();
        this.a.c();
        b();
    }

    public final void onPrepareFromSearch(String str, Bundle bundle) {
        wq.a(bundle);
        a();
        this.a.d();
        b();
    }

    public final void onPrepareFromUri(Uri uri, Bundle bundle) {
        wq.a(bundle);
        a();
        this.a.e();
        b();
    }
}
