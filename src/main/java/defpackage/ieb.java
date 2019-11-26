package defpackage;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Handler;
import android.provider.Settings.System;

/* renamed from: ieb */
public final class ieb extends ContentObserver {
    public static final Uri a = System.CONTENT_URI;
    private final int b;
    private final int c;
    private final AudioManager d;
    private final bctx e;

    public static bctz a(Context context) {
        return bctz.a(new bcwk(new iee(context)));
    }

    public ieb(Context context, bctx bctx, int i) {
        super(new Handler());
        this.e = bctx;
        this.c = i;
        this.d = (AudioManager) context.getSystemService("audio");
        this.b = this.d.getStreamVolume(i);
    }

    public final void onChange(boolean z) {
        super.onChange(z);
        int streamVolume = this.b - this.d.getStreamVolume(this.c);
        if (streamVolume != 0) {
            this.e.e_(Integer.valueOf(streamVolume));
        }
    }
}
