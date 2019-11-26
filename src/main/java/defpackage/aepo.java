package defpackage;

import android.content.Context;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnBufferingUpdateListener;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnInfoListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.media.MediaPlayer.OnSeekCompleteListener;
import android.media.MediaPlayer.OnVideoSizeChangedListener;
import android.net.Uri;
import android.view.Surface;
import android.view.SurfaceHolder;
import java.util.Map;

/* renamed from: aepo */
public final class aepo implements aeps, OnBufferingUpdateListener, OnCompletionListener, OnErrorListener, OnInfoListener, OnPreparedListener, OnSeekCompleteListener, OnVideoSizeChangedListener {
    public aepr a = this;
    private final MediaPlayer b = new MediaPlayer();

    public aepo() {
        this.b.setOnPreparedListener(this);
        this.b.setOnVideoSizeChangedListener(this);
        this.b.setOnBufferingUpdateListener(this);
        this.b.setOnSeekCompleteListener(this);
        this.b.setOnCompletionListener(this);
        this.b.setOnErrorListener(this);
        this.b.setOnInfoListener(this);
    }

    public final void a(aepr aepr) {
        this.a = aepr;
    }

    public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        aepr aepr = this.a;
        return aepr != null ? aepr.a(i, i2) : false;
    }

    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        aepr aepr = this.a;
        return aepr != null ? aepr.b(i, i2) : false;
    }

    public final void onCompletion(MediaPlayer mediaPlayer) {
        aepr aepr = this.a;
        if (aepr != null) {
            aepr.i();
        }
    }

    public final void onSeekComplete(MediaPlayer mediaPlayer) {
        aepr aepr = this.a;
        if (aepr != null) {
            aepr.j();
        }
    }

    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
        aepr aepr = this.a;
        if (aepr != null) {
            aepr.b(i);
        }
    }

    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        aepr aepr = this.a;
        if (aepr != null) {
            aepr.a(this, i, i2);
        }
    }

    public final void onPrepared(MediaPlayer mediaPlayer) {
        aepr aepr = this.a;
        if (aepr != null) {
            aepr.a(this);
        }
    }

    public final void a(Context context, Uri uri, Map map) {
        this.b.setDataSource(context, uri, map);
    }

    public final void a() {
        this.b.prepare();
    }

    public final void b() {
        this.b.prepareAsync();
    }

    public final void c() {
        this.b.start();
    }

    public final void d() {
        this.b.pause();
    }

    public final void a(long j) {
        if (j <= 2147483647L && j >= -2147483648L) {
            this.b.seekTo((int) j);
            return;
        }
        afpf afpf = afpf.media;
        StringBuilder stringBuilder = new StringBuilder(67);
        stringBuilder.append("32 bit integer overflow attempting to seekTo: ");
        stringBuilder.append(j);
        stringBuilder.append(".");
        afpc.a(1, afpf, stringBuilder.toString());
    }

    public final void e() {
        this.b.release();
    }

    public final int f() {
        return this.b.getAudioSessionId();
    }

    public final int g() {
        return this.b.getCurrentPosition();
    }

    public final int h() {
        return this.b.getDuration();
    }

    public final void a(float f, float f2) {
        this.b.setVolume(f, f2);
    }

    public final void a(int i) {
        this.b.setAudioStreamType(i);
    }

    public final void a(SurfaceHolder surfaceHolder) {
        try {
            this.b.setDisplay(surfaceHolder);
        } catch (IllegalStateException unused) {
        }
    }

    public final void a(Surface surface) {
        try {
            this.b.setSurface(surface);
        } catch (IllegalStateException unused) {
        }
    }
}
